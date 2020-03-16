
import java.io.*;
import java.util.Random;
import static java.lang.System.out;

public class Main  {

    public static void main(String[] args) throws NumberFormatException, IOException {

        BufferedReader rd = new BufferedReader( new InputStreamReader(System.in));

        Random r = new Random();

        int x = r.nextInt(100)+1;

        int i;


        int counter = 0;
        out.println("Угадай");
        out.println("Чтобы сдаться введи ?Exit...");
        do {
            out.print("Угадай число: ");
            i = Integer.parseInt(rd.readLine());

            counter++;

            if(i == 0) break;
            if(i>x) {
                out.println("Много");
            }
            if(i<x) {
                out.println("Мало");
            }
        }
        while ((i!=x) && (counter<2));

        if (i == x) {
            out.println("Вы выиграли!");
            out.printf("Число попыток: %d", counter);
        }
        else {
            out.println("Проиграл");
            out.printf("Загаданное число: %d ", x);
        }
    }

}