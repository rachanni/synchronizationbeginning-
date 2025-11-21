package objectlevelsynchronization;
public class ObjectLevelTask implements Runnable {

    
    
    

    
   


	
    @Override
    public void run() {
        
    	System.out.println("Thread name: "  + Thread.currentThread().getName() + " executing the task on object having hashCode: "+this.hashCode() );
    	
    	
    	for(int i = 0; i< 10; i++) {
    		
    		System.out.print(i );
    	}
    }
}
