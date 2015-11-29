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
    public String name;

    public SuperButton(String st)
    {
        Border myBorder = new LineBorder (Color.BLACK, 4);
        jb= new JButton(st);//button, st is number on it
        jb.setBorder(myBorder);
        jb.setBackground(Color.WHITE);
        jb.setForeground(Color.WHITE);
        occupied = false;//buttons start as not yellow or red
        name=st;
    }
    public void setSize(int w, int h)//sets the size of the button--all should be the same
    {
        jb.setSize(w,h);
    }

    public void setLocation(int x, int y)//this sets where the button should be in the JFrame--x and y cords like a cartesian plane
    {
        jb.setLocation(x, y);
    }

    public void addActionListener(ActionListener jf)//should make it so the button can be clicked on
    {
        jb.addActionListener(jf);
    }

    public JButton getJB()//will need this when checking if 4 are in a row or diagonal
    {
        return jb;
    }

    public void setOccupiedp1()//this happens when it changes to a color
    {
            jb.setBackground(Color.BLUE);
            jb.setForeground(Color.BLUE);
    }

    public void setOccupiedp2()//this happens when it changes to a color
    {
        jb.setBackground(Color.RED);
        jb.setForeground(Color.RED);
    }



    public boolean getOccupied()//this checks to see if it has already been clicked on
    {
        return occupied;
    }

    public String getName(){
        return name;
    }
}
