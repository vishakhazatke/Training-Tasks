class AnimalDemo{
    void sound(){
        System.out.println("Animal makes sound");
    }
}

class DogDemo extends AnimalDemo{

    void bark(){
        System.out.println("Dog barks");
    }
}
public class DowncastingDemo {

    public static void main(String[] args) {

        AnimalDemo a = new DogDemo();

        if(a instanceof DogDemo){
            DogDemo d2 = (DogDemo) a;
            d2.bark();
        }
    }
}
