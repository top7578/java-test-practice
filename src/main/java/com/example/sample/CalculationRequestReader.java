package com.example.sample;

import java.util.Scanner;

public class CalculationRequestReader {

    public String[] read() {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();
        return result.split(" ");
    }
}
