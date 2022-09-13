package polymorphism;

public class CompileTime_Poly {

    //compile or static polymorphism
    //two or more methods with same name but different parameters
    int sum(int a, int b){
        return a+b;
    }

    int sum(int a, int b, int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        CompileTime_Poly obj=new CompileTime_Poly();
        obj.sum(1,2);
        obj.sum(1,2,3);
    }
}
