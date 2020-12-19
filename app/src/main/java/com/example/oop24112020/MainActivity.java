package com.example.oop24112020;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    final int a = 5;
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
//        Animal dog = new Animal("kiki",5);
//
//        dog.setName("milu");
//
//        Log.d("BBB",dog.getName());

        // public : ai cũng thấy
        // private : ai tạo thì người đó thấy
        // default : giống private nhưng các class trong package có thể thấy

//        Rectangle rectangle = new Rectangle(4.5 , 5.5);
//        rectangle.getInformation();

//        1 : Tính kế thừa
//        Non access modifier : static , final
//        Dog dog = new Dog("kiki",5);
//        Log.d("BBB",dog.getName());

        // Non access modifier : thay đổi tính chất của biến , đối tượng , phương thức
        // final : Thay đổi biến thành hằng số và không được gán lại
        // static : Giá trị hiển nhiên không phải khởi tạo ra object để gọi được giá trị này

        // Override : ghi đè
        // Overload : nạp chồng
//            1 : Tên phương thức giống nhau
//            2 : Giá trị truyền vào khác nhau
//            3 : Phạm vi cùng 1 class
        showToast(true);
    }
    public void showToast(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
    public void showToast(Integer resId){
        Toast.makeText(this, resId + "", Toast.LENGTH_SHORT).show();
    }
    public void showToast(Boolean aBoolean){
        Toast.makeText(this, aBoolean + "", Toast.LENGTH_SHORT).show();
    }
}