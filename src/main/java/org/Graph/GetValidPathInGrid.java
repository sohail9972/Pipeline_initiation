package org.Graph;

public class GetValidPathInGrid {
    public boolean hasValidLength(int[][] grid){
        int m= grid.length;
        int n=grid[0].length;

        boolean[][] visited = new boolean[m][n];

        int [][][] dirs =   {
                {},
                {{0,-1},{0,1}},
                {{-1,0},{1,0}},
                {{0,-1},{1,0}},
                {{0,1},{1,0}},
                {{0,-1},{-1,0}},
                {{0,1},{-1,0}}
        };
        return dfs(0,0,grid,visited,dirs,m,n);

    }

    private boolean dfs(
            int i,
            int j,
            int[][]grid,
            boolean[][] visited,
            int[][][]dirs,
            int m,
            int n
    ){
        if (i==m-1 && j==n-1){
            return true;
        }
        visited[i][j]=true;
        int street = grid[i][j];

        for (int[] dir:dirs[street]){
            int dx =dir[0];
            int dy = dir[1];

            int ni= i+dx;
            int nj = j+dy;

            if (ni>=0 && ni<m && nj>=0 && nj<n && !visited[ni][nj]){
                for (int[] nextDir : dirs[grid[ni][nj]]){
                    if (nextDir[0]==-dx && nextDir[1]==-dy){
                        if (dfs(ni,nj,grid,visited,dirs,m,n)){
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }


    public static void main(String[] args) {

    }
}
