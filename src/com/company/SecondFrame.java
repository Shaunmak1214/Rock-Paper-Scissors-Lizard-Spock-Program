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
    JLabel descenter1 = new JLabel("Enter player names: ");
    JLabel descenter2 = new JLabel("Enter player names: ");
    JLabel upperlabel = new JLabel();

    SecondFrame()
    {
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

        descenter1.setFont(new Font("Verdana", Font.PLAIN,19));
        descenter2.setFont(new Font("Verdana",Font.PLAIN,19));
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

        descenter1.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));


        f2.add(team1);
        secondpanel.add(team1);
        team1.setOpaque(true);
        secondpanel.add(descenter1);

        //secondpanel.setPreferredSize(new Dimension(500,620));

//////////////// THIRD PANEL BELOW///////////////////////////
        thirdpanel.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));
        f2.add(thirdpanel,BorderLayout.EAST);
        thirdpanel.setPreferredSize(new Dimension(500,620));

        //team2.setText("Team 2");
        //team2.setBorder((BorderFactory.createEmptyBorder(100,1000,20,0)));
        //team2.setFont(new Font("Verdana",Font.PLAIN,20));

        descenter2.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));


        f2.add(team2);
        thirdpanel.add(team2);
        team2.setOpaque(true);
        secondpanel.add(descenter2);

        //thirdpanel.setPreferredSize(new Dimension(500,620));


    }

}
