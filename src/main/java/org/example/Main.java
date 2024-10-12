package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Вкажіть ціле число: ");
        int userInt = input.nextInt();

        System.out.print("Вкажіть число з плаваючою точкою: ");
        double userDouble = input.nextDouble();

        System.out.print("Вкажіть текст: ");
        String userString = input.next();

        System.out.print("Вкажіть логічне значення (true/false): ");
        boolean userBoolean = input.nextBoolean();

        System.out.println("\n--- Перший формат ---");
        String output1 = String.format("Ціле: %d\nДробове: %f\nТекст: %s\nЛогіка: %b", userInt, userDouble, userString, userBoolean);
        System.out.println(output1);

        System.out.println("\n--- Другий формат ---");
        String output2 = String.format("Ціле (шістнадцяткове): %x\nЦіле (вісімкове): %o\nЧисло (3 цифри після коми): %.3f", userInt, userInt, userDouble);
        System.out.println(output2);

        System.out.println("\n--- Третій формат ---");
        System.out.printf("Рядок до 4 символів: %.4s\nЧисло з плаваючою точкою (2 символи після коми): %.2f\n", userString, userDouble);
        System.out.printf("Логічне значення: %b\n", userBoolean);

        input.close();
    }
}
