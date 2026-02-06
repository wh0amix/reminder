package org.example;

import javax.swing.*;

public class Fenetre extends JFrame {
    String message = "Avez-vous sorti les poubelles ? ";

    public int invoquePanel(){
        int reponse = JOptionPane.showConfirmDialog(null, message, "Confirmation", JOptionPane.YES_NO_OPTION);
        return reponse;

    }
    public String getMessage() {
        return this.message;
    }

    public int getReponse() {
        int reponse = invoquePanel();
        return reponse;
    }
}
