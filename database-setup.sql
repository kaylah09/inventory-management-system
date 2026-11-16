CREATE DATABASE IF NOT EXISTS inventorydb;

USE inventorydb;

CREATE TABLE IF NOT EXISTS inventory_item (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50) NOT NULL,
    category VARCHAR(50) NOT NULL,
    quantity INT NOT NULL,
    status VARCHAR(20) NOT NULL
    );