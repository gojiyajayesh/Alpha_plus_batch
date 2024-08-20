import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphCode {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 9;
        @SuppressWarnings("unchecked")
        ArrayList<Edge>[] graph = new ArrayList[V];
        buildGraph(graph);
        System.out.println("Graph Breadth First Search...");
        BFS(graph);
        System.out.println();
        System.out.println("Graph Depth First Search (Recursive)...");
        DFS(graph, 0, new boolean[V]);
        System.out.println();
        System.out.println("Graph Depth First Search (Iterative)...");
        DFS(graph);
        System.out.println();
        System.out.println("Path is Present between 0 and 8");
        System.out.println(hasPath(graph, 0, 8, new boolean[V]));
    }

    public static void buildGraph(ArrayList<Edge>[] graph) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        // Vertex-0
        graph[0].add(new Edge(0, 1, 1));
        graph[0].add(new Edge(0, 2, 1));

        // Vertex-1
        graph[1].add(new Edge(1, 3, 1));
        graph[1].add(new Edge(1, 0, 1));

        // Vertex-2
        graph[2].add(new Edge(2, 4, 1));
        graph[2].add(new Edge(2, 0, 1));

        // Vertex-3
        graph[3].add(new Edge(3, 1, 1));
        graph[3].add(new Edge(3, 4, 1));
        graph[3].add(new Edge(3, 5, 1));

        // Vertex-4
        graph[4].add(new Edge(4, 3, 1));
        graph[4].add(new Edge(4, 2, 1));
        graph[4].add(new Edge(4, 5, 1));

        // Vertex-5
        graph[5].add(new Edge(5, 6, 1));
        graph[5].add(new Edge(5, 3, 1));
        graph[5].add(new Edge(5, 4, 1));

        // Vertex-6
        graph[6].add(new Edge(6, 5, 1));

        // Vertex-7
        graph[7].add(new Edge(7, 8, 1));

        // Vertex-8
        graph[8].add(new Edge(8, 7, 1));
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int source, int target, boolean[] visited) {
        if (source == target) {
            return true;
        }
        if (!visited[source]) {
            visited[source] = true;
            for (Edge e : graph[source]) {
                if (hasPath(graph, e.dest, target, visited)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void DFS(ArrayList<Edge>[] graph, int curr, boolean[] visited) {
        if (visited[curr]) {
            return;
        }
        visited[curr] = true;
        System.out.print(curr + " ");
        for (Edge e : graph[curr]) {
            if (!visited[e.dest]) {
                DFS(graph, e.dest, visited);
            }
        }
    }

    public static void DFS(ArrayList<Edge>[] graph) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!visited[i]) {
                DFS(graph, i, visited);
            }
        }
    }

    public static void DFSIterative(ArrayList<Edge>[] graph) {
        Stack<Integer> stack = new Stack<>();
        boolean[] tracer = new boolean[graph.length];
        for (int j = 0; j < graph.length; j++) {
            if (!tracer[j]) {
                stack.push(j);
                while (!stack.isEmpty()) {
                    int curr = stack.pop();
                    if (!tracer[curr]) {
                        System.out.print(curr + " ");
                        tracer[curr] = true;
                        for (int i = graph[curr].size() - 1; i >= 0; i--) {
                            stack.push(graph[curr].get(i).dest);
                        }
                    }
                }
            }
        }
    }

    public static void BFS(ArrayList<Edge>[] graph) {
        if (graph.length == 0) {
            System.out.println("Graph Is Empty!!");
            return;
        }
        boolean[] tracer = new boolean[graph.length];
        Queue<Integer> q = new LinkedList<>();
        for (int j = 0; j < graph.length; j++) {
            if (!tracer[j]) {
                q.add(j);
                while (!q.isEmpty()) {
                    int curr = q.remove();
                    if (!tracer[curr]) {
                        System.out.print(curr + " ");
                        tracer[curr] = true;
                        for (int i = 0; i < graph[curr].size(); i++) {
                            q.add(graph[curr].get(i).dest);
                        }
                    }
                }
            }
        }
    }
}
