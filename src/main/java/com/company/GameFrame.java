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
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.io.IOException;
import java.io.File;  // Import the File class
import java.util.Scanner; // Import the Scanner class to read text files
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Vector;
import javax.swing.border.LineBorder;
import java.awt.Component;

public class GameFrame extends FinalFrame {

    //variable initialization
    int roundNumLeft = -1, roundNumRight = -1;
    int roundNum = 0;

    String imageName = "assets/rock.png"; //default image
    int imageNo = 0;

    int team1 = 0, team2 = 0; //The image number of player from team 1 and team 2
    int point = 0; //Point awarded
    int pointT1 = 0, pointT2 = 0; //Point of team 1 and team 2 from Each Round
    int totalPointT1 = 0, totalPointT2 = 0; //Total point of team 1 and team 2 from Each Game
    int totalPointT1P1 = 0; //Total point of team 1 player 1
    int totalPointT2P1 = 0; //Total point of team 2 player 1
    int totalPointT1P2 = 0; //Total point of team 1 player 2
    int totalPointT2P2 = 0; //Total point of team 2 player 2

    int pointT1P1[] = new int[3]; //Array to store the point of team 1 player 1 of every round
    int pointT2P1[] = new int[3]; //Array to store the point of team 2 player 1 of every round
    int pointT1P2[] = new int[3]; //Array to store the point of team 1 player 2 of every round
    int pointT2P2[] = new int[3]; //Array to store the point of team 2 player 2 of every round

    int visibleRowCount = 2; //Visible row count of table
    int gameRoundNum = 0;    //The number of game after 3 round end

    Color background;

    //initalizing JComponenets
    JFrame f3 = new JFrame("Java Assignment");

    JPanel firstpanel = new JPanel();
    JPanel secondpanel = new JPanel();
    JPanel thirdpanel = new JPanel();
    JPanel thirdeastpanel = new JPanel();
    JPanel thirdwestpanel = new JPanel();
    JPanel forthpanel = new JPanel();
    JPanel fortheastpanel = new JPanel();
    JPanel forthwestpanel = new JPanel();
    JPanel wrapperpanel = new JPanel();
    JPanel tablepanel = new JPanel();
    JPanel dialogpanel = new JPanel();

    JLabel upperlabel = new JLabel(); //Label of displaying title
    JLabel roundCountLabel = new JLabel(); //Label of display number of round

    JLabel name1Label = new JLabel(); //Label of Team 1 Player 1
    JLabel name2Label = new JLabel(); //Label of Team 2 Player 1
    JLabel name3Label = new JLabel(); //Label of Team 1 Player 2
    JLabel name4Label = new JLabel(); //Label of Team 2 Player 2

    JLabel icon1Label = new JLabel(); //Label of rock, paper.... image (left side)
    JLabel icon2Label = new JLabel(); //Label of rock, paper.... image (left side)

    JDialog dl = new JDialog(f3, "Scoreboard");
    JLabel winnerLabel = new JLabel();  //Show winning team
    JButton nextButton = new JButton("Next Player");
    JButton viewResultButton = new JButton("View Result");

    JButton boom1button = new JButton("BOOM!");
    JButton boom2button = new JButton("BOOM!");

    JTable resultstable = new JTable(2, 5);
    String[] resultshead = {"Player 1", "Round 1", "Round 2", "Round 3", "Total"};
    String[][] resultscolumn = {{"Team 1: "}, {"Team 2: "}};
    JScrollPane jsp = new JScrollPane(resultstable);
    DefaultTableModel headmodel = new DefaultTableModel(resultscolumn, resultshead);

    //Gameframe constructor
    GameFrame() {

/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));//PANEL LAYOUT FOR LABEL
        f3.add(firstpanel, BorderLayout.NORTH);//panel position
        firstpanel.setBackground(new Color(253, 105, 0));//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000, 60));//FIRST PANEL SIZE

        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Verdana", Font.PLAIN, 18));//font of text
        upperlabel.setBackground(new Color(253, 105, 0));//text background color

        firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
        upperlabel.setOpaque(true);// MAKE LABEL VISIBLE

///////////////// SECOND PANEL BELOW////////////////////////////

        secondpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        f3.add(secondpanel, BorderLayout.BEFORE_LINE_BEGINS);
        secondpanel.setPreferredSize(new Dimension(1000, 200));

        roundCountLabel.setBorder((BorderFactory.createEmptyBorder(35, 10, 10, 10)));
        roundCountLabel.setFont(new Font("Verdana", Font.PLAIN, 22));
        roundCountLabel.setText("Round 1");

        secondpanel.add(roundCountLabel, BorderLayout.CENTER);
        roundCountLabel.setOpaque(true);

//////////////// WRAPPER PANEL BELOW //////////////////////////

        wrapperpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        f3.add(wrapperpanel, BorderLayout.SOUTH);
        wrapperpanel.setPreferredSize(new Dimension(1000, 500));
        wrapperpanel.add(thirdpanel, BorderLayout.EAST);
        wrapperpanel.add(forthpanel, BorderLayout.WEST);

//////////////// THIRD PANEL BELOW //////////////////////////

        thirdpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 100, 0)));
        thirdpanel.setPreferredSize(new Dimension(450, 250));

        thirdpanel.add(thirdeastpanel, BorderLayout.EAST);
        thirdpanel.add(thirdwestpanel, BorderLayout.WEST);

//////////////// THIRD EAST PANEL BELOW //////////////////////////

        thirdeastpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        thirdeastpanel.setPreferredSize(new Dimension(100, 200));

        name1Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
        name1Label.setFont(new Font("Verdana", Font.PLAIN, 22));
        name1Label.setOpaque(true);
        name1Label.setVerticalAlignment(JLabel.CENTER);

        boom1button.setPreferredSize(new Dimension(100, 30));
        boom1button.setFont(new Font("Verdana", Font.BOLD, 12));
        boom1button.setVerticalAlignment(JLabel.CENTER);

        thirdeastpanel.add(name1Label, BorderLayout.CENTER);
        thirdeastpanel.add(boom1button, BorderLayout.CENTER);

//////////////// THIRD WEST PANEL BELOW /////////////////////////

        thirdwestpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        thirdwestpanel.setPreferredSize(new Dimension(160, 160));
        thirdwestpanel.setBackground(Color.BLACK);

        icon1Label.setText("");
        icon1Label.setOpaque(true);
        icon1Label.setSize(150, 150);
        renderImageLeft(imageName);

//////////////// FORTH PANEL BELOW //////////////////////////

        forthpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 100, 0)));
        forthpanel.setPreferredSize(new Dimension(450, 250));

        forthpanel.add(fortheastpanel, BorderLayout.EAST);
        forthpanel.add(forthwestpanel, BorderLayout.WEST);

//////////////// FORTH EAST PANEL BELOW /////////////////////////

        fortheastpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        fortheastpanel.setPreferredSize(new Dimension(160, 160));
        fortheastpanel.setBackground(Color.BLACK);

        icon2Label.setText("");
        icon2Label.setOpaque(true);
        icon2Label.setSize(150, 150);
        renderImageRight(imageName);

//////////////// FORTH WEST PANEL BELOW /////////////////////////

        forthwestpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        forthwestpanel.setPreferredSize(new Dimension(100, 200));

        name2Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
        name2Label.setFont(new Font("Verdana", Font.PLAIN, 22));
        name2Label.setOpaque(true);
        name2Label.setVerticalAlignment(JLabel.CENTER);

        boom2button.setPreferredSize(new Dimension(100, 30));
        boom2button.setFont(new Font("Verdana", Font.BOLD, 12));
        boom2button.setVerticalAlignment(JLabel.CENTER);

        forthwestpanel.add(name2Label, BorderLayout.CENTER);
        forthwestpanel.add(boom2button, BorderLayout.CENTER);

