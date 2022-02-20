class Geometry {

    public float Area(float a) {
        float A = a * a;
        return  A ;
    }

    public float Area(float a, float b) {
        float A = a * b;
        return A;

    }

    public double Area(double a) {
        double A = 3.14 * a * a;
        return  A;

    }

    public float Perimeter(float a) {
        float perimeter = 4 * a;
        return perimeter;

    }

    public float Perimeter(float a, float b) {
        float perimeter = 2 * (a + b);
        return perimeter;
    }

    public double Perimeter(double a) {
        double perimeter = 3.14 * 2 * a;
        return perimeter;

    }



}