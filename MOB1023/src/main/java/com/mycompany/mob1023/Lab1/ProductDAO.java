/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mob1023.Lab1;

/**
 *
 * @author truon
 */
public class ProductDAO implements DAO<Product> {
    @Override
    public void insert(Product product) {
        System.out.println("Thêm mới thành công: " + product.getName());
    }

    @Override
    public void update(Product product) {
        System.out.println("Cập nhật thành công: " + product.getName());
    }

    @Override
    public void delete(Product product) {
        System.out.println("Xóa thành công: " + product.getName());
    }

    @Override
    public Product select(int id) {
        System.out.println("Lấy thông tin sản phẩm với ID: " + id);
        return null; // Chỉ để minh họa, thực tế sẽ trả về sản phẩm từ CSDL
    }
}
