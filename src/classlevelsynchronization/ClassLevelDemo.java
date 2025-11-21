package classlevelsynchronization;

public class ClassLevelDemo {
	
    public static void main(String[] args) {
    	
    	
        Thread t1 = new Thread(new ClassLevelTask("Thread-A"), "T-A");
        
        Thread t2 = new Thread(new ClassLevelTask("Thread-B"), "T-B");

        t1.start();
        
        t2.start();
    }
}
