package Text1;

import java.util.*;
import java.util.stream.IntStream;

class RandomizedSet {
/*    Set<Integer> set;
    public RandomizedSet() {
        set = new HashSet<>();
    }

    public boolean insert(int val) {
        return set.add(val);
    }

    public boolean remove(int val) {
        return set.remove(val);
    }

    public int getRandom() {
        Random r = new Random();
        int index = r.nextInt(set.size());
        //int[] arr = new int[set.size()];
        Object[] array = set.toArray();
        return (int)array[index];
    }*/
    List<Integer> list;
    Map<Integer, Integer> map;
    Random r;
    public RandomizedSet() {
        list = new ArrayList<>();
        map = new HashMap<>();
        r = new Random();
    }

    public boolean insert(int val) {
        if(map.containsKey(val)){
            return false;
        }
        int index = list.size();
        list.add(val);
        map.put(val, index);
        return true;
    }

    public boolean remove(int val) {
        if(!map.containsKey(val)){
            return false;
        }
        int index = map.get(val);
        int last = list.get(list.size() - 1);
        list.set(index, last);
        map.put(last, index);
        list.remove(list.size() - 1);
        map.remove(val);
        return true;
    }

    public int getRandom() {
        int index = r.nextInt(list.size());
        return list.get(index);
    }
}
