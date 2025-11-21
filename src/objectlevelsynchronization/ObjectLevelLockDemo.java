package objectlevelsynchronization;

public class ObjectLevelLockDemo {

    public static void main(String[] args) {

//    	create an object of class ObjectLevelTask or In simple word create runnable
    	
    	
//        Runnable runnable1 = new ObjectLevelTask();
        
        
//        Runnable runnable2 = new ObjectLevelTask();
        
		/* Note - Every object has its own lock. so obj1 and obj2 has different lock.
		 * 
		 *  Thread t1 can acquire lock of obj1 and run synchronized instance method.
		 *  At the same time Thread t2 can acquire lock of another object obj2 and run synchronized instance method parallely. 
		 *  
		 *  */

//        Thread t1 = new Thread(runnable1);
        
        
//        Thread t2 = new Thread(runnable2);

        // Since obj1 and obj2 are different objects, both threads run parallel.
//        t1.start();
        
//        t2.start();
        
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
    	
    	
    	
    	// Create TWO separate instance of type "ObjectLevelLock" -> synchronized method is defined in this class.
//    	   These two separate object have different lock so two different threads can acquire lock of these two object
//    	And can execute the codes inside synchronized parallely.
//    	In another word, in case of object level synchronization two threads say t1 and t2 can acquire object lock of two different object say o1 and o1 and run synchronized method parallely
//    	so they are not blocking to each other. 
//    	But thread t2 has to wait if he want to acquire lock of an object which is current held by another thread
    	
		/* We have two object lock1, lock2 of type ObjectLevelLock 
		 * Also we have two threads t1 and t2
		 * 
		 * 
		 * */
        ObjectLevelLock lock1 = new ObjectLevelLock();
        ObjectLevelLock lock2 = new ObjectLevelLock();

        
//        new ObjectLevelTask(lock1, "Thread-1"), "T-1" -> This is nothing just a runnable object -> because ObjectLevelTask implements Runnable interface
//        new ObjectLevelTask(lock2, "Thread-2"), "T-2" -> -> This is nothing just a runnable object -> because ObjectLevelTask implements Runnable interface
        
//        
        Thread t1 = new Thread(new ObjectLevelTask(lock1, "Thread-1"), "T-1");
        Thread t2 = new Thread(new ObjectLevelTask(lock2, "Thread-2"), "T-2");

        t1.start();
        t2.start();
    	
        
		/*
		 * output - 
		 * 
		 * Thread name: T-1 calling printMessage on object 6e17b62d Thread name: T-2
		 * calling printMessage on object 953aa44 Thread-1 acquired CURRENT-OBJECT lock
		 * on object having hashCode: Object@6e17b62d Thread-2 acquired CURRENT-OBJECT
		 * lock on object having hashCode: Object@953aa44 Thread-2 releasing
		 * CURRENT-OBJECT lock on object having hashCode: Object@953aa44 Thread-1
		 * releasing CURRENT-OBJECT lock on object having hashCode: Object@6e17b62d
		 * 
		 */
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
