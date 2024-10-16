/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utils;

import java.io.*;
/**
 *
 * @author thnrg
 */
public class XFile {
    
    /**
     * Đọc file nhị phân
     * @param path là đường dẫn file cần đọc
     * @return dữ liệu đã đợc được
     */
    public static byte[] read(String path)
    {

        byte[] data = null;
        try (FileInputStream fis = new FileInputStream(path)) 
        {
            int n = fis.available();
            data = new byte[n];
            fis.read(data);
        }
        catch(IOException ex)
        {
        }
        return data;
    }
    
    /**
    * Ghi file nhị phân
    * @param path là đường dẫn file cần ghi
    * @param data là dữ liệu cần ghi vào file
    */
    public static void write(String path, byte[] data)
    {
        try(FileOutputStream fos = new FileOutputStream(path))
        {
            fos.write(data);
            fos.close();
        }
        catch(IOException ex)
        {
        }
    }
    
    /**
    * Đọc file đối tượng
    * @param path là đường dẫn file cần đọc
    * @return đối tượng đọc được
    */
    public static Object readObject(String path)
    {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path)))
        {
            Object object = ois.readObject();
            ois.close();
            return object;
        }
        catch(Exception ex)
        {
        }
        return null;
    }
    
    /**
    * Ghi file đối tượng
    * @param path là đường dẫn file cần ghi
    * @param object đối tượng cần ghi vào file
    */
    public static void writeObject(String path, Object object)
    {
        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path)))
        {
            oos.writeObject(object);
            oos.close();
        }
        catch(IOException ex)
        {
        }
    }
}
