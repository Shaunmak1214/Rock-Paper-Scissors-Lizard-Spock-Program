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
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class Main{

    static String T1P1 = "";
    static String T2P1 = "";
    static String T1P2 = "";
    static String T2P2 = "";

    public static void main(String[] args){

        MainFrame frame = new MainFrame();// Color changer frame
        SecondFrame frame2 = new SecondFrame();// Enter player name frame
        GameFrame gameFrame = new GameFrame();


        //Create new temp file for name storing
        File storeName = new File("temp.txt");
            try {
                if (storeName.createNewFile()) {
                    System.out.println("File created: " + storeName.getName());
                } else {
                    System.out.println("File already exists.");
                }
            } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }

        frame.cb.addActionListener(frame::actionPerformed);//get COMBO BUTTON ACTION PERFORM FROM FIRST FRAME

        frame.proceed.addActionListener(new ActionListener() {//WHEN PROCEED BUTTON IS CLICKED
            @Override
            public void actionPerformed(ActionEvent e) {

                String colorSelected = frame.getSelectedColor(); //GET COLOR FROM FIRST FRAME

                frame.f.setVisible(false);//SET frame 1 visible false
                frame2.f2.setSize(1000,700);// SET SIZE FOR FRAME 2
                frame2.f2.setResizable(false);// SET FRAME 2 NOT RESIZABLE

                switch (colorSelected)//SWITCH COLOR FOR SECOND FRAME
                {
                    case "Red":
                        frame2.secondpanel.setBackground(Color.RED);
                        frame2.thirdpanel.setBackground(Color.RED);
                        frame2.fourthpanel.setBackground(Color.RED);
                        frame2.fifthpanel.setBackground(Color.RED);
                        frame2.team1btn.setBackground(Color.RED);
                        frame2.team2btn.setBackground(Color.RED);
                        frame2.display1.setBackground(Color.RED);
                        frame2.display2.setBackground(Color.RED);
                        break;

                    case "Green":
                        frame2.secondpanel.setBackground(Color.GREEN);
                        frame2.thirdpanel.setBackground(Color.GREEN);
                        frame2.fourthpanel.setBackground(Color.GREEN);
                        frame2.fifthpanel.setBackground(Color.GREEN);
                        frame2.team1btn.setBackground(Color.GREEN);
                        frame2.team2btn.setBackground(Color.GREEN);
                        frame2.display1.setBackground(Color.GREEN);
                        frame2.display2.setBackground(Color.GREEN);
                        break;

                    case "Blue":
                        frame2.secondpanel.setBackground(Color.decode("#00ECFF"));
                        frame2.thirdpanel.setBackground(Color.decode("#00ECFF"));
                        frame2.fourthpanel.setBackground(Color.decode("#00ECFF"));
                        frame2.fifthpanel.setBackground(Color.decode("#00ECFF"));
                        frame2.team1btn.setBackground(Color.decode("#00ECFF"));
                        frame2.team2btn.setBackground(Color.decode("#00ECFF"));
                        frame2.display1.setBackground(Color.decode("#00ECFF"));
                        frame2.display2.setBackground(Color.decode("#00ECFF"));
                        break;

                    case "Yellow":
                        frame2.secondpanel.setBackground(Color.YELLOW);
                        frame2.thirdpanel.setBackground(Color.YELLOW);
                        frame2.fourthpanel.setBackground(Color.YELLOW);
                        frame2.fifthpanel.setBackground(Color.YELLOW);
                        frame2.team1btn.setBackground(Color.YELLOW);
                        frame2.team2btn.setBackground(Color.YELLOW);
                        frame2.display1.setBackground(Color.YELLOW);
                        frame2.display2.setBackground(Color.YELLOW);
                        break;

                    case "Grey":
                        frame2.secondpanel.setBackground(Color.decode("#A4A7AB"));
                        frame2.thirdpanel.setBackground(Color.decode("#A4A7AB"));
                        frame2.fourthpanel.setBackground(Color.decode("#A4A7AB"));
                        frame2.fifthpanel.setBackground(Color.decode("#A4A7AB"));
                        frame2.team1btn.setBackground(Color.decode("#A4A7AB"));
                        frame2.team2btn.setBackground(Color.decode("#A4A7AB"));
                        frame2.display1.setBackground(Color.decode("#A4A7AB"));
                        frame2.display2.setBackground(Color.decode("#A4A7AB"));
                        break;
                }
                frame2.f2.setVisible(true);//frame 2 visible true

                Color backgrounds = Color.RED;

                switch (colorSelected)
                {
                    case "Red": backgrounds = Color.RED; break;
                    case "Green": backgrounds = Color.GREEN; break;
                    case "Blue": backgrounds = Color.decode("#00ECFF"); break;
                    case "Yellow": backgrounds = Color.YELLOW; break;
                    case "Grey": backgrounds = Color.decode("#A4A7AB"); break;
                }
                gameFrame.setBackgrounds(backgrounds);
            }
        });

        frame2.button1.addActionListener(new ActionListener() { //WHEN SECOND FRAME ENTER BUTTON FOR TEAM 1 IS CLICKED
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frame2.team1player1.getText().trim().isEmpty() && frame2.team1player2.getText().trim().isEmpty()) //IF BOTH PLAYER 1 AND 2 DIDNT ENTER ANY INPUT
                {
                    frame2.results1.setText("Please enter name for both Player");// DISPLAY THIS TO USER
                }
                else if(frame2.team1player1.getText().trim().isEmpty())// IF PLAYER 1 DIDNT ENTER ANY INPUT
                {
                    frame2.results1.setText("Please enter name for Player 1");// DISPLAY THIS TO USER
                }
                else if(frame2.team1player2.getText().trim().isEmpty())// IF PLAYER 2 DIDNT ENTER ANY INPUT
                {
                    frame2.results1.setText("Please enter name for Player 2");// DISPLAY THIS TO USER
                }
                else// IF BOTH PLAYER HAS ENTER THE INPUT
                {

                    frame2.results1.setText("Ready!"); // DISPLAY THIS TO USER

                    if(frame2.results1.getText().equals("Ready!") && frame2.results2.getText().equals("Ready!")) // IF BOTH TEAM 1 AND TEAM 2 HAS READY
                    {
                        frame2.f2.setVisible(false);// SET FRAME 2 VISIBLE TO FALSE
                        gameFrame.f3.setVisible(true);// SET FRAME 3 VISIBLE TO TRUE
                        gameFrame.f3.setSize(1000,700);// SET FRAME 3 SIZE
                        gameFrame.f3.setResizable(false);// SET FRAME 3 NOT RESIZABLE

                        T1P1 = frame2.team1player1.getText();
                        T1P2 = frame2.team1player2.getText();

                        T2P1 = frame2.team2player1.getText();
                        T2P2 = frame2.team2player2.getText();

                        //Initilize filewriter, and write stored name to temp file
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter("temp.txt");
                            myWriter.write(T1P1);
                            myWriter.write("\n");
                            myWriter.write(T2P1);
                            myWriter.write("\n");
                            myWriter.write(T1P2);
                            myWriter.write("\n");
                            myWriter.write(T2P2);
                            myWriter.write("\n");
                            myWriter.close();
                            System.out.println("Successfully store name");

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                            System.out.println("Failed to store name");
                        }

                        //calling inbuilt function in gameframe for setting names
                        gameFrame.setName();

                        gameFrame.headmodel.setValueAt("Team 1: "+ T1P1, 0, 0);
                        gameFrame.headmodel.setValueAt("Team 2: "+ T2P1, 1, 0);
                    }
                }
            }
        });

        frame2.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frame2.team2player1.getText().trim().isEmpty() && frame2.team2player2.getText().trim().isEmpty()) //IF BOTH PLAYER 1 AND 2 DIDNT ENTER ANY INPUT
                {
                    frame2.results2.setText("Please enter name for both Player");// DISPLAY THIS TO USER
                }
                else if(frame2.team2player1.getText().trim().isEmpty()) // IF PLAYER 1 DIDNT ENTER ANY INPUT
                {
                    frame2.results2.setText("Please enter name for Player 1");// DISPLAY THIS TO USER
                }
                else if(frame2.team2player2.getText().trim().isEmpty()) // IF PLAYER 2 DIDNT ENTER ANY INPUT
                {
                    frame2.results2.setText("Please enter name for Player 2");// DISPLAY THIS TO USER
                }
                else // IF BOTH PLAYER HAS READY
                {
                    frame2.results2.setText("Ready!");// DISPLAY THIS TO USER

                    if(frame2.results1.getText().equals("Ready!") && frame2.results2.getText().equals("Ready!")) // IF BOTH TEAM 1 AND TEAM 2 HAS READY
                    {
                        frame2.f2.setVisible(false);// SET FRAME 2 VISIBLE TO FALSE
                        gameFrame.f3.setVisible(true);// SET FRAME 3 VISIBLE TO TRUE
                        gameFrame.f3.setSize(1000,700);// SET FRAME 3 SIZE
                        gameFrame.f3.setResizable(false);// SET FRAME 3 TO NOT RESIZABLE

                        T1P1 = frame2.team1player1.getText();
                        T1P2 = frame2.team1player2.getText();

                        T2P1 = frame2.team2player1.getText();
                        T2P2 = frame2.team2player2.getText();

                        //Initilize filewriter, and write stored name to temp file
                        FileWriter myWriter = null;
                        try {
                            myWriter = new FileWriter("temp.txt");
                            myWriter.write(T1P1);
                            myWriter.write("\n");
                            myWriter.write(T2P1);
                            myWriter.write("\n");
                            myWriter.write(T1P2);
                            myWriter.write("\n");
                            myWriter.write(T2P2);
                            myWriter.write("\n");
                            myWriter.close();
                            System.out.println("Successfully store name");

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                            System.out.println("Failed to store name");
                        }

                        //caling inbuilt function in gameframe for setting names
                        gameFrame.setName();

                        gameFrame.headmodel.setValueAt("Team 1: "+ T1P1, 0, 0);
                        gameFrame.headmodel.setValueAt("Team 2: "+ T2P1, 1, 0);
                    }
                }
            }
        });

        //binding action listener to both of the "boom" buttons
        gameFrame.boom1button.addActionListener(gameFrame::boomAction);
        gameFrame.boom2button.addActionListener(gameFrame::boomAction);

    }
}

