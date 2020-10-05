package com.company;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.println("Text:");
        String text = key.nextLine();
        int count_letter = 0;
        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i)))
                count_letter++;
        }
        System.out.println(count_letter + " letter(s)");

        int count_words = 0;
        for (int i = 0; i < text.length() - 1; i++) {
            if (text.charAt(i) == ' ' && text.charAt(1 + i) != ' ')
                count_words++;
        }
        System.out.println(count_words + " word(s)");

        int count_sentences = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == '.' || text.charAt(i) == '?' || text.charAt(i) == '!' )

                count_sentences++;
    }
        System.out.println(count_sentences + " sentence(s)");

        double L = (double) count_letter/(double) count_words * 100;
        double S = (double) count_sentences/(double) count_words * 100;
        double CLI = 0.0588 * L - 0.296 * S - 15.8;
        System.out.println("Grade " + CLI); 



    }


    }






