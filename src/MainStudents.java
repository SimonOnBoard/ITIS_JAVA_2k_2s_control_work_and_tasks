import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MainStudents {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("11-802", "Nurieva", 96));
        students.add(new Student("11-801", "Elanskaya", 94));
        students.add(new Student("11-804", "Elin", 94));
        students.add(new Student("11-805", "Gimazov", 94));
        students.add(new Student("11-803", "Akhmetov", 96));
        students.add(new Student("11-807", "Amirkhanova", 95));
        students.add(new Student("11-806", "Shagaliev", 95));
        for (Student student: students){
            System.out.println(student);
        }
        System.out.println("_________________________________");
        Comparator<Student> studentComparator = new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getResult() - o2.getResult();
            }
        };
        Collections.sort(students, studentComparator);

        for (Student student: students){
            System.out.println(student);
        }
        System.out.println("_________________________________");
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int nameResult = o1.getName().compareTo(o2.getName());
                int groupResult = o1.getGroup().compareTo(o2.getGroup());
                if(nameResult > 0 && groupResult > 0){
                    return -1;
                } else if(nameResult > 0 && groupResult < 0){
                    return 1;
                } else if(nameResult < 0 && groupResult > 0){
                    return 1;
                } else if(nameResult < 0 && groupResult < 0){
                    return -1;
                }
                if (nameResult == 0 || groupResult == 0) {
                    return 0;
                }
                return 0;
            }
        });
        System.out.println("FORCED COMPARATOR");

        for (Student student: students){
            System.out.println(student);
        }
        System.out.println("_________________________________");
    }
}