//////////////// SCORE TABLE PANEL BELOW /////////////////////////

        wrapperpanel.add(tablepanel, BorderLayout.SOUTH);

        tablepanel.setSize(950,160);
        tablepanel.setPreferredSize(new Dimension(960,165));

        resultstable.setFillsViewportHeight(true);
        resultstable.setRowHeight(50);
        resultstable.setPreferredScrollableViewportSize(new Dimension(940, visibleRowCount * resultstable.getRowHeight()));
        resultstable.setBorder(BorderFactory.createMatteBorder(0, 5, 5, 5, Color.BLACK));
        resultstable.setOpaque (false); //set false for non-transparent

        //Properties of the header of table
        resultstable.getTableHeader().setBorder(BorderFactory.createMatteBorder(5, 5, 0, 5, Color.BLACK));
        resultstable.getTableHeader().setBackground(Color.white);
        resultstable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 19));
        resultstable.getTableHeader().setResizingAllowed(true);
        resultstable.getTableHeader().setPreferredSize(new Dimension(949, 55));

        //Table model
        headmodel.setColumnIdentifiers(resultshead); //create table model and set column identifiers
        resultstable.setModel(headmodel); //set the model to the table
        resultstable.setFont(new Font("Verdana", Font.PLAIN, 19));

        tablepanel.add(resultstable.getTableHeader(), BorderLayout.SOUTH);
        tablepanel.add(jsp);

        //Table Cell Renderer
        DefaultTableCellRenderer centerer = new DefaultTableCellRenderer();
        centerer.setHorizontalAlignment(JLabel.CENTER);
        resultstable.getColumnModel().getColumn(0).setPreferredWidth(380);
        resultstable.getColumnModel().getColumn(0).setCellRenderer(centerer);
        resultstable.getColumnModel().getColumn(1).setPreferredWidth(120);
        resultstable.getColumnModel().getColumn(1).setCellRenderer(centerer);
        resultstable.getColumnModel().getColumn(2).setPreferredWidth(120);
        resultstable.getColumnModel().getColumn(2).setCellRenderer(centerer);
        resultstable.getColumnModel().getColumn(3).setPreferredWidth(120);
        resultstable.getColumnModel().getColumn(3).setCellRenderer(centerer);
        resultstable.getColumnModel().getColumn(4).setPreferredWidth(120);
        resultstable.getColumnModel().getColumn(4).setCellRenderer(centerer);

    }

    //function to set every panels, label , frames's background color to match the chosen color by user
    public void setBackgrounds(Color background) {

        f3.setBackground(background);
        wrapperpanel.setBackground(background);
        thirdpanel.setBackground(background);
        forthpanel.setBackground(background);
        secondpanel.setBackground(background);
        roundCountLabel.setBackground(background);
        thirdeastpanel.setBackground(background);
        forthwestpanel.setBackground(background);
        tablepanel.setBackground(background);
        name1Label.setBackground(background);
        name2Label.setBackground(background);
        name3Label.setBackground(background);
        name4Label.setBackground(background);

        this.background = background;

        System.out.println("GameFrame Background: "+this.background); //Test output
    }

    //function of handling the action listener when button is pressed, some actionlistener is implemented on Main.java
    public void boomAction(ActionEvent boom)
    {
        //If user clicked boom1button
        if(boom.getSource() == boom1button)
        {
            //If the 3 round of game haven't end, another boom button will be disabled
            if(roundNumLeft<2)
            {
                boom1button.setEnabled(false);
                boom2button.setEnabled(true);
                team1 = randomizeImageNo();      //Randomize image number for team 1
                imageName = setImageName(team1); //Set image name based on image number
                renderImageLeft(imageName);      //Display left image
            }
            else if(roundNumLeft>=1) //Button disabled when game round finished
            {
                boom1button.setEnabled(false);
            }
            roundNumLeft++;
            System.out.println("Left Round No: "+roundNumLeft); //Test output
        }
        else if(boom.getSource() == boom2button)
        {
            if(roundNumRight<2)
            {
                boom2button.setEnabled(false);
                boom1button.setEnabled(true);
                team2 = randomizeImageNo();
                imageName = setImageName(team2);
                renderImageRight(imageName);
            }
            else if(roundNumRight>=1)
            {
                boom2button.setEnabled(false);
            }
            roundNumRight++;
            System.out.println("Right Round No: "+roundNumRight); //Test output
        }

        //If both buttons were clicked
        if(roundNumLeft == roundNumRight)
        {
            pointT1 = setPoint(team1, team2);     //Compare image number to determine who get the point awarded
            pointT2 = setPoint(team2, team1);
            System.out.println("Point Team1: "+pointT1);  //Test output
            System.out.println("Point Team2: "+pointT2);  //Test output

            //If it is not a tie
            if(pointT1!=pointT2)
            {
                //First game
                if(gameRoundNum == 0)
                {
                    pointT1P1[roundNum] = pointT1; //Store the point of every round into the array
                    pointT2P1[roundNum] = pointT2;

                    System.out.println("T1P1 saved point:  " + pointT1P1[roundNum]); //Test output
                    System.out.println("T2P1 saved point:  " + pointT2P1[roundNum]); //Test output
                }
                //Second game
                else if(gameRoundNum == 1)
                {
                    pointT1P2[roundNum] = pointT1;
                    pointT2P2[roundNum] = pointT2;

                    System.out.println("T1P2 saved point:  " + pointT1P2[roundNum]); //Test output
                    System.out.println("T2P2 saved point:  " + pointT2P2[roundNum]); //Test output
                }

                //If both buttons were clicked, set the point into the table
                if (roundNumLeft == 0 && roundNumRight == 0)
                {
                    headmodel.setValueAt(pointT1, 0, 1);
                    headmodel.setValueAt(pointT2, 1, 1);
                }
                else if (roundNumLeft == 1 && roundNumRight == 1)
                {

                    headmodel.setValueAt(pointT1, 0, 2);
                    headmodel.setValueAt(pointT2, 1, 2);
                }
                else if (roundNumLeft == 2 && roundNumRight == 2)
                {
                    headmodel.setValueAt(pointT1, 0, 3);
                    headmodel.setValueAt(pointT2, 1, 3);
                }

                //Calculate total point
                totalPointT1 += pointT1;
                totalPointT2 += pointT2;

                System.out.println("Total team1 point: "+totalPointT1);  //Test output
                System.out.println("Total team2 point: "+totalPointT2);  //Test output

                headmodel.setValueAt(totalPointT1, 0, 4);  //Set total point on table
                headmodel.setValueAt(totalPointT2, 1, 4);

                roundNum++;

            }
            //If it is a tie
            else if(pointT1 == pointT2)
            {
                //Decrement to stay on the same round
                roundNumLeft--;
                roundNumRight--;
            }
        }

        //If within round 3
        if(roundNum<4)
        {
            //First game
            if(gameRoundNum == 0)
            {
                totalPointT1P1 = totalPointT1; //Assign total point for each player
                totalPointT2P1 = totalPointT2;

                System.out.println("Total Point T1P1:  "+totalPointT1P1); //Test output
                System.out.println("Total Point T1P1:  "+totalPointT2P1); //Test output
            }
            //Second game
            else if(gameRoundNum == 1)
            {
                totalPointT1P2 = totalPointT1;
                totalPointT2P2 = totalPointT2;

                System.out.println("Total Point T1P1:  "+totalPointT1P2); //Test output
                System.out.println("Total Point T1P1:  "+totalPointT2P2); //Test output
            }

            if(roundNum<3)
            {
                //Set round label for every round
                roundCountLabel.setText("Round " + (int) (roundNum + 1));
            }
            else if(roundNum==4)
            {
                //After clicked the third times of button, remain the round label
                roundCountLabel.setText("Round " + roundNum);
            }
        }

        //End game
        if(roundNum==3)
        {
            //Disable all buttons
            boom1button.setEnabled(false);
            boom2button.setEnabled(false);

            //Add JDialog
            dl.add(dialogpanel);
            dialogpanel.setLayout(new BorderLayout());
            dialogpanel.add(winnerLabel, BorderLayout.CENTER); //Add to show winning team

            dl.setSize(250,200);
            dl.setLocationRelativeTo(f3);   //Set on middle of frame
            dl.setVisible(true);

            winnerLabel.setFont(new Font("Verdana", Font.PLAIN, 18));
            winnerLabel.setOpaque(true);

            //Determine the output in JDialog
            if(gameRoundNum == 0)
            {
                //Compare point and display winning team
                if(totalPointT1P1>totalPointT2P1)
                {
                    winnerLabel.setText("The Winner is Team 1!");
                }
                else if(totalPointT1P1<totalPointT2P1)
                {
                    winnerLabel.setText("The Winner is Team 2!");
                }

                //Add next button on the panel of dialog
                dialogpanel.add(nextButton, BorderLayout.SOUTH);
                nextButton.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));
                nextButton.addActionListener(this::nextAction);
            }

            if(gameRoundNum == 1)
            {
                if(totalPointT1P2>totalPointT2P2)
                {
                    winnerLabel.setText("The Winner is Team 1!");
                }
                else if(totalPointT1P2<totalPointT2P2)
                {
                    winnerLabel.setText("The Winner is Team 2!");
                }

                //Remove next button
                dialogpanel.remove(nextButton);

                //View result button
                dialogpanel.add(viewResultButton, BorderLayout.SOUTH);
                viewResultButton.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));
                viewResultButton.addActionListener(this::actionPerformed);
            }
        }
    }

    public void nextAction(ActionEvent next)
    {
        //If clicked next button
        if(next.getSource() == nextButton)
        {
            if(gameRoundNum == 0)
            {
                dl.dispose();  //Close the JDialog
                f3.dispose();  //Close the frame 3

                thirdeastpanel.remove(name1Label);  //Remove name1
                thirdeastpanel.remove(boom1button); //Remove boom1button

                forthwestpanel.remove(name2Label);  //Remove name2
                forthwestpanel.remove(boom2button); //Remove boom2button
                f3.setVisible(true);

                gameRoundNum++;
                System.out.println("Game Round Num: "+gameRoundNum); //Test output

                setName(); //Set the player name of second game

                //Reset the variable value for game 2
                roundNumLeft = -1;
                roundNumRight = -1;
                roundNum = 0;
                roundCountLabel.setText("Round " + (int)(roundNum+1));

                imageNo = 0;
                team1 = 0;
                team2 = 0;
                point = 0;
                pointT1 = 0;
                pointT2 = 0;
                totalPointT1 = 0;
                totalPointT2 = 0;
                totalPointT1P2 = 0;
                totalPointT2P2 = 0;

                imageName = "assets/rock.png"; //Set default image
                renderImageLeft(imageName);    //Set both images to default
                renderImageRight(imageName);

                //Set second game table for player 2
                resultstable.getTableHeader().getColumnModel().getColumn(0).setHeaderValue("Player 2");

                //Reset all value in table
                headmodel.setValueAt("", 0, 1);
                headmodel.setValueAt("", 1, 1);
                headmodel.setValueAt("", 0, 2);
                headmodel.setValueAt("", 1, 2);
                headmodel.setValueAt("", 0, 3);
                headmodel.setValueAt("", 1, 3);
                headmodel.setValueAt("", 0, 4);
                headmodel.setValueAt("", 1, 4);

                //Reset boom button state
                boom1button.setEnabled(true);
                boom2button.setEnabled(true);

                //Call specific button
                if(next.getSource() == boom1button)
                {
                    boom1button.addActionListener(this::boomAction);
                }
                else  if(next.getSource() == boom2button)
                {
                    boom2button.addActionListener(this::boomAction);
                }
            }
        }
    }

    //function of randomizing images when boom button is clicked
    public int randomizeImageNo() {

        double max = 5, min = 1;
        imageNo = 0;

        imageNo = (int) ((Math.random() * ((max - min) + 1)) + min);

        return imageNo;
    }

    //function of setting the image path according to what number is randomized on previous function
    public String setImageName(int imageNo)
    {
        System.out.println("\nImage: "+imageNo); //Test output

        //1 - Rock
        //2 - Paper
        //3 - Scissors
        //4 - Lizard
        //5 - Spock
        switch(imageNo)
        {
            case 1: imageName = "assets/rock.png"; break;
            case 2: imageName = "assets/paper.png"; break;
            case 3: imageName = "assets/scissors.png"; break;
            case 4: imageName = "assets/lizard.png"; break;
            case 5: imageName = "assets/spock.png"; break;
            default: System.out.println("Failed to display image."); break;
        }
        return imageName;
    }

    //function to render the image for left section, also resize the image to fit with the label
    public void renderImageLeft(String imageName){

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imageName)); //Read image name
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image resImage = img.getScaledInstance(icon1Label.getWidth(), icon1Label.getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon player1 = new ImageIcon(resImage);

        icon1Label.setIcon(player1);
        icon1Label.setBackground(Color.decode("#589595"));  //Set background for image

        thirdwestpanel.add(icon1Label, BorderLayout.CENTER);

    }

    //function to render the image for left section, also resize the image to fit with the label
    public void renderImageRight(String imageName) {

        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image resImage1 = img1.getScaledInstance(icon2Label.getWidth(), icon2Label.getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon player2 = new ImageIcon(resImage1);

        icon2Label.setIcon(player2);
        icon2Label.setBackground(Color.decode("#589595"));

        fortheastpanel.add(icon2Label, BorderLayout.CENTER);

    }

    //Compare the image number and return the point
    public int setPoint(int p1, int p2)
    {
        point = 0;

        //If the image number is different, it is able to compare
        if(p1!=p2)
        {
            switch(p1)
            {
                case 1: if(p2 == 3 || p2 == 4){ point += 1; } break;
                case 2: if(p2 == 1 || p2 == 5){ point += 1; } break;
                case 3: if(p2 == 2 || p2 == 4){ point += 1; } break;
                case 4: if(p2 == 2 || p2 == 5){ point += 1; } break;
                case 5: if(p2 == 1 || p2 == 3){ point += 1; } break;
                default: point = 0; break;
            }
        }
        //If the image number is same, then it is a tie
        else if(p1==p2)
        {
            point = 0;
        }
        return point;
    }

    //Action Listener of view result button which pass the table value to FinalFrame
    public void actionPerformed(ActionEvent openFrame) {

        f3.setVisible(false); //Hide this frame

        //Pass table value and background
        setP1Result(totalPointT1P1, totalPointT2P1, pointT1P1, pointT2P1, totalPointT1P2, totalPointT2P2, pointT1P2, pointT2P2, this.background);
    }

    //function to set all the names user typed in
    public void setName(){

        System.out.println("\nGame Round Number: "+gameRoundNum); //Test output
        int counter = 0;

        try {
            File myObj = new File("temp.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println("Name: "+data); //Test output

                if(gameRoundNum==0) {
                    if (counter == 0) {

                        //Set name for team 1 player 1
                        name1Label.setText(data);
                    }

                    if (counter == 1) {

                        //Set name for team 2 player 1
                        name2Label.setText(data);
                    }
                }
                else if(gameRoundNum==1)
                {
                    if(counter == 2){

                        //Set name for team 1 player 2
                        name3Label.setText( data );
                        name3Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
                        name3Label.setFont(new Font("Verdana", Font.PLAIN, 22));
                        name3Label.setOpaque(true);
                        name3Label.setVerticalAlignment(JLabel.CENTER);
                        thirdeastpanel.add(name3Label, BorderLayout.NORTH);
                        headmodel.setValueAt( "Team 1: " +  data , 0, 0);
                        thirdeastpanel.add(boom1button, BorderLayout.CENTER);
                    }

                    if(counter == 3){

                        //Set name for team 2 player 2
                        name4Label.setText( data );
                        name4Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
                        name4Label.setFont(new Font("Verdana", Font.PLAIN, 22));
                        name4Label.setOpaque(true);
                        name4Label.setVerticalAlignment(JLabel.CENTER);
                        forthwestpanel.add(name4Label, BorderLayout.NORTH);
                        headmodel.setValueAt( "Team 2: " + data , 1, 0);
                        forthwestpanel.add(boom2button, BorderLayout.CENTER);
                    }
                }

                counter++;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
