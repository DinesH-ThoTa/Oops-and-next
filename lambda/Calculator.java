package lambda;

public class Calculator {
    public static void main(String[] args) {
//
        Operation sum=(a,b) -> a + b;
        Operation prod=(a,b) -> a * b;
        Calculator cal=new Calculator();
        System.out.println(cal.fun(2,3,sum));
        System.out.println(cal.fun(2,3,prod));
    }

    private int fun(int a, int b, Operation specified){
        return specified.op(a,b);
    }
}

interface Operation{
    int op(int a, int b);
}
