public class Student implements Comparable<Student> {
    private final String name;
    private double gpa;

    public Student(String name, double age) {
        this.name = name;
        this.gpa = age;
    }

    @Override
    public int compareTo(Student o) {
        return this.name.compareTo(o.name);
    }
}