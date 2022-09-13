package comparing;

public class Main {
    public static void main(String[] args) {
        Student Dinesh = new Student(10, 87.65f);
        Student Rick = new Student(18, 97.76f);

        if(Rick.compareTo(Dinesh) > 0){
            System.out.println("Rick has more marks");
        }
    }
}
