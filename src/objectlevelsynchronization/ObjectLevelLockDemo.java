package objectlevelsynchronization;

public class ObjectLevelLockDemo {

    public static void main(String[] args) {

//    	create an object of class ObjectLevelTask or In simple word create runnable
    	
    	
        Runnable runnable1 = new ObjectLevelTask();
        
        
        Runnable runnable2 = new ObjectLevelTask();
        
		/* Note - Every object has its own lock. so obj1 and obj2 has different lock.
		 * 
		 *  Thread t1 can acquire lock of obj1 and run synchronized instance method.
		 *  At the same time Thread t2 can acquire lock of another object obj2 and run synchronized instance method parallely. 
		 *  
		 *  */

        Thread t1 = new Thread(runnable1);
        
        
        Thread t2 = new Thread(runnable2);

        // Since obj1 and obj2 are different objects, both threads run parallel.
        t1.start();
        
        t2.start();;
        
		/* output -
		 * 
		 * Thread name: Thread-0 executing the task on object having hashCode: 882840559
           0123Thread name: Thread-1 executing the task on object having hashCode: 513373785
           0123456456787899
		 * 
		 * 
		 * If you observe the output carefully -
		 * 1. Thread-0 first acquire the lock of object having hashCode  $ 882840559 $ and start executing the task.
		 *    It has not finished execution still Thread-1 acquire the lock of another object having hashCode $ 513373785 $
		 *    and enters into synchronized and starts executing the task. So both are executing the task parallely. 
		 * 
		 * 
		 * 
		 */
    }
}
