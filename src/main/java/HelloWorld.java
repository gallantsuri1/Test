import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HelloWorld {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 2, 3, 4, 5};
        List<Integer> list = Arrays.asList(arr);

        list.forEach((x) -> {
            System.out.println(x);
        });

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
        int result = numbers
                .stream()
                .reduce(0, (subtotal, element) -> subtotal + element);
        System.out.println(result);
        System.out.println(Stream.of(1,4,2,9,6,8,5).max(Integer::compareTo).get().intValue() );
        System.out.println(Stream.of(1,4,2,9,6,8,5).collect(Collectors.averagingInt(Integer::intValue)));
        //list.stream().filter(x -> Hello.greater(x)).forEach(x -> System.out.println(x));

        List<Integer> myList = new ArrayList<>();
        for(int i=0; i<100; i++) myList.add(i);

        //List<Integer> l = myList.stream().map(x -> x*2).collect(Collectors.toList());
        //List<Integer> f = myList.stream().filter(x -> x>50).collect(Collectors.toList());
        System.out.println(myList.stream().reduce(0, Integer::sum).intValue());
        System.out.println((100*(100-1))/2);

    }
}
