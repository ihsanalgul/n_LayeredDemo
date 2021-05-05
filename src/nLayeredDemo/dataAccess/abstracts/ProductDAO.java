package nLayeredDemo.dataAccess.abstracts;

import nLayeredDemo.entities.concretes.Product;

public interface ProductDAO {
    void add(Product product);
    void delete(Product product);
    void update(Product product);
    Product get(int id);
    Product[] getAll();
}
