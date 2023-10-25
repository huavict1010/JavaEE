import java.util.*;

class Pair implements Comparable<Pair> {
    int x, y;
    Pair(int x, int y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public int compareTo(Pair p) {
        return this.x - p.x;
    }
}

public class Main {
    private static final int N = 100010;
    private static final int M = N * 2;
    private static final int INF = 0x3f3f3f3f;
    private static int[] h, e, ne, w;
    private static int idx;
    private static int n, m;
    private static int[] d;
    private static boolean[] st;
    private static void init() {
        h = new int[N];
        e = new int[N];
        ne = new int[N];
        w = new int[N];
        Arrays.fill(h, -1);
        idx = 0;
    }
    private static void add(int a, int b, int c) {
        w[idx] = c;
        e[idx] = b;
        ne[idx] = h[a];
        h[idx] = idx ++;
    }
    private static void add(int a, int b) {
        e[idx] = b;
        ne[idx] = h[a];
        h[a] = idx ++;
    }
    private static int dijkstra() {
        PriorityQueue<Pair> q = new PriorityQueue<>();
        q.offer(new Pair(d[1], 1));
        st[1] = true;
        while (!q.isEmpty()) {
            var t = q.poll();
            int ver = t.y;
            st[ver] = true;
            for (int i = h[ver]; i != -1; i = ne[i]) {
                int j = e[i];
                if (d[j] > d[ver] + w[i]) {
                    d[j] =d[ver] + w[i];
                    q.offer(new Pair(d[j], j));
                }
            }
        }
        if (d[n] == INF) {
            return -1;
        }
        return d[n];
    }
    public static void main(String[] args) {
        init();
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        d = new int[N];
        Arrays.fill(d, INF);
        st = new boolean[N];
        while (m -- > 0) {
            int a, b, c;
            a = sc.nextInt();
            b = sc.nextInt();
            c = sc.nextInt();
            add(a, b, c);
        }
        System.out.println(dijkstra());
    }
}