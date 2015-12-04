package com.company;

//-----------------------------------------------------------------------------------
// Class with 2D arrays inside J Frame with back and forth algorithm and horizontal,
// vertical and diagonal check of 4 in a row
//------------------------------------------------------------------------------------

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Game extends JFrame implements ActionListener
{
    private SuperButton myTwoButton[][] = new SuperButton[6][7];
    boolean playerCheck = false;
    boolean playerOneWin = false;
    boolean playerTwoWin = false;
    String winner = " Winner: ";
    int playerChoice;

    public static void main(String[] args)
    {
        Game myGame = new Game();
        myGame.setSize(726, 660);
        myGame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myGame.setVisible(true);
    }

    public Game()
    {
        Container con = getContentPane();
        con.setLayout(null);
        con.setBackground(Color.BLUE);
        setTitle("Connect Four");
        getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.cyan));
        setVisible(true);
        int count = 10;

        for (int x = 0; x < 6; x++)
        {
            for (int y = 0; y < 7; y++) {
                myTwoButton[x][y] = new SuperButton("" + x + y);
                myTwoButton[x][y].setSize(100, 100);
                myTwoButton[x][y].setLocation(y * 100, count);
                myTwoButton[x][y].addActionListener(this);
                con.add(myTwoButton[x][y].getJB());
            }
            count += 100;
        }

    }

    public void actionPerformed(ActionEvent e)
    {

        for (int x = 0; x < 6; x++)
        {
            for (int y = 0; y < 7; y++)
            {
                if (playerCheck &&(e.getActionCommand().equals(myTwoButton[x][y].getName())))
                {
                    int xx = 5;
                    while (xx >= x )
                    {
                        if (!myTwoButton[xx][y].getOccupied())
                        {
                            myTwoButton[xx][y].setOccupiedp2();
                            playerCheck = false;
                            xx = x-1;
                        }
                        else
                            xx--;
                    }
                }
                else if (!playerCheck &&(e.getActionCommand().equals(myTwoButton[x][y].getName())))
                {
                    int xx = 5;
                    while (xx >= x )
                    {
                        if (!myTwoButton[xx][y].getOccupied())
                        {
                            myTwoButton[xx][y].setOccupiedp1();
                            playerCheck = true;
                            xx = x-1;
                        }
                        else
                            xx--;
                    }
                }
            }
        }
        // Horizontal check
        for (int x = 0; x < 6; x++)
        {
            for (int y = 0; y < 3; y++)
            {
                if (myTwoButton[x][y].isOccupiedp1()&&myTwoButton[x][y+1].isOccupiedp1()&&myTwoButton[x][y+2].isOccupiedp1()&&myTwoButton[x][y+3].isOccupiedp1())
                {
                    playerOneWin = true;
                }
                if (myTwoButton[x][y].isOccupiedp2()&&myTwoButton[x][y+1].isOccupiedp2()&&myTwoButton[x][y+2].isOccupiedp2()&&myTwoButton[x][y+3].isOccupiedp2())
                {
                    playerTwoWin = true;
                }
            }
        }
        // Vertical check
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 7; y++)
            {
                if (myTwoButton[x][y].isOccupiedp1()&&myTwoButton[x+1][y].isOccupiedp1()&&myTwoButton[x+2][y].isOccupiedp1()&&myTwoButton[x+3][y].isOccupiedp1())
                {
                    playerOneWin = true;
                }
                if (myTwoButton[x][y].isOccupiedp2()&&myTwoButton[x+2][y].isOccupiedp2()&&myTwoButton[x+2][y].isOccupiedp2()&&myTwoButton[x+3][y].isOccupiedp2())
                {
                    playerTwoWin = true;
                }
            }
        }
        // Diagonal down-right testing
        for (int x = 0; x < 3; x++)
        {
            for (int y = 0; y < 4; y++)
            {
                if (myTwoButton[x][y].isOccupiedp1()&&myTwoButton[x+1][y+1].isOccupiedp1()&&myTwoButton[x+2][y+2].isOccupiedp1()&&myTwoButton[x+3][y+3].isOccupiedp1())
                {
                    playerOneWin = true;
                }
                if (myTwoButton[x][y].isOccupiedp2()&&myTwoButton[x+1][y+1].isOccupiedp2()&&myTwoButton[x+2][y+2].isOccupiedp2()&&myTwoButton[x+3][y+3].isOccupiedp2())
                {
                    playerTwoWin = true;
                }
            }
        }
        // Diagonal up-right testing
        for (int x = 0; x < 3; x++)
        {
            for (int y = 6; y > 2; y--)
            {
                if (myTwoButton[x][y].isOccupiedp1()&&myTwoButton[x+1][y-1].isOccupiedp1()&&myTwoButton[x+2][y-2].isOccupiedp1()&&myTwoButton[x+3][y-3].isOccupiedp1())
                {
                    playerOneWin = true;
                }
                if (myTwoButton[x][y].isOccupiedp2()&&myTwoButton[x+1][y-1].isOccupiedp2()&&myTwoButton[x+2][y-2].isOccupiedp2()&&myTwoButton[x+3][y-3].isOccupiedp2())
                {
                    playerTwoWin = true;
                }
            }
        }
        // Output for testing
        if (playerOneWin)
        {
            winner = "Player One Wins";
            JOptionPane.showMessageDialog(null, winner);
            System.exit(0);
        } else if (playerTwoWin)
        {
            winner = "Player Two Wins";
            JOptionPane.showMessageDialog(null, winner);
            System.exit(0);
        }
    }


}