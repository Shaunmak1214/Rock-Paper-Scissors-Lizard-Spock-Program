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
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.io.IOException;
import java.io.File;
import java.util.Vector;
import javax.swing.border.LineBorder;

public class GameFrame extends SecondFrame {

    int roundNumLeft = -1, roundNumRight = -1;
    int roundNum = 1;
    String imageName = "assets/rock.png"; //default image
    int imageNo = 0;
    int player1 = 0, player2 = 0;
    int point = 0;
    int pointP1 = 0, pointP2 = 0;
    int totalPointP1 = 0, totalPointP2 = 0;
    int pointPlayer1[] = new int[3];
    int pointPlayer2[] = new int[3];
    int visibleRowCount = 2;

    JFrame f3 = new JFrame();

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

    JLabel upperlabel = new JLabel();
    JLabel roundCountLabel = new JLabel();
    JLabel name1Label = new JLabel();
    JLabel name2Label = new JLabel();
    JLabel icon1Label = new JLabel();
    JLabel icon2Label = new JLabel();
    //JLabel team1label = new JLabel();
    //JLabel team2label = new JLabel();

    JDialog dl = new JDialog(f3, "Scoreboard");
    JLabel winnerLabel = new JLabel("The Winner is");
    JButton nextButton = new JButton("Next");

    JButton boom1button = new JButton("BOOM!");
    JButton boom2button = new JButton("BOOM!");

/*    String testnama[][] ={
            {"Player 1", "Round 1", "Round 2", "Round 3", "Total"},
            {"Team 1 : SINYIN"},
            {"Team 2 : POHKANG"}
    };*/

    JTable resultstable = new JTable(2, 5);
    String[] resultshead = {"Player 1", "Round 1", "Round 2", "Round 3", "Total"};
    String[][] resultscolumn = {{"Team 1: "}, {"Team 2: "}};



    JScrollPane jsp = new JScrollPane(resultstable);

    //Object[] rowPoint1 = new Object[4];
    //Object[] rowPoint2 = new Object[4];

    DefaultTableModel headmodel = new DefaultTableModel(resultscolumn, resultshead);

    //ImageIcon player1 = new ImageIcon("assets/paper.png");

    GameFrame() {
/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));//PANEL LAYOUT FOR LABEL

        f3.add(firstpanel, BorderLayout.NORTH);//panel position
        firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000, 60));//FIRST PANEL SIZE
        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Verdana", Font.PLAIN, 18));//font of text
        upperlabel.setBackground(Color.ORANGE);//text background color

        firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
        upperlabel.setOpaque(true);// MAKE LABEL VISIBLE

///////////////// SECOND PANEL BELOW////////////////////////////

        secondpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 100, 0)));
        f3.add(secondpanel, BorderLayout.BEFORE_LINE_BEGINS);
        secondpanel.setPreferredSize(new Dimension(1000, 250));
        //secondpanel.setBackground(Color.GRAY);

        roundCountLabel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        roundCountLabel.setFont(new Font("Verdana", Font.PLAIN, 22));

        roundCountLabel.setText("Round "+roundNum);

        secondpanel.add(roundCountLabel, BorderLayout.CENTER);
        roundCountLabel.setOpaque(true);

//////////////// WRAPPER PANEL BELOW //////////////////////////

        wrapperpanel.setBorder((BorderFactory.createEmptyBorder(60, 0, 0, 0)));
        f3.add(wrapperpanel, BorderLayout.SOUTH);
        wrapperpanel.setPreferredSize(new Dimension(1000, 550));
        wrapperpanel.add(thirdpanel, BorderLayout.EAST);
        wrapperpanel.add(forthpanel, BorderLayout.WEST);

//////////////// THIRD PANEL BELOW //////////////////////////

        thirdpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 100, 0)));
        thirdpanel.setPreferredSize(new Dimension(450, 250));
        //thirdpanel.setBackground(Color.ORANGE);

        thirdpanel.add(thirdeastpanel, BorderLayout.EAST);
        thirdpanel.add(thirdwestpanel, BorderLayout.WEST);

