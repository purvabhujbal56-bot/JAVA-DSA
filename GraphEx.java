//graph problen from leetcode(famous for interview ques)
//given matrix (2D array )of integer consiting of 0&1 only. 0 represt water and 1 represent land . 
// it is possible to join adjacent lands either vertically or horizontally and from an islan . 
// detremine the no of such islands which can be formed 
//logic : DFS approach is more suitable in this problem becz we need to explore  neighor of 1st vertex , 
// then explore the neighbour of 2nd vertex & so on

public class GraphEx {
    public static void main(String[] args) {
        int adj_matrix[][]={
                            {1,1,1,0,0},
                            {0,1,0,1,1},
                            {0,0,1,0,0},
                            {0,0,0,1,1},
                            };
        System.out.println("given adj matrix is :" );
        for(int i=0;i<adj_matrix.length;i++)//length property in martix return no of rows in  atrix
        {
            for (int j = 0; j < adj_matrix[0].length; j++)//length of roews in matrix return the no. of columns in matrix
                System.out.print(adj_matrix[i][j]+" ");
            System.out.println();
        }
        System.out.println("no. of island that can be formed are "+countIsland(adj_matrix));
    }
    static int countIsland(int adj_matrix[][]){
        int rows = adj_matrix.length;
        int cols = adj_matrix[0].length;
        int count = 0;
        boolean visited[][] = new boolean[rows][cols];// auto initialised  to false
        //now visit every vertex i.e element of matrix
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                //check whether it is land & also unvisited 
                if (adj_matrix[i][j] == 1 && !visited[i][j] ) 
                {
                    count++;
                    //now start trversal rom this vertex and explore its neighbours
                    dfs(adj_matrix,i,j,visited);  //user defined method
                }
            }
        }
        //return count;  

        return count;  
    }
      

static void dfs(int adj_matrix[][],int i,int j,boolean visited[][] ){
    int rows = adj_matrix.length;
    int cols = adj_matrix[0].length;
    //base case - to stop recursion
    if(i<0 || i> rows-1 || j<0 || j>cols-1 ||adj_matrix[i][j]==0 || visited[i][j])
        //check bounds ,check if its is water and also if it standa visited
        return ; //terminate dfs

    visited[i][j] = true; //mark the land as visited so that it is not counted again
    
    //explore the neighbours using recursion
    dfs(adj_matrix, i-1, j, visited); //up
    dfs(adj_matrix, i+1, j, visited); //down
    dfs(adj_matrix, i, j-1, visited); //left
    dfs(adj_matrix, i, j+1, visited); //right
    }
}