class Animal{

    Animal getAnimal(){
        System.out.println("Returning Animal");
        return new Animal();
    }
}

class Dog extends Animal{

    @Override
    Dog getAnimal() {
        System.out.println("Returning Dog");
        return new Dog();
    }
}
public class CovariantDemo {

    public static void main(String[] args) {

        Animal a = new Dog();
        a.getAnimal();
    }
}
