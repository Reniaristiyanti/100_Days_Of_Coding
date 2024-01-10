package ISC;

import java.util.Scanner;

public class Day93 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Angka a: ");
        int a = scanner.nextInt();

        System.out.print("Angka b: ");
        int b = scanner.nextInt();

        System.out.print("Angka c: ");
        int c = scanner.nextInt();

        double[] roots = solveQuadraticEquation(a, b, c);

        if (roots[0] != Double.NaN) {
            System.out.println("Hasil Persamaan Kuadrat adalah " + roots[0] + " dan " + roots[1]);
        } else {
            System.out.println("Persamaan Kuadrat tidak memiliki akar real");
        }
    }

    public static double[] solveQuadraticEquation(int a, int b, int c) {
        double[] roots = new double[2];
        double d = b * b - 4 * a * c;

        if (d >= 0) {
            roots[0] = (-b + Math.sqrt(d)) / (2 * a);
            roots[1] = (-b - Math.sqrt(d)) / (2 * a);
        } else {
            // Set roots to NaN if no real roots
            roots[0] = Double.NaN;
            roots[1] = Double.NaN;
        }

        return roots;
    
    }
    
}
