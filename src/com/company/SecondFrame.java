package com.company;

import javax.swing.*;
import java.awt.*;

public class SecondFrame {

    JFrame f2 = new JFrame();

    JPanel firstpanel = new JPanel();
    JPanel secondpanel = new JPanel();
    JPanel thirdpanel = new JPanel();

    JLabel team1 = new JLabel("Team 1");
    JLabel team2 = new JLabel("Team 2");

    JLabel entername1 = new JLabel("Enter player names: ");
    JLabel entername2 = new JLabel("Enter player names: ");




    //JSeparator sep = new JSeparator();

    JLabel sep = new JLabel("<html><br/></html>",SwingConstants.CENTER);

    JLabel upperlabel = new JLabel();

    SecondFrame()
    {
        //s.setOrientation(SwingConstants.HORIZONTAL);

//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
/////////////////////////// FIRST PANEL BELOW/////////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL

        f2.add(firstpanel,BorderLayout.NORTH);//panel position
        firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000,60));//FIRST PANEL SIZE

        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Verdana",Font.PLAIN,18));//font of text
        upperlabel.setBackground(Color.ORANGE);//text background color

        firstpanel.add(upperlabel);
        upperlabel.setOpaque(true);

        entername1.setFont(new Font("Verdana", Font.PLAIN,19));
        entername2.setFont(new Font("Verdana",Font.PLAIN,19));
//////////////////////  IMPORTANTTTTTTTTTTTTTTTTTTTTTTT //////////////////////
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

///////////////// SECOND PANEL BELOW////////////////////////////

        secondpanel.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));
        f2.add(secondpanel,BorderLayout.WEST);
        secondpanel.setPreferredSize(new Dimension(500,620));


        //team1.setText("Team 1");
        //team1.setBorder((BorderFactory.createEmptyBorder(100,100,20,0)));
        //team1.setFont(new Font("Verdana",Font.PLAIN,20));

        f2.add(team1);
        secondpanel.add(team1);
        team1.setOpaque(true);
        secondpanel.add(entername1);
        entername1.setBorder((BorderFactory.createEmptyBorder(0,250,30,250)));

        JLabel t1p1 = new JLabel("Player 1:");
        JTextField team1player1 = new JTextField();

        secondpanel.add(t1p1);
        secondpanel.add(team1player1);
        team1player1.setPreferredSize(new Dimension(200,20));

        //f2.add(sep);
        JLabel t1p2 = new JLabel("Player 2:");
        JTextField team1player2 = new JTextField();

        secondpanel.add(t1p2);
        secondpanel.add(team1player2);

        t1p2.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));
        team1player2.setPreferredSize(new Dimension(200,20));
        team1player2.setBorder((BorderFactory.createEmptyBorder(0,250,0,250)));

        //secondpanel.setPreferredSize(new Dimension(500,620));

//////////////// THIRD PANEL BELOW///////////////////////////
        thirdpanel.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));
        f2.add(thirdpanel,BorderLayout.EAST);
        thirdpanel.setPreferredSize(new Dimension(500,620));

        //team2.setText("Team 2");
        //team2.setBorder((BorderFactory.createEmptyBorder(100,1000,20,0)));
        //team2.setFont(new Font("Verdana",Font.PLAIN,20));

        entername2.setBorder((BorderFactory.createEmptyBorder(100,250,0,250)));




        f2.add(team2);
        thirdpanel.add(team2);
        team2.setOpaque(true);
        thirdpanel.add(entername2);
        entername2.setBorder((BorderFactory.createEmptyBorder(0,250,30,250)));

        JLabel t2p1 = new JLabel("Player 1:");
        JTextField team2player1 = new JTextField();

        team2player1.setBorder((BorderFactory.createEmptyBorder()));
        team2player1.setPreferredSize(new Dimension(200,20));

        thirdpanel.add(t2p1);
        thirdpanel.add(team2player1);

        JLabel t2p2 = new JLabel("Player 2:");
        JTextField team2player2 = new JTextField();

        thirdpanel.add(t2p2);
        thirdpanel.add(team2player2);

        //thirdpanel.setPreferredSize(new Dimension(500,620));


    }

}
