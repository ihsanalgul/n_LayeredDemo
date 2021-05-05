package nLayeredDemo.dataAccess.concretes;

import nLayeredDemo.dataAccess.abstracts.ProductDAO;
import nLayeredDemo.entities.concretes.Product;

public class HibernateProductDAO implements ProductDAO {

    @Override
    public void add(Product product) {
        System.out.println("Hibernate ile eklendi -> "+product.getName());
    }

    @Override
    public void delete(Product product) {

    }

    @Override
    public void update(Product product) {

    }

    @Override
    public Product get(int id) {
        return null;
    }

    @Override
    public Product[] getAll() {
        return new Product[0];
    }
}
