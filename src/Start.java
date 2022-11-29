import java.util.Scanner;

public class Start {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try{
            System.out.println("Insert first number");
            int dividend = scanner.nextInt();
            System.out.println("insert the second number");
            int divisor = scanner.nextInt();
            scanner.close();
            int result = dividend / divisor;
            System.out.println("This is a result "+ result);

        }catch (Exception e){ e.printStackTrace();
            System.out.println("second number can't be 0");
        }
    }
}
