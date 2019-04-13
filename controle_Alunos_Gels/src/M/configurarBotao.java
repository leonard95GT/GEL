/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package M;

import java.awt.Color;
import java.awt.Cursor;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Leonardo Renê
 */
public class configurarBotao {
    
    //classe para efeitos quando o mouse entrar no espaço dos botões
    public void efeitosBotao(JPanel j, JLabel l){
       j.setCursor(new Cursor(Cursor.HAND_CURSOR));
       j.setBackground(java.awt.Color.white);
       l.setForeground(java.awt.Color.black);
    }

    //classe para efeitos quando o mouse sair no espaço dos botões
    public void efeitosBotaoSair(JPanel j, JLabel l){
       j.setBackground(new Color(153, 204, 0));
       l.setForeground(java.awt.Color.white);
    }
    
    
}
