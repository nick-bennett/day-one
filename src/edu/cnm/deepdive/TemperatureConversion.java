package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {
    if (args.length == 0) {
      double tempCelsius = 100;
      double tempFahrenheit = 32;
      System.out.println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahreheit");
      System.out.println("Fahrenheit " + tempFahrenheit + " = " + convertF2C(tempFahrenheit) + " Celsius");
    } else {
      for (int i = 0; i < args.length; i++) {
        double tempCelsius = Double.parseDouble(args[i]);
        System.out.println("Celsius " + tempCelsius + " = " + convertC2F(tempCelsius) + " Fahreheit");
      }
    }
  }

  public static double convertC2F(double celsius) {
    return celsius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
