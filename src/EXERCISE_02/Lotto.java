package EXERCISE_02;

import java.util.Random;

public class Lotto {
    private int[] numbers;

    // Constructor to populate the array with random values
    public Lotto() {
        numbers = new int[3];
        Random rand = new Random();
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = rand.nextInt(9) + 1; // Random numbers between 1 and 9
        }
    }

    // Method to return the array
    public int[] getNumbers() {
        return numbers;
    }

    // Method to calculate the sum of the array
    public int getSum() {
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        return sum;
    }
}

