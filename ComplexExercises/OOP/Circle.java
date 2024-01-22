package ComplexExercises.OOP;

import java.util.Objects;

public class Circle {

    private  int coordinteX;
    private  int coordinteY;
    private  int radius;


    public Circle(int x, int y, int r) {
        this.coordinteX = x;
        this.coordinteY = y;
        this.radius = r;
    }

    @Override
    public String toString() {
        return "\nCircle{" +
                "\ncoordinteX=" + coordinteX +
                ", \ncoordinteY=" + coordinteY +
                ", \nradius=" + radius +"\n"+
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Circle circle = (Circle) o;
        return coordinteX == circle.coordinteX && coordinteY == circle.coordinteY;
    }

    @Override
    public int hashCode() {
        return Objects.hash(coordinteX, coordinteY);
    }

    public double circleArea(){
        this.radius = radius;

        return Math.PI * Math.pow(radius,2);
    }

}
