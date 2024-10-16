package Main;

import Models.*;
import UI.*;
import Utils.*;
import com.formdev.flatlaf.FlatLightLaf;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JFrame;
import static java.lang.Math.*;

/**
 *
 * @author thnrg
 */
public class Lab5 {
    protected File fileNameBai5 = new File("src/Files/lab5bai5.txt");
    protected String fileNameBai6 = "src/Files/lab5bai6.txt";
    protected ArrayList<Stock> stocks = new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        FlatLightLaf.setup();
        int exercise = 0;

        Lab5 lab5 = new Lab5(); 
        while(exercise < 1 || exercise > 6)
        {
            exercise = Tools.getInt("Choose exercise (1-6): ");
        }

        switch(exercise)
        {
            case 1 -> lab5.bai1();
            case 2 -> lab5.bai2();
            case 3 -> lab5.bai3();
            case 4 -> lab5.bai4();
            case 5 -> lab5.bai5();
            case 6 -> lab5.bai6();
        }
    }
    
    public void bai1() {
        byte[] data = XFile.read("src/Files/a.gif");
        XFile.write("src/Files/b.gif", data);
    }

    public void bai2() {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Tuan", 5, "CNTT"));
        list.add(new Student("Cuong", 7.5, "TKTW"));
        list.add(new Student("Hanh", 8.5, "CNTT"));
        
        XFile.writeObject("src/Files/students.dat", list);
        
        ArrayList<Student> list2 = (ArrayList<Student>) XFile.readObject("src/Files/students.dat");
        for(Student sv : list2){
            System.out.println(">Ho va ten: " + sv.getName());
        }
    }

    public void bai3() {
        JFrame quanlynhanvien = new QuanLyNhanVien();
        quanlynhanvien.setVisible(true);
    }

    public void bai4() {
        JFrame docghivanban = new DocGhiVanBan();
        docghivanban.setVisible(true);
    }

    public void bai5() {
        ghi();
        doc();
    }

    public void doc()
    {
        try(FileReader fr = new FileReader(fileNameBai5))
        {
            System.out.println("Doc tu file " + fileNameBai5.toString());
            int ch = fr.read();
            while(ch !=  -1)
            {
                System.out.print((char) ch);
                ch = fr.read();
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        System.out.println("");
    }

    private void ghi() {
        try(FileWriter fw = new FileWriter(fileNameBai5))
        {
            fw.write("Doc ghi du lieu trong Java");
            fw.write("\n");
            fw.write("Su dung character stream");
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }

    private void bai6() {
        for(int i = 0; i < random() * 10; i++)
        {
            stocks.add(new Stock(i + 1, "Desc", round(random() * 100000), (int) round(random() * 100)));
        }
        writeToFileText(fileNameBai6);
        readFromFileText(fileNameBai6);
    }
    
    public void writeToFileText(String filename)
    {
        try(BufferedWriter bw = new BufferedWriter(new FileWriter(filename)))
        {
            for(Stock stock: stocks)
            {
                bw.write(stock.toString() + "\n");
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
    
    public void readFromFileText(String filename)
    {
        try(BufferedReader br = new BufferedReader(new FileReader(filename)))
        {
            String text;
            while((text = br.readLine()) != null)
            {
                System.out.println(text);
            }
        }
        catch(IOException ex)
        {
            ex.printStackTrace();
        }
    }
}
