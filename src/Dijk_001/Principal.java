package Dijk_001;

import java.util.Collections;
import java.util.PriorityQueue;

public class Principal{
    
    public void testRecorridoGrafo(){
        // Probando un grafo
        Grafo grafo1 = new Grafo(7);        
        grafo1.insertarArista(0, 1, 10.0);
        grafo1.insertarArista(0, 2, 20.0);
        grafo1.insertarArista(1, 3, 30.0);
        grafo1.insertarArista(2, 4, 40.0);
        grafo1.insertarArista(3, 4, 50.0);
        grafo1.insertarArista(4, 5, 60.0);
        grafo1.insertarArista(5, 6, 70.0);
        grafo1.printGrafo();
    }

    public void testColaPrioridad(){
        // Probando una cola de prioridad
        PriorityQueue<ItPriQue> cola1 = new PriorityQueue<ItPriQue>();
        cola1.add(new ItPriQue(120.0, 1));
        cola1.add(new ItPriQue(1.0, 2));
        cola1.add(new ItPriQue(1.0, 3));
        cola1.add(new ItPriQue(3.0, 5));
        cola1.add(new ItPriQue(5.0, 6));
        cola1.add(new ItPriQue(2.5, 7));
        cola1.add(new ItPriQue(1.0, 4));
        cola1.add(new ItPriQue(1.0, 8));
        cola1.add(new ItPriQue(1.0, 9));
        System.out.println("Imprimimos la cola con prioridades de enteros");
        
        while (!cola1.isEmpty()){
            ItPriQue item = cola1.poll();
            System.out.println(item);
        }        
    }

    public void testColaPrioridadMenor01(){
        PriorityQueue<ItPriQue> cola2 = new PriorityQueue<ItPriQue>();
        cola2.add(new ItPriQue(12.0, 1));
        cola2.add(new ItPriQue(14.0, 1));
        cola2.add(new ItPriQue(15.0, 1));
        cola2.add(new ItPriQue(12.0, 2));
        cola2.add(new ItPriQue(15.0, 1));
        cola2.add(new ItPriQue(0.0, 1));
        cola2.add(new ItPriQue(12.0, 1));
        cola2.add(new ItPriQue(14.0, 1));
        cola2.add(new ItPriQue(15.0, 1));
        cola2.add(new ItPriQue(12.0, 2));
        cola2.add(new ItPriQue(15.0, 1));
        cola2.add(new ItPriQue(0.0, 1));
        cola2.add(new ItPriQue(-1.0, 4));
        System.out.println("Imprimimos la cola con prioridades de enteros");
        
        while (!cola2.isEmpty()){
            ItPriQue item = cola2.poll();
            System.out.println(item);
        }   
    }

    public void testColaPrioridadMenor02(){
        PriorityQueue<ItPriQue> cola3 = new PriorityQueue<ItPriQue>();
        cola3.add(new ItPriQue(15.0, 2));
        cola3.add(new ItPriQue(1.0, 2));
        cola3.add(new ItPriQue(2.0, 2));
        cola3.add(new ItPriQue(3.0, 2));
        cola3.add(new ItPriQue(4.0, 2));
        cola3.add(new ItPriQue(-1.0, 2));
        cola3.add(new ItPriQue(-2.0, 2));
        cola3.add(new ItPriQue(1000.0, 0));
        cola3.add(new ItPriQue(0.0, 0));
        System.out.println("Imprimimos la cola con prioridades de enteros");
        
        while (!cola3.isEmpty()){
            ItPriQue item = cola3.poll();
            System.out.println(item);
        }
        
    }

    public void testColaPrioridadMayor01(){
        PriorityQueue<ItPriQueMayor> cola4 = new PriorityQueue<ItPriQueMayor>();
        cola4.add(new ItPriQueMayor(12, 1));
        cola4.add(new ItPriQueMayor(14, 1));
        cola4.add(new ItPriQueMayor(15, 1));
        cola4.add(new ItPriQueMayor(12, 2));
        cola4.add(new ItPriQueMayor(15, 1));
        cola4.add(new ItPriQueMayor(0, 1));
        cola4.add(new ItPriQueMayor(12, 1));
        cola4.add(new ItPriQueMayor(14, 1));
        cola4.add(new ItPriQueMayor(15, 1));
        cola4.add(new ItPriQueMayor(12, 2));
        cola4.add(new ItPriQueMayor(15, 1));
        cola4.add(new ItPriQueMayor(0, 1));
        cola4.add(new ItPriQueMayor(-1, 4));
        
        while (!cola4.isEmpty()){
            ItPriQueMayor item = cola4.poll();
            System.out.println(item);
        }
        
    }

