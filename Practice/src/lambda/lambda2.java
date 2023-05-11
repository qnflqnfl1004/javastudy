package lambda;

import java.util.Comparator;

public class lambda2 {

  public static void main(String[] args) {
    /*
     * 함수형 인터페이스
     * 
     * Consumer<T> 하나의 인자를 받고, 반환값이 없는 함수 인터페이스입니다. 주로 인자로 받은 객체를 처리하는데 사용됩니다.
     * 
     * Function<T, R> 하나의 인자를 받아서 다른 타입의 값을 반환하는 함수 인터페이스입니다. 주로 인자를 변환하는데 사용됩니다.
     * 
     * Supplier<T> 인자를 받지 않고, 값을 반환하는 함수 인터페이스입니다. 주로 어떤 객체나 값을 생성하는데 사용됩니다.
     * 
     * Predicate<T> 하나의 인자를 받아서, true 또는 false를 반환하는 함수 인터페이스입니다. 주로 인자를 조건으로 검사하는데 사용됩니다.
     * 
     * BiConsumer<T, U> 두 개의 인자를 받고, 반환값이 없는 함수 인터페이스입니다. 주로 두 개의 인자를 처리하는데 사용됩니다.
     * 
     * BiFunction<T, U, R> 두 개의 인자를 받아서, 다른 타입의 값을 반환하는 함수 인터페이스입니다. 주로 두 개의 인자를 변환하는데 사용됩니다.
     * 
     * BinaryOperator<T> 두 개의 인자를 받아서, 같은 타입의 값을 반환하는 함수 인터페이스입니다. 주로 두 개의 인자를 연산하는데 사용됩니다.
     * 
     * UnaryOperator<T> Function<T, T>와 같이 입력과 출력 타입이 같은 함수 인터페이스입니다. 주로 입력을 연산하여 같은 타입의 값을 반환하는데
     * 사용됩니다.
     * 
     * Runnable 인자를 받지 않고, 반환값이 없는 함수 인터페이스입니다. 주로 어떤 작업을 실행하는데 사용됩니다.
     */
    
    /* 함수형 인터페이스는 람다 표현식 및 스트림 API와 함께 자주 사용됩니다. 
     * 람다 표현식은 함수형 인터페이스의 인수로 전달할 수 있으며 
     * 스트림 API는 함수형 인터페이스를 사용하여 데이터를 처리하는 데 사용할 수 있습니다.
     * 두 가지 함수형 인터페이스로 익명클래스를 람다식으로 구현해 보았습니다. */
    
    /*
     * 익명 내부 클래스1
     * 
     * Runnable은 기본적인 인터페이스이며 단일 메소드인 'run()'을 정의하고 있습니다.
     * 매개변수와 반환값은 없습니다.
     */
      Runnable r = new Runnable() {
        
        @Override
        public void run() {
            System.out.println("익명 내부 클래스");
        }
      };
      
      r.run();
      
      
    /*
     * 익명 내부 클래스2
     * 
     * Comparator 인터페이스는 같은 제네릭 타입 매개변수 두개를 받고, Integer 반환값을 가지고 있습니다.
     * Comparator 인터페이스의 compare() 메소드가 두 값의 대소관계를 비교하고,
     * 첫 번째 인자가 두 번째 인자보다 크면 양수를, 같으면 0을, 작으면 음수를 반환합니다.
     * o1 은 Integer 이고, Integer는 Comparable을 구현하고 Comparable 에 comparaTo 메서드가 있습니다.
     * 실행시키면 첫 번째 인자가 두 번쨰 인자보다 크기 때문에 양수를 반환합니다.
     */
      Comparator<Integer> comp = new Comparator<Integer>() {    //
                                                                //
        @Override
        public int compare(Integer o1, Integer o2) {
          return o1.compareTo(o2);                              // 
        }                                                       // 
      };
      
      System.out.println(comp.compare(2, 1));
  }
}
