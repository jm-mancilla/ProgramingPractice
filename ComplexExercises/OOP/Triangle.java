package ComplexExercises.OOP;

public class Triangle {

    private int coordinateX;
    private int coordinateY;
    private int width;
    private int height;


    public Triangle(int x, int y, int w, int h) {
        this.coordinateX = x;
        this.coordinateY = y;
        this.width = w;
        this.height = h;
    }

    public int triangleArea(){
        return (width * height) / 2;
    }


}
