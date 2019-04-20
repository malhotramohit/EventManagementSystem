
-- test_model
create table test_model(
seq bigint primary key, 
attr1 varchar(255),
attr2 varchar(255),
create_date timestamp,
create_user varchar(255),
modify_date timestamp,
modify_user varchar(255)
)

create sequence test_model_seq start 1 increment 1

select * from test_model

drop sequence test_model_seq
drop table test_model