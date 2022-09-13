package inheritence;

public class Main {

    public static void main(String[] args) {
//        Box box1=new Box();
//        System.out.println(box1.l+" "+ box1.b+" "+ box1.h);
//
//        Box box2=new Box(5);
//        System.out.println(box2.l+" "+ box2.b+" "+ box2.h);
//
//        Box box3=new Box(1,2,3);
//        System.out.println(box3.l+" "+ box3.b+" "+ box3.h);
//
//        Box box4=new Box(box3);
//        System.out.println(box4.l+" "+ box4.b+" "+ box4.h);

//        Box_Weight box5=new Box_Weight();
//        System.out.println(box5.h+" "+box5.box_weight);
//
//       Box_Weight box6=new Box_Weight(1,2,3,4);
//        System.out.println(box6.l+" "+ box6.b+" "+ box6.h+" "+ box6.box_weight);

//      As we are referencing box7 with Box, we can only acess Box properties,so we can't access box_weight
//      Box box7=new Box_Weight(1,2,3,4);
//      System.out.println(box7.l+" "+ box7.b+" "+ box7.h+" "+ box7.box_weight);

//        BoxPrice boxPrice=new BoxPrice();
//        System.out.println(boxPrice.l);

        BoxPrice boxPrice1=new BoxPrice(1,2,3,10,50);
        System.out.println(boxPrice1.l);
    }
}
