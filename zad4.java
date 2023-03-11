import java.util.Scanner;

public class zad4 {

    public static void main(String[] args)
    {
        System.out.println("Podaj trzy liczby:");
        System.out.print("a = ");
        
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        System.out.print("b = ");
        int b = sc.nextInt();

        System.out.print("c = ");
        int c = sc.nextInt();

        if ( ((a + b) > c) && ((a + c) > b) && ((b + c) > a))
        {
            System.out.print("Mozna zbudowac");
        }
        else
        {
            System.out.print("Blad");
        }

        sc.close();






    }

}
