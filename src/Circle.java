public class Circle {
    int radius;

    public double circlesize() {
        double size = radius * radius * 3.14;
        return size;
    }


    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.radius = 8;

        double result = circle.circlesize();
        System.out.println(result);
    }
}