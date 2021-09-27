create table task_groups (
    id int primary key auto_increment,
    description varchar(100) not null,
    done bit
);

alter table task add column task_groups_id int null;
alter table task add foreign key (task_groups_id) references task_groups (id);