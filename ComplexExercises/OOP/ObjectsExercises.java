package ComplexExercises.OOP;

import java.util.*;

public class ObjectsExercises {
    public static void main(String[] args) {

        Circle circle = new Circle(2,4,8);
        Circle circle2 = new Circle(1,2,90);

        Triangle triangle = new Triangle(1,2,10,10);

        System.out.println(circle.toString());
        System.out.printf("%nAre both circles equals?: " + circle.equals(circle2) + "%n");
        System.out.printf("%nCircle area: " + circle.circleArea() + "%n");

        System.out.printf("%nTriangle area: " + triangle.triangleArea() + "%n");
        System.out.printf("%nObjects area: " + getObjectsAreasList(circle,triangle) + "%n");

    }

    private static ArrayList<Object> getObjectsAreasList(Circle circle, Triangle triangle) {
        ArrayList<Object> objectArrayList = new ArrayList<>();
        objectArrayList.add(circle.circleArea());
        objectArrayList.add(triangle.triangleArea());
        return objectArrayList;
    }
}
