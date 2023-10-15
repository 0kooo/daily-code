package day317.Test2;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

//950. 按递增顺序显示卡牌
class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int n = deck.length;
        Deque<Integer> deque = new ArrayDeque<>();
        for (int i = 0; i < n; i++) {
            deque.add(i);
        }
        Arrays.sort(deck);
        int[] res = new int[n];
        for (int num : deck) {
            res[deque.pollFirst()] = num;
            if(!deque.isEmpty()) deque.add(deque.pollFirst());
        }
        return res;
    }
}
