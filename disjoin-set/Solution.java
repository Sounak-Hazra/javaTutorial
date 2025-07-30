class Solution {
    
    //disjoin set data stracture
    static int n = 10;
    static int par[] = new int[n];
    static int rank[] = new int[n];


    static void init() {
        for (int i = 0; i < n; i++) {
            par[i] = i;
            rank[i] = 0;
        }
    }

    static int find(int el) {
        if (par[el] == el) {
            return el;
        } else {
            return find(par[el]);
        }
    }

    static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (parA == parB) {
            par[parB] = parA;
            parA++;
        } else if (parA > parB) {
            par[parB] = parA;
        } else {
            par[parA] = parB;
        }
    }

    public static void main(String args[]) {
        init();

        union(1, 2);
        union(2, 3);
        union(4, 5);

        System.out.println(find(3));
        System.out.println(find(5)); 
    }
}