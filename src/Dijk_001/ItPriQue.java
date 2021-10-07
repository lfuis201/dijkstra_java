
package Dijk_001;

// clases Item PriorityQueue
public class ItPriQue implements Comparable<ItPriQue>{
    
    public double d;
    public int u;
    //
    public ItPriQue(double d, int u){
        this.d = d;
        this.u = u;
    }


    @Override
    public int compareTo(ItPriQue it) {
        if (this.d < it.d) return -1;
        return 1;
    }

    @Override
    public String toString(){
        String message = "nodo: " + this.u + " con valor arista: " + this.d;        
        return message;
    }
}