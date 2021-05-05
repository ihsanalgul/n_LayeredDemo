package nLayeredDemo.bussiness.concretes;

import nLayeredDemo.bussiness.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDAO;
import nLayeredDemo.entities.concretes.Product;

import java.util.List;

public class ProductManager implements ProductService {

    private ProductDAO productDAO;

    private LoggerService loggerService;

    public ProductManager(ProductDAO productDAO, LoggerService loggerService) {
        this.productDAO = productDAO;
        this.loggerService=loggerService;
    }


    @Override
    public void add(Product product) {
        if (product.getCategoryId()==1) {
            System.out.println("Bu kategoride ürün kabul edilmiyor. \ncategoryId: 1");
            System.out.println("*****************************************************");
            return;
        }

        this.productDAO.add(product);
        this.loggerService.logToSystem("Ürün eklendi: "+product.getName());
    }


    @Override
    public List<Product> getAll() {
        return null;
    }
}
