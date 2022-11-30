package day55.Text1;

class Solution {
    public int mySqrt(int x) {
        int left=0, right=x;
        long res;
        int mid;
        while(left<=right){
            mid=((right-left)>>1)+left;
            res=(long)mid*mid;
            if(res>x) right=mid-1;
            else if(res<x) left=mid+1;
            else return mid;
        }
        return right;
    }
}
