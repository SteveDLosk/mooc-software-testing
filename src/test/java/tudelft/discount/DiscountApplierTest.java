package tudelft.discount;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import java.util.LinkedList;
import java.util.List;

import static org.mockito.Mockito.*;



public class DiscountApplierTest {

    ProductDao dao;
    Product[] testProducts;
    List<Product> results;
    DiscountApplier discountApplier;

    @BeforeEach
    public void initialize() {

        results = new LinkedList<>();
        dao = mock(ProductDao.class);
        testProducts = new Product[] { new Product("Cookie", 0.99, "FOOD"),
            new Product("Beer", 5.99, "FOOD"),
            new Product( "Paper Towels", 2.99, "HOME"), new Product("lamp", 9.99, "HOME"),
            new Product( "pens", 1.99, "BUSINESS"), new Product("folders", 3.49, "BUSINESS")};

        when(dao.all()).thenReturn(results);
        discountApplier = new DiscountApplier(dao);

    }

    @Test
    public void changeNoPrices() {

        results.add(testProducts[0]);
        results.add(testProducts[1]);

        discountApplier.setNewPrices();

        List<Product> endResult = dao.all();
        Assertions.assertEquals(0.99 , endResult.get(0).getPrice());
        Assertions.assertEquals(5.99 , endResult.get(1).getPrice());
    }

    @Test
    public void businessMiddlePrices() {

        results.add(testProducts[0]);
        results.add(testProducts[5]);
        results.add(testProducts[1]);

        discountApplier.setNewPrices();

        List<Product> endResult = dao.all();
        Assertions.assertEquals(0.99 , endResult.get(0).getPrice());
        // imprecise double handling
        Assertions.assertTrue(endResult.get(1).getPrice() <= 3.84);
        Assertions.assertTrue(endResult.get(1).getPrice() >= 3.83);
        Assertions.assertEquals(5.99 , endResult.get(2).getPrice());
    }

    @Test
    public void homeMiddlePrices() {

        results.add(testProducts[0]);
        results.add(testProducts[3]);
        results.add(testProducts[1]);

        discountApplier.setNewPrices();

        List<Product> endResult = dao.all();
        Assertions.assertEquals(0.99 , endResult.get(0).getPrice());
        // imprecise double handling
        Assertions.assertTrue(endResult.get(1).getPrice() < 9.00);
        Assertions.assertTrue(endResult.get(1).getPrice() >= 8.99);
        Assertions.assertEquals(5.99 , endResult.get(2).getPrice());
    }

}
