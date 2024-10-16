/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mob1023.Lab1;

/**
 *
 * @author truon
 */
public interface DAO<T> {
    void insert(T t);
    void update(T t);
    void delete(T t);
    T select(int id);
}

