package ru.borodin.test8;

public class Main {
    public static void main(String[] args) {
        Vector3D v1 = new Vector3D( 1, 2, 3 );
        Vector3D v2 = new Vector3D( 4, 5, 6 );
        System.out.println("v1 = " + v1);
        System.out.println("v2 = " + v2);
        System.out.println("v1 length = " + v1.length());
        System.out.println("v2 length = " + v2.length());
        System.out.println("vector product = " + Vector3D.vectorProduct( v1, v2 ));
        System.out.println("scalar product = " + Vector3D.scalarProduct( v1, v2 ));
        System.out.println("sum = " + Vector3D.sum( v1, v2 ));
        System.out.println("subtraction = " + Vector3D.subtraction( v1, v2 ));
    }
}