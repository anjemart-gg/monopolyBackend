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
  property_grouping int,
  left_pos int,
  top_pos int
);

insert into board_resources(location, space_name, price, land_price, house_multiplier,
                            hotel_multiplier, mortgage_value, property_grouping, left_pos, top_pos)
values(1,'GO',null,null,null,null,null,null,10,10)
,(2,'Mediterranian Avenue',60,2,null,null,30,0,9,10)
,(3,'Community Chest',null,null,null,null,null,null,8,10)
,(4,'Baltic Avenue',60,20,null,null,30,0,7,10)
,(5,'Income Tax',null,null,null,null,null,null,6,10)
,(6,'Reading Railroad',200,50,null,null,30,null,5,10)
,(7,'Oriental Avenue',100,30,null,null,null,1,4,10)
,(8,'Chance',null,null,null,null,null,null,3,10)
,(9,'Vermont Avenue',100,30,null,null,null,1,2,10)
,(10,'Connecticut Avenue',120,40,null,null,null,1,1,10)
,(11,'Jail',null,null,null,null,null,null,0,10)
,(12,'St. Charles Place',140,50,null,null,null,2,0,9)
,(13,'Electric Company',150,null,null,null,null,null,0,8)
,(14,'States Avenue',140,50,null,null,null,2,0,7)
,(15,'Virginia Avenue',160,60,null,null,null,2,0,6)
,(16,'Pennsylvania Railroad',200,null,null,null,null,null,0,5)
,(17,'St. James Place',180,70,null,null,null,3,0,4)
,(18,'Community Chest',null,null,null,null,null,null,0,3)
,(19,'Tennessee Place',180,70,null,null,null,3,0,2)
,(20,'New York Avenue',200,80,null,null,null,3,0,1)
,(21,'Free Parking',null,null,null,null,null,null,0,0)
,(22,'Kentucky Avenue',220,90,null,null,null,4,1,0)
,(23,'Chance',null,null,null,null,null,null,2,0)
,(24,'Indiana Avenue',220,90,null,null,null,4,3,0)
,(25,'Illinois Avenue',240,100,null,null,null,4,4,0)
,(26,'B&O Railroad',200,null,null,null,null,null,5,0)
,(27,'Atlantic Avenue',260,110,null,null,null,5,6,0)
,(28,'Ventor Avenue',260,110,null,null,null,5,7,0)
,(29,'Water Works',150,null,null,null,null,null,8,0)
,(30,'Marvin Gardens',280,120,null,null,null,5,9,0)
,(31,'Go To Jail',null,null,null,null,null,null,10,0)
,(32,'Pacific Avenue',300,130,null,null,null,6,10,1)
,(33,'North Carolina Avenue',300,130,null,null,null,6,10,2)
,(34,'Community Chest',null,null,null,null,null,null,10,3)
,(35,'Pennsylvania Avenue',320,450,null,null,null,6,10,4)
,(36,'Short Line Railroad',200,null,null,null,null,null,10,5)
,(37,'Chance',null,null,null,null,null,null,10,6)
,(38,'Park Place',350,500,null,null,null,7,10,7)
,(39,'Luxury Tax',null,null,null,null,null,null,10,8)
,(40,'Boardwalk',400,200,null,null,null,7,10,9)
;
