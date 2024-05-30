    import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class Control {
    private Modelo model;
    private Vista consoleView;
    private GUIVvista guiVista;

    public Control(Modelo model, Vista consoleView, GUIVvista guiView) {
        this.model = model;
        this.consoleView = consoleView;
        this.guiVista = guiView;

        // Configurar la vista de consola
        if (consoleView != null) {
            int playerChoice = consoleView.getPlayerChoice();
            int computerChoice = model.getRandomChoice();
            String result = model.determineWinner(playerChoice, computerChoice);
            consoleView.displayResult(result, model.choiceToString(playerChoice), model.choiceToString(computerChoice));
        }

        // Configurar la vista de GUI
        if (guiView != null) {
            guiView.setButtonActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    int playerChoice = -1;
                    if (e.getSource() == guiView.getBtnPiedra()) {
                        playerChoice = Modelo.PIEDRA;
                    } else if (e.getSource() == guiView.getBtnPapel()) {
                        playerChoice = Modelo.PAPEL;
                    } else if (e.getSource() == guiView.getBtnTijera()) {
                        playerChoice = Modelo.TIJERA;
                    }

                    int computerChoice = model.getRandomChoice();
                    String result = model.determineWinner(playerChoice, computerChoice);
                    guiView.displayResult("Tú: " + model.choiceToString(playerChoice) + " | Computadora: " + model.choiceToString(computerChoice) + " | Resultado: " + result);
                }
            });
        }
    }

    public static void main(String[] args) {
        Modelo model = new Modelo();
        Vista consoleView = new Vista();
        GUIVvista guiView = new GUIVvista();

        new Control(model, consoleView, guiView);
    }
}

}
