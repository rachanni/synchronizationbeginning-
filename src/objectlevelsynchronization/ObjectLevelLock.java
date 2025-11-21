package objectlevelsynchronization;


public class ObjectLevelLock {

//	
	
	
public synchronized void printMessage(String threadName) {
		
        System.out.println(threadName + " acquired CURRENT-OBJECT lock on object having hashCode: " + thisHash());
        
        try {
        	
            Thread.sleep(5000); // simulate work
            
        } catch (InterruptedException e) {
        	
            Thread.currentThread().interrupt();
        }
        
        System.out.println(threadName + " releasing CURRENT-OBJECT lock on object having hashCode: " + thisHash());
    }

	
    private String thisHash() {
    	
        return "Object@" + Integer.toHexString(System.identityHashCode(this));
        
    }

	

	
    
}
