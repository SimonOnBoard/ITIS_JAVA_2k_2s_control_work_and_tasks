public class Student implements Comparable<Student> {
    private String name;
    private String group;
    private int result;

    public Student(String group, String name, int result) {
        this.name = name;
        this.group = group;
        this.result = result;
    }

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.group.compareTo(o.group) > 0 ? this.result - o.result : this.name.compareTo(o.name);
        //0 - объекты равны
        // > 0 - объект больше объекта поданного для сравнения ( this больше o)
        // < 0 - объект меньше объекта поданного для сравнения ( this меньше o)
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", result=" + result +
                '}';
    }
}
