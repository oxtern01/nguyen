/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author thnrg
 */
public class NoTaxProduct extends Product
{
    @Override
    public double getImportTax()
    {
        return 0;
    }
}
