/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tetris;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author HotNerd
 */
public class Matrix extends JPanel{
    boolean [][] matrix;
    int size = 40, col = 10, row = 20;
    public Matrix(){
        super();
        matrix = new boolean [col][row];
        setSize(col*size,row*size);
        setPreferredSize(new Dimension(col*size,row*size));
        System.out.println(this.getSize());
        repaint();
        
    }
    
    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        for(int i=0;i<col;i++){
            System.out.println(i);
            g.setColor(Color.BLACK);
            g.drawLine( i*size, 0, i*size, row*size);
        }
        for(int i=0;i<row;i++){
            g.setColor(Color.BLACK);
            g.drawLine(0, i*size, col*size, i*size);
        }
    }
}
