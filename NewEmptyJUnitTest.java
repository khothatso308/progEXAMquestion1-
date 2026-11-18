/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import com.mycompany.salesreportexam.Product;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Admin
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
        
    /**
     *
     */
    Public class ProductTest {

    @Test
    public void GetTotalProductSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(products, sales);
        int expected = 153;
        int actual = product.GetTotalProductsSold();

        assertEquals(expected, actual);
    }

    @Test
    public void GetAverageSales_WithValidData_ReturnsCorrectValue() {
        String[] products = {"Cozy Nights Monarch", "Restonic Barbados", "Sealy Phuket"};
        int[][] sales = {
            {25, 18, 20},
            {15, 10, 12},
            {18, 15, 20}
        };

        Product product = new Product(products, sales);
        double expected = 17.0;
        double actual = product.GetAverageProductSold();

        assertEquals(expected, actual, 0.01);
    }
}
    
    

