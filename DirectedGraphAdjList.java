
import java.util.*;
class Graphs{
    class Edge{
        //v=N vertex
        //w=weight
        int v,w;
        //contructor
        public Edge(int v,int w){
            this.v=v; this.w=w;
        }
         /**when we want to print smth
        by only the object name we must have 
        to override the to string method**/
        @Override
        public String toString(){
            return "("+v+","+w+")";
        }
    }
    /**array of linked lists which
    type of Edge**/
    List<Edge> G[];
    public Graphs(int n){
        //new object
        G=new LinkedList[n];
        /**assign to each of the elements 
        of array**/
        for(int i=0;i<G.length;i++)
            G[i]=new LinkedList<Edge>();
    }
    boolean isConnected(int u,int v){
        for(Edge i: G[u])
            if(i.v==v) return true;
        return false;
    }
    /**return true if the vertex U and V is connected
    by an edge**/
    void addEdge(int u,int v,int w){
        G[u].add(0,new Edge(v,w));
    }
    @Override
    public String toString(){
        String result="";
        for(int i = 1; i < G.length; i++)
            result+=i+"=>"+G[i]+"\n";
            //adding everything in result 
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
        
        System.out.println(g.isConnected(2,5));
        System.out.println(g.isConnected(3,2));
        System.out.println(g.isConnected(5,3));

    }
}