//////////////// THIRD EAST PANEL BELOW //////////////////////////

        thirdeastpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 0, 0)));
        thirdeastpanel.setPreferredSize(new Dimension(100, 200));
        //thirdeastpanel.setBackground(Color.ORANGE);
        //thirdeastpanel.setAlignmentY();

        name1Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
        name1Label.setFont(new Font("Verdana", Font.PLAIN, 22));

        name1Label.setText(team1player1.getText());
        name1Label.setOpaque(true);
        name1Label.setVerticalAlignment(JLabel.CENTER);
        //name1Label.setBackground(Color.ORANGE);

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
        //forthpanel.setBackground(Color.RED);

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
        //forthwestpanel.setBackground(Color.ORANGE);

        name2Label.setBorder((BorderFactory.createEmptyBorder(70, 0, 0, 0)));
        name2Label.setFont(new Font("Verdana", Font.PLAIN, 22));
        name2Label.setText(team1player2.getText());
        name2Label.setOpaque(true);
        name2Label.setVerticalAlignment(JLabel.CENTER);
        //name2Label.setBackground(Color.ORANGE);

        boom2button.setPreferredSize(new Dimension(100, 30));
        boom2button.setFont(new Font("Verdana", Font.BOLD, 12));
        boom2button.setVerticalAlignment(JLabel.CENTER);

        forthwestpanel.add(name2Label, BorderLayout.CENTER);
        forthwestpanel.add(boom2button, BorderLayout.CENTER);

        //boom1button.addActionListener(this::boom1Action);
        //boom2button.addActionListener(this::boom2Action);

//////////////// SCORE TABLE PANEL BELOW /////////////////////////

        wrapperpanel.add(tablepanel, BorderLayout.SOUTH);
        //tablepanel.add(resultstable.getTableHeader(), BorderLayout.PAGE_START);
        //tablepanel.setBorder(new LineBorder(Color.black, 5));
        tablepanel.setSize(949,160);
        tablepanel.setPreferredSize(new Dimension(960,165));
        resultstable.setFillsViewportHeight(true);
        resultstable.setRowHeight(50);
        resultstable.setPreferredScrollableViewportSize(new Dimension(940, visibleRowCount * resultstable.getRowHeight()));
        //tablepanel.setSize(970,154);
        //resultstable.setBounds(0, 0, 970, 154);

        //resultstable.setSize(960,154);
        //tablepanel.setSize(970,154);
        //resultstable.setPreferredSize(tablepanel.getPreferredSize());
        //resultstable.setPreferredSize(new Dimension(0,0));
        resultstable.getTableHeader().setBorder(BorderFactory.createMatteBorder(5, 5, 0, 5, Color.BLACK));
        resultstable.setBorder(BorderFactory.createMatteBorder(0, 5, 5, 5, Color.BLACK));
        resultstable.setOpaque (false); //set false for non-transparent

        resultstable.getTableHeader().setBackground(Color.white);
        resultstable.getTableHeader().setFont(new Font("Verdana", Font.PLAIN, 19));
        resultstable.getTableHeader().setResizingAllowed(true);
        resultstable.getTableHeader().setPreferredSize(new Dimension(949, 55));
        //resultstable.getTableHeader().setSize(960,154);

        headmodel.setColumnIdentifiers(resultshead); //create table model and set column identifiers
        resultstable.setModel(headmodel); //set the model to the table
        //resultstable.setBackground(Color.LIGHT_GRAY);
        //resultstable.setForeground(Color.black);
        //Font font = new Font("",1,30);
        resultstable.setFont(new Font("Verdana", Font.PLAIN, 19));
        //resultstable.setFont(font);


        //pane.setBounds(0, 0, 880, 200);

        //jsp.setPreferredSize(new Dimension(951,150));
        //resultstable.setAutoResizeMode(300);



        tablepanel.add(resultstable.getTableHeader(), BorderLayout.SOUTH);
        //tablepanel.setLayout(null);

        tablepanel.add(jsp);
        //jsp.setBorder(BorderFactory.createMatteBorder(0, 0, 50, 0, Color.BLACK));

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


        //f3.getContentPane();

        //f3.pack();

        /*tablepanel.add(resultstable, BorderLayout.CENTER);
        resultstable.setRowHeight(50);


        ///// Results Table /////
        resultstable.setFont(new Font("Verdana", Font.PLAIN, 19));
        resultstable.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.BLACK));




        //wrapperpanel.add(resultstable, BorderLayout.SOUTH);
        //tablepanel.add(resultstable.getTableHeader(), BorderLayout.NORTH);

        tablepanel.add(new JScrollPane(resultstable));
        resultstable.setFont(new Font("Verdana",Font.PLAIN,16));*/

