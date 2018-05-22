
CREATE TABLE menu(
	idMenu int(3) NOT NULL AUTO_INCREMENT,
	nama_menu varchar(35) NOT NULL,
	harga_menu int(25) NOT NULL,
	jenis enum('Makanan','Minuman') NOT NULL,
	PRIMARY KEY (idMenu)
)ENGINE=InnoDB;




INSERT INTO menu (idMenu, nama_menu, harga_menu, jenis) VALUES
(1, 'Martabak', 10000, 'Makanan');


CREATE TABLE tenant1(
	idMenu int(3) NOT NULL AUTO_INCREMENT,
	nama_menu varchar(35) NOT NULL,
	harga_menu int(25) NOT NULL,
	jenis enum('Makanan','Minuman') NOT NULL,
	PRIMARY KEY (idMenu)
)ENGINE=InnoDB;


CREATE TABLE pesanan(
	NoPesanan int(3) NOT NULL,
	jumlah_pesanan int(3) NOT NULL
)ENGINE=InnoDB;


CREATE TABLE user (
	idUser int(4) NOT NULL AUTO_INCREMENT,
	username char(6) NOT NULL,
	password char(10) NOT NULL,
	nama_kantin varchar(20) NOT NULL,
	hak_akses enum('kantin','pemesan'),
	PRIMARY KEY (idUser)
) ENGINE=InnoDB;


INSERT INTO user(idUser, username, password, nama_kantin, hak_akses) VALUES
(1, 'kantin', 'kantin', 'Tenant 1', 'kantin'),
(2, 'pesan', 'pesan', 'Nandar', 'pemesan'),
(3, 'kantin1', 'kantin1', 'tenant1', 'kantin');

ALTER TABLE user ADD nama_pemilik varchar(25) NOT NULL;
ALTER TABLE user MODIFY username varchar(15) NOT NULL;
ALTER TABLE user MODIFY nama_pemilik varchar(25) NOT NULL;


UPDATE user SET nama_pemilik='Nandar' WHERE idUser=1;
UPDATE user SET nama_pemilik='Majid' WHERE idUser=2;
UPDATE user SET nama_pemilik='Rahmat' WHERE idUser=3;
CREATE TABLE  pemesan(
	idPemesan int(4) NOT NULL AUTO_INCREMENT,
	namaPemesan varchar(25) NOT NULL,
	JK enum('Pria','Wanita'),
	alamat int,
	PRIMARY KEY(idPemesan),
	FOREIGN KEY(alamat) REFERENCES pengiriman(idKirim)
) ENGINE = InnoDB;

INSERT INTO pemesan(idPemesan, namaPemesan,JK, alamat) VALUES
(1, 'Nandar','Pria',1);

CREATE TABLE kantin (
	idkantin int(4) NOT NULL AUTO_INCREMENT,
	namakantin varchar(25) NOT NULL,
	namaPemilik varchar(25) NOT NULL,
	PRIMARY KEY (idkantin);
) ENGINE=InnoDB;

INSERT INTO kantin (idkantin, namakantin, nam)

CREATE TABLE pengiriman(
	idKirim int(3) NOT NULL,
	lantai int(2) NOT NULL,
	ruang char(8) NOT NULL,
	PRIMARY KEY(idKirim)
) ENGINE=InnoDB;

INSERT INTO

CREATE DATABASE SayaPesan;
use SayaPesan;
