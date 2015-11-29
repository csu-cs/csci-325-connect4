package csu.csci325;

//------------------------------------------------------------------
//Class to create 6 x 7 array of buttons to go inside a design grid
// of the connect 4 game board. Created 10/20/15 SPhillips
//------------------------------------------------------------------

import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class Game extends JFrame implements ActionListener {
    private SuperButton myTwoButton[][] = new SuperButton[6][7];
    boolean playerCheck = false;
    int playerChoice;

//    public class PlayerSelect{
//        public void main(String[] args){
//            JFrame frame = new JFrame("Player Select");
//            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//            PlayerSelectPanel panel = new PlayerSelectPanel();
//            frame.getContentPane().add(panel);
//
//            frame.pack();
//            frame.setVisible(true);
//        }
//
//    }

    public Game()
    {
        Container con = getContentPane();
        con.setLayout(null);
        con.setBackground(Color.BLUE);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.cyan));
        setVisible(true);
        int count = 10;
        //Edited by Alex Waters on 11/28/2015, changed the array of buttons to a 2 dimensional array.

        for(int x = 0; x <6; x++){
            for(int y = 0; y<7; y++){
                myTwoButton[x][y] = new SuperButton(""+x +y);
                myTwoButton[x][y].setSize(100, 100);
                myTwoButton[x][y].setLocation(y * 100, count);
                myTwoButton[x][y].addActionListener(this);
                con.add(myTwoButton[x][y].getJB());
            }
            count+=100;
        }

    }


    public void actionPerformed(ActionEvent e)
    {
        //Edited by Alex Waters, 11/28/2015, nested for loop to attach action listener's to each button, and
        //a back and forth function.

        for(int x = 0; x<6; x++){
                    for(int y = 0; y<7; y++){
                        if ((playerCheck && !myTwoButton[x][y].getOccupied()) && (e.getActionCommand().equals(myTwoButton[x][y].getName()))) {

                            myTwoButton[x][y].setOccupiedp1();
                            playerCheck = false;

                        }
                        else if ((!playerCheck && !myTwoButton[x][y].getOccupied()) && (e.getActionCommand().equals(myTwoButton[x][y].getName()))){

                            myTwoButton[x][y].setOccupiedp2();
                            playerCheck = true;

                        }
                    }
                }


            }

    //Check back n forth algorithm ALEX WATERS
    //Create a switch that allows you to choose whether red or yellow SHAWN SINGLETON
    //Check for 4 in a row (within each array and across arrays horizontally at each index) PATRICK PULLUM
    //Check for 4 in a row (Diagonally - going up and Diagonally - going down) CURTIS OLIVER

}
