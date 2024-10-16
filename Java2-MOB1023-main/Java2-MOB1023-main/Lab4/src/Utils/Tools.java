/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author thnrg
 */
public class Tools {
    private static final  SimpleDateFormat formatter = new SimpleDateFormat();
            
    public static Date parseDate(String text) throws ParseException
    {
        Date date;
        formatter.applyPattern("đ-MM-yyyy");
        date = formatter.parse(text);
        return date;
    }
    
    public static Date parseDate(String text, String pattern) throws ParseException
    {
        Date date;
        formatter.applyPattern(pattern);
        date = formatter.parse(text);
        return date;
    }
}
