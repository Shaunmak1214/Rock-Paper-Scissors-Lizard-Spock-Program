/**
 * Class Section: TT3V
 * Trimester 2 2020/21
 * Members:
 * Mak Yen Wei         | 1181203334 | 018-9495849
 * Reynard Kok Jin Yik | 1181203212 | 017-2890325
 * Ong Sin Yin         | 1181203333 | 018-4093684
 * Tew Jing Lai        | 1181203035 | 018-3101858
 * Koong Poh Kang      | 1181203314 | 017-6971339
 */

package com.company;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;

public class SecondFrame {

    String[][] playername = new String[2][2];

    JFrame f2 = new JFrame();

    JPanel firstpanel = new JPanel();   // TITLE PANEL
    JPanel secondpanel = new JPanel();  // ENTER PLAYER 1 NAME PANEL (TEAM 1)
    JPanel thirdpanel = new JPanel();   // ENTER PLAYER 1 NAME PANEL (TEAM 2)

    JPanel fourthpanel = new JPanel();  // ENTER PLAYER 2 NAME PANEL (TEAM 1)
    JPanel fifthpanel = new JPanel();   // ENTER PLAYER 2 NAME PANEL (TEAM 2)

    JPanel team1btn = new JPanel();     // BUTTON FOR TEAM 1
    JPanel team2btn = new JPanel();     // BUTTON FOR TEAM 2

    JPanel display1 = new JPanel();     // Display for team 1
    JPanel display2 = new JPanel();     // Display for team 2

    JLabel team1 = new JLabel("Team 1");
    JLabel team2 = new JLabel("Team 2");

    JLabel entername1 = new JLabel("Enter player names: ");
    JLabel entername2 = new JLabel("Enter player names: ");

    JLabel t1p1 = new JLabel("Player 1:");
    JTextField team1player1 = new JTextField();// TEXTFIELD FOR PLAYER 1 (TEAM 1)

    JLabel t1p2 = new JLabel("Player 2:");
    JTextField team1player2 = new JTextField();// TEXTFIELD FOR PLAYER 2 (TEAM 1)


    JLabel t2p1 = new JLabel("Player 1:");
    JTextField team2player1 = new JTextField();// TEXTFIELD FOR PLAYER 1 (TEAM 2)

    JLabel t2p2 = new JLabel("Player 2:");
    JTextField team2player2 = new JTextField();// TEXTFIELD FOR PLAYER 2 (TEAM 2)

    JButton button1 = new JButton("Enter");// BUTTON FOR TEAM 1
    JButton button2 = new JButton("Enter");// BUTTON FOR TEAM 2

    JLabel upperlabel = new JLabel();// LABEL FOR TITLE

    JLabel results1 = new JLabel();
    JLabel results2 = new JLabel();

    SecondFrame()
    {

//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////
/////////////////////////// FIRST PANEL BELOW/////////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL

        f2.add(firstpanel,BorderLayout.NORTH);//panel position
        firstpanel.setBackground(new Color(253, 105, 0));//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000,60));//FIRST PANEL SIZE

        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Sans Serif",Font.BOLD,18));//font of text
        upperlabel.setBackground(Color.ORANGE);//text background color

        firstpanel.add(upperlabel);// ADDED LABEL TO TOP PANEL
        //upperlabel.setOpaque(true);
//////////////////////  IMPORTANTTTTTTTTTTTTTTTTTTTTTTT //////////////////////
//////////////////////////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////////////////////////

        entername1.setFont(new Font("Verdana", Font.PLAIN,19));// FONT FOR "Enter Player Names:" (TEAM 1)
        entername2.setFont(new Font("Verdana",Font.PLAIN,19));// FONT FOR "Enter Player Names:" (TEAM 2)

        button1.setFont(new Font("Verdana", Font.BOLD,14));// FONT FOR "ENTER" BUTTON (TEAM 1)
        button2.setFont(new Font("Verdana", Font.BOLD,14));// FONT FOR "ENTER" BUTTON (TEAM 2)

        team1.setFont(new Font("Verdana",Font.PLAIN,20));// FONT FOR "Team 1"
        team2.setFont(new Font("Verdana",Font.PLAIN,20));// FONT FOR "Team 2"

///////////////// SECOND PANEL BELOW////////////////////////////

//        t1p1.setLabelFor(team1player1);
//        t1p2.setLabelFor(team1player2);

        secondpanel.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));// SECOND PANEL POSITION
        f2.add(secondpanel,BorderLayout.WEST);// ADD SECOND PANEL TO FRAME
        secondpanel.setPreferredSize(new Dimension(500,300));// SET SIZE FOR SECOND PANEL

        secondpanel.add(team1);// ADDED "Team 1" LABEL
        //team1.setOpaque(true);
        secondpanel.add(entername1);// ADDED "Enter Player Name:" (TEAM 1)
        entername1.setBorder((BorderFactory.createEmptyBorder(20,250,30,250)));// SET "Enter Player Name:" POSITION

        team1player1.setPreferredSize(new Dimension(200,20));// SET TEXT FIELD SIZE

        secondpanel.add(t1p1);// ADD "Player 1:" LABEL
        secondpanel.add(team1player1);// ADD TEXT FIELD


