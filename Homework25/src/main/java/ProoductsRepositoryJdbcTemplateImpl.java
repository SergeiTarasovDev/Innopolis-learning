import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.util.List;

public class ProoductsRepositoryJdbcTemplateImpl implements ProoductsRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into product(name, description, cost, count) values(?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from product order by id";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_PRICE = "select * from product where cost = ? order by id";

    //language=SQL
    private static final String SQL_SELECT_ALL_BY_ORDERS_COUNT ="select * from (select a.*, count(o.id) as orders_count from product a left join orders o on a.id = o.product_id group by a.id order by a.id ) as t where orders_count = ?";

    private JdbcTemplate jdbcTemplate;

    public ProoductsRepositoryJdbcTemplateImpl(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    private static final RowMapper<Product> userRowMapper = (row, rowNumber) -> {
        int id = row.getInt("id");
        String name = row.getString("name");
        String description = row.getString("description");
        int cost = row.getInt("cost");
        int count = row.getInt("count");

        return new Product(id, name, description, cost, count);
    };

    @Override
    public List<Product> findAll() {
        return jdbcTemplate.query(SQL_SELECT_ALL, userRowMapper);
    }

    @Override
    public List<Product> findAllByPrice(int cost) {
        return jdbcTemplate.query(SQL_SELECT_ALL_BY_PRICE, userRowMapper, cost);
    }

    @Override
    public List<Product> findAllByOrdersCount(int count) {
        return jdbcTemplate.query(SQL_SELECT_ALL_BY_ORDERS_COUNT, userRowMapper, count);
    }

    @Override
    public void save(Product product) {
        jdbcTemplate.update(SQL_INSERT, product.getName(), product.getDescription(), product.getCost(), product.getCount());
    }

}
