package JavaPrograms;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

public class PrintInputAsOutputExample {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String sname = scanner.nextLine();
        System.out.println();
        System.out.print("Enter you age: ");
        int age = scanner.nextInt();
        System.out.println();
        System.out.println("Hello "+sname+" your age is "+age);
        scanner.close();
    }
}
