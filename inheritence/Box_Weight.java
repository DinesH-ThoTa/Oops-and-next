package inheritence;

public class Box_Weight extends Box{
    public int box_weight;

    Box_Weight()
    {
        this.box_weight=-1;
    }

    public Box_Weight(int l, int b, int h, int box_weight) {
        super(l, b, h);//calls the parent class constructor
        //we can refer to parent variables to this.l or super.l
        //if both child and parent has same variable then we can access parent variable with super
        this.box_weight = box_weight;
    }
}

