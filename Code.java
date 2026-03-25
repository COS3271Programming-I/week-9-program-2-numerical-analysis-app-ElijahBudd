package myProjects;

import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;

public class Numerical_Analysis_App {
	
	public static void main(String[] args) {
		String decimalData = "decimalData.txt";
		
		try (Scanner dataInput = new Scanner(new File(decimalData))) {
			
			int numbers = 0;
			double total = 0,
			max = Double.MIN_VALUE,
			min = Double.MAX_VALUE;
			
			while (dataInput.hasNextDouble()) {
				double num = dataInput.nextDouble();
				numbers++;
				total += num;
				
				if (num > max) max = num;
				if (num < min) min = num;
			}
			
			double mean = total / numbers;
			double range = max - min;
			
			// Print results
			System.out.println("Numbers:         " + numbers);
			System.out.println("Mean:            " + mean);
			System.out.println("Largest Number:  " + max);
			System.out.println("Smallest Number: " + min);
			System.out.println("Range:           " + range);
			
		} catch (FileNotFoundException e) {
            System.out.println("Error: File not found -> " + decimalData);
        }
	}
}
