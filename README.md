# CHAPTER 01 맛보기 예제

#### 비디오 대여점에서 고객의 대여료 내역을 계산하고 출력  
</br>

#### [조건]
- 고객이 대여한 비디오와 대여 기간을 표시한 후 
  비디오 종류와 대여 기간을 토대로 대여료를 계산
- 비디오 종류는 일반물, 아동물, 최신물 (3 종류)
- 대여료 계산과 더불어 내역을 바탕으로 적립 포인트도 계산되는데, 
  이 포인트는 비디오가 최신물인지 아닌지에 따라 달라짐
  
</br>

#### [클래스 다이어그램]

![class_diagram_01](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/src/image/class_diagram_01.png)

</br>

#### [소스 코드]

- Movie 클래스 - 비디오 데이터 클래스

```java
public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String title;
    private int priceCode;

    public Movie(String title, int priceCode) {
        this.title = title;
        this.priceCode = priceCode;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        this.priceCode = arg;
    }

    public String getTitle() {
        return title;
    }

}
```

</br>

- Rental 클래스 - 대여 정보 클래스

```java
public class Rental {

    private Movie movie;
    private int dayRented;

    public Rental(Movie movie, int dayRented) {
        this.movie = movie;
        this.dayRented = dayRented;
    }

    public Movie getMovie() {
        return movie;
    }

    public int getDaysRented() {
        return dayRented;
    }

}
```

</br>

- Customer 클래스 - 고객 클래스

```java
public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental rental) {
        this.rentals.addElement(rental);
    }

    public String getName() {
        return name;
    }

    /**
     * 지나치게 많은 기능이 들어 있어 문제 많은 메서드
     */
    public String statement() {
        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Enumeration<Rental> enumerationRentals = rentals.elements();
        String result = getName() + " 고객님의 대여 기록 \n";

        while (enumerationRentals.hasMoreElements()) {
            //코드로 인해 변경 됨
            //변경되는 변수는 더 주의해야 함
            //변경되는 변수가 하나뿐이라면 그 변수를 반환할 수 있음
            double thisAmount = 0;
            //코드로 인해 변경되지 않음 (매개변수로 전달할 수 있음
            Rental each = enumerationRentals.nextElement();

            //비디오 종류별 대여료 계산
            switch (each.getMovie().getPriceCode()) {
                case Movie.REGULAR:
                    thisAmount += 2;
                    if (each.getDaysRented() > 2)
                        thisAmount += (each.getDaysRented() - 2) * 1.5;
                    break;
                case Movie.NEW_RELEASE:
                    thisAmount += each.getDaysRented() * 3;
                    break;
                case Movie.CHILDRENS:
                    thisAmount += 1.5;
                    if (each.getDaysRented() > 3)
                        thisAmount += (each.getDaysRented() - 3) * 1.5;
                    break;
            }

            //적립 포인트 1포인트 증가
            frequentRenterPoints++;

            //최신물을 이틀 이상 대여하면 보너스 포인트 지급
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) && each.getDaysRented() > 1)
                frequentRenterPoints++;

            //이번에 대여하는 비디오 정보와 대여로를 출력
            result += "\t" + each.getMovie().getTitle() + "\t" + thisAmount + "\n";

            //현재까지 누적된 총 대여료
            totalAmount += thisAmount;
        }

        //푸터 행 추가
        result += "누적 대여료 : " + totalAmount + "\n";
        result += "적립 포인트 : " + frequentRenterPoints;
        return result;
    }
}
```

</br>

#### [예제의 문제점]

- statement() 메서드에 지나치게 많은 기능들이 들어 있어 있음

</br>

#### [가정 1]

- 사용자가 대여 내역을 웹에서도 볼 수 있고 
  다른 대중적 형식과도 호환되게끔 HTML로 출력되길 원한다면?

  답 : 임시방편은 statement() 메서드와 대부분의 기능이 같은 새 메서드를 작성하는 것
  statement() 메서드를 복제한 후 필요한 부분들만 고치면 되니까

</br>

#### [가정 2]

- 하지만 대여료 적용 규칙을 수정하면 어떻게 될까?

  

  답 : 코드를 복사해서 붙이게 되면 나중에 그 코드를 수정할 때 마다 
  계속 같은 여러 부분을 복사해서 붙여야 하기 때문에 아주 번거롭고 에러가 생길 수도 있음

</br>

#### [결론]

- 위와 같은 경우 프로그램이 당장 문제가 없을지 몰라도
  나중엔 사용자가 요구한 기능을 수정하기 힘들어서 애먹을 것

  ### 이 상황이 바로 리팩토리해야 할 시점!!

</br>

#### [리팩토링 작업 전]

- 리팩토링할 코드 부분에 대한 신뢰도 높은 각종 테스트를 작성
- 긴 메서드를 보면 작은 부분들로 쪼갤 수 있는지 살펴본다
