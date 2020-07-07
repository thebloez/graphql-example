create table test.author
(
    id   bigint auto_increment
        primary key,
    age  int          not null,
    name varchar(255) not null
);

create table test.tutorial
(
    id          bigint auto_increment
        primary key,
    description varchar(255) null,
    title       varchar(255) null,
    author_id   bigint       not null,
    constraint FKjmn3w4clcdfulxllrw6n636qd
        foreign key (author_id) references test.author (id)
);

-- auto-generated definition
create table test.book
(
    id         bigint auto_increment
        primary key,
    book_title varchar(255) null,
    id_tutor   bigint       not null,
    constraint FKegjsix8m6i9axqaqovs6xiwbe
        foreign key (id_tutor) references test.tutorial (id)
);