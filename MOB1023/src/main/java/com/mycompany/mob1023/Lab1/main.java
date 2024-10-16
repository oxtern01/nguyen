/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mob1023.Lab1;
import java.util.Scanner;

/**
 *
 * @author truon
 */

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductDAO productDAO = new ProductDAO();
        Product[] products = new Product[3];

        for (int i = 0; i < 2; i++) {
            System.out.println("nhap thong tin cho san pham thu " + (i + 1) + ":");
            System.out.print("Tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Đơn giá: ");
            double price = scanner.nextDouble();
            scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập giá

            products[i] = new Product(name, price);
            productDAO.insert(products[i]);
        }

        // Nhập thông tin cho sản phẩm không thuế
        System.out.println("Nhập thông tin cho sản phẩm không thuế:");
        System.out.print("Tên sản phẩm: ");
        String noTaxName = scanner.nextLine();
        System.out.print("Đơn giá: ");
        double noTaxPrice = scanner.nextDouble();
        scanner.nextLine(); // Đọc bỏ dòng mới sau khi nhập giá

        products[2] = new NoTaxProduct(noTaxName, noTaxPrice);
        productDAO.insert(products[2]);

        System.out.println("\nThông tin các sản phẩm:");
        for (Product product : products) {
            System.out.println("Tên sản phẩm: " + product.getName());
            System.out.println("Thuế nhập khẩu: " + product.getImportTax());
            System.out.println();
        }

        // Gọi các phương thức thao tác CSDL
        productDAO.update(products[0]);
        productDAO.delete(products[1]);
        productDAO.select(1);
        scanner.close();
    }
}
