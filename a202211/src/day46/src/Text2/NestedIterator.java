package Text2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NestedIterator implements Iterator<Integer> {
    public static void main(String[] args) {

    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public Integer next() {
        return null;
    }
    /*private List<Integer> vals;
    private Iterator<Integer> res;
    public NestedIterator(List<NestedInteger> nestedList) {
        vals = new ArrayList<>();
        dfs(nestedList);
        res = vals.iterator();
    }

    @Override
    public Integer next() {
        return res.next();
    }

    @Override
    public boolean hasNext() {
        return res.hasNext();
    }

    private void dfs(List<NestedInteger> nestedList) {
        for (NestedInteger nest : nestedList) {
            if (nest.isInteger()) {
                vals.add(nest.getInteger());
            } else {
                dfs(nest.getList());
            }
        }
    }*/
}
