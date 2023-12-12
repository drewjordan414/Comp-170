package Exam3_Part_B;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TemperatureProcessor {
    
    
    public static void main(String[] args) {
        System.out.println("This program processes temperatures in a file and reports statistics about them.");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the temperature data file: ");
        String fileName = scanner.nextLine();

        try {
            Scanner fileScanner = new Scanner(new File(fileName));
            Kelvin[] temperatures = new Kelvin[100];
            int count = readTemperatureFile(fileScanner, temperatures);
            printTemperatureData(fileName, temperatures, count);
            fileScanner.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

   
    public static int readTemperatureFile(Scanner reader, Kelvin[] temps) {
        int count = 0;
        while (reader.hasNextLine() && count < temps.length) {
            String line = reader.nextLine();
            double kelvinTemp = processTempLine(line);
            if (kelvinTemp >= 0) {
                temps[count++] = new Kelvin(kelvinTemp);
            }
        }
        return count;
    }

    
    public static double processTempLine(String line) {
        Scanner lineScanner = new Scanner(line);
        if (lineScanner.hasNext()) {
            String type = lineScanner.next().toLowerCase();
            if (lineScanner.hasNextDouble()) {
                double value = lineScanner.nextDouble();
                switch (type) {
                    case "k":
                        return value;
                    case "c":
                        return c2k(value);
                    case "f":
                        return f2k(value);
                }
            }
        }
        return -1; 
    }

    
    private static double c2k(double temp) {
        return temp + Kelvin.ZEROC_IN_KELVIN;
    }

    
    private static double f2k(double temp) {
        return (temp - 32) * 5 / 9 + Kelvin.ZEROC_IN_KELVIN;
    }

    
    public static void printTemperatureData(String fileName, Kelvin[] temps, int count) {
        if (count == 0) {
            System.out.println("No valid temperatures in the file.");
            return;
        }

        
        double totalKelvin = 0, totalCelsius = 0, totalFahrenheit = 0;
        for (int i = 0; i < count; i++) {
            totalKelvin += temps[i].getKelvin();
            totalCelsius += temps[i].getCelsius();
            totalFahrenheit += temps[i].getFahrenheit();
        }
        double avgKelvin = totalKelvin / count;
        double avgCelsius = totalCelsius / count;
        double avgFahrenheit = totalFahrenheit / count;

        int aboveAverageCount = 0;
        for (int i = 0; i < count; i++) {
            if (temps[i].getKelvin() > avgKelvin) {
                aboveAverageCount++;
            }
        }

        
        System.out.println("Temperature data from file " + fileName);
        System.out.printf("Average Kelvin temperature: %.2fK\n", avgKelvin);
        System.out.printf("Average Fahrenheit temperature: %.2fF\n", avgFahrenheit);
        System.out.printf("Average Celsius temperature: %.2fC\n", avgCelsius);
        System.out.println("There were " + count + " valid temperatures in this file");
        System.out.println(aboveAverageCount + " of those temperatures were above average");
    }
}
