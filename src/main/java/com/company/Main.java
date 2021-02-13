package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;

public class Main{

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        SecondFrame frame2 = new SecondFrame();
        GameFrame gameFrame = new GameFrame();

        String[][] playername = new String[2][2];
        FinalFrame finalFrame = new FinalFrame();


        frame.cb.addActionListener(frame::actionPerformed);

        frame.proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String colorSelected = frame.getSelectedColor();

                //System.out.println("Color Selected" + colorSelected );

                frame.f.setVisible(false);//frame 1 visible false
                frame2.f2.setSize(1000,700);
                frame2.f2.setResizable(false);
                switch (colorSelected)
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
                finalFrame.f.setVisible(true);
            }
        });

        gameFrame.boom1button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInit(gameFrame);
            }
        });

        gameFrame.boom2button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                gameInit(gameFrame);
            }
        });

        frame2.button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frame2.team1player1.getText().trim().isEmpty() && frame2.team1player2.getText().trim().isEmpty())
                {
                    frame2.results1.setText("Please enter name for both Player");
                }
                else if(frame2.team1player1.getText().trim().isEmpty())
                {
                    frame2.results1.setText("Please enter name for Player 1");
                }
                else if(frame2.team1player2.getText().trim().isEmpty())
                {
                    frame2.results1.setText("Please enter name for Player 2");
                }
                else
                {



                    frame2.results1.setText("Ready!");

                    if(frame2.results1.getText().equals("Ready!") && frame2.results2.getText().equals("Ready!"))
                    {
                        frame2.f2.setVisible(false);
                        gameFrame.f3.setVisible(true);
                        gameFrame.f3.setSize(1000,700);
                        gameFrame.f3.setResizable(false);

                        playername[0][0] = frame2.team1player1.getText();
                        playername[0][1] = frame2.team1player2.getText();

                        playername[1][0] = frame2.team2player1.getText();
                        playername[1][1] = frame2.team2player2.getText();

                        System.out.println(Arrays.deepToString(playername));//DELETE THIS AFTER FINISH PROJECT
                    }




                }
            }
        });

        frame2.button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(frame2.team2player1.getText().trim().isEmpty() && frame2.team2player2.getText().trim().isEmpty())
                {
                    frame2.results2.setText("Please enter name for both Player");
                }
                else if(frame2.team2player1.getText().trim().isEmpty())
                {
                    frame2.results2.setText("Please enter name for Player 1");
                }
                else if(frame2.team2player2.getText().trim().isEmpty())
                {
                    frame2.results2.setText("Please enter name for Player 2");
                }
                else
                {
                    frame2.results2.setText("Ready!");

                    if(frame2.results1.getText().equals("Ready!") && frame2.results2.getText().equals("Ready!"))
                    {
                        frame2.f2.setVisible(false);
                        gameFrame.f3.setVisible(true);
                        gameFrame.f3.setSize(1000,700);
                        gameFrame.f3.setResizable(false);
                        Color background = frame2.f2.getBackground();
                        gameFrame.setBackgrounds(background);

                        playername[0][0] = frame2.team1player1.getText();
                        playername[0][1] = frame2.team1player2.getText();

                        playername[1][0] = frame2.team2player1.getText();
                        playername[1][1] = frame2.team2player2.getText();

                        System.out.println(Arrays.deepToString(playername)); //DELETE THIS AFTER FINISH PROJECT
                    }
                }
            }
        });
    }

    private static void gameInit(GameFrame gameFrame) {
        setButton(gameFrame);
        setImage(gameFrame, "assets/lizard.png", "assets/scissors.png");
        setName(gameFrame, "makyenwei", "ongsinyin");
    }

    public static void setButton(GameFrame gameFrame){
        if(gameFrame.boom2button.isEnabled()){
            gameFrame.setButtonState(true, gameFrame.boom1button);
            gameFrame.setButtonState(false, gameFrame.boom2button);
        }else{
            gameFrame.setButtonState(false, gameFrame.boom1button);
            gameFrame.setButtonState(true, gameFrame.boom2button);
        }
    }

    public static void setImage(GameFrame gameFrame, String ImageLeftPath, String ImageRightPath){
        gameFrame.renderImageRight(ImageLeftPath);
        gameFrame.renderImageLeft(ImageRightPath);
    }

    public static void setName(GameFrame gameFrame, String name1, String name2){
        gameFrame.changeName1(name1);
        gameFrame.changeName2(name2);
    }

    public static void gameEnd(GameFrame gameFrame){
        gameFrame.setButtonState(false, gameFrame.boom1button);
        gameFrame.setButtonState(false, gameFrame.boom2button);
    }

    public static void storeData(){

    }

    public static void setRoundCount(GameFrame gameFrame, Number roundCount){
        gameFrame.roundCountLabel.setText(String.valueOf(roundCount));
    }

    public static void displayTable(GameFrame gameFrame){
        gameFrame.setTable();
    }

}

