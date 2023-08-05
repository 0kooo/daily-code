package day263.Test2;

class UnionFind {
    private int[] arr;
    private double[] weight;
    public UnionFind(int n){
        this.arr = new int[n];
        this.weight = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = i;
            weight[i] = 1.0d;
        }
    }

    public void union(int x, int y, double value){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY) return;
        arr[rootX] = rootY;
        weight[rootX] = weight[y] * value / weight[x];
    }

    public int find(int x){
        if(x != arr[x]){
            int origin = arr[x];
            arr[x] = find(arr[x]);
            weight[x] *= weight[origin];
        }
        return arr[x];
    }

    public double isConnected(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if(rootX == rootY) return weight[x] / weight[y];
        else return -1.0d;
    }
}
