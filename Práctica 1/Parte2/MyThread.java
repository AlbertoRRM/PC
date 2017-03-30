package Parte2;


public class MyThread extends Thread {
    private int _ID;
    private int T; //time
    private Var var;
    boolean operation; // True addition False substraction
    
    public MyThread(int id, int time, Var var, boolean operation) {
        _ID = id;
        T = time;
        this.var = var;
        this.operation = operation;
    }
   
	public void run() {
        try {
			Thread.sleep(T);
			operation(operation);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        System.out.println(_ID);
    }
    
    public int getID() {
    	return _ID;
    }
    
    public void operation(boolean operation) {
    	if(operation)
    		var.addVar();
    	else
    		var.subVar();
    }
}