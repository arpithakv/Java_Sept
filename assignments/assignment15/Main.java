package co.arpitha.training.assignments.assignment15;

public class Main {
    public static void main(String[] args) {
        Movable m1 = new MovablePoint(5, 6, 10, 15);     // upcast
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);

        Movable m2 = new MovableCircle(1, 2, 3, 4, 20);  // upcast
        System.out.println(m2);
        m2.moveRight();
        System.out.println(m2);


        Movable m3 = new MovableRectangle(1, 2, 3, 4, 25, 35);  // upcast
        System.out.println(m3);
        m3.moveUp();
        System.out.println(m3);


    }
}
/*OUTPUT
MovablePoint[x=5, y=6, xSpeed=10, ySpeed=15]
MovablePoint[x=15, y=6, xSpeed=10, ySpeed=15]
MovableCircle{radius=1, center=MovablePoint[x=2, y=3, xSpeed=4, ySpeed=20]}
MovableCircle{radius=1, center=MovablePoint[x=-2, y=3, xSpeed=4, ySpeed=20]}
MovableRectangle[topLeft=MovablePoint[x=1, y=2, xSpeed=25, ySpeed=35], bottomRight=MovablePoint[x=3, y=4, xSpeed=25, ySpeed=35]]
MovableRectangle[topLeft=MovablePoint[x=1, y=-33, xSpeed=25, ySpeed=35], bottomRight=MovablePoint[x=3, y=-31, xSpeed=25, ySpeed=35]]
 */