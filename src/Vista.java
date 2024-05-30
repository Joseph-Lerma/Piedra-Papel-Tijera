import java.util.Scanner;

public class Vista {
    private Scanner scanner;

    public Vista() {
        scanner = new Scanner(System.in);
    }

    public int getPlayerChoice() {
        System.out.println("Selecciona: (0) Piedra, (1) Papel, (2) Tijera");
        return scanner.nextInt();
    }

    public void displayResult(String result, String playerChoice, String computerChoice) {
        System.out.println("Tú elegiste: " + playerChoice);
        System.out.println("La computadora eligió: " + computerChoice);
        System.out.println("Resultado: " + result);
    }
}