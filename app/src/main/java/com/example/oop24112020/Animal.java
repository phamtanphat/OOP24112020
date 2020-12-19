package com.example.oop24112020;

import android.util.Log;

public class Animal {
    // 1 : Thuộc tính
    private String name;
    private Integer weight;
    // 2 : Hành vi

    // constructor (Phương thức khởi tạo)
    // mặc định object sẽ cung cấp constructor rỗng cho lớp đối tượng

    // alt + insert : generate code

    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    // Display : in ra thông tin
    // Nếu truyền String name  : in ra tên
    // Nếu truyền String name , Integer weight : in ra cả hai
    // Nếu không truyền : như bên dưới

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
