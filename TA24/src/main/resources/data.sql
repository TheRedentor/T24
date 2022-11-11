
DROP table IF EXISTS empleado;

create table empleado(
	id int auto_increment,
	nombre varchar(250),
	trabajo varchar(250),
	salario integer
);

insert into empleado (nombre, trabajo) values ('Jose','Trabajo 1');
insert into empleado (nombre, trabajo) values ('Juan','Trabajo 1');
insert into empleado (nombre, trabajo) values ('Pedro','Trabajo 2');
insert into empleado (nombre, trabajo) values ('Jordi','Trabajo 2');
insert into empleado (nombre, trabajo) values ('Jonatan','Trabajo 3');

update empleado set salario = 0 where salario is null;
