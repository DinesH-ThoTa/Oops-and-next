package abstractDemo;

public class Son extends Parent{


    Son(int age) {
        super(age);
    }

    @Override
    void career(){
        System.out.println("Son is an engineer and age is  "+ age);
    }

    @Override
    void partner() {
        System.out.println("Sons partner is Arya ");
    }

    @Override
    void normal(){
        System.out.println("normal mehod");
    }
}