    public void testColaPrioridadMayor02(){
        PriorityQueue<ItPriQueMayor> cola5 = new PriorityQueue<ItPriQueMayor>();
        cola5.add(new ItPriQueMayor(15, 2));
        cola5.add(new ItPriQueMayor(1, 2));
        cola5.add(new ItPriQueMayor(2, 2));
        cola5.add(new ItPriQueMayor(3, 2));
        cola5.add(new ItPriQueMayor(4, 2));
        cola5.add(new ItPriQueMayor(-1, 2));
        cola5.add(new ItPriQueMayor(-2, 2));
        cola5.add(new ItPriQueMayor(1000, 0));
        cola5.add(new ItPriQueMayor(0, 0));
        
        while (!cola5.isEmpty()){
            ItPriQueMayor item = cola5.poll();
            System.out.println(item);
        }
    }

    public void testDijkstra01(){
        Grafo grafo1 = new Grafo(5);        
        grafo1.insertarArista(1, 4, 6.0);   
        grafo1.insertarArista(1, 2, 2.0);   
        grafo1.insertarArista(2, 0, 6.0);   
        grafo1.insertarArista(0, 4, 1.0);   
        grafo1.insertarArista(1, 3, 3.0);
        grafo1.insertarArista(2, 3, 7.0);
        grafo1.insertarArista(4, 3, 5.0);

        grafo1.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        
        dijkstra.recorrerDijkstra(grafo1, 2);
        dijkstra.printDist();
        //dijkstra.generarcaminoscortos(grafo1,2);
    }

