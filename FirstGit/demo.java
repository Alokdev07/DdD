package FirstGit;
import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("hello world");
        System.out.println(a);
        Scanner sc =  new Scanner(System.in);
        int b = sc.nextInt();
        System.out.println(a+b);
        int c = sc.nextInt();
        System.out.println(a+b+c);
        sc.close();  
        System.out.println("Hi i am alok");
        System.out.println("want errors");
    }
}
