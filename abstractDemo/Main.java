package abstractDemo;

public class Main {

    public static void main(String[] args) {
        Son son=new Son(27);
        Daughter d=new Daughter(30);

        son.career();
        son.partner();

        d.career();
        d.partner();

        Parent.hello();
        son.normal();
    }
}
