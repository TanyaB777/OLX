package hw_4;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        //𝑎𝑥2+𝑏𝑥+𝑐=0, 𝑎≠0
        double a, b, c, discriminator, x1, x2;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculating the roots of a quadratic equation 𝑎𝑥2+𝑏𝑥+𝑐=0");

        do {
            System.out.print("Enter a (a cannot be equal to 0): ");
            a = scanner.nextDouble();
        } while (a == 0);

        System.out.print("Enter b: ");
        b = scanner.nextDouble();

        System.out.print("Enter c: ");
        c = scanner.nextDouble();

        scanner.close();

        discriminator = b * b - 4 * a * c;

        if (discriminator < 0) {
            System.out.println("The equation has no real roots");
        } else if (discriminator == 0) {
            x1 = (-1 * b) / 2 * a;
            System.out.printf("The roots of the equation are : %.2f, %.2f", x1, x1);
        } else {
            x1 = (-1 * b + Math.sqrt(discriminator)) / 2 * a;
            x2 = (-1 * b - Math.sqrt(discriminator)) / 2 * a;
            System.out.printf("The roots of the equation are : %.2f, %.2f", x1, x2);
        }
    }
}