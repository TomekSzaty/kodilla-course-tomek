package com.kodilla.kodillahibernate.invoice.dao;

import com.kodilla.kodillahibernate.invoice.Invoice;
import com.kodilla.kodillahibernate.invoice.Item;
import com.kodilla.kodillahibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    void testInvoiceDaoSave() {
        //Given
        Product product = new Product("Mouse");
        Product product2 = new Product("Keyboard");
        Product product3 = new Product("HDD");

        Item item = new Item(product, new BigDecimal(25.50), 2, new BigDecimal(51.00));
        Item item2 = new Item(product2, new BigDecimal(80.00), 4, new BigDecimal(360.00));
        Item item3 = new Item(product3, new BigDecimal(200.00), 6, new BigDecimal(1200.00));

        Invoice invoice = new Invoice("INV_NR_1");
        invoice.getItems().add(item);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);

        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();

        //Then
        assertNotEquals(0, id);

        //CleanUp
        invoiceDao.deleteById(id);

    }

}