//////////////// SCORE DIALOG BELOW /////////////////////////


    }

    /*public void changeName1(){

        name1Label.setText(team1player2.getText());

    }

    public void changeName2(){

        name2Label.setText(team2player2.getText());

    }*/

    public void setBackgrounds(Color backgrounds) {

        f2.setBackground(backgrounds);
        wrapperpanel.setBackground(backgrounds);
        thirdpanel.setBackground(backgrounds);
        forthpanel.setBackground(backgrounds);

        System.out.println(backgrounds);
    }

    public void boomAction(ActionEvent boom)
    {
        if(boom.getSource() == boom1button)
        {
            if(roundNumLeft<2)
            {
                boom1button.setEnabled(false);
                boom2button.setEnabled(true);
                player1 = randomizeImageNo();
                imageName = setImageName(player1);
                renderImageLeft(imageName);
                //gameFrame.storeHandsignLeft();
            }
            else if(roundNumLeft>=1)
            {
                boom1button.setEnabled(false);
            }
            roundNumLeft++;
            System.out.println("Round: "+roundNumLeft);
        }
        else if(boom.getSource() == boom2button)
        {
            if(roundNumRight<2)
            {
                boom2button.setEnabled(false);
                boom1button.setEnabled(true);
                player2 = randomizeImageNo();
                imageName = setImageName(player2);
                renderImageRight(imageName);
                //gameFrame.storeHandsignRight();
            }
            else if(roundNumRight>=1)
            {
                boom2button.setEnabled(false);
            }
            roundNumRight++;
            System.out.println("Round: "+roundNumRight);
        }

        if(roundNumLeft == roundNumRight)
        {
            roundNum++;

            if(roundNum<4)
            {
                roundCountLabel.setText("Round " + roundNum);
            }

            pointP1 = setPoint(player1, player2);
            pointP2 = setPoint(player2, player1);
            System.out.println("point"+pointP1);
            System.out.println("point"+pointP2);

            if(pointP1!=pointP2)
            {
                pointPlayer1[roundNumLeft] = pointP1;
                System.out.println("saved point " + pointPlayer1[roundNumLeft]);
                pointPlayer2[roundNumRight] = pointP2;
                System.out.println("saved point " + pointPlayer2[roundNumRight]);

                if (roundNumLeft == 0 && roundNumRight == 0)
                {
                    //rowPoint1[0] = pointPlayer1[0];
                    //rowPoint2[0] = pointPlayer2[0];
                    headmodel.setValueAt(pointP1, 0, 1);
                    headmodel.setValueAt(pointP2, 1, 1);
                    //headmodel.addRow(rowPoint2);
                }
                else if (roundNumLeft == 1 && roundNumRight == 1)
                {
                    /*rowPoint1[1] = pointPlayer1[1];
                    rowPoint2[1] = pointPlayer2[1];
                    headmodel.addRow(rowPoint1);
                    headmodel.addRow(rowPoint2);*/
                    headmodel.setValueAt(pointP1, 0, 2);
                    headmodel.setValueAt(pointP2, 1, 2);
                }
                else if (roundNumLeft == 2 && roundNumRight == 2)
                {
                    /*rowPoint1[2] = pointPlayer1[2];
                    rowPoint2[2] = pointPlayer2[2];
                    headmodel.addRow(rowPoint1);
                    headmodel.addRow(rowPoint2);*/
                    headmodel.setValueAt(pointP1, 0, 3);
                    headmodel.setValueAt(pointP2, 1, 3);
                }

                totalPointP1 += pointP1;
                totalPointP2 += pointP2;
                System.out.println(totalPointP1);
                System.out.println(totalPointP2);
                /*rowPoint1[3] = pointPlayer1[3];
                rowPoint2[3] = pointPlayer2[3];
                headmodel.addRow(rowPoint1);
                headmodel.addRow(rowPoint2);*/
                headmodel.setValueAt(totalPointP1,0, 4);
                headmodel.setValueAt(totalPointP2,1, 4);
            }
            else if(pointP1 == pointP2)
            {
                roundNum--;
                roundNumLeft--;
                roundNumRight--;
            }

        }

        /*if((roundNumLeft == 2 && roundNumRight == 2) && (totalPointP1 == totalPointP2))
        {
            roundNum--;
        }*/

        if(roundNum==4)
        {
            boom1button.setEnabled(false);
            boom2button.setEnabled(false);

            dl.add(winnerLabel);
            dl.setSize(200,200);
            dl.setVisible(true);

        }
        System.out.println("saved point array "+pointPlayer1[0]+pointPlayer1[1]+pointPlayer1[2]);
        System.out.println("saved point array "+pointPlayer2[0]+pointPlayer2[1]+pointPlayer2[2]);
   }

 /*  public void scorerecorder(ActionEvent scoring)
   {
       rowPoint1[0] = pointPlayer1[0];
       rowPoint2[0] = pointPlayer2[0];

       rowPoint1[1] = pointPlayer1[1];
       rowPoint2[1] = pointPlayer2[1];

       rowPoint1[2] = pointPlayer1[2];
       rowPoint2[2] = pointPlayer2[2];

       rowPoint1[3] = totalPointP1;
       rowPoint2[3] = totalPointP2;

       headmodel.addRow(rowPoint1);
       headmodel.addRow(rowPoint2);
   }*/

    /*public void storeHandsign(ActionEvent storeHandsign)
    {
        if (storeHandsign.getSource() == boom1button) {

            this.handsignLeft[roundNumLeft] = imageNo;
            System.out.println("image: "+imageNo);

        } else if (storeHandsign.getSource() == boom2button) {

            this.handsignRight[roundNumRight] = imageNo;
            System.out.println("image: "+imageNo);
        }

        System.out.println("Sign: "+handsignLeft[roundNumLeft]);
        System.out.println("Round: "+roundNumLeft);
        System.out.println("Sign: "+handsignRight[roundNumRight]);
        System.out.println("Round: "+roundNumRight);
    }*/

    public int randomizeImageNo() {

        double max = 5, min = 1;
        imageNo = 0;

        imageNo = (int) ((Math.random() * ((max - min) + 1)) + min);

        return imageNo;
    }

    public String setImageName(int imageNo)
    {
        System.out.println("\nimage: "+imageNo);
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

    public void renderImageLeft(String imageName){

        //boom1button.addActionListener(this::storeHandsign);
        //String imageName = setImageName(imageNo);

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imageName));
        } catch (IOException e) {
            e.printStackTrace();
        }

        Image resImage = img.getScaledInstance(icon1Label.getWidth(), icon1Label.getHeight(),
                Image.SCALE_SMOOTH);

        ImageIcon player1 = new ImageIcon(resImage);

        icon1Label.setIcon(player1);
        icon1Label.setBackground(Color.decode("#589595"));

        thirdwestpanel.add(icon1Label, BorderLayout.CENTER);

    }

    public void renderImageRight(String imageName) {

        //boom2button.addActionListener(this::storeHandsign);
        //String imageName = setImageName(imageNo);

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

    public int setPoint(int p1, int p2)
    {
        point = 0;

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
        else if(p1==p2)
        {
            point = 0;
        }
        return point;
    }

    /*public void storeHandsignLeft(int imgNo){

        if(roundNumLeft==0)
            handsignLeft[roundNumLeft] = imgNo;
        else if(roundNumLeft==1)
            handsignLeft[roundNumLeft] = imgNo;
        else if(roundNumLeft==2)
            handsignLeft[roundNumLeft] = imgNo;
    }*/

    /*public void storeHandsignRight(int imgNo){

        if(roundNumRight==0)
            handsignRight[roundNumRight] = imgNo;
        else if(roundNumLeft==1)
            handsignRight[roundNumRight] = imgNo;
        else if(roundNumLeft==2)
            handsignRight[roundNumRight] = imgNo;
    }*/

    /*public void setButtonState(boolean buttonState, JButton buttonName){

        buttonName.setEnabled(buttonState);

    }*/

    //////////////// GAME RESULT TABLE BELOW /////////////////////////

    public void setTable(){



        }

}
