package bnp;
import java.util.*;

// incorrect incomplete 
// test case 2 failed

public class _2TrapRainWater {

    private static class Cell {
        int x, y, height;
        Cell(int x, int y, int height) {
            this.x = x;
            this.y = y;
            this.height = height;
        }
    }

    private static int trapRainWater(int[][] heightMap, int n, int m) {
        if (heightMap == null || n == 0 || m == 0) return 0;
        
        // Min-heap priority queue (used for BFS-like processing of the boundary cells)
        PriorityQueue<Cell> pq = new PriorityQueue<>((a, b) -> a.height - b.height);
        
        // To keep track of visited cells
        boolean[][] visited = new boolean[n][m];
        
        // Push all the boundary cells into the priority queue
        for (int i = 0; i < n; i++) {
            pq.offer(new Cell(i, 0, heightMap[i][0]));
            pq.offer(new Cell(i, m - 1, heightMap[i][m - 1]));
            visited[i][0] = true;
            visited[i][m - 1] = true;
        }
        
        for (int j = 0; j < m; j++) {
            pq.offer(new Cell(0, j, heightMap[0][j]));
            pq.offer(new Cell(n - 1, j, heightMap[n - 1][j]));
            visited[0][j] = true;
            visited[n - 1][j] = true;
        }
        
        // Directions for 4 possible neighbors (up, down, left, right)
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        
        int totalWater = 0;
        
        // Process the cells in the priority queue
        while (!pq.isEmpty()) {
            Cell current = pq.poll();
            
            // Check all 4 neighbors
            for (int i = 0; i < 4; i++) {
                int nx = current.x + dx[i];
                int ny = current.y + dy[i];
                
                // Skip out-of-bounds or already visited cells
                if (nx < 0 || nx >= n || ny < 0 || ny >= m || visited[nx][ny]) {
                    continue;
                }
                
                // Water can be trapped if the neighbor's height is lower
                if (heightMap[nx][ny] < current.height) {
                    totalWater += current.height - heightMap[nx][ny];
                }
                
                // Mark the cell as visited and add it to the priority queue
                visited[nx][ny] = true;
                pq.offer(new Cell(nx, ny, Math.max(heightMap[nx][ny], current.height)));
            }
        }
        
        return totalWater;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] mat = new int[N][M];
        
        // Input the elevation map
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        
        // Call the function to calculate the trapped rainwater
        System.out.println(trapRainWater(mat, N, M));
        sc.close();
    }
}


// Sample Input 1:
// 3 3
// 2 2 2
// 2 -1 2
// 2 2 2
// Sample Output 1:
// 3
// Sample Input 2:
// 4 5
// 2 1 1 2 1
// 3 -2 2 -2 1
// 2 -3 4 1 0
// 1 1 2 1 1
// Sample Output 2:
// 17