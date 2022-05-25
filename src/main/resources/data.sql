drop table if exists suministra;
	drop table if exists piezas;
	drop table if exists proveedores;
	
	create table proveedores (
	id varchar(4) primary key, 
	nombre varchar(255)
	);
	
	create table piezas (
	id int primary key auto_increment,
	nombre varchar(100)
	);
	
	create table suministra (
	id int primary key auto_increment,
	precio int,
	codigo_pieza int,
	id_proveedor varchar(4),
	foreign key(codigo_pieza) references piezas(id)
	on delete cascade
	on update cascade,
	foreign key(id_proveedor) references proveedores(id)
	on delete cascade
	on update cascade
	);
	
	insert into (id_proveedor, nombre) proveedores values ('1234', "Empresa1"),
	insert into (id_proveedor, nombre) proveedores values ('2234', "Empresa2"),
	insert into (id_proveedor, nombre) proveedores values ('3234', "Empresa3"),
	insert into (id_proveedor, nombre) proveedores values ('4234', "Empresa4"),
	insert into (id_proveedor, nombre) proveedores values ('5234', "Empresa5");
	
	insert into piezas (nombre) values ("Martillo");
	insert into piezas (nombre) values ("Clavo");
	insert into piezas (nombre) values ("Tornillo");
	insert into piezas (nombre) values ("Placa");
	insert into piezas (nombre) values ("Motor");
	
	insert into suministra (precio, codigo_pieza, id_proveedor) values (15, 1, "1234"),
	insert into suministra (precio, codigo_pieza, id_proveedor) values (20, 2, "2234"),
	insert into suministra (precio, codigo_pieza, id_proveedor) values (50, 3, "3234"),
	insert into suministra (precio, codigo_pieza, id_proveedor) values (75, 4, "4234"),
	insert into suministra (precio, codigo_pieza, id_proveedor) values (100, 5, "5234");
	
	

	
	