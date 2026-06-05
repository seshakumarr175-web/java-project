import java.util.*;
import java.lang.*;
public class Codechef
{
    static int[][] graph;
    static boolean[] visited;
    static int total;
    static int[] arr = new int[30];
    static int k = 0, count = 0;

    public static void main(String[] args) 
  {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the total number of vertices in graph:");
        total = sc.nextInt();
        graph = new int[total][total]; //5*5
        visited = new boolean[total];

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < total; i++) 
        {
            for (int j = 0; j < total; j++)
           {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("\nDFS traversal is:");
        dfs(0);
    }

    static void dfs(int vertex) 
   {
        int c = 0;
        count++;
        System.out.print(vertex + "\t");
        visited[vertex] = true;

        for (int j = 0; j < total; j++)
    {
            if (!visited[j] && graph[vertex][j] == 1)
         {
                arr[++k] = j;
                c = 1;
            }
            if (count == total) 
           {
                System.exit(0);
            }
        }

        if (c == 1) 
       {
            dfs(arr[k]);
        } 
         else 
        {
            k--;
            dfs(arr[k]);
        }
    }
}