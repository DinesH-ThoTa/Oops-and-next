package comparing;

public class Student implements Comparable<Student>{

    private int rollno;
    private float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    @Override
    public int compareTo(Student o) {
        int diff= (int)(this.marks - o.marks);

        //return 0 if both are equal
        //<0 if o is greater vice versa
        return diff;
    }
}
