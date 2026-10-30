class Solution {
    private int[] delRow = {-1, 0, 1, 0};
    private int[] delCol = {0, 1, 0, -1};
    private boolean isValid(int i, int j, 
                            int n, int m) {
        if(i < 0 || i >= n) return false;
        if(j < 0 || j >= m) return false;
        return true;
    }
    public int[][] updateMatrix(int[][] mat) {
        int n = mat.length;
       int m = mat[0].length;
       int[][] vis = new int[n][m];
        int[][] dist = new int[n][m];
        Queue<int[]> q = new LinkedList<>();
        for(int i=0; i < n; i++) {
            for(int j=0; j < m; j++) {
                if(mat[i][j] == 0) {
                    q.add(new int[]{i, j, 0});
                    vis[i][j] = 1;
                }
                else {
                    vis[i][j] = 0;
                }
            }
        }
        while(!q.isEmpty()) {
            
            // Determine the top of the queue
            int[] it = q.poll();
            
            // Determine the coordinates of the cell
            int row = it[0];
            int col = it[1];
            
            // Get the steps
            int steps = it[2];
            
            // Update the distance matrix
            dist[row][col] = steps;
            for(int i = 0; i < 4; i++) {
                
                // Coordinates of new cell
                int nRow = row + delRow[i];
                int nCol = col + delCol[i];
                if(isValid(nRow, nCol, n, m) && 
                   vis[nRow][nCol] == 0) {
                    
                    // Mark the cell as visited
                    vis[nRow][nCol] = 1;
                    q.add(new int[]{nRow, nCol, steps + 1});
                }
            }
        }
        return dist;
    }
}