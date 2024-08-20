import java.util.ArrayList;

public class GraphCycleDetection {
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
        System.out.println(isCycle(graph, 0));
    }

    public static boolean isCycle(ArrayList<Edge>[] graph, int curr) {
        boolean[] visited = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if(!visited[i]){
                if(isCycleUtil(graph, i, -1, visited)){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean isCycleUtil(ArrayList<Edge>[] graph, int curr,int prev,boolean[] visited) {
        visited[curr]=true;
            for(int i=0;i<graph[curr].size();i++){
                Edge e=graph[curr].get(i);
                // Case -1   not visited and check for next 
                if(!visited[e.dest]){
                    if(isCycleUtil(graph, e.dest,curr,visited))
                    return true;
                }
                // Case-2 all visited and not parent
                else if(visited[e.dest] && e.dest!=prev){
                    return true;
                }
            }
            return false;
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
}
