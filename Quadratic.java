import java.util.*;

public class Quadratic {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO COMPUTATION OF QUADRATIC EQUATION");
        System.out.println("          Ax*x + Bx + C      ");
        System.out.println();
        System.out.println("Enter value for A ,B ,C ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println();
        System.out.println("Quadratic Equation is:  "+a+"xx + "+b+"x + "+c);
        double root1, root2;
        double determinant = (b * b) - (4 * a * c);
        if (determinant > 0) {

            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1, root2);
        }
        else if (determinant == 0) {

            root1 = root2 = (float)-b / (2 * a);
            System.out.format("root1 = root2 = %.2f;", root1);
        }
       else {

            double real = -b / (2 * a);
            double imaginary = Math.sqrt(-determinant) / (2 * a);
            System.out.format("root1 = %.2f+%.2fi", real, imaginary);
            System.out.format("\nroot2 = %.2f-%.2fi", real, imaginary);
        }
    }
}
