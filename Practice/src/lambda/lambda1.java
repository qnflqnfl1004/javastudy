package lambda;

public class lambda1 {

  public static void main(String[] args) {
    // 람다식1(반환자료형이 없는 경우)
    /*
     * 람다식은 인터페이스, 인스턴스 그리고 생성자는 생략을 하고 
     * (test() ) 매개변수는 비어있으니까 그대로 가져오고,
     * 에로우펑션, 그리고 내용을 구현해줍니다.
     * 내용이 두줄 이상일 때는 괄호와 세미콜론을 넣어줍니다 한줄일 때는 생략 가능합니다.
     */
    Lamda01Function f = () -> {
      System.out.println("람다식1테스트 출력1");
      System.out.println("람다식1테스트 출력2");
    };
    
    /*
     * f는 테스트가 단 하나밖에 없기 때문에 당연히 이 테스트라고 추론해서 값을 불러 올 수 있습니다.
     * 인스턴스 f를 추상메서드로 실행을 시킵니다.
     */
    f.test();
    
    // 람다식2(반환자료형이 있는 경우)
    /*
     * 여기서 매개변수에 String 있을 경우 당연히 이 안에 있는 것이라고 예측이 가능해서 
     * String을 생략해도 에러는 나지 않습니다. 
     * 매개변수 타입이 string이고 반환자료형도 string이니까 return은 생략하고 매개변수만 넣어줍니다.
     */
    Lamda02Function f2 = (a) -> a;
    System.out.println(f2.test("람다식2테스트 출력1"));
    
    // 람다식2(중괄호가 있을 경우)
    /* 중괄호가 있을 경우 직접 반환을 해줘야합니다. */
    Lamda02Function f3 = a -> {
      return a;
    };
    
    System.out.println(f3.test("람다식2테스트 출력2"));

    
    // 익명 내부클래스
    /*
     * 이 Lamda01Function 람다식을 익명 내부클래스로도 실행시켜 보았습니다. 
     * 익명내부클래스는 함수형 인터페이스 조건이 아니어도 되지만 람다식은 꼭 펑셔널인터페이스 조건에 맞아야 합니다.
     */
    Lamda01Function f4 = new Lamda01Function() {

      @Override
      public void test() {

        System.out.println("람다식1테스트 출력3");
        
      }
      
    };
    
    f4.test();
    
  }

}


/* 단 하나의 추상메서드를 갖고 있는 인터페이스. 올바르게 함수형 인터페이스를 정의하였는지 체크해준다. */
@FunctionalInterface 
interface Lamda01Function{
    public void test();
/* 추상메서드가 두개이므로 @FunctionalInterface 조건에 만족하지 않아서 에러남 */
//    public abstract String run(); // 
}


@FunctionalInterface 
interface Lamda02Function{
    public String test(String a);
}