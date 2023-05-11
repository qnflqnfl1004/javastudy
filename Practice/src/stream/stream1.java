package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class stream1 {
  /*
   * 스트림을 사용하는 이유
   * 
   * 간결하고 가독성이 높은 코드: 스트림은 함수형 프로그래밍의 개념을 활용하여
   * 데이터를 처리하는 코드를 간결하고 가독성 있게 작성할 수 있습니다.
   * 스트림은 연속적인 작업을 체인으로 연결하여 표현할 수 있으며,
   * 작업들은 중간 연산과 최종 연산으로 구분됩니다. 
   * 이를 통해 코드를 더 직관적으로 작성할 수 있습니다.
   * 
   * 병렬 처리 지원: 스트림은 데이터를 병렬로 처리하는 것을 자동으로 지원합니다. 
   * 병렬 스트림을 사용하면 멀티코어 프로세서를 활용하여 
   * 작업을 병렬로 처리할 수 있으므로 성능을 향상시킬 수 있습니다.
   * 이는 데이터의 크기가 크거나 병렬 처리가 유리한 작업에 특히 유용합니다.
   * 
   * 지연 연산: 스트림은 지연 연산(lazy evaluation)을 지원합니다. 
   * 이는 중간 연산을 수행할 때 실제로 데이터가 처리되지 않고 연산 그래프만 구성되는 것을 의미합니다. 
   * 최종 연산이 호출될 때까지 중간 연산이 실행되지 않으며, 이를 통해 불필요한 연산을 피할 수 있습니다.
   * 이러한 특성은 대량의 데이터나 복잡한 연산을 다룰 때 성능과 메모리 사용을 최적화하는 데 도움을 줍니다.
   * 
   * 다양한 중간 연산과 최종 연산 제공: 스트림은 다양한 중간 연산과 최종 연산을 제공하여
   * 데이터를 필터링, 변환, 정렬, 그룹화, 집계하는 등 다양한 작업을 수행할 수 있습니다.
   * 이를 통해 코드를 더 유연하게 작성하고 원하는 결과를 쉽게 얻을 수 있습니다.
   */
  public static void main(String[] args) {
    int[] arr = {1, 1, 10, 30, 2};
    List<Integer> list = new ArrayList<>();
    Set<Integer> set = new HashSet<>();
    
    /* Stream을 쓰지 않았을 경우 */
    // 배열의 내용을 set 담습니다
    for (int i = 0; i < arr.length; i++) {
        set.add(arr[i]);
    }
    // set을 iterator 안에 담습니다.    
    Iterator<Integer> iter = set.iterator();
    
    // iterator를 list 안에 담고
    for (int i = 0; iter.hasNext(); i++) {
      list.add(iter.next());
    }
    
    // reverseOrder()로 역정렬을 합니다.
    list.sort(Comparator.reverseOrder());
    
    System.out.println("일반방법으로 출력 : " + list.toString());
    
    /* Stream을 사용하는 경우 */
    System.out.println("Stream으로 출력 : " + 
            Arrays.stream(arr).boxed() // Stream을 생성하고
            .distinct() // 중복을 제거하고
            .sorted(Comparator.reverseOrder()) // 역정렬 한 다음
            .collect(Collectors.toList()) // List로 반환합니다.
    ); 
  }

}
