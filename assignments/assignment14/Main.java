package co.arpitha.training.assignments.assignment14;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = {
                new Circle(),
                new Circle(2.0),
                new Circle("yellow",false,3.0),
                new Rectangle(),
                new Rectangle(3,4),
                new Rectangle("blue",false,2,3),
                new Square(),
                new Square(4),
                new Square("grey",true,5),
                new Square("green",false,6)
        };
        for(Shape shape:shapes){
            System.out.println("Shape is");
            System.out.println(shape.toString());
            System.out.println();
            System.out.println("Perimeters and Area of the shape");
            System.out.println("Perimeter is: "+shape.getPerimeter()+" units and Area is: "+shape.getArea()+" sq units.");
            System.out.println("------------------------");
            System.out.println();
        }
    }
}
/*OUTPUT
Shape is
A Circle with radius= 1.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 6.283185307179586 units and Area is: 3.141592653589793 sq units.
------------------------

Shape is
A Circle with radius= 2.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 12.566370614359172 units and Area is: 12.566370614359172 sq units.
------------------------

Shape is
A Circle with radius= 3.0 , which is a subclass of A Shape with color of yellow and is not filled .

Perimeters and Area of the shape
Perimeter is: 18.84955592153876 units and Area is: 28.274333882308138 sq units.
------------------------

Shape is
A Rectangle with width= 1.0 and length= 1.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 4.0 units and Area is: 1.0 sq units.
------------------------

Shape is
A Rectangle with width= 3.0 and length= 4.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 14.0 units and Area is: 12.0 sq units.
------------------------

Shape is
A Rectangle with width= 2.0 and length= 3.0 , which is a subclass of A Shape with color of blue and is not filled .

Perimeters and Area of the shape
Perimeter is: 10.0 units and Area is: 6.0 sq units.
------------------------

Shape is
A Square with side= 1.0 , which is a subclass of A Rectangle with width= 1.0 and length= 1.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 4.0 units and Area is: 1.0 sq units.
------------------------

Shape is
A Square with side= 4.0 , which is a subclass of A Rectangle with width= 4.0 and length= 4.0 , which is a subclass of A Shape with color of red and is filled .

Perimeters and Area of the shape
Perimeter is: 16.0 units and Area is: 16.0 sq units.
------------------------

Shape is
A Square with side= 5.0 , which is a subclass of A Rectangle with width= 5.0 and length= 5.0 , which is a subclass of A Shape with color of grey and is filled .

Perimeters and Area of the shape
Perimeter is: 20.0 units and Area is: 25.0 sq units.
------------------------

Shape is
A Square with side= 6.0 , which is a subclass of A Rectangle with width= 6.0 and length= 6.0 , which is a subclass of A Shape with color of green and is not filled .

Perimeters and Area of the shape
Perimeter is: 24.0 units and Area is: 36.0 sq units.
------------------------
 */