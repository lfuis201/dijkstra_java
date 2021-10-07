package Dijk_001;


public class ItPriQueMayor implements Comparable<ItPriQueMayor>{
    public int d;
    public int u;
    //
    public ItPriQueMayor(int d, int u){
        this.d = d;
        this.u = u;
    }

    @Override
    public int compareTo(ItPriQueMayor  it) {
        if (this.d > it.d) return -1;
        return 1;
    }

    @Override
    public String toString(){
        String message = "nodo: " + this.u + " con valor arista: " + this.d;        
        return message;
    }
}