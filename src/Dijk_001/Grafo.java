package Dijk_001;

import java.util.List;
import java.util.ArrayList;

public class Grafo{
    public List<List<ParAristaNodo>> listAdj;
    public int numeroNodos; 
    //
    public Grafo(int numeroNodos){
        this.numeroNodos = numeroNodos;
        this.listAdj = new ArrayList<List<ParAristaNodo>>(this.numeroNodos);
        for (int i = 0; i < this.numeroNodos; i++){
            this.listAdj.add(new ArrayList<ParAristaNodo>());
        }
    }
    
    public void insertarArista(int nodo1, int nodo2, double valorArista){
        this.listAdj.get(nodo1).add(new ParAristaNodo(nodo2, valorArista));
        this.listAdj.get(nodo2).add(new ParAristaNodo(nodo1, valorArista));
    }

    public void printGrafo(){
        for(int i = 0; i < this.numeroNodos; i++){
            System.out.println("Nodo " + i + " tiene vecinos a: ");
            for(int j = 0; j < this.listAdj.get(i).size(); j++){
                ParAristaNodo item = this.listAdj.get(i).get(j);
                System.out.println("\t nodo: " + item.nodo + 
                                " con el valor: " +item.valorArista);
            }
        }
    }
    
}