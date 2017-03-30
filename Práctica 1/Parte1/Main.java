package Parte1;
import java.util.Random;

public class Main {
    public static void main (String[] args) {
    	Random rnd = new Random();
        int N = Integer.parseInt(args[0]);
        MyThread [] threads = new MyThread[N];
        
        for (int i = 0; i < Integer.parseInt(args[0]) ; i++) {
			threads[i] = new MyThread(i, Math.abs(rnd.nextInt()%100));
            threads[i].start();
        }

        for (int i = 0; i < N ; i++) {
            try {
				threads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        
        System.out.println("Todos los threads han terminado");
    }
}