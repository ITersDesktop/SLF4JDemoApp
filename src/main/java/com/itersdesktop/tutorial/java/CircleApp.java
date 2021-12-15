package com.itersdesktop.tutorial.java;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author <a href="mailto:nvntung@gmail.com">Tung Nguyen</a> (https://www.itersdesktop.com)
 * @version 1.0
 * @since on 15/12/2021
 */
public class CircleApp {
   private static final Logger LOGGER = LoggerFactory.getLogger(String.valueOf(CircleApp.class));

   public static void main(String[] args) {
      Circle c1 = new Circle(5.0);
      try {
         double area = c1.area();
         LOGGER.info("Circle with the radius {} having the area {}", c1.getRadius(), area);
         double r = 5.0/0.0;
         LOGGER.info("The result of this division 5.0/0.0 is INFINITY. While this division 5/0 throws an exception.");
         r = 5/0;
         System.out.println(r);
      } catch (Exception e) {
         LOGGER.error("Division by 0 error!!!");
      }
   }
}
