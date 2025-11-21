package classlevelsynchronization;

public class ClassLevelTask implements Runnable {
	
	
    private final String name;

    public ClassLevelTask(String name) {
    	
        this.name = name;
    }

    @Override
    public void run() {
    	
        ClassLevelLock.printMessage(name);
        
    }
}
