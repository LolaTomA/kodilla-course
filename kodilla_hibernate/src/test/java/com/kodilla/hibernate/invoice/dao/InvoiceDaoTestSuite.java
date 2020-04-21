package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.math.BigDecimal;
import java.util.Optional;

@RunWith(SpringRunner.class)
@SpringBootTest
public class InvoiceDaoTestSuite {
    @Autowired
    InvoiceDao invoiceDao;

    @Test
    @Transactional
    public void testInvoiceDaoSave(){
        //Given
        Product productT = new Product("Trampek");
        Product productS = new Product("Sandal");
        Product productM = new Product("Maska");

        Item itemT = new Item(productT, new BigDecimal(100), 110);
        Item itemT2 = new Item(productT,new BigDecimal(100), 1000);
        Item itemS = new Item(productS,new BigDecimal(50),55);
        Item itemM = new Item(productM,new BigDecimal(10),11000);

        Invoice invoice1 = new Invoice("17/04/20/0001");
        Invoice invoice2 = new Invoice("18/04/20/0002");

        productT.getItems().add(itemT);
        productT.getItems().add(itemT2);
        productS.getItems().add(itemS);
        productM.getItems().add(itemM);

        invoice1.getItems().add(itemT);
        invoice1.getItems().add(itemM);
        invoice1.getItems().add(itemS);
        invoice2.getItems().add(itemT2);

        //When
        invoiceDao.save(invoice1);
        invoiceDao.save(invoice2);

        //Then
        int id1 = invoice1.getId();
        int id2 = invoice2.getId();
        Optional<Invoice> readInvoice1 = invoiceDao.findById(id1);
        Optional<Invoice> readInvoice2 = invoiceDao.findById(id2);
        Assert.assertTrue(readInvoice1.isPresent());
        Assert.assertTrue(readInvoice2.isPresent());

        //CleanUp
        invoiceDao.deleteById(id1);
        invoiceDao.deleteById(id2);
    }
}
