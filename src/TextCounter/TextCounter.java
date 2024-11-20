package TextCounter;

import java.util.Scanner;

public class TextCounter {

    static int totalLines;   // Satır sayısı
    static int totalChars;   // Toplam karakter sayısı

    // Constructor
    public TextCounter() {
        this.totalLines = 0;
        this.totalChars = 0;
    }

    // Kullanıcıdan metin al
    public static void readInput() {
        Scanner scanner = new Scanner(System.in);
        String line;

        System.out.println("Skriv in text (fortsätt tills du ser 'stop'):");

        while (true) {
            line = scanner.nextLine();  // Få rad från användare

            // Gå ur slingan när ordet 'stop' har skrivits in
            if (line.equals("stop")) {
                break;
            }

            // Uppdatera antalet rader och tecken
            totalLines++;
            totalChars += line.length();
        }

        scanner.close();
    }

    public int getTotalLines() {
        return totalLines;
    }

    public int getTotalChars() {
        return totalChars;
    }


}






