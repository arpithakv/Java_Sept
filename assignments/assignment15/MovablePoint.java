package co.arpitha.training.assignments.assignment15;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MovablePoint implements Movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    @Override
    public String toString() {
        return "MovablePoint[" +
                "x=" + x +
                ", y=" + y +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                ']';
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
        y += ySpeed;
    }

    @Override
    public void moveLeft() {
        x += xSpeed;
    }

    @Override
    public void moveRight() {
        x -= xSpeed;
    }
}
