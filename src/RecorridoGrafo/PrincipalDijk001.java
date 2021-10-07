package RecorridoGrafo;

public class PrincipalDijk001{
    
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

    public void recorridoGrafoEjercicio01(){
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
    }

    public void recorridoGrafoEjercicio02(){
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
        grafo3.insertarArista(5, 3, 8);
        grafo3.printGrafo();
    }

    public void recorridoGrafoEjercicio03(){
        Grafo grafo4 = new Grafo(12);        
        grafo4.insertarArista(0, 1, 1);
        grafo4.insertarArista(0, 2, 2);
        grafo4.insertarArista(0, 3, 2);
        grafo4.insertarArista(0, 6, 6);
        grafo4.insertarArista(1, 4, 3);
        grafo4.insertarArista(1, 5, 3);
        grafo4.insertarArista(1, 9, 9);
        grafo4.insertarArista(2, 3, 5);
        grafo4.insertarArista(2, 6, 4);
        grafo4.insertarArista(3, 7, 4);
        grafo4.insertarArista(3, 4, 8);
        grafo4.insertarArista(3, 8, 6);
        grafo4.insertarArista(4, 5, 5);
        grafo4.insertarArista(5, 9, 1);
        grafo4.insertarArista(6, 7, 8);
        grafo4.insertarArista(6, 10, 9);
        grafo4.insertarArista(7, 10, 1);
        grafo4.insertarArista(7, 8, 5);
        grafo4.insertarArista(7, 11, 9);
        grafo4.insertarArista(8, 9, 8);
        grafo4.insertarArista(8, 11, 1);
        grafo4.insertarArista(10, 11, 4);
        
        grafo4.printGrafo();
    }

    public static void main(String[] args){
        PrincipalDijk001 principal = new PrincipalDijk001();
        //principal.recorridoGrafoEjercicio01();
        //principal.recorridoGrafoEjercicio02();
        principal.recorridoGrafoEjercicio03();
        
    }

}