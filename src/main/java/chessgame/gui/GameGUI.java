package chessgame.gui;

import java.util.List;
import java.util.ArrayList;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.ComponentOrientation;


import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JPanel;
import javax.swing.JFrame;
import javax.swing.border.LineBorder;

import chessgame.Piece;

public class GameGUI extends JFrame {
    
    public GameGUI() {

        this.setSize(1000, 1000);
        JPanel jp = new JPanel();
        jp.setLayout(new GridLayout(8, 8));
        //jp.add(new BoardSquare(Color.WHITE, null));
        //jp.add(new BoardSquare(Color.BLACK, null));

        int black = -1;
        for(int i = 1; i < 65; i++) {
            if(black == 1) {
                jp.add(new BoardSquare(Color.BLACK, null));
            } else {
                jp.add(new BoardSquare(Color.WHITE, null));
            }

            if(i % 8 != 0) {
                black *= -1;
            }
        }

        this.getContentPane().add(jp);
        //this.setLocationRelativeTo(null);
        this.setBackground(Color.LIGHT_GRAY);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setVisible(true);
        
    }

    class BoardPanel extends JPanel {

        public BoardPanel() {
            
        }

        public void paintComponent(Graphics g) {
            g.fillRect(0, 0, 800, 800);
            int offset = 0;
            for(int y = 0; y < 800; y += 100) {
                for(int x = offset; x < 800; x += 200) {
                    g.clearRect(x, y, 100, 100); 
                }
                offset = (offset == 0 ? 100 : 0);
            }

           
        }
    }

    class BoardSquare extends JButton {

        Color color;
        Piece piece;

        public BoardSquare(String txt) {
            super(txt);
        }
        public BoardSquare(Color color, Piece piece) {

            this.color = color;
            //setBorder(new LineBorder(Color.BLACK, 3));
            setBackground(color);
            //setBounds(0, 0, 100, 100);
            //setOpaque(false);


        }

        
    }

}