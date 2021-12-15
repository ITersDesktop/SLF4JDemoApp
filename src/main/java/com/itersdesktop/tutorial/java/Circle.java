package com.itersdesktop.tutorial.java;

/**
 * @author <a href="mailto:nvntung@gmail.com">Tung Nguyen</a> (https://www.itersdesktop.com)
 * @version 1.0
 * @created on 15/12/2021
 */
public class Circle {
   private double radius;
   private String colour;

   public Circle() {
      this.radius = 1.0;
      this.colour = "red";
   }

   public Circle(final double _radius) {
      this.radius = _radius;
   }

   public double getRadius() {
      return this.radius;
   }

   public String getColour() {
      return this.colour;
   }

   public double area() {
      return Math.pow(this.radius, 2)*Math.PI;
   }
}
