package classlevelsynchronization;

public class ClassLevelLock {
	
	
	
	
//	making the synchronized method static so that class level lock is required to run static synchronized method
//	Only one lock is available which belongs to class itself -> and this one and only one lock will be shared across all threads.
//	It means if class level lock is held by thread t1 then other threads can't enter inside synchronized method. As a result only one thread can run static synchronized method.
	
	
    public static synchronized void printMessage(String threadName) {
    	
    	
        System.out.println(threadName + " acquired CLASS lock");
        
        try {
        	
            Thread.sleep(5000);
            
        } catch (InterruptedException e) {
        	
            Thread.currentThread().interrupt();
        }
        
        System.out.println(threadName + " releasing CLASS lock");
    }
}
