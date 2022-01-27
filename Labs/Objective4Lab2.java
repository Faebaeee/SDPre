import java.util.Scanner;

public class Objective4Lab2 {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int num1 = 0, num2 = 0, num3 = 0;
    double dub1 = 0.0, dub2 = 0.0, dub3 = 0.0;
    int intsum;
    double dubsum;

    System.out.println("Please enter the first whole number you would like to add.");
    num1 = sc.nextInt();
    System.out.println("Please enter the second whole number you would like to add.");
    num2 = sc.nextInt();
    System.out.println("Please enter the third whole number you would like to add.");
    num3 = sc.nextInt();

    System.out.println("Please enter the first decimal you would like to add.");
    dub1 = sc.nextDouble();
    System.out.println("Please enter the second decimal you would like to add.");
    dub2 = sc.nextDouble();
    System.out.println("Please enter the third decimal you would like to add.");
    dub3 = sc.nextDouble();

    sc.close();

    System.out.println("The sum of " + num1 + " + " + num2 + " + " + num3 + " = " + (num1 + num2 + num3));

    System.out.println("The sum of " + dub1 + " + " + dub2 + " + " + dub3 + " = " + (dub1 + dub2 + dub3));






  }
}
