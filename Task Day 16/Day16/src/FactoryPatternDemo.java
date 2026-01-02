interface Shape{
    void draw();
}

class Circle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Circle");
    }
}

class Rectangle implements Shape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangle");
    }
}

class ShapeFactory{
    public static Shape getShape(String type){
        if(type.equalsIgnoreCase("CIRCLE")){
            return new Circle();
        }
        if(type.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();
        }
        return null;
    }

}
public class FactoryPatternDemo {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("CIRCLE");
        shape1.draw();

        Shape shape2 = ShapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
