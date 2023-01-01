/*
 Homework 1 : Make a program that takes the radius of a circle as input,
 calculates its radius and area and prints it as output to the user.
*/

import java.util.*;

public class HW1 {

    public static void main(String[] args) {
        double radius, area, circumference;
        //program to find area & circumference of a circle with given radius.
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the radius of the Circle below  :) ");
        radius = in.nextDouble();
        //Calculate Area & Circumference of Circle
        area = Math.PI * radius * radius;
        circumference = 2 * Math.PI * radius;

        System.out.println("Area of Circle :" + area);
        System.out.println("Circumference of Circle:" + circumference);

    }

}
