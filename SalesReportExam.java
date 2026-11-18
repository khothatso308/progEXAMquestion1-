/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salesreportexam;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SalesReportExam {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] products = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[products.length][3];

        for (int i = 0; i < products.length; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Enter number of sales for month " + (j + 1) + " for " + products[i] + " mattress: ");
                sales[i][j] = scanner.nextInt();
            }
            System.out.println();
        }

        Product productData = new Product(products, sales);
        PrintProduct printer = new PrintProduct(productData);
        printer.printReport();

        scanner.close();
    }
}