package com.example.oop24112020;

import android.util.Log;

public class Rectangle {
    private double width;
    private double length;

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return length * width;
    }
    public double getPerimeter(){
        return (length + width) * 2;
    }

    public void getInformation(){
        Log.d("BBB","Area : " + getArea() + "\n"  + "Perimeter : " + getPerimeter());
    }
}
