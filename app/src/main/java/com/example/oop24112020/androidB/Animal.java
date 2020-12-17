package com.example.oop24112020.androidB;

import android.util.Log;

public class Animal {
    // 1 : Thuộc tính
    private String name;
    private Integer weight;
    // 2 : Hành vi

    // constructor (Phương thức khởi tạo)
    // mặc định object sẽ cung cấp constructor rỗng cho lớp đối tượng
    public Animal(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public void setName(String name){
        if (name.length() <= 0){
            Log.d("BBB","Thuoc tinh chua co gia tri");
        }else{
            this.name = name;
        }
    }
    public String getName(){
        return name;
    }

}
