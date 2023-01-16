create table users (
    id          serial         primary key identifier,
    username    varchar(30)    not null unique,
    password    varchar(80)    not null,
);

create table roles (
    id bigint,
    title varchar(50) not null,
    primary key (id)
);

create table user_role (
    user_id bigint not null,
    role_id bigint not null,
    primary key (user_id, role_id),
    foreign key (user_id) references users (id),
    foreign key (role_id) references roles (id)
);

--create table products (
--    id bigint,
--    title varchar(255) not null,
--    price decimal(6,2) not null,
--    primary key (id)
--);

insert into roles (title)
values
    ('ROLE_USER'), ('ROLE_MANAGER'), ('ROLE_ADMIN'), ('ROLE_SUPERADMIN');

insert into users (username, password)
values
    ('user', '$2y$12$3jD2vqhTkyn3nYy4XmMUXO9V8LaW1gQPsiC8vqaanV7Q05dydOY9C'),
    ('manager', '$2y$12$3jD2vqhTkyn3nYy4XmMUXO9V8LaW1gQPsiC8vqaanV7Q05dydOY9C'),
    ('admin', '$2y$12$3jD2vqhTkyn3nYy4XmMUXO9V8LaW1gQPsiC8vqaanV7Q05dydOY9C'),
    ('superadmin', '$2y$12$3jD2vqhTkyn3nYy4XmMUXO9V8LaW1gQPsiC8vqaanV7Q05dydOY9C');

insert into user_role (user_id, role_id)
values
    (1, 1),
    (2, 2),
    (3, 3),
    (4, 4);

--insert into products (title, price)
--values
--    ('Product1', 10),
--    ('Product2', 20),
--    ('Product3', 30),
--    ('Product4', 40);



