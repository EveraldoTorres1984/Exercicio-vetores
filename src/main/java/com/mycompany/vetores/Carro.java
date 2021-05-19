/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.vetores;

import javax.swing.JOptionPane;

/**
 *
 * @author torre
 */
public class Carro {

    public void CadastroCarro() {
        String marca[] = new String[3];
        String modelo[] = new String[3];
        String result = "";
        for (int i = 0; i < marca.length; i++) {
            marca[i] = JOptionPane.showInputDialog("Marca: ");
            modelo[i] = JOptionPane.showInputDialog("Modelo: ");
            result += marca[i] + " - " + modelo[i] + "\n";
        }

        JOptionPane.showMessageDialog(null, result);

        int indice = Integer.parseInt(JOptionPane.showInputDialog("Código da marca(0 a 2): "));
        JOptionPane.showMessageDialog(null, marca[indice] + " - " + modelo[indice]);
    }
}