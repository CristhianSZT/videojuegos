/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videojuego.cristhian;

import java.awt.EventQueue;
import javax.swing.JFrame;

/**
 *
 * @author cristhianszt
 */
public class Main extends JFrame{
    
    public Main() {
        initUI();
    }
    
    private void initUI() {

        add(new Pantalla());
        
        setSize(408, 268);
        setResizable(false);
        
        setTitle("Dragon Ball");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    } 

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                Main videojuego = new Main();
                videojuego.setVisible(true);
            }
        });
    }
    
}
