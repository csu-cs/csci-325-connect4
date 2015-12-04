package com.company;

//---------------------------------------------------------------
// An application to create a connect4 game for 2 players
// Programming Team: Susan Phillips, Alex Waters, Patrick Pullum,
// Shawn Singleton, and Curtis Oliver.
//----------------------------------------------------------------
public class Main
{

    public static void main(String[] args)
    {
        Game myGame = new Game();
        myGame.setSize(720, 660);
        myGame.setVisible(true);
    }
}