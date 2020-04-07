import java.util.*;
class Graph
{
    int v;
    LinkedList<Integer> adj[];
    Graph(int a)
    {
        v=a;
        adj=new LinkedList[v];
        for(int i=0;i<v;i++)
        {
            adj[i]=new LinkedList<>();
        }
    }
    void addedge(int a,int b)
    {
adj[a].add(b);
adj[b].add(a);
    }
    void print()
    {
        for(int i=0;i<adj.length;i++)
        {
            for(int j:adj[i])
            {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
public class example1{
    public static void main(String[] args) {
        Graph g1=new Graph(4);
        g1.addedge(0,1);
        g1.addedge(0,2);
        g1.addedge(0,3);
        g1.addedge(1,2);
        g1.addedge(2,3);
        g1.print();
    }
}