
package com.mycompany.exercicio9;

import javax.swing.JOptionPane;
public class Exercicio9 {

    public static void main(String[] args) {
        int massa;
        massa = Integer.parseInt(JOptionPane.showInputDialog("Digite sua massa:"));
        double altura;
        altura = Double.parseDouble(JOptionPane.showInputDialog("Digite sua altura:"));
        double soma;
        soma = massa/(altura * altura);
            JOptionPane.showMessageDialog(null, "O seu IMC é:" + soma); 
    }
}
