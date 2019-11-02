# 테스트 작성
리팩토링을 실시하기 위한 필수 전제조건은 반드시 견고한 테스트를 해야 한다는 것
</br>
## JUnit 테스트 프레임워크

[프레임워크 구조]

![junit_architecture](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/src/image/junit_architecture.png)


[특이 사항]

- 테스트가 들어 있는 모든 클래스 안에는 JUnit의 TestCase 클래스가 반드시 들어 있어야 함
- 실패 뿐 아니라 에러도 잡아냄



[소스 코드]

- 기본 소스

  ```java
  public class FileReaderTester1 extends TestCase {
      FileReader input;
  
      public FileReaderTester1(String name) {
          super(name);
      }
  
      public static Test suite() {
          TestSuite suite = new TestSuite();
          suite.addTest(new FileReaderTester1("testRead"));
          return suite;
      }
  
      public static void main(String[] args) {
          junit.textui.TestRunner.run(suite());
      }
  
      //테스트 픽스처(test Fixture) : 테스트의 샘플 역할을 하는 객체
      //픽스처 객체 생성
      protected void setUp() {
          try {
              input = new FileReader("data.txt");
          } catch (FileNotFoundException e) {
              throw new RuntimeException("테스트 파일을 열 수 없음");
          }
      }
  	
      //픽스처 객체 제거
      protected void tearDown() {
          try {
              input.close();
          } catch (IOException e) {
              throw new RuntimeException("테스트 파일을 닫는 중 에러 발생");
          }
      }
  
      public void testRead() throws IOException {
          char ch = '&';
          for (int i = 0; i < 4; i++)
              ch = (char) input.read();
          assertEquals ('d', ch);
      }
  }
  ```

- 결과 (성공)

![test_success](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/src/image/test_success.png)



- 고의적인 오류 (예 - 실패)
  - 테스트가 실제로 수행되는지 스스로 입증하고 실제로 테스트하기 위함
  - assertEquals() 메소드 매개값 변경

```java
public void testRead() throws IOException 
{    
    char ch = '&';    
    for (int i = 0; i < 4; i++)        
        ch = (char) input.read();    
    assertEquals ('m', ch);
}
```



- 결과 

![test_fail](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/src/image/test_fail.png)



- 고의적인 오류 (예 - 에러)

  - 파일을 읽기 전에 close() 메소드 실행

  ```java
  public void testRead() throws IOException 
  {    
      char ch = '&';    
      input.close();    
      for (int i = 0; i < 4; i++)        
          ch = (char) input.read();    
      assertEquals ('m', ch);
  }
  ```



- 결과

![test_error](https://raw.githubusercontent.com/machine-human/Refactoring-Study/master/src/image/test_error.png)