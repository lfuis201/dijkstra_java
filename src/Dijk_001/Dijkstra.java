package Dijk_001;

import java.awt.event.ItemEvent;
import java.util.PriorityQueue;
import java.util.List;

public class Dijkstra{

    public double[] dist;
    

    public double min(double a, double b){
        if (a < b)
            return a;
        return b;
    }
    
    public void recorrerDijkstra(Grafo grafo, int sourceNodo){
        // paso 1: setear la distancia a todos los nodos con un valor enorme
        //         y la distancia al nodo origin es cero
        this.dist = new double[grafo.numeroNodos];
        /*
        ESCRIBE TU CODIGO AQUI
        */
        for (int i = 0; i < this.dist.length; i++) {
            dist[i]=99999;
        }
        dist[sourceNodo]=0;
        
        // paso 2: se agrega el nodo fuente con distancia "0"
        PriorityQueue<ItPriQue> colaPrioridad = new PriorityQueue<ItPriQue>();
        /* 
        ESCRIBE TU CODIGO AQUI - una linea de codigo
        */
        colaPrioridad.add(new ItPriQue(0, sourceNodo));
        // paso 3: recorrer la cola de prioridad
        while(!colaPrioridad.isEmpty()){
            // paso 3.1 Obten la cabeza de la cola
            ItPriQue cabeza = colaPrioridad.poll();
            
            
            // paso 3.2 obten los vecinos del nodo cabeza obtenido anteriormente
            List<ParAristaNodo> vecinos = grafo.listAdj.get(cabeza.u);

            // paso 3.3 recorre los vecinos del nodo cabeza
            for (int i = 0; i < vecinos.size(); i++){
                ParAristaNodo item = vecinos.get(i);
                // paso 3.4 realiza la comparacion y obtén el mínimo de 
                // (distancia al nodo vecino vs 
                // (distancia al nodo cabeza + valor de la arista entre el nodo cabeza y el nodo vecino)
                // almacena este valor en un valor temporal llamado: tmp
                double temp = min(dist[item.nodo],  dist[cabeza.u] + item.valorArista);
                
                // paso 3.5
                // si cambia el valor, entonce se agrega a la cola de prioridad
                if (temp != dist[item.nodo]){
                    dist[item.nodo] = temp;
                    /* 
                    ESCRIBE TU CODIGO AQUI - una linea de codigo
                    */
                    colaPrioridad.add(new ItPriQue(temp, item.nodo ));
                }
            }
        }        
    }
    
    
    
    public void printDist(){
        System.out.println("Distancia conseguida por el Dijkstra");
        for (int i = 0; i < dist.length; i++)
            System.out.println("dist["+i+"] = " + dist[i]);
    }
}