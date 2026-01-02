package Day4;

public interface InterfaceVehicle {

      void startEngine();

      default void honkHorn() {
    	  
          System.out.println("Default Sound: Beep beep!");
      }

      static void displayInterfaceInfo() {
    	  
         System.out.println("This is the Vehicle interface");
      }
}

class CarDemooo implements InterfaceVehicle {

      @Override
      public void startEngine() {
    	  
         System.out.println("Car Engine: Starting silently");
      }

      @Override
      public void honkHorn() {
    	  
         System.out.println("Car Sound: Honk honk!");
      }
}

