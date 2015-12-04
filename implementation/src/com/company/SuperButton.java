package com.company;

//-----------------------------------
// Class that creates the game board.
// ----------------------------------

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;
import java.awt.*;
import java.awt.event.ActionListener;


public class SuperButton
{

    public boolean occupied;
    private JButton jb;
    public String name;

    public SuperButton(String st)
    {
        Border myBorder = new LineBorder(Color.BLACK, 4);
        jb= new JButton(st);
        jb.setBorder(myBorder);
        jb.setBackground(Color.WHITE);
        jb.setForeground(Color.WHITE);
        occupied = false;
        name=st;
    }

    public void setSize(int w, int h)

    {
        jb.setSize(w,h);
    }

    public void setLocation(int x, int y)

    {
        jb.setLocation(x, y);
    }

    public void addActionListener(ActionListener jf)

    {
        jb.addActionListener(jf);
    }

    public JButton getJB()

    {
        return jb;
    }

    public void setOccupiedp1()
    {
        jb.setBackground(Color.BLUE);
        jb.setForeground(Color.BLUE);
        occupied = true;
    }

    public void setOccupiedp2()
    {
        jb.setBackground(Color.RED);
        jb.setForeground(Color.RED);
        occupied = true;
    }

    public boolean isOccupiedp1()
    {
        boolean blueChip=false;
        if(jb.getBackground()==Color.BLUE&&jb.getForeground()==Color.BLUE)
        {
            blueChip=true;
        }
        else if (jb.getBackground()==Color.RED&&jb.getForeground()==Color.RED)
        {blueChip=false;}
        return blueChip;
    }

    public boolean isOccupiedp2()
    {
        boolean redChip=false;
        if (jb.getBackground()==Color.RED&&jb.getForeground()==Color.RED)
        {
            redChip=true;
        }
        else if (isOccupiedp1())
        {
            redChip=false;
        }
        return redChip;
    }



    public boolean getOccupied()
    {
        if (isOccupiedp1()||isOccupiedp2())
        {
            occupied=true;
        }
        else{occupied=false;}
        return occupied;
    }


    public String getName()
    {
        return name;
    }
}