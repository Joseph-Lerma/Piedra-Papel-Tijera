import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Modelo model = new Modelo();
        
        System.out.println("Selecciona la interfaz: (1) Consola (2) GUI");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice == 1) {
            // Interfaz de consola
            Vista consoleView = new Vista();
            new Control(model, consoleView, null);
        } else if (choice == 2) {
            // Interfaz gráfica (GUI)
            GUIVvista guiVista = new GUIVvista();
            new Control(model, null, guiVista);
        } else {
            System.out.println("Selección inválida. Por favor, reinicia el programa y selecciona una opción válida.");
        }
        
        scanner.close();
    }
}