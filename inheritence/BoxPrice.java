package inheritence;

public class BoxPrice extends Box_Weight{
    public int price;
    BoxPrice()
    {
        this.price=-1;
    }


    public BoxPrice(int l, int b, int h, int box_weight, int price) {
//      this super calls the parent method Box_Weight
        super(l,b,h,box_weight);
        this.price=price;
    }
}
