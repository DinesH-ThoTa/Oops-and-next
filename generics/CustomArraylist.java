package generics;

import java.util.Arrays;

public class CustomArraylist {

    private int[] data;
    private int DEFAULT_SIZE=10;
    private int size=0;

    CustomArraylist(){
        this.data=new int[DEFAULT_SIZE];
    }
    public void add(int num){
        if(isFull())
            resize();
        data[size++]=num;
    }

    public boolean isFull(){
        return size == data.length;
    }

    public void resize(){
        int[] temp = new int[size*2];
        for (int i = 0; i < data.length; i++) {
            temp[i]=data[i];
        }
        data=temp;
    }

    public int remove(){
        return data[--size];
    }

    @Override
    public String toString(){
        return Arrays.toString(data)+" Size"+size;
    }

    public static void main(String[] args) {
        CustomArraylist list = new CustomArraylist();

        list.add(20);
        list.remove();
        list.add(50);

        for (int i = 0; i < 15; i++) {
            list.add(10);
        }

        System.out.println(list);
    }
}
