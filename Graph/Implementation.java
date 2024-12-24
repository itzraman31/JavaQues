
// package Graph;
import java.util.*;

public class Implementation {
    static class edge {
        int src;
        int dest;
        int dist;

        public edge(int s, int d, int dis) {
            this.src = s;
            this.dest = d;
            this.dist = dis;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<edge>();
        }
        // graph[0].add(new edge(0, 1, 2));
        // graph[0].add(new edge(0, 3, 4));
        // graph[0].add(new edge(0, 5, 7));

        // graph[1].add(new edge(1, 0, 8));
        // graph[1].add(new edge(1, 2, 3));
        // graph[1].add(new edge(1, 3, 1));
        // graph[1].add(new edge(1, 5, 3));

        // graph[2].add(new edge(2, 1, 2));

        // graph[3].add(new edge(3, 0, 9));
        // graph[3].add(new edge(3, 1, 4));
        // graph[3].add(new edge(3, 4, 9));

        // graph[4].add(new edge(4, 3, 2));

        // graph[5].add(new edge(5, 0, 3));
        // graph[5].add(new edge(5, 1, 5));

        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 5));
        graph[0].add(new edge(0, 3, 8));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 2, 2));
        graph[1].add(new edge(1, 4, 6));

        graph[2].add(new edge(2, 0, 5));
        graph[2].add(new edge(2, 1, 2));
        graph[2].add(new edge(2, 4, 4));

        graph[3].add(new edge(3, 0, 8));
        graph[3].add(new edge(3, 4, 3));

        graph[4].add(new edge(4, 1, 6));
        graph[4].add(new edge(4, 2, 4));
        graph[4].add(new edge(4, 3, 3));
    }

    public static void print(ArrayList<edge> graph[], int n) {
        for (int i = 0; i < graph[n].size(); i++) {
            edge e = graph[n].get(i);
            System.out.println(e.src + " , " + e.dest);
        }
    }

    static void BFS(ArrayList<edge> graph[], int stPoint) {
        Queue<Integer> q = new LinkedList<>();
        boolean arr[] = new boolean[graph.length + 1];

        int e = graph[stPoint].get(0).src;
        q.add(e);

        while (!q.isEmpty()) {
            stPoint = q.poll();
            e = graph[stPoint].get(0).src;
            if (arr[e] == false) {
                System.out.print(e + " ");
                arr[e] = true;

                for (int i = 0; i < graph[e].size(); i++) {
                    int s = graph[e].get(i).dest;
                    q.add(s);
                }
            }
        }
    }

    static void DFS(ArrayList<edge> graph[], int stPoint, boolean vis[]) {
        System.out.print(stPoint + " ");
        vis[stPoint] = true;

        for (int i = 0; i < graph[stPoint].size(); i++) {
            edge e = graph[stPoint].get(i);
            if (vis[e.dest] == false) {
                DFS(graph, e.dest, vis);
            }
        }
    }

    static void AllPath(ArrayList<edge> graph[], int stPoint, boolean vis[], int target, String res) {
        if (stPoint == target) {
            System.out.println(res + "" + target);
            return;
        }
        res += stPoint + " ";
        vis[stPoint] = true;

        for (int i = 0; i < graph[stPoint].size(); i++) {
            edge e = graph[stPoint].get(i);
            if (vis[e.dest] == false) {
                AllPath(graph, e.dest, vis, target, res);
                vis[e.dest] = false;
            }
        }
    }

    static class Pair implements Comparable<Pair> {
        int dis;
        int node;

        public Pair(int dis, int node) {
            this.dis = dis;
            this.node = node;
        }

        @Override
        public int compareTo(Pair other) {
            return Integer.compare(this.dis, other.dis);
        }
    }

    static void Dijkastra(int src, boolean vis[], ArrayList<edge> graph[]) {
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>();

        int disArr[] = new int[graph.length];
        disArr[src] = 0;
        for (int i = 0; i < graph.length; i++) {
            if (i != src) {
                disArr[i] = Integer.MAX_VALUE;
            }
        }

        pq.add(new Pair(0, src));
        vis[src] = true;
        while (!pq.isEmpty()) {
            Pair p = pq.remove();

            for (int i = 0; i < graph[p.node].size(); i++) {
                edge child = graph[p.node].get(i);
                if (vis[child.dest] == false) {
                    if (disArr[child.dest] > p.dis + child.dist) {
                        disArr[child.dest] = p.dis + child.dist;
                        pq.add(new Pair(disArr[child.dest], child.dest));
                    }
                }
            }
        }

        System.out.println();
        for (int i = 0; i < disArr.length; i++) {
            System.out.print(disArr[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        boolean vis[] = new boolean[v];
        String res = "";

        createGraph(graph);

        // BFS(graph, 5);

        // DFS(graph, 2, vis);

        // AllPath(graph, 2, vis, 3, res);

        // PriorityQueue<Integer> pq = new PriorityQueue<>();
        // PriorityQueue<Integer> pqI=new PriorityQueue<>(Collections.reverseOrder());
        // ArrayList<ArrayList<Integer>> arr=new ArrayList<>();

        // PRINTING GRAPH --->>>
        // int n = 0;
        // while (n != -1) {
        // System.out.println("To exit type -1");
        // System.out.print("Enter vertex index to visit: ");
        // n = sc.nextInt();
        // if (n != -1) {
        // print(graph, n);
        // }
        // }

        Dijkastra(1, vis, graph);
    }
}