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

        while(true)
        {
            System.out.print(message);
            String input = scanner.nextLine();
            
            if(isDouble(input))
            {
                result = Double.parseDouble(input);
                break;
            }
            else
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

        while (true) {
            System.out.print(message);
            String input = scanner.nextLine();
            
            if(isInt(input))
            {
                result = Integer.parseInt(input);
                break;
            }
            else
            {
                System.out.println("Not a double");
            }
        }

        return result;
    }
    
    public static boolean isDouble(String str) {
        try 
        {
            Double.valueOf(str);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
    
    public static boolean isInt(String str) {
        try 
        {
            Integer.valueOf(str);
            return true;
        } 
        catch (NumberFormatException e) 
        {
            return false;
        }
    }
}
