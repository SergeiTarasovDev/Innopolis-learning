package ru.pcs.web.repositories;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;
import ru.pcs.web.models.Product;

import javax.sql.DataSource;
import java.util.List;

@Component
public class ProductsRepositoryJdbcTemplateImpl implements ProductsRepository {

    //language=SQL
    private static final String SQL_INSERT = "insert into product(name, description, cost, count) values(?, ?, ?, ?)";

    //language=SQL
    private static final String SQL_SELECT_ALL = "select * from product order by id";

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public ProductsRepositoryJdbcTemplateImpl(DataSource dataSource) {
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
    public void save(Product product) {
        jdbcTemplate.update(SQL_INSERT, product.getName(), product.getDescription(), product.getCost(), product.getCount());
    }

}
