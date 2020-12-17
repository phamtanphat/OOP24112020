package com.example.oop24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.example.oop24112020.androidB.Animal;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Tính chất
        // Tính kế thừa
            // Quan hệ has A
        // Tính đa hình
        // Tính trừu tượng
        // Tinh đóng gói

//        Object va class
//        Access modifier : Phạm vi truy cập
        Animal dog = new Animal("kiki",5);

        dog.setName("milu");

        Log.d("BBB",dog.getName());

        // public : ai cũng thấy
        // private : ai tạo thì người đó thấy
        // default : giống private nhưng các class trong package có thể thấy

    }
}