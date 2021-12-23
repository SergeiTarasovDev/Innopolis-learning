import java.util.List;

public interface ProoductsRepository {
    List<Product> findAll();
    List<Product> findAllByPrice(int cost);
    List<Product> findAllByOrdersCount(int count);

    void save(Product product);
}
