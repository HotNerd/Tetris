/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.BorderLayout;
import javax.swing.JFrame;

/**
 *
 * @author HotNerd
 */
public class Tetris extends JFrame{
    Matrix matrix;
    public Tetris(){
        super();
        matrix = new Matrix();
        this.setLayout(new BorderLayout());
        add(matrix,BorderLayout.CENTER);
        pack();
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
    }
    
    public void drawMatrix(){
        
    }
    

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Tetris tetris = new Tetris();
    }
    
}
