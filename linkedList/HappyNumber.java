package linkedList;
//https://leetcode.com/problems/happy-number/submissions/
public class HappyNumber {
    public boolean isHappy(int n) {

        int slow = n;
        int fast = n;
        do{
            slow = happy(slow);
            fast = happy(happy(fast));
        }while(slow != fast);

        if(slow == 1){
            return true;
        }
        return false;

    }

    public int happy(int num){
        int ans = 0;
        while(num > 0){
            int rem = num%10;
            ans += (rem*rem);
            num /= 10;
        }

        return ans;
    }

    public static void main(String[] args) {
        HappyNumber obj = new HappyNumber();
//        obj.happy(10);

        System.out.println(obj.isHappy(10));
    }
}
