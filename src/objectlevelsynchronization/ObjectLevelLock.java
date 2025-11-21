package objectlevelsynchronization;


public class ObjectLevelLock {

//	
    public synchronized void printMessage(String threadName) {
    	
        System.out.println(threadName + " acquired CUURENT-OBJECT lock");
        
        try {
        	
            Thread.sleep(1000); // simulate work
            
        } catch (InterruptedException e) {
        	
            e.printStackTrace();
        }
        System.out.println(threadName + " releasing CURRENT-OBJECT lock");
    }
}
