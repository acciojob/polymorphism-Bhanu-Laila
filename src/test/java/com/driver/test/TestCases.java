package com.driver.test;

import static org.junit.Assert.*;

import com.driver.Main;
import org.junit.jupiter.api.Test;

public class TestCases {
    public static class Product{
        public int product(int x, int y) {
            return x+y;
        }

        public double product(double x, double y) {
            return x+y;
        }
        public int product(int x, int y, int z) {
            return x+y+z;
        }

    }



    public static void main(String[] args){
        Main.Product p = new Main.Product();
        p.product(5,11);
        p.product(5,11);
        p.product(5,11,55);
    }
     
}
