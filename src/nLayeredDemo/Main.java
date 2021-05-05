package nLayeredDemo;

import nLayeredDemo.bussiness.abstracts.ProductService;
import nLayeredDemo.bussiness.concretes.ProductManager;
import nLayeredDemo.core.JLoggerManagerAdapter;
import nLayeredDemo.dataAccess.concretes.HibernateProductDAO;
import nLayeredDemo.entities.concretes.Product;

public class Main {
    public static void main(String[] args) {

        ProductService productService = new ProductManager(new HibernateProductDAO(),
                new JLoggerManagerAdapter());

        Product product1= new Product(1,1,"Acer Laptop",12,50);

        Product product2= new Product(1,12,"Acer Laptop",12,50);

        productService.add(product1);

        productService.add(product2);
    }
}
