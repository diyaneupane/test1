        import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        int product = 1;
        if (number == 0) {
            product = 0;
        } else {
            while (number != 0) {
                int digit = number % 10;  
                product *= digit;         
                number /= 10;            
            }
        }

        System.out.println("The product of the digits of   is: " + product);
    }
}
