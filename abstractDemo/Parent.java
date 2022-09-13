package abstractDemo;

//abstract classes only contain abstract methods
public abstract class Parent {

    int age;

    //we  can have a constructor in abstract class
    Parent(int age){
        this.age=age;
    }
    abstract void career();
    abstract void partner();


    //we can have static methods in abstract class but cannot have abstract static methods
    static void  hello(){
        System.out.println("hello");
    }

    void normal() {
    }
}
