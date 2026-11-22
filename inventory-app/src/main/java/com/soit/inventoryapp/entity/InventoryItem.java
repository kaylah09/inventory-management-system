package com.soit.inventoryapp.entity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name="inventory_item")
public class InventoryItem {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id")
    private int id;

    @NotBlank(message = "Name is required")
    @Column(name = "name")
    private String name;

    @Column(name = "category")
    private String category;

    @Min(value = 0, message = "Quantity cannot be negative")
    @Column(name = "quantity")
    private int quantity;

    @Column(name = "status")
    private String status;

    public InventoryItem(){

    }

    public InventoryItem(int id, String name, String category, int quantity, String status) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.quantity = quantity;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//set the toString() method
    @Override
    public String toString() {
        return "InventoryItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", category='" + category + '\'' +
                ", quantity=" + quantity +
                ", status='" + status + '\'' +
                '}';
    }
}
