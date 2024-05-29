public class Modelo {
    public static final int PIEDRA = 0;
    public static final int PAPEL = 1;
    public static final int TIJERA = 2;

    public int getRandomChoice() {
        return (int) (Math.random() * 3);
    }

    public String determineWinner(int playerChoice, int computerChoice) {
        if (playerChoice == computerChoice) {
            return "Empate";
        }
        switch (playerChoice) {
            case PIEDRA:
                return (computerChoice == TIJERA) ? "Ganaste" : "Perdiste";
            case PAPEL:
                return (computerChoice == PIEDRA) ? "Ganaste" : "Perdiste";
            case TIJERA:
                return (computerChoice == PAPEL) ? "Ganaste" : "Perdiste";
        }
        return "Error";
    }

    public String choiceToString(int choice) {
        switch (choice) {
            case PIEDRA:
                return "Piedra";
            case PAPEL:
                return "Papel";
            case TIJERA:
                return "Tijera";
            default:
                return "Desconocido";
        }
    }
}