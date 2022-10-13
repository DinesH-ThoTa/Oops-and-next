package Tree;

import java.util.Map;
import java.util.TreeMap;

public class get_Map {
    public static void main(String[] args) {
        Map<Integer,Integer> map= new TreeMap<>();
        int n=0, x=100;
        while(n<5){
            map.put(n,x);
            n++;
            x++;
        }
        int m =3;
        while(m<5){
            map.put(m,x);
            m++;
            x++;
        }
        for(Map.Entry<Integer, Integer> entry : map.entrySet())
            System.out.println(entry.getValue());
    }
}
