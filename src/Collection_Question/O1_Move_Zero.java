package Collection_Question;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class O1_Move_Zero {
    public static void main(String[] args){
        List<Integer> numbers = Arrays.asList(1, 0, -3, 0, 5, -2, 0, 8, 0, -4);

        List<Integer> moveZeroEle = Stream.concat(numbers.stream().filter(n->n!=0), numbers.stream().filter(n->n==0)).collect(Collectors.toList());

        System.out.println(moveZeroEle);
    }
}
