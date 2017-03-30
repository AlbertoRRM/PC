package Parte2;

import java.util.Random;

import Parte2.MyThread;

public class Main {
	public static void main(String[] args) {
		Random rnd = new Random();
		int N = Integer.parseInt(args[0]);
        MyThread [] addThreads = new MyThread[N];
        MyThread [] subsThreads = new MyThread[N];
        Var var = new Var();
        
        for (int i = 0; i < Integer.parseInt(args[0]) ; i++) {
			addThreads[i] = new MyThread(i, Math.abs(rnd.nextInt()%100), var, true);
            addThreads[i].start();
            subsThreads[i] = new MyThread(i, Math.abs(rnd.nextInt()%100), var, false);
            subsThreads[i].start();
        }

        for (int i = 0; i < N ; i++) {
            try {
				addThreads[i].join();
				subsThreads[i].join();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        System.out.println("Var = " + var.getVar());
        System.out.println("Todos los threads han terminado");
	}
}
