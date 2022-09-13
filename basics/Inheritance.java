package basics;


class Base{

    static String box_type="Square";
     int box_height;
     int box_width;
    Base(){

        this.box_height=-1;
        this.box_width=-1;
    }
    Base(int box_height,int box_width){

        this.box_height=box_height;
        this.box_width=box_width;
    }


}
public class Inheritance extends Base {

    int box_weight=50;

//    Inheritance(int box_height, int box_width,int box_weight) {
//        super(box_height, box_width);
//        this.box_weight=box_weight;
//    }

    public static void main(String[] args) {
        Base box1=new Base(10,20);
        System.out.println(box1.box_width);
    }
}
