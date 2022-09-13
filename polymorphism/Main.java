package polymorphism;

public class Main {
    public static void main(String[] args) {
//        Shapes s=new Shapes();
//        s.area();
//
//        Circle c=new Circle();
//        c.area();

        //here we are overriding the area method in shapes and the area method in square will run
        Shapes sq=new Square();
        sq.area();
    }
}
