package implementacionesED;
import java.time.*;
import java.lang.*;
import java.util.*;

public class Main {
	
	public static void main(String[] args) {
	
	int dataPrueba =  99999999;
		
//	linkedList<Integer> myLL = new linkedList<>();
	linkedStack<Integer> ls = new linkedStack<>();
	arrayStack<Integer> as = new arrayStack<>();
	
	
	long i1 = System.nanoTime();
	for (int a =0; a<dataPrueba ; a++){
    ls.push(a);
    }
    long i2= System.nanoTime();
    long t1 = i2 - i1 ;
    System.out.println("push: " + t1 );
    
    long b1 = System.nanoTime();
	for (int a =0; a<dataPrueba ; a++){
    ls.top();
    }
    long b2= System.nanoTime();
    long b3 = b2 - b1 ;
    System.out.println("top: " + b3 );
    
    long c1 = System.nanoTime();
	for (int a =0; a<dataPrueba ; a++){
    ls.pop();
    }
    long c2= System.nanoTime();
    long c3 = c2 - c1 ;
    System.out.println("pop: " + c3 );
    
//    long a1 = System.nanoTime();
//    for(int a = 0 ; a < dataPrueba ; a++) {
//    	myLL.addEnd(a);
//    }
//    long a2 = System.nanoTime();
//    long t2 = a2 -a1;
//    System.out.println("addEnd: " + t2);
//	
//	
//    long g1 = System.nanoTime();
//    	myLL.findElement(dataPrueba/2);
//    long g2 = System.nanoTime();
//    long g3 = g2 - g1;
//    System.out.println("find: " + g3);
//	
//    long b1 = System.nanoTime();
//    myLL.remove(dataPrueba/2);
//    long b2 = System.nanoTime();
//    long t3 = b2 - b1;
//    System.out.println("remove: " + t3);
	
    
    
	}
}