class Solution {
    static class State {
        int node;
        int weight;
        int count;

        State(int node, int weight, int count) {
            this.node = node;
            this.weight = weight;
            this.count = count;
        }
    }

    public int shortestPath(int n, int[][] edges, String labels, int k) {
        List<List<int[]>> adj = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adj.add(new ArrayList<>());
        }

        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];
            int w = edge[2];
            adj.get(u).add(new int[] { v, w });
        }

        int[][] dist = new int[n][k + 1];
        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Integer.MAX_VALUE);
        }

        PriorityQueue<State> pq = new PriorityQueue<>((a, b) -> Integer.compare(a.weight, b.weight));

        dist[0][1] = 0;
        pq.offer(new State(0, 0, 1));

        while (!pq.isEmpty()) {
            State curr = pq.poll();
            int u = curr.node;
            int w = curr.weight;
            int count = curr.count;

            if (w > dist[u][count])
                continue;

            for (int[] neighbor : adj.get(u)) {
                int v = neighbor[0];
                int edgeWeight = neighbor[1];

                int newCount = (labels.charAt(v) == labels.charAt(u)) ? count + 1 : 1;

                if (newCount <= k) {
                if (w + edgeWeight < dist[v][newCount]) {
                    dist[v][newCount] = w + edgeWeight;
                    pq.offer(new State(v, dist[v][newCount], newCount));
                }
            }
            }

            
        }

        int minWight = Integer.MAX_VALUE;
        for (int c = 1; c <= k; c++) {
            minWight = Math.min(minWight, dist[n - 1][c]);
        }
        return minWight == Integer.MAX_VALUE ? -1 : minWight;
    }

}