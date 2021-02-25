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

import jdk.swing.interop.SwingInterOpUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.io.File;
import java.io.IOException;

public class Main{

    static String T1P1 = "";
    static String T2P1 = "";
    static String T1P2 = "";
    static String T2P2 = "";
    //static int totalPointT1P1 = 0;/DELETE LAAAAAA

    public static void main(String[] args){

        MainFrame frame = new MainFrame();// Color changer frame
        SecondFrame frame2 = new SecondFrame();// Enter player name frame
        GameFrame gameFrame = new GameFrame();
        //FinalFrame finalFrame = new FinalFrame();

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

        //JLabel name3Label = new JLabel();

        String[][] playername = new String[2][2];
        /*String T1P1 = "";
        String T2P1 = "";
        String T1P2 = "";
        String T2P2 = "";*///DELETE LAAAAAA

        frame.cb.addActionListener(frame::actionPerformed);//get COMBO BUTTON ACTION PERFORM FROM FIRST FRAME

        frame.proceed.addActionListener(new ActionListener() {//WHEN PROCEED BUTTON IS CLICKED
            @Override
            public void actionPerformed(ActionEvent e) {

                String colorSelected = frame.getSelectedColor(); //GET COLOR FROM FIRST FRAME

                //System.out.println("Color Selected" + colorSelected );

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
                        frame2.secondpanel.setBackground(Color.BLUE);
                        frame2.thirdpanel.setBackground(Color.BLUE);
                        frame2.fourthpanel.setBackground(Color.BLUE);
                        frame2.fifthpanel.setBackground(Color.BLUE);
                        frame2.team1btn.setBackground(Color.BLUE);
                        frame2.team2btn.setBackground(Color.BLUE);
                        frame2.display1.setBackground(Color.BLUE);
                        frame2.display2.setBackground(Color.BLUE);
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
                        frame2.secondpanel.setBackground(Color.GRAY);
                        frame2.thirdpanel.setBackground(Color.GRAY);
                        frame2.fourthpanel.setBackground(Color.GRAY);
                        frame2.fifthpanel.setBackground(Color.GRAY);
                        frame2.team1btn.setBackground(Color.GRAY);
                        frame2.team2btn.setBackground(Color.GRAY);
                        frame2.display1.setBackground(Color.GRAY);
                        frame2.display2.setBackground(Color.GRAY);
                        break;
                }
                frame2.f2.setVisible(true);//frame 2 visible true
                //finalFrame.f4.setVisible(true);

                Color backgrounds = Color.RED;

                switch (colorSelected)
                {
                    case "Red": backgrounds = Color.RED; break;
                    case "Green": backgrounds = Color.GREEN; break;
                    case "Blue": backgrounds = Color.BLUE; break;
                    case "Yellow": backgrounds = Color.YELLOW; break;
                    case "Grey": backgrounds = Color.GRAY; break;
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

                        //System.out.println(backgrounds);

                        T1P1 = frame2.team1player1.getText();
                        T2P1 = frame2.team1player2.getText();

                        T1P2 = frame2.team2player1.getText();
                        T2P2 = frame2.team2player2.getText();

                        //System.out.println(frame2.team1player1.getText());
                        System.out.println(Arrays.deepToString(playername));//DELETE THIS AFTER FINISH PROJECT

                        /*String T1P1 = "";
                        String T2P1 = "";
                        String T1P2 = "";
                        String T2P2 = "";*/

                        /*T1P1 = playername[0][0];
                        T2P1 = playername[0][1];
                        T1P2 = playername[1][0];
                        T2P2 = playername[1][1];*/

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
                            System.out.println("success");

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                            System.out.println("failed");
                        }

                        gameFrame.setName();

                        //gameFrame.name1Label.setText(T1P1);
                        //gameFrame.name2Label.setText(T2P1);
                        //gameFrame.name3Label.setText(T1P2);
                        //gameFrame.name4Label.setText(T2P2);

                        gameFrame.headmodel.setValueAt("Team 1: "+ T1P1, 0, 0);
                        gameFrame.headmodel.setValueAt("Team 2: "+ T2P1, 1, 0);

                        //Color backgrounds = frame2.f2.getBackground();
                        //gameFrame.setBackgrounds(backgrounds);

                        //gameFrame.wrapperpanel.setBackground(Color.red);

                        //gameFrame.resultscolumn[0][0] = gameFrame.resultscolumn[0][0]+playername[0][0];
                        //gameFrame.resultscolumn[0][1] = gameFrame.resultscolumn[0][1]+playername[0][1];

                        //System.out.println(Arrays.deepToString(gameFrame.resultscolumn));
                        //gameFrame.setBackgrounds();
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

                        //Color backgrounds = frame2.f2.getBackground();
                        //gameFrame.setBackgrounds(backgrounds);

                        T1P1 = frame2.team1player1.getText();
                        T2P1 = frame2.team1player2.getText();

                        T1P2 = frame2.team2player1.getText();
                        T2P2 = frame2.team2player2.getText();

                        System.out.println(Arrays.deepToString(playername)); //DELETE THIS AFTER FINISH PROJECT

                        /*String T1P1 = "";
                        String T2P1 = "";
                        String T1P2 = "";
                        String T2P2 = "";*/

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
                            System.out.println("success");

                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                            System.out.println("failed");
                        }

                        gameFrame.setName();

                        //gameFrame.name1Label.setText(T1P1);
                        //gameFrame.name2Label.setText(T2P1);


                        //name3Label.setText(T1P2);
                        //gameFrame.thirdeastpanel.add(name3Label);
                        //gameFrame.name4Label.setText(T2P2);
                        /*JLabel name3label = new JLabel(T1P2);*/

                        /*gameFrame.setName3Label(name3label);*/
                        //gameFrame.setName3(T1P2);

                        gameFrame.headmodel.setValueAt("Team 1: "+ T1P1, 0, 0);
                        gameFrame.headmodel.setValueAt("Team 2: "+ T2P1, 1, 0);
                    }
                }
            }
        });

        gameFrame.boom1button.addActionListener(gameFrame::boomAction);
        gameFrame.boom2button.addActionListener(gameFrame::boomAction);

        /*gameFrame.nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent fake) {
                String name3;
                gameFrame.dl.dispose();
                gameFrame.name3Label.setText(T1P2);
                System.out.println("Player-name: "+T1P2);
                gameFrame.thirdeastpanel.remove(gameFrame.name1Label);
                gameFrame.thirdeastpanel.add(gameFrame.name3Label, BorderLayout.CENTER);
            }
        });*/

        /*gameFrame.viewResultButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent openFrame) {

                gameFrame.f3.setVisible(false);
                FinalFrame finalFrame = new FinalFrame();
                finalFrame.data[1][4] = String.valueOf(gameFrame.totalPointT1P1);

                finalFrame.setP1Result();
                //finalFrame.setFinalFrame();

                //finalFrame.data[1][4] = String.valueOf(finalFrame.totalPointT1P1);
            }
        });*/



    /*  gameFrame.boom1button.addActionListener(gameFrame::scorerecorder);
        gameFrame.boom2button.addActionListener(gameFrame::scorerecorder);*/
        /*gameFrame.boom1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(gameFrame.roundNumLeft<3)
                {
                    gameFrame.boom1button.setEnabled(false);
                    gameFrame.boom2button.setEnabled(true);
                    gameFrame.renderImageLeft();
                    //gameFrame.storeHandsignLeft();
                }
                else if(gameFrame.roundNumLeft>=2)
                {
                    gameFrame.boom1button.setEnabled(false);
                }
                gameFrame.roundNumLeft++;
            }
        });*/

        //gameFrame.boom2button.addActionListener(gameFrame::boom2Action);

        /*gameFrame.boom2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                if(gameFrame.roundNumRight<3)
                {
                    gameFrame.boom2button.setEnabled(false);
                    gameFrame.boom1button.setEnabled(true);
                    gameFrame.renderImageRight();
                    //gameFrame.storeHandsignRight();
                }
                else if(gameFrame.roundNumRight>=2)
                {
                    gameFrame.boom2button.setEnabled(false);
                }
                gameFrame.roundNumRight++;
            }
        });*/
    }

    /*private static void gameInit(GameFrame gameFrame) {
        //setButton(gameFrame);
        //setImage(gameFrame);
        setName(gameFrame);
    }*/

    /*public static void setButton(GameFrame gameFrame){
        if(gameFrame.boom1button.isEnabled()){
            gameFrame.setButtonState(false, gameFrame.boom1button);
            gameFrame.setButtonState(true, gameFrame.boom2button);
        }else if(gameFrame.boom2button.isEnabled()){
            gameFrame.setButtonState(true, gameFrame.boom1button);
            gameFrame.setButtonState(false, gameFrame.boom2button);
        }
    }*/

    /*public static void setImage(GameFrame gameFrame){
        gameFrame.renderImageRight();
        gameFrame.renderImageLeft();
    }*/
    /*public static void setImage(GameFrame gameFrame){
        gameFrame.renderImageRight();
        gameFrame.renderImageLeft();
    }*/

    /*public static String setName3 (){

        return T1P2;
    }*/

    /*public static String setName3 (String playername[][]){

        return playername[1][1];
    }*/

            /*gameFrame.changeName1();
        gameFrame.changeName2();*/
    /*public static void gameEnd(GameFrame gameFrame){
        gameFrame.setButtonState(false, gameFrame.boom1button);
        gameFrame.setButtonState(false, gameFrame.boom2button);
    }*/

    /*public static void storeData(){

    }

    public static void setRoundCount(GameFrame gameFrame, Number roundCount){
        gameFrame.roundCountLabel.setText(String.valueOf(roundCount));
    }*/

    /*public static void displayTable(GameFrame gameFrame){
        gameFrame.setTable();
    }*/

}

