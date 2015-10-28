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
    private SuperButton myButton[]= new SuperButton[7];
    private SuperButton myButton2[] = new SuperButton[7];
    private SuperButton myButton3[] = new SuperButton[7];
    private SuperButton myButton4[] = new SuperButton[7];
    private SuperButton myButton5[] = new SuperButton[7];
    private SuperButton myButton6[] = new SuperButton[7];

    public Game()
    {

        Container con = getContentPane();
        con.setLayout(null);
        con.setBackground(Color.blue);
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.cyan));
        setVisible(true);
        for (int index = 0; index < myButton.length; index ++)
        {
            myButton[index] = new SuperButton("" +1 + index);
            myButton[index].setSize(100, 100);
            myButton[index].setLocation(index*100, 10);
            myButton[index].addActionListener(this);
            con.add(myButton[index].getJB());
        }
        for (int index = 0; index < myButton2.length; index ++)
        {
            myButton2[index] = new SuperButton("" +2 + index);
            myButton2[index].setSize(100, 100);
            myButton2[index].setLocation(index*100, 110);
            myButton2[index].addActionListener(this);
            con.add(myButton2[index].getJB());
        }
        for (int index = 0; index < myButton3.length; index ++)
        {
            myButton3[index] = new SuperButton("" +3 + index);
            myButton3[index].setSize(100, 100);
            myButton3[index].setLocation(index*100,210);
            myButton3[index].addActionListener(this);
            con.add(myButton3[index].getJB());
        }
        for (int index = 0; index < myButton4.length; index ++)
        {
            myButton4[index] = new SuperButton("" +4 + index);
            myButton4[index].setSize(100, 100);
            myButton4[index].setLocation(index*100, 310);
            myButton4[index].addActionListener(this);
            con.add(myButton4[index].getJB());
        }
        for (int index = 0; index < myButton5.length; index ++)
        {
            myButton5[index] = new SuperButton("" +5 + index);
            myButton5[index].setSize(100, 100);
            myButton5[index].setLocation(index*100, 410);
            myButton5[index].addActionListener(this);
            con.add(myButton5[index].getJB());
        }
        for (int index = 0; index < myButton6.length; index ++)
        {
            myButton6[index] = new SuperButton("" +6 + index);
            myButton6[index].setSize(100, 100);
            myButton6[index].setLocation(index*100, 510);
            myButton6[index].addActionListener(this);
            con.add(myButton6[index].getJB());
        }
    }

    public void actionPerformed(ActionEvent e)
    {

                if ((myButton[0].getOccupied() != true) && (e.getActionCommand().equals("10")))
                {
                    myButton[0].setOccupied();

                }

            }

    //Check back n forth algorithm ALEX WATERS
    //Create a switch that allows you to choose whether red or yellow SHAWN SINGLETON
    //Check for 4 in a row (within each array and across arrays horizontally at each index) PATRICK PULLUM
    //Check for 4 in a row (Diagonally - going up and Diagonally - going down) CURTIS OLIVER

}
