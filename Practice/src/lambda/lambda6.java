package lambda;

public class lambda6 {
  /*
   * 람다를 사용하면 안되는 경우
   * 
   * - 익명클래스의 this는 익명클래스 자신을 가리키지만 람다에서의 this는 선언된 클래스를 가리킨다.
   * - 람다는 은닉 변수(Shadow Variable)을 허용하지 않는다.
   *   익명 클래스는 변수를 선언하여 사용할 수 있지만 람다는 이를 허용하지 않습니다.
   * - 람다는 인터페이스에 반드시 하나의 메서드만 가지고 있어야 한다.
   *   인터페이스에 @FunctionalInterface 어노테이션을 붙이면 두개 이상의 추상 메서드가
   *   선언되었을 경우 컴파일 에러를 발생시킨다.
   * - 람다 코드가 3줄 이상으로 넘어갈때 람다는 이름을 붙일 수 없기 떄문에 다른 메서드나 함수처럼
   *   이름을 통해서 해당 동작을 알 수 없기 때문에 오직 구현만 보고 동작을 알아내야 합니다.
   *   그렇기 때문에 시간이 오래걸리고 복잡한 코드가 나올 수 있기 때문에 익명내부클래스를 권장하고 있습니다.
   */
  public static void print(Output o) {
    o.output();
  }
  
//  public static void print(Runnable r) {
//    r.run();
//  }
  
  
  public static void main(String[] args) {
    /*
     * error! 컨텍스트 오버로딩이 존재함
     * 람다는 이름이 없기 때문에 파라미터나 반환 값 등을 통해서
     * 해당 람다가 어느 익명 메서드의 구현인지를 내부적으로 추론합니다.
     * 모든 요소가 같은 추상메서드가 2개 이상 존재한다면 자바는 해당 람다가
     * 어떤 추상 메서드에 구현인지를 추론할 수 없고 에러를 띄우게 됩니다.
     */
    print(() -> System.out.println("dweax")); 
  }

}
@FunctionalInterface
interface Output {
  void output();
}