package com.kodilla.good.patterns.task134;

public class AddSupplierProcess {
    Product product = new Product("Jaja", 100);
    Producer producer = new Producer("Kury Boryny", "Kowalewo 12");
    Process process = new Process();

    //@Override
            public boolean process(){
        System.out.println(producer + " sold " + 30 +" eggs.");
        return true;
    }

    ProcessRepository processRepository = new ProcessRepository();
    ProductRepository productRepository = new ProductRepository();

    public void addSupplierProcess(){

        processRepository.createProcess();
        productRepository.addProduct();
    }
}
