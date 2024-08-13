CREATE TABLE product_table (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    title VARCHAR(50) NOT NULL,
    description TEXT,
    image TEXT,
    price DOUBLE
);

CREATE TABLE user_table (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    first_name VARCHAR(20) NOT NULL,
    last_name VARCHAR(20),
    email VARCHAR(30) NOT NULL,
    phone VARCHAR(15),
    password VARCHAR(300),
    role TEXT,
    address VARCHAR(70),
    UNIQUE (email)
);

CREATE TABLE purchase_item_table (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    product_id INTEGER,
    count INTEGER DEFAULT 1,
    FOREIGN KEY (product_id) REFERENCES product_table(id)
);

CREATE TABLE order_table (
	id INTEGER PRIMARY KEY AUTO_INCREMENT,
    user_id INTEGER,
    purchase_item_id INTEGER,
    comment TEXT,
    FOREIGN KEY (purchase_item_id) REFERENCES purchase_item(id),
    FOREIGN KEY (user_id) REFERENCES user_table(id)
);