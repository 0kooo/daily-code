package day383.Test1;

import java.util.*;

//1600. 王位继承顺序
class ThroneInheritance {
    Map<String, List<String>> edges;
    Set<String> dead;
    String king;

    public ThroneInheritance(String kingName) {
        edges = new HashMap<>();
        dead = new HashSet<>();
        king = kingName;
    }

    public void birth(String parentName, String childName) {
        List<String> children = edges.getOrDefault(parentName, new ArrayList<String>());
        children.add(childName);
        edges.put(parentName, children);
    }

    public void death(String name) {
        dead.add(name);
    }

    public List<String> getInheritanceOrder() {
        List<String> ans = new ArrayList<>();
        preorder(ans, king);
        return ans;
    }

    private void preorder(List<String> ans, String name) {
        if(!dead.contains(name)){
            ans.add(name);
        }
        List<String> children = edges.getOrDefault(name, new ArrayList<String>());
        for (String child : children) {
            preorder(ans, child);
        }
    }
}
