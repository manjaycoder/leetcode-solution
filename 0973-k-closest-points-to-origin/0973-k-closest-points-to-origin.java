import java.util.PriorityQueue;

class Solution {

    // Helper class
    static class Coordinate implements Comparable<Coordinate> {
        int x;
        int y;

        Coordinate(int x, int y) {
            this.x = x;
            this.y = y;
        }

        // Distance from origin (no sqrt needed)
        public int calDistance() {
            return x * x + y * y;
        }

        @Override
        public int compareTo(Coordinate other) {
            // Max heap based on distance
            return other.calDistance() - this.calDistance();
        }
    }

    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<Coordinate> pq = new PriorityQueue<>();

        for (int[] point : points) {
            pq.offer(new Coordinate(point[0], point[1]));
            if (pq.size() > k) {
                pq.poll(); // remove farthest
            }
        }

        int[][] ans = new int[k][2];
        int i = 0;

        while (!pq.isEmpty()) {
            Coordinate obj = pq.poll();
            ans[i][0] = obj.x;
            ans[i][1] = obj.y;
            i++;
        }

        return ans;
    }
}
