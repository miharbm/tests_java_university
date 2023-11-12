package ru.borodin.test8;

public class Vector3D {
    private final double x;
    private final double y;
    private final double z;

    public Vector3D(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double length() {
        return Math.sqrt( x * x + y * y + z * z );
    }

    public static double scalarProduct (Vector3D v1, Vector3D v2) {
        return v1.getX() * v2.getX() + v1.getY() * v2.getY() + v1.getZ() * v2.getZ();
    }

    public static Vector3D vectorProduct (Vector3D v1, Vector3D v2) {
        double x = v1.getY() * v2.getZ() - v1.getZ() *  v2.getY();
        double y = v1.getZ() * v2.getX() - v1.getX() * v2.getZ();
        double z = v1.getX() * v2.getY() - v1.getY() * v2.getX();

        return new Vector3D( x, y ,z );
    }

    public static Vector3D sum (Vector3D v1, Vector3D v2) {
        double x = v1.getX() + v2.getX();
        double y = v1.getY() + v2.getY();
        double z = v1.getZ() + v2.getZ();

        return new Vector3D( x, y ,z );
    }
    public static Vector3D subtraction (Vector3D v1, Vector3D v2) {
        double x = v1.getX() + v2.getX();
        double y = v1.getY() + v2.getY();
        double z = v1.getZ() + v2.getZ();

        return new Vector3D( x, y ,z );
    }

    @Override
    public String toString() {

        return "{" + x + " ," + y +" ," + z + "}";
    }

    public double getY() {
        return y;
    }

    public double getX() {
        return x;
    }

    public double getZ() {
        return z;
    }
}
