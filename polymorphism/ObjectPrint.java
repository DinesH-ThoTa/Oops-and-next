package polymorphism;

public class ObjectPrint {

    int num=10;

    //this is runtime or dynamic polymorphism
    //here we are overriding the toString method
    @Override
    public String toString(){
        return "Object"+num;
    }
    public static void main(String[] args) {
        ObjectPrint obj=new ObjectPrint();
        System.out.println(obj);
    }
}
