/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.salesreportexam;

/**
 *
 * @author Admin
 */
public class PrintProduct {
    private Product product;

    public PrintProduct(Product product) {
        this.product = product;
    }

    public void printReport() {
        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*****************************************");
        printTotalProductSales();
        printAverageProductSales();
        printMostPopularProductSale();
    }

    public void printTotalProductSales() {
        System.out.println("TOTAL PRODUCT SALES: " + product.GetTotalProductsSold());
    }

    public void printAverageProductSales() {
        System.out.printf("AVERAGE PRODUCT SALES: %.0f%n", product.GetAverageProductSold());
    }

    public void printMostPopularProductSale() {
        System.out.println("MOST POPULAR PRODUCT: " + product.GetMostPopularProduct());
    }
}
    

