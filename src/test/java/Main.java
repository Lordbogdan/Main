import java.io.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws Exception {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));

        Random r = new Random();

        int x = r.nextInt(100) + 1;

        int i, counter=0;

        System.out.println("Угадай");
        System.out.println("Чтобы сдаться введи ?Exit...");
        do {
            System.out.print("Угадай число: ");
            String line = rd.readLine();
            if (line.equals("?Exit")) {
                System.out.println("Good buy");
                System.exit(0);
            }
            i = Integer.parseInt(line);

            if (i > x) {
                System.out.println("Много");
            }
            if (i < x) {
                System.out.println("Мало");
            }
            counter ++;
        }

        while (i != x);

        System.out.println("Вы выиграли!");
        System.out.printf("Число попыток: %d", counter);


    }

}