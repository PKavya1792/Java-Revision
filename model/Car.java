package com.example.carapp.model;

import java.io.Serializable;

//pojo class
public class Car {
        private String make;
        private String model;
        float price;
        private String color;
        private float miles;

        public Car(String make, String model, float price, String color, float miles) {
            this.make = make;
            this.model = model;
            this.price = price;
            this.color = color;
            this.miles = miles;
        }

//        public Car (){
//            this.make= "Acura";
//        }

        public String getMake() {
            return make;
        }

        public String getModel() {
            return model;
        }

        public float getPrice() {
            return price;
        }

        public String getColor() {
            return color;
        }

        public void setMake(String make) {
            this.make = make;
        }

        public void setModel(String model) {
            this.model = model;
        }

        public void setPrice(float price) {
            this.price = price;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void setMiles(float miles) {
            this.miles = miles;
        }

        public float getMiles() {
            return miles;
        }

        @Override
        public String toString() {
            return ("My car is " + this.make + " of model " + this.model + "it costs $" + this.price + " Color " + this.color + "Mileage of " + this.miles);
        }

        public static void main(String[] args) {
            var c1 = new Car("Acura", "RDX" , 50000.00f, "Gray" , 60000.0f);
            var c2 = new Car("Acura", "MDX", 69000.00f, "White", 10000.0f);
            var c3 = new Car("Mazda", "CX5",37000.0f,"Metallic Blue",15000.0f );
            var c4 = new Car("Mazda", "CX9",50000.0f,"White",12000.0f);
            var c5 = new Car("Toyota", "Rav4",40000.0f,"Red",2000.0f);

            System.out.println(c1); // System.out.println(c1);- prints the address, but the Sout(c1.toString()) will print what we want to print using the C1
            System.out.println(c2);
            System.out.println(c3);
            System.out.println(c4);
            System.out.println(c5);

            System.out.println(c1.getMiles());
        }

    }






