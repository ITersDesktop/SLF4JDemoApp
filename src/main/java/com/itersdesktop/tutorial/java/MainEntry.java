package com.itersdesktop.tutorial.java;

import java.util.logging.Logger;

/**
 * @author <a href="mailto:nvntung@gmail.com">Tung Nguyen</a> (https://www.itersdesktop.com)
 * @version 1.0
 * @since on 15/12/2021
 */
public class MainEntry {
   private static final Logger LOGGER = Logger.getLogger(String.valueOf(MainEntry.class));
   public static void main(String[] args) {
      LOGGER.info("Welcome! This is an info level log message!");
      LOGGER.warning("Pay attention to! This is a warning level log message!");
      LOGGER.severe("Sorry! An error has happened! This is an error level log message.");
   }
}
