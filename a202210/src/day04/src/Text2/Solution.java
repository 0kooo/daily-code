package Text2;

import java.util.Scanner;

public class Solution {
    public static int main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int num = sc.nextInt();
            arr[i] = num;
        }
        int higher = sc.nextInt();
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] <= (higher + 30)){
                count++;
            }
        }
        return count;
    }
}
