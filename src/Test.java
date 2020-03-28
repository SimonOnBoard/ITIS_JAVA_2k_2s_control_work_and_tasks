import java.util.*;

public class Test {
    public static void main(String[] args) {
        //Set<String> setString = new HashSet<>();
//        setString.add("352");
//            setString.add("352");
//        setString.add("200");
//        System.out.println(setString.size());
//        System.out.println(setString.toString());
//
        SortedSet<String> strings = new TreeSet<>();
//        strings.addAll(setString);
//        System.out.println(strings.size());
//        System.out.println(strings.toString());
       Iterator iterator = strings.iterator();
//        while (iterator.hasNext()){
//            //iterator.remove();
//            System.out.println(iterator.next());
//        }
//        System.out.println(iterator);
//        while (iterator.hasNext()){
//            System.out.println("Anything else");
//        }

//        List<Double> strings1 = new ArrayList<>();
//        strings1.add(43.43);
//        strings1.add(432.32);
//        System.out.println(strings1.toString());
//        strings1.add(1,4.43);
//        strings1.add(432.32);
//        System.out.println(strings1.toString());
//        System.out.println(strings1.lastIndexOf(432.32));
//        System.out.println(strings1.indexOf(432.43));
//        System.out.println(strings1.indexOf(432.32));
//        System.out.println(strings1.subList(0,3).toString());
//        System.out.println(strings1.get(1));
//        ListIterator<Double> listIterator = strings1.listIterator();
//        while (listIterator.hasNext()){
//            System.out.println(listIterator.next());
//        }
//        System.out.println("__________________");
//        while (listIterator.hasPrevious()){
//            System.out.println(listIterator.previous());
//        }
//
//        System.out.println("__________________");
//        System.out.println(strings1.toString());
//        int i = 0;
//        while (listIterator.hasNext()){
//            if(i == 3){
//                //listIterator.set(432.25245345);
//                listIterator.remove();
//            }
//            else{
//                System.out.println(listIterator.next());
//            }
//            i++;
//        }
//        System.out.println(strings1.toString());
//        System.out.println(strings1.size());

//        Deque<String> deque = new ArrayDeque<>();
//        System.out.println(deque.offer("50"));
//        System.out.println(deque.offer("60"));
//        System.out.println(deque.offer("70"));
//
//        //deque.offer("5356");
//        //String str = "432";
//        System.out.println(deque.getFirst());
//        System.out.println(deque.getFirst());

//        Queue<String> queue = new LinkedList<>();
//        //queue.remove();
//        System.out.println(queue.poll());
//        System.out.println(queue.peek());
//        //System.out.println(queue.element());
//        queue.offer("543534");
//        queue.offer("462543");
//        System.out.println(queue.remove());
//        System.out.println(queue.peek());
        //FIFO - First In First Out - queue
        //LIFO - Last In First Out -stack


        Map<String, Long> result = new HashMap<>();
        System.out.println(result.put("Иван",43L));
        System.out.println(result.put("Алексей",35L));
        result.put("Андрей",32L);
        result.put("Ahrakadabra",11L);
        result.put("Ныпфыпа",15L);
        Set<String> keys = result.keySet();
        Set<Map.Entry<String,Long>> entries = result.entrySet();

        System.out.println(keys.toString());
        result.put("Андрей",253425L);
        for(String s: keys){
            System.out.println("Key: " + s + " Value:" + result.get(s));
        }
        System.out.println("---------------------------------------");
        for (Map.Entry<String,Long> entry: entries){
            System.out.println(entry.getKey() +  " " + entry.getValue());
        }


////        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>((o1, o2) -> {
////            return o2 - o1;
////        });
////
////        priorityQueue.add(1);
////        priorityQueue.add(2);
////        priorityQueue.add(3);
////        while (priorityQueue.peek() != null){
////            System.out.println(priorityQueue.poll());
////        }
    }
}