//////////////// THIRD PANEL BELOW (TEAM 1, PLAYER 2)///////////////////////////
        secondpanel.add(thirdpanel);// ADD THIRD PANEL FOR PLAYER 2

        team1player2.setPreferredSize(new Dimension(200,20));// SET SIZE FOR TEXT FIELD
        thirdpanel.setBorder(BorderFactory.createEmptyBorder(20,250,0,250));// SET THIRD PANEL POSITION

        thirdpanel.add(t1p2);// ADD "Player 2:" LABEL
        thirdpanel.add(team1player2);// ADD TEXT FIELD

//////////////// TEAM 1 "ENTER" BUTTON PANEL/////////////////////////////
        secondpanel.add(team1btn);

        team1btn.setBorder(BorderFactory.createEmptyBorder(25,250,0,250));
        button1.setPreferredSize(new Dimension(100,30));
        button1.setForeground(Color.BLUE);

        //button1.addActionListener(this::btn1Check);
        team1btn.add(button1);

///////////////// DISPLAY RESULTS FOR TEAM 1 ///////////////////////////
        secondpanel.add(display1);

        display1.setBorder(BorderFactory.createEmptyBorder(0,250,20,250));
        display1.add(results1);
//        JLabel testing = new JLabel("Testing");
        //display1.add(testing);



//////////////// FOURTH PANEL BELOW///////////////////////////
        fourthpanel.setBorder((BorderFactory.createEmptyBorder(100,0,0,0)));
        f2.add(fourthpanel,BorderLayout.EAST);
        fourthpanel.setPreferredSize(new Dimension(500,300));

        entername2.setBorder((BorderFactory.createEmptyBorder(20,250,0,250)));

        f2.add(team2);
        fourthpanel.add(team2);
        //team2.setOpaque(true);
        fourthpanel.add(entername2);
        entername2.setBorder((BorderFactory.createEmptyBorder(20,250,30,250)));

        team2player1.setPreferredSize(new Dimension(200,20));

        fourthpanel.add(t2p1);
        fourthpanel.add(team2player1);


//////////////// FIFTH PANEL BELOW (TEAM 2, PLAYER 2)//////////////////////////
        fourthpanel.add(fifthpanel);

        team2player2.setPreferredSize(new Dimension(200,20));
        fifthpanel.setBorder(BorderFactory.createEmptyBorder(20,250,0,250));
        fifthpanel.add(t2p2);
        fifthpanel.add(team2player2);

//////////////// TEAM 2 "ENTER" BUTTON PANEL//////////////////////////////////
        fourthpanel.add(team2btn);

        team2btn.setBorder(BorderFactory.createEmptyBorder(25,250,0,250));
        button2.setPreferredSize(new Dimension(100,30));
        button2.setForeground(Color.BLUE);

        //button2.addActionListener(this::btn2Check);
        team2btn.add(button2);

//////////////// DISPLAY RESULTS FOR TEAM 2 /////////////////////////////////
        fourthpanel.add(display2);
        display2.setBorder(BorderFactory.createEmptyBorder(10,250,0,250));

        display2.add(results2);

//////////////////////////// 2D ARRAY //////////////////////////////////////

     /*   String[][] playername = new String[2][2];

        playername[0][0] = team1player1.getText();
        playername[0][1] = team1player2.getText();

        playername[1][0] = team2player1.getText();
        playername[1][1] = team2player2.getText();
       */

    }
}
