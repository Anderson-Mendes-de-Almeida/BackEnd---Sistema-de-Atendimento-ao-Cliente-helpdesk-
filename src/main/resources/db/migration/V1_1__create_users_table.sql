create table users (
   id uuid primary key,
   username varchar(40) not null unique,
   password varchar(150) not null,
   name_ varchar(150) not null,
   email varchar(200) not null,
   active boolean not null,
   created_at timestamp not null,
   created_by uuid null,
   update_at timestamp null,
   update_by uuid null


)