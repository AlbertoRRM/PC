package Parte1;
public class MyThread extends Thread {
    private int _ID;
    private int T;
    
    public MyThread(int id, int time) {
        _ID = id;
        T = time;
    }
    
    public void run() {
        try {
			Thread.sleep(T);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(_ID);
    }
    
    public int getID() {
    	return _ID;
    }
}