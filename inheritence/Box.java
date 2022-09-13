package inheritence;

public class Box {

    public int l;
    public int b;
    public int h;

    //constructor with no parameters
    Box(){
        //super(); object class(superclass of all classes)
        this.l=-1;
        this.b=-1;
        this.h=-1;
    }

    //constructor with 1 parameter ==> Cube
    Box(int size){
        this.l=size;
        this.b=size;
        this.h=size;
    }

    //constructor with 3 parameters
    Box(int l,int b,int h){
        this.l=l;
        this.b=b;
        this.h=h;
    }

    Box(Box old)
    {
        this.l= old.l;
        this.b= old.b;
        this.h= old.h;
    }
}
