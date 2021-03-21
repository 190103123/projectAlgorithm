
import java.util.*;
class Graphs{
    class Edge{
        int v,w;
        public Edge(int v,int w){
            this.v=v; this.w=w;
        }
        @Override
        public String toString(){
            return "("+v+","+w+")";
        }
    }
    List<Edge> G[];
    public Graphs(int n){
        G=new LinkedList[n];
        for(int i=0;i<G.length;i++)
            G[i]=new LinkedList<Edge>();
    }
    boolean isConnected(int u,int v){
        for(Edge i: G[u])
            if(i.v==v) return true;
        return false;
    }
    void addEdge(int u,int v,int w){
        G[u].add(0,new Edge(v,w));
    }
    @Override
    public String toString(){
        String result="";
        for(int i = 1; i < G.length; i++)
            result+=i+"=>"+G[i]+"\n";
        return result;
    }
}
public class DirectedGraphAdjList {
    public static void main(String[] args) {
        Graphs g=new Graphs(6);
        g.addEdge(1,2,2);
        g.addEdge(2,3,4);
        g.addEdge(2,4,8);
        g.addEdge(3,1,3);
        g.addEdge(3,5,8);
        g.addEdge(5,2,7);
        g.addEdge(5,4,3);

        System.out.println(g);
        System.out.println(g.isConnected(3,5));
        System.out.println(g.isConnected(1,2));
        System.out.println(g.isConnected(5,4));

    }
}
