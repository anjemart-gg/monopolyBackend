drop table if exists board_resources;

create table if not exists board_resources(
  id SERIAL PRIMARY KEY,
  location int,
  space_name varchar(100),
  price int,
  owner int,
  house_count int default 0,
  hotel_count int default 0,
  land_price int,
  house_multiplier decimal,
  hotel_multiplier decimal,
  mortgage_value int,
  property_grouping int
);

insert into board_resources(location, space_name, price, owner, house_count, hotel_count, land_price, house_multiplier,
                            hotel_multiplier, mortgage_value, property_grouping)
values(1,'GO',null,null,null,null,null,null,null,null,null)
,(2,'Mediterranian Avenue',60,null,null,2,null,null,null,null,0)
;
