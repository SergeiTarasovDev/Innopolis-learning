create table product
(
    id serial primary key,
    name varchar(30),
    description varchar(50),
    cost integer check (cost > 0),
    count integer check (count > 0)
);

create table customer
(
    id serial primary key,
    first_name varchar(30),
    last_name varchar(30),
    email varchar(20)
);

create table orders (
    id serial primary key,
    product_id integer,
    customer_id integer,
    order_date date,
    count_products integer,
    foreign key(product_id) references product(id),
    foreign key(customer_id) references customer(id)
);
insert into product(name, description, cost, count) values ('Lamborghini Diablo', 'Super Car', 11250000, 1);
insert into product(name, description, cost, count) values ('Lada 2101', 'Car for real man', 112500, 40);
insert into product(name, description, cost, count) values ('Subaru Impreza', 'Forced car', 680000, 7);
insert into product(name, description, cost, count) values ('Hyundai Solaris', 'Standart car', 1250000, 100);
insert into product(name, description, cost, count) values ('Lamborghini Murcielago', 'Super Car', 16250000, 1);

update product set cost = 1600000 where id = 1;

insert into customer(first_name, last_name, email) values ('Михаил', 'Сокуров', 'sokur@mail.ru');
insert into customer(first_name, last_name, email) values ('Иван', 'Ходиков', 'hodit@mail.ru');
insert into customer(first_name, last_name, email) values ('Анна', 'Петрова', 'petrovA@gmail.com');
insert into customer(first_name, last_name, email) values ('Александр', 'Иванов', 'AlekIva@mail.ru');
insert into customer(first_name, last_name, email) values ('Мария', 'Кошкина', 'koshki@ya.ru');

insert into orders(order_date, customer_id, product_id, count_products) values ('2021-08-12', 1, 1, 1);
insert into orders(order_date, customer_id, product_id, count_products) values ('2021-09-02', 2, 2, 3);
insert into orders(order_date, customer_id, product_id, count_products) values ('2021-08-30', 3, 3, 2);
insert into orders(order_date, customer_id, product_id, count_products) values ('2021-10-11', 4, 4, 10);
insert into orders(order_date, customer_id, product_id, count_products) values ('2021-11-01', 5, 2, 7);
insert into orders(order_date, customer_id, product_id, count_products) values ('2021-08-22', 1, 4, 15);

/* Все товары */
select * from product;

/* Все заказы */
select
       order_date,
       customer.last_name,
       customer.first_name,
       product.name,
       product.cost,
       orders.count_products
from orders, customer, product
where orders.product_id = product.id and orders.customer_id = customer.id;

/* Количество проданных товаров и их остаток */
select a.name as product_name, sum(p.count_products) as sold_count, a.count as in_stock
from product a
         full join orders p on p.product_id = a.id
group by a.id
order by sold_count DESC;

/* Список товоаров, с количеством заказов, в которых он присутствует */
select name, (select count (*) from orders where product_id = product.id) as orders_count from product;

/* Покупатели, которые совершали покупки */
select a.last_name, a.first_name, a.email
from customer a
    left join orders o on a.id = o.customer_id
group by a.id
order by a.last_name;




