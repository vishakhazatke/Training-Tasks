class Vehicle{

    protected Vehicle start(){
        System.out.println("Vehicle is Starting");
        return this;
    }

    final void fuelType(){
        System.out.println("Generic fuel");
    }
    private void secret(){
        System.out.println("Parent secret");
    }
}

class Car extends Vehicle{

    @Override
    public Car start() {
       System.out.println("Car is Starting");
       return this;
    }
}
public class OverridingDemo {

    public static void main(String[] args) {

        Vehicle v = new Car();
        v.start();
    }
}
