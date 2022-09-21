import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first value");
        int x = scanner.nextInt();
        System.out.println("Enter second value");
        int y = scanner.nextInt();
        System.out.println("Hello, what do you like to do?\n1.Addition\n2.Sunstraction\n3.Multiplication\n4.Division");
        int select = scanner.nextInt();
        switch (select){
            case 1:
                System.out.println("Result: "+(x+y));
                break;
            case 2:
                System.out.println("Result: " +(x-y));
                break;
            case 3:
                System.out.println("Result: " +(x*y));
                break;
            case 4:
                System.out.println("Result: " +(x/y));
                break;
        }
    }}