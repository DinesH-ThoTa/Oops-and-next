package abstractDemo;

public class Daughter extends Parent{


    Daughter(int age) {
        super(age);
    }

    @Override
    void career() {
        System.out.println("Daughter is an doctor and she is "+age);
    }

    @Override
    void partner() {
        System.out.println("Daughter loves Ned");
    }
}
