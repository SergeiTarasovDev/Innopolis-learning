import org.springframework.jdbc.datasource.DriverManagerDataSource;

import javax.sql.DataSource;

public class Main {
    public static void main(String[] args) {
        DataSource dataSource = new DriverManagerDataSource("jdbc:postgresql://localhost:5432/pcs_2",
                "postgres", "innopolis2021");

        ProoductsRepository prooductsRepository = new ProoductsRepositoryJdbcTemplateImpl(dataSource);

        System.out.println("\nВсе товары " + prooductsRepository.findAll());

        int price = 680_000;
        System.out.println("\nТовары с ценой равной " + price + " руб: " + prooductsRepository.findAllByPrice(price));

        int countOrders = 1;
        System.out.println("\nТовары, которые присутствуют в " + countOrders + " заказах: " + prooductsRepository.findAllByOrdersCount(countOrders));

    }
}
