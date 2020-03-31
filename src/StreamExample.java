import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");
        list.add("Six");
        list.add("Seven");
        list.add("Eight");
        list.add("Nine");
        list.add("Ten");
        //exampleReduce(list);
        //generateStreams();
        javaRushTest();
    }
    public static void exampleReduce(List<String> numbers){
        String result = numbers.stream().filter(string -> string.length() <= 3).map(str -> str + " checked_map_stage;").limit(3)
                .reduce("Join result:",(accumulative,x)-> accumulative + " " + x);
//        Integer result = numbers.stream().filter(string -> string.length() <= 3).map(str -> str + " checked_map_stage;").mapToInt(str -> str.length())
//                .reduce(0, (acc,x) -> acc + x);
        System.out.println(result);
    }
    public static void example(List<String> numbers){
        Stream<String> stream = numbers.stream();
        Optional<String> result = stream.reduce((acc,x)-> acc + x);
        System.out.println(result.isPresent() + " " + result.isEmpty());
        System.out.println(numbers.stream().allMatch(x -> x.length() >= 4));
        System.out.println(numbers.stream().findFirst());
        System.out.println(numbers.stream().anyMatch(x -> x.length() < 3));
    }

    public static void generateStreams(){
        Stream twelve_numbers = Stream.generate(() -> 25).limit(5).sorted((o1,o2) -> o1.compareTo(o2));
        twelve_numbers.forEach(System.out::println);
    }

    public static void javaRushTest(){
        String[] array = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray = Arrays.stream(array);
//        List<String> list1 = streamOfArray.map(s -> s.split("")) //Преобразование слова в массив букв
//                .flatMap(Arrays::stream).distinct() //выравнивает каждый сгенерированный стрим в один стрим
//                .collect(Collectors.toList());
        streamOfArray.map(s -> s.split("")).flatMap(Arrays::stream).distinct().collect(Collectors.toList()).forEach(System.out :: print);
        System.out.println();




        String[] array1 = {"Java", "Ruuuuussshhh"};
        Stream<String> streamOfArray1 = Arrays.stream(array);
        List<String[]> arrayList = streamOfArray1.map(s -> s.split("")).collect(Collectors.toList());//collect позволяет собрать получившийся стрим в указанный тип
        List<Stream<String>> arrayList1 = Arrays.stream(array).map(s -> s.split("")).map(Arrays::stream).collect(Collectors.toList());
        //1 стриме будет J a v a
        //2 - соответсвущие строки каждая будет представлять букву из 2 слова
        //String[] -> Stream<String>
        System.out.println("SIZE_1 " + arrayList.size());
        for(String[] s: arrayList){
            System.out.println(s.length);
        }

        System.out.println("SIZE " + arrayList.size());
        for(Stream s : arrayList1){
            System.out.println("\n" + s.toString() + "\n");
            s.forEach(System.out::print);
        }
    }

}
