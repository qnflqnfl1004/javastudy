package lambda;

import java.util.Comparator;

public class lambda3 {

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
    
    /*
     * 람다식1
     */    Runnable r = () -> {
      System.out.println("익명 내부 클래스를 람다식으로");
    };
    
    r.run();
    
    /*
     * 람다식2
     * 
     * 매개변수, 반환자료형이 Integer니까 중괄호 생략가능.
     */
    Comparator<Integer> comp = (o1, o2) -> (o1.compareTo(o2)); 
    
    System.out.println(comp.compare(2, 1));
  }

}