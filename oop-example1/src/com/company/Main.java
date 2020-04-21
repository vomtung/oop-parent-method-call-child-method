package com.company;

import java.text.DecimalFormat;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Parent m = new Child();
        m.sing();


        double[] numbers = {1.16763, 33.0, 44444.1111, 3, 517827.17, 44444.101, 4444444};
        DecimalFormat decimalFormat = new DecimalFormat("#.00"); decimalFormat.setGroupingUsed(true);
        decimalFormat.setGroupingSize(3);
        System.out.println("adding commas to number in Java using DecimalFormat class");
        for (double d : numbers) { System.out.println(decimalFormat.format(d)); }
    }


}
