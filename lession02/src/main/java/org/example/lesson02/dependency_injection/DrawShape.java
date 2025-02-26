package org.example.lesson02.dependency_injection;

interface Shape {
    void draw();
}

class CircleShape implements Shape {
    public void draw() {
        System.out.println("CircleShape draw");
    }
}

class RectangShape implements Shape {
    public void draw() {
        System.out.println("RectangShape draw");
    }
}

public class DrawShape {
    private Shape shape;
    public DrawShape(Shape shape) {
        this.shape = shape;
    }
    public void Draw() {
        shape.draw();
    }

    public static void main(String[] args) {
        DrawShape drawShape = new DrawShape(new CircleShape());
        drawShape.Draw();

        drawShape = new DrawShape(new RectangShape());
        drawShape.Draw();
    }
}
