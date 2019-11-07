# Null 검사를 널 객체에 위임

###### Introduce Null Object

일부 코드가 프로그램의 어떤 상태를 전제할 땐 어설션을 넣어서 그 전제를 확실하게 코드로 작성하자

</br>

[보기]

```java
if (customer == null) {
	plan = BillingPlan.basic();
} else {
	plan = customer.getPlan();
}
```

</br>

![Introduce Null Object.PNG](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/image/Introduce%20Null%20Object.PNG)

</br>

[방법]

1. 원본 클래스 안에 널 객체 역할을 할 하위클래스를 작성하자.

</br>

2. 원본 클래스와 널 클래스 안에 isNull 메서드를 작성하자. 

</br>

3. 원본 클래스의 isNull 메서드는 false를 반환해야 하고, 널 클래스의 isNull 메서드는 true를 반환해야 한다.
   (isNull 메서드를 넣을 Nullalble 인터페이스를 작성하면 좋을 때도 있다)

   (아니면, 검사 인터페이스로 null 여부를 검사하는 방법도 있음)

</br>

4. 컴파일

</br>

5. 원본 객체에 요청하면 null을 반환할 수 있는 부분을 전부 찾아서 그 부분을 널 객체로 변경

</br>

6. 원본 타입의 변수를 null과 비교하는 코드를 전부 찾아서 isNull 호출로 수정

   (null이 나오지 말아야 할 고세 null을 검사하는 어설션을 몇 개 넣으면 좋다)

</br>

7. 컴파일과 테스트

</br>

8. 클아이언트가 null이 아니면 한 메서드를 호출하고 null이면 다른 메서드를 호출하는 case문을 전부 찾자

</br>

9. 각 case문마다 널 클래스 안의 해당 메서드를 다른 기능의 메서드로 재정의

</br>

10. 재정의 메서드를 사용하는 부분에서 조건문을 삭제하고  컴파일과 테스트를 실시

</br>

[예제]

- 수정 전

  ```java
  public class BillingPlan {
  	static BillingPlan basic() {
  		return new BillingPlan();
  	}
  }
  ```
  
  ```java
  public class Execute {
  
  	public void execute() {
  		Site site = new Site();
  		Customer customer = site.getCustomer();
  		BillingPlan plan;
  
  		if (customer == null) {
  			plan = BillingPlan.basic();
  		} else {
  			plan = customer.getPlan();
  		}
  
  		String customerName;
  		if (customer == null) {
  			customerName = "occupant";
  		} else {
  			customerName = customer.getName();
  		}
  
  		int weeksDelinquent;
  		if (customer == null) {
  			weeksDelinquent = 0;
  		} else {
  			weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
  		}
  	}
  }
  ```
  
  ```java
  public class PaymentHistory {
  	int getWeeksDelinquentInLastYear() {
  		return 0;
  	}
  }
  ```
  
  ```java
  public class Site {
  	Customer customer;
  
  	Customer getCustomer() {
  		return customer;
  	}
  }
  
  class Customer {
  	public String getName() {
  		return "test";
  	}
  
  	public BillingPlan getPlan() {
  		return new BillingPlan();
  	}
  
  	public PaymentHistory getHistory() {
  		return new PaymentHistory();
  	}
  }
  
  ```

</br>

- 수정 후

  ```java
  public class BillingPlan {
  	static BillingPlan basic() {
  		return new BillingPlan();
  	}
  
  	static BillingPlan special() {
  		return new BillingPlan();
  	}
  }
  ```
  
  ```java
  public class Execute {
  
  	public static void main(String[] args) {
  		Execute ex = new Execute();
  		ex.execute();
  	}
  
  	public void execute() {
  		Site site = new Site();
  		Customer customer = site.getCustomer();
  		BillingPlan plan;
  
  		if (customer.isNull()) {
  			plan = BillingPlan.basic();
  		} else {
  			plan = customer.getPlan();
  		}
  
  		if (!customer.isNull()) {
  			customer.setPlan(BillingPlan.special());
  		}
  
  		String customerName = customer.getName();
  
  		int weeksDelinquent = customer.getHistory().getWeeksDelinquentInLastYear();
  	}
  }
  ```
  
  ```java
  public class PaymentHistory {
  	static PaymentHistory newNull() {
  		return new NullPaymentHistory();
  	}
  
  	int getWeeksDelinquentInLastYear() {
  		return 10;
  	}
  }
  
  class NullPaymentHistory extends PaymentHistory {
  	@Override
  	int getWeeksDelinquentInLastYear() {
  		return 0;
  	}
  }
  ```
  
  ```java
  public class Site {
  	Customer customer;
  
  	Customer getCustomer() {
  		return (customer == null) ? Customer.newNull() : customer;
  	}
  }
  
  class Customer {
  
  	// Null Customer가 사용
  	protected Customer() {
  	}
  
  	private BillingPlan billingPlan;
  
  	static Customer newNull() {
  		return new NullCustomer();
  	}
  
  	public String getName() {
  		return "test";
  	}
  
  	public BillingPlan getPlan() {
  		return new BillingPlan();
  	}
  
  	public PaymentHistory getHistory() {
  		return new PaymentHistory();
  	}
  
  	public void setPlan(BillingPlan arg) {
  		billingPlan = arg;
  	}
  
  	public boolean isNull() {
  		return false;
  	}
  }
  
  class NullCustomer extends Customer {
  	@Override
  	public boolean isNull() {
  		return true;
  	}
  
  	@Override
  	public String getName() {
  		return "occupant";
  	}
  
  	@Override
  	public void setPlan(BillingPlan arg) {
  
  	}
  
  	public PaymentHistory getHistory() {
  		return PaymentHistory.newNull();
  	}
  }
  ```