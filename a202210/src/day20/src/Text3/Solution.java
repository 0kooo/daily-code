package Text3;

import java.util.HashSet;
import java.util.Set;

/*class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while(n != 1 && !set.contains(n)){
            set.add(n);
            n = getNext(n);
        }
        return n == 1;
    }

    public int getNext(int n){
        int sum = 0;
        while(n != 0){
            int ge = n % 10;
            n = n / 10;
            sum += (ge * ge);
        }

        return sum;
    }
}*/
//快慢指针
class Solution {
    public boolean isHappy(int n) {
        int s = n;
        int f = n;
        do{
            s = getNext(s);
            f = getNext(getNext(f));
        }while(s != f);
        return s == 1;
    }

    public int getNext(int n){
        int sum = 0;
        while(n != 0){
            int ge = n % 10;
            n = n / 10;
            sum += (ge * ge);
        }

        return sum;
    }
}
