package Day4;

class Engine {
	
    public String start() {
        return "Engine started.";
    }
}

class DemoCar {

	private Engine engine;

    public DemoCar() {
    	
        this.engine = new Engine();
    }

    public String startCar() {
    	
        String engineStatus = this.engine.start();
        return engineStatus + " The Car is ready to go.";
    }
}

public class CompositionDemo {

    public static void main(String[] args) {
    	
        DemoCar myCar = new DemoCar();
        
        System.out.println(myCar.startCar());
    }
}
