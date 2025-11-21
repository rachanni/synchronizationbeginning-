package objectlevelsynchronization;
public class ObjectLevelTask implements Runnable {

    
    
//	    instance of thread having synchronized method printMessage()
	    private final ObjectLevelLock lock;
	    
//	    instance belong to class implementing Runnable interface
	    private final String name;
	    
	    
	    public ObjectLevelTask(ObjectLevelLock lock, String name) {
	    	
	        this.lock = lock;
	        
	        this.name = name;
	    }

    

    
   


	
//    @Override
//    public void run() {
//        
//    	System.out.println("Thread name: "  + Thread.currentThread().getName() + " executing the task on object having hashCode: "+this.hashCode() );
//    	
//    	
//    	for(int i = 0; i< 10; i++) {
//    		
//    		System.out.print(i );
//    	}
//    }
	    
//	    
	    
	    
//	    Implementing run() method in such a way we call synchronized method printMessage() 
	    
	    @Override
	    public void run() {
	    	
	        // show which thread and which lock object we are using
	        System.out.println("Thread name: " + Thread.currentThread().getName()
	                + " calling printMessage on object " + Integer.toHexString(System.identityHashCode(lock)));
	        
	        lock.printMessage(name);
	    }
}
