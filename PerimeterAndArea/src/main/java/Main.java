public class Main {

    public static void main(String[] args) {
/**
 * float as a parameter a is used for Area and Perimeter of Square.
 * float as parameters (a,b) are used for Area and Perimeter of Rectangle.
 * Double as a parameter a is used for Area and Perimeter of Square.
 */
        Geometry geometry = new Geometry();
        System.out.println("Area of square is " + geometry.Area(5));
        System.out.println("Perimeter of square is " + geometry.Perimeter(5));
        System.out.println("Area of rectangle is " + geometry.Area(6,7));
        System.out.println("Perimeter of Rectangle is " + geometry.Perimeter(6,7));
        System.out.println("Area of circle is " + geometry.Area(7.0));
        System.out.println("Perimeter of circle is " + geometry.Perimeter(9.0));
    }
}

