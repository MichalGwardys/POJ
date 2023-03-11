import java.util.Scanner;

// Zadanie 3 

public class zad3 {

    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj dwa ciagi znakow oddzielone spacja");
        String napis= sc.nextLine() + sc.nextLine();
        System.out.print("%"+napis+"%");

    }


}