

package Dijk_001;

public class Ejercicio_6 implements Comparable<Ejercicio_6>{
    int a;
    int b;
    int c;
    int d;

    public Ejercicio_6(int a, int b, int c, int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    
    
    @Override
    public int compareTo(Ejercicio_6  it) {
        if (this.a + this.b + this.c + this.d < it.a + it.b + it.c + it.d) return -1;
        return 1;
    }

    @Override
    public String toString(){
        String message = "valor de  (a + b + c + d) ->" + (this.a + this.b + this.c + this.d) ;        
        return message;
    }
}