    public void testDijkstra02(){
        Grafo grafo1 = new Grafo(7);        
        grafo1.insertarArista(0, 1, 5.0);
        grafo1.insertarArista(0, 2, 7.0);
        grafo1.insertarArista(1, 2, 9.0);
        grafo1.insertarArista(1, 4, 15.0);
        grafo1.insertarArista(1, 5, 6.0);
        grafo1.insertarArista(2, 3, 8.0);
        grafo1.insertarArista(2, 4, 7.0);
        grafo1.insertarArista(3, 4, 5.0);
        grafo1.insertarArista(4, 6, 9.0);
        grafo1.insertarArista(4, 5, 8.0);
        grafo1.insertarArista(5, 6, 11.0);
        
        grafo1.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo1, 0);
        dijkstra.printDist();
    }
    public void testDijkstra03(){
        Grafo grafo1 = new Grafo(5);        
        grafo1.insertarArista(0, 2, 6.0);   
        grafo1.insertarArista(0, 4, 1.0);   
        grafo1.insertarArista(1, 4, 6.0);   
        grafo1.insertarArista(1, 3, 3.0);   
        grafo1.insertarArista(1, 3, 3.0);
        grafo1.insertarArista(1, 2, 2.0);
        grafo1.insertarArista(3, 4, 5.0);
        grafo1.insertarArista(3, 2, 7.0);

        grafo1.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo1, 2);
        dijkstra.printDist();;
    }
    public void dijsktragrafo02ej4(){
        Grafo grafo2 = new Grafo(10);        
        grafo2.insertarArista(0, 1, 2.0);
        grafo2.insertarArista(0, 2, 7.0);
        grafo2.insertarArista(0, 3, 6.0);
        grafo2.insertarArista(0, 5, 5.0);
        grafo2.insertarArista(0, 6, 6.0);
        grafo2.insertarArista(0, 7, 3.0);
        grafo2.insertarArista(0, 8, 1.0);
        grafo2.insertarArista(1, 8, 6.0);
        grafo2.insertarArista(1, 2, 3.0);
        grafo2.insertarArista(2, 3, 3.0);
        grafo2.insertarArista(2, 9, 2.0);
        grafo2.insertarArista(3, 9, 1.0);
        grafo2.insertarArista(3, 5, 2.0);
        grafo2.insertarArista(3, 4, 5.0);
        grafo2.insertarArista(4, 9, 9.0);
        grafo2.insertarArista(4, 5, 8.0);
        grafo2.insertarArista(5, 6, 4.0);
        grafo2.insertarArista(6, 7, 4.0);
        grafo2.insertarArista(7, 8, 2.0);
        grafo2.insertarArista(8, 1, 8.0);

        grafo2.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo2, 0);
        dijkstra.printDist();;
    }
    
    public void dijsktragrafo02ej5(){
        Grafo grafo2 = new Grafo(10);        
        grafo2.insertarArista(0, 1, 2.0);
        grafo2.insertarArista(0, 2, 7.0);
        grafo2.insertarArista(0, 3, 6.0);
        grafo2.insertarArista(0, 5, 5.0);
        grafo2.insertarArista(0, 6, 6.0);
        grafo2.insertarArista(0, 7, 3.0);
        grafo2.insertarArista(0, 8, 1.0);
        grafo2.insertarArista(1, 8, 6.0);
        grafo2.insertarArista(1, 2, 3.0);
        grafo2.insertarArista(2, 3, 3.0);
        grafo2.insertarArista(2, 9, 2.0);
        grafo2.insertarArista(3, 9, 1.0);
        grafo2.insertarArista(3, 5, 2.0);
        grafo2.insertarArista(3, 4, 5.0);
        grafo2.insertarArista(4, 9, 9.0);
        grafo2.insertarArista(4, 5, 8.0);
        grafo2.insertarArista(5, 6, 4.0);
        grafo2.insertarArista(6, 7, 4.0);
        grafo2.insertarArista(7, 8, 2.0);
        grafo2.insertarArista(8, 1, 8.0);

        grafo2.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo2, 9);
        dijkstra.printDist();;
    }
    
    public void dijsktragrafo03ej6(){
        Grafo grafo3 = new Grafo(7);        
        grafo3.insertarArista(0, 3, 1);
        grafo3.insertarArista(0, 2, 2);
        grafo3.insertarArista(0, 4, 3);
        grafo3.insertarArista(0, 1, 3);
        grafo3.insertarArista(1, 2, 1);
        grafo3.insertarArista(1, 3, 2);
        grafo3.insertarArista(1, 4, 5);
        grafo3.insertarArista(2, 3, 5);
        grafo3.insertarArista(2, 5, 7);
        grafo3.insertarArista(3, 4, 8);
        grafo3.insertarArista(3, 6, 9);
        grafo3.insertarArista(4, 6, 2);
        grafo3.insertarArista(5, 3, 8);;

        grafo3.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo3, 3);
        dijkstra.printDist();;
    }

    public void dijsktragrafo03ej7(){
        Grafo grafo3 = new Grafo(7);        
        grafo3.insertarArista(0, 3, 1);
        grafo3.insertarArista(0, 2, 2);
        grafo3.insertarArista(0, 4, 3);
        grafo3.insertarArista(0, 1, 3);
        grafo3.insertarArista(1, 2, 1);
        grafo3.insertarArista(1, 3, 2);
        grafo3.insertarArista(1, 4, 5);
        grafo3.insertarArista(2, 3, 5);
        grafo3.insertarArista(2, 5, 7);
        grafo3.insertarArista(3, 4, 8);
        grafo3.insertarArista(3, 6, 9);
        grafo3.insertarArista(4, 6, 2);
        grafo3.insertarArista(5, 3, 8);;

        grafo3.printGrafo();

        Dijkstra dijkstra = new Dijkstra();
        dijkstra.recorrerDijkstra(grafo3, 0);
        dijkstra.printDist();;
    }
    
    public void ej6(){
        PriorityQueue<Ejercicio_6> cola6 = new PriorityQueue<Ejercicio_6>();
        cola6.add(new Ejercicio_6(0, 0, 0, 0));
        cola6.add(new Ejercicio_6(1, 1, 1, 1));
        cola6.add(new Ejercicio_6(2, 2, 2, 2));
        cola6.add(new Ejercicio_6(3, 3, 3, 3));
        
        while (!cola6.isEmpty()){
            Ejercicio_6 item = cola6.poll();
            System.out.println(item);
        }
    }
    
    public void ej7(){
        PriorityQueue<Ejercicio_7> cola7 = new PriorityQueue<Ejercicio_7>();
        cola7.add(new Ejercicio_7(4, 3, 2, 1));
        cola7.add(new Ejercicio_7(5, 2, 4, 2));
        cola7.add(new Ejercicio_7(2, 2, 2, 2));
        cola7.add(new Ejercicio_7(6, 3, 5, 4));
        
        while (!cola7.isEmpty()){
            Ejercicio_7 item = cola7.poll();
            System.out.println(item);
        }
    }


    public static void main(String[] args){
        Principal principal = new Principal();
        principal.testDijkstra01();
        // principal.testDijkstra02();
        //principal.testColaPrioridadMayor02();
        //principal.testColaPrioridadMenor01();
        //principal.testColaPrioridadMenor02();
        //principal.testColaPrioridadMayor01();
        //principal.testColaPrioridadMayor02();
        //principal.ej6();
        //principal.ej7();
        //principal.testDijkstra01();
        //principal.testDijkstra02();
        //principal.dijsktragrafo02ej4();
        //principal.dijsktragrafo02ej5();
        //principal.dijsktragrafo03ej6();
        //principal.dijsktragrafo03ej7();
        
        
    }

}   