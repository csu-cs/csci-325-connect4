package csu.csci325;

//-------------------------------
// Class to create game board
// Date: 10/25/15 SPhillips
// -------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
public class SuperButton
{
    public boolean occupied;//need this to know when already yellow or red
    private JButton jb;//just a button
    public SuperButton(String st)
    {
        Border myBorder = new LineBorder (Color.blue, 4);
        jb= new JButton(st);//button, st is number on it
        jb.setBorder(myBorder);
        jb.setBackground(Color.cyan);
        jb.setForeground(Color.cyan);
        occupied = false;//buttons start as not yellow or red
    }
    public void setSize(int w, int h)//sets the size of the button--all should be the same
    {
        jb.setSize(w,h);
    }

    public void setLocation(int x, int y)//this sets where the button should be in the JFrame--x and y cords like a cartesian plane
    {
        jb.setLocation(x,y);
    }
    public void addActionListener(ActionListener jf)//should make it so the button can be clicked on
    {
        jb.addActionListener(jf);
    }
        public JButton getJB()//will need this when checking if 4 are in a row or diagonal
    {
        return jb;
    }
    public void setOccupied()//this happens when it changes to a color
    {
        occupied = true;
        jb.setBackground(Color.RED);
        jb.setForeground(Color.RED);
    }

    public boolean getOccupied()//this checks to see if it has already been clicked on
    {
        return occupied;
    }

}
