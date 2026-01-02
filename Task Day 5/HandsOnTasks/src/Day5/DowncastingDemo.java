package Day5;

class AnimalDemoo {
    public void makeSound() {
        System.out.println("Animal is making a sound");
    }
}

class DogDemoo extends AnimalDemoo {
    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    public void fetch() {
        System.out.println("Dog is fetching a ball");
    }
}

public class DowncastingDemo {
    public static void main(String[] args) {
    	
        AnimalDemoo a1 = new DogDemoo();

        a1.makeSound(); 

       
        if (a1 instanceof DogDemoo) {
            DogDemoo d1 = (DogDemoo) a1; 
            
            d1.makeSound(); 
            d1.fetch();     
        } 
        else {
            System.out.println("Cannot downcast to Dog type.");
        }
    }
}
