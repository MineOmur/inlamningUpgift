package TextCounter;

public class TextCounterMain {

    public static void main(String[] args) {

        TextCounter reader = new TextCounter();
        String[] simulatedInput = new String[0];
        reader.readInput();      // Få input från användaren

        // Skriv ut resultat när användaren skriver "stop"
        System.out.println("Totalt antal rader: " + TextCounter.totalLines);


        System.out.println("Totalt antal tecken: " + TextCounter.totalChars);
    }
}
