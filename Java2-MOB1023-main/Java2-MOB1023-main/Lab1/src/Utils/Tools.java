/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.util.Scanner;

public class Tools {
    private static final Scanner scanner = new Scanner(System.in);
    
    public static double getDouble(String message)
    {
        double result = 0;
        boolean check = false;

        while (!check) {
            System.out.print(message);
            String input = scanner.nextLine();

            try 
            {
                result = Double.parseDouble(input);
                check = true;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Not a double");
            }
        }

        return result;
    }
    
    public static String getString(String message)
    {
        System.out.print(message);
        return scanner.nextLine();
    }
    
    public static int getInt(String message)
    {
        int result = 0;
        boolean check = false;

        while (!check) {
            System.out.print(message);
            String input = scanner.nextLine();

            try 
            {
                result = Integer.parseInt(input);
                check = true;
            } 
            catch (NumberFormatException e) 
            {
                System.out.println("Not a double");
            }
        }

        return result;
    }
}
