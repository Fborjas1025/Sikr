package implementacionesED;

public class Main {
	
	public static void main(String[] args) {
		
		linkedList<Productos> ld = new linkedList<>();
//		int dataPrueba =  10000000;
		
		
		
		long t1 = System.nanoTime();
		for(int a = 0; a <= 100 ; a++) {
			Productos prod1 = new Productos(10000, "M", "Rojo", "Adiolas","Camiseta polo",  10);
			Productos prod2 = new Productos(15000, "L", "Azul", "Mike","Gorra deportiva",  7);
			ld.addFront(prod1);
			ld.addEnd(prod2);
		}
		long t2 =  System.nanoTime();
		long tt = t2 -t1;
		System.out.println("agregarInicio : " + (tt));
		
		Productos prodSearch = ld.returnElement(51);
		Productos prodSearc = ld.returnElement(101);
		
		System.out.println(prodSearch.getNombre());
		System.out.println(prodSearc.getNombre());
		
//		long a1 = System.nanoTime();
//		ld.encontrarElemento(dataPrueba/2);
//		long a2 =  System.nanoTime();
//		long at = a2 -a1;
//		System.out.println("encontrar elemento mitad : " + (at));
//		
//		long b1 = System.nanoTime();
//		ld.eliminar(dataPrueba/2);
//		//ld.eliminarInicio();
//		long b2 = System.nanoTime();	
//		long b3 =  b2 - b1;
//		System.out.println("eliminar mitad : " + (b3));
	
		
//		arrayQueue<Integer> aQ= new arrayQueue<>();
//		
//		long ti = System.nanoTime();
//		for (int a = 0 ; a <= dataPrueba ; a++) {
//			aQ.enqueue(a);
//		}
//		long tf =  System.nanoTime();
//		long tt = tf - ti;
//		System.out.println("enqueue : " + tt);
//		
//		long t1 = System.nanoTime();
//		for (int a = 0 ; a <= dataPrueba ; a++) {
//			aQ.peek();
//		}
//		long t2 =  System.nanoTime();
//		long t3 = t2 - t1;
//		System.out.println("peek   : " + t3);
//		
//		long ai = System.nanoTime();
//		for (int a = 0 ; a <= dataPrueba ; a++) {
//			aQ.dequeue();
//		}
//		long af =  System.nanoTime();
//		long at = af - ai;
//		System.out.println("dequeue : " + at);
		
		
	
//	linkedList<Integer> myLL = new linkedList<>();
//	linkedStack<Integer> ls = new linkedStack<>();
//	arrayStack<Integer> as = new arrayStack<>();
//	
//	
//	long i1 = System.nanoTime();
//	for (int a =0; a<dataPrueba ; a++){
//    ls.push(a);
//    }
//    long i2= System.nanoTime();
//    long t1 = i2 - i1 ;
//    System.out.println("push: " + t1 );
//    
//    long b1 = System.nanoTime();
//	for (int a =0; a<dataPrueba ; a++){
//    ls.top();
//    }
//    long b2= System.nanoTime();
//    long b3 = b2 - b1 ;
//    System.out.println("top: " + b3 );
//    
//    long c1 = System.nanoTime();
//	for (int a =0; a<dataPrueba ; a++){
//    ls.pop();
//    }
//    long c2= System.nanoTime();
//    long c3 = c2 - c1 ;
//    System.out.println("pop: " + c3 );
    
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