/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreportexam;

import com.mycompany.salesreportexam.Iproduct.IProduct;

/**
 *
 * @author Admin
 */

    public class Product implements IProduct {
    private String[] products;
    private int[][] sales;

    public Product(String[] products, int[][] sales) {
        this.products = products;
        this.sales = sales;
    }

    @Override
    public int GetTotalProductsSold() {
        int total = 0;
        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
        }
        return total;
    }

    @Override
    public double GetAverageProductSold() {
        int total = GetTotalProductsSold();
        int count = 0;
        for (int i = 0; i < sales.length; i++) {
            count += sales[i].length;
        }
        return (double) total / count;
    }

    @Override
    public String GetMostPopularProduct() {
        int highestSingleSale = -1;
        String mostPopular = "";

        for (int i = 0; i < sales.length; i++) {
            for (int j = 0; j < sales[i].length; j++) {
                if (sales[i][j] > highestSingleSale) {
                    highestSingleSale = sales[i][j];
                    mostPopular = products[i] + " (" + highestSingleSale + ")";
                }
            }
        }
        return mostPopular;
    }
}
    

