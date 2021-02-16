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
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableCellRenderer;
import java.io.IOException;
import java.io.File;

public class GameFrame extends SecondFrame {

    String team1[][] = {
            {"Player 1", "Round 1", "Round 2", "Round 3", "Total"},
            {"Team 1 : Sheldon", "1", "1", "0", "2"},
            {"Team 2 : Howard", "0", "0", "1", "1"}
    };

    String c[] = {"Player 1", "Round 1", "Round 2", "Round 3", "Total"};

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
    JPanel resultspanel = new JPanel();

    JLabel upperlabel = new JLabel();
    JLabel roundCountLabel = new JLabel();
    JLabel name1Label = new JLabel();
    JLabel name2Label = new JLabel();
    JLabel icon1Label = new JLabel();
    JLabel icon2Label = new JLabel();

    JButton boom1button = new JButton("BOOM!");
    JButton boom2button = new JButton("BOOM!");

    JTable resultstable = new JTable(team1,c);

    JScrollPane jsp = new JScrollPane(resultstable);

    //ImageIcon player1 = new ImageIcon("assets/paper.png");

    GameFrame()
    {
/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL

        f3.add(firstpanel,BorderLayout.NORTH);//panel position
        firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000,60));//FIRST PANEL SIZE
        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Verdana",Font.PLAIN,18));//font of text
        upperlabel.setBackground(Color.ORANGE);//text background color

        firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
        upperlabel.setOpaque(true);// MAKE LABEL VISIBLE

///////////////// SECOND PANEL BELOW////////////////////////////

        secondpanel.setBorder((BorderFactory.createEmptyBorder(0,0,100,0)));
        f3.add(secondpanel, BorderLayout.BEFORE_LINE_BEGINS);
        secondpanel.setPreferredSize(new Dimension(1000,250));
        //secondpanel.setBackground(Color.GRAY);

        roundCountLabel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));
        roundCountLabel.setFont(new Font("Verdana",Font.PLAIN,22));

        roundCountLabel.setText("ROUND 1");

        secondpanel.add(roundCountLabel, BorderLayout.CENTER);
        roundCountLabel.setOpaque(true);

//////////////// WRAPPER PANEL BELOW //////////////////////////

        wrapperpanel.setBorder((BorderFactory.createEmptyBorder(60,0,100,0)));
        f3.add(wrapperpanel,BorderLayout.SOUTH);
        wrapperpanel.setPreferredSize(new Dimension(1000,550));
        wrapperpanel.add(thirdpanel, BorderLayout.EAST);
        wrapperpanel.add(forthpanel, BorderLayout.WEST);

//////////////// THIRD PANEL BELOW //////////////////////////

        thirdpanel.setBorder((BorderFactory.createEmptyBorder(0,0,100,0)));
        thirdpanel.setPreferredSize(new Dimension(450,250));
        //thirdpanel.setBackground(Color.ORANGE);

        thirdpanel.add(thirdeastpanel, BorderLayout.EAST);
        thirdpanel.add(thirdwestpanel, BorderLayout.WEST);

//////////////// THIRD EAST PANEL BELOW //////////////////////////

        thirdeastpanel.setBorder((BorderFactory.createEmptyBorder(0,0,0,0)));
        thirdeastpanel.setPreferredSize(new Dimension(100,200));
        //thirdeastpanel.setBackground(Color.ORANGE);
        //thirdeastpanel.setAlignmentY();

        name1Label.setBorder((BorderFactory.createEmptyBorder(70,0,0,0)));
        name1Label.setFont(new Font("Verdana",Font.PLAIN,22));

        name1Label.setText(team1player1.getText());
        name1Label.setOpaque(true);
        name1Label.setVerticalAlignment(JLabel.CENTER);
        //name1Label.setBackground(Color.ORANGE);

        boom1button.setPreferredSize(new Dimension(100,30));
        boom1button.setFont(new Font("Verdana",Font.BOLD,12));
        boom1button.setVerticalAlignment(JLabel.CENTER);

        thirdeastpanel.add(name1Label, BorderLayout.CENTER);
        thirdeastpanel.add(boom1button, BorderLayout.CENTER);

//////////////// THIRD WEST PANEL BELOW /////////////////////////

        thirdwestpanel.setBorder((BorderFactory.createEmptyBorder(0,0,0,0)));
        thirdwestpanel.setPreferredSize(new Dimension(160,160));
        thirdwestpanel.setBackground(Color.BLACK);

        icon1Label.setText("");
        icon1Label.setOpaque(true);
        icon1Label.setSize(150, 150);

        renderImageLeft();

//////////////// FORTH PANEL BELOW //////////////////////////

        forthpanel.setBorder((BorderFactory.createEmptyBorder(0,0,100,0)));
        forthpanel.setPreferredSize(new Dimension(450,250));
        //forthpanel.setBackground(Color.RED);

        forthpanel.add(fortheastpanel, BorderLayout.EAST);
        forthpanel.add(forthwestpanel, BorderLayout.WEST);

//////////////// FORTH EAST PANEL BELOW /////////////////////////

        fortheastpanel.setBorder((BorderFactory.createEmptyBorder(0,0,0,0)));
        fortheastpanel.setPreferredSize(new Dimension(160,160));
        fortheastpanel.setBackground(Color.BLACK);

        icon2Label.setText("");
        icon2Label.setOpaque(true);
        icon2Label.setSize(150, 150);

        renderImageRight();

//////////////// FORTH WEST PANEL BELOW /////////////////////////

        forthwestpanel.setBorder((BorderFactory.createEmptyBorder(0,0,0,0)));
        forthwestpanel.setPreferredSize(new Dimension(100,200));
        //forthwestpanel.setBackground(Color.ORANGE);

        name2Label.setBorder((BorderFactory.createEmptyBorder(70,0,0,0)));
        name2Label.setFont(new Font("Verdana",Font.PLAIN,22));
        name2Label.setText(team1player2.getText());
        name2Label.setOpaque(true);
        name2Label.setVerticalAlignment(JLabel.CENTER);
        //name2Label.setBackground(Color.ORANGE);

        boom2button.setPreferredSize(new Dimension(100,30));
        boom2button.setFont(new Font("Verdana",Font.BOLD,12));
        boom2button.setVerticalAlignment(JLabel.CENTER);

        forthwestpanel.add(name2Label, BorderLayout.CENTER);
        forthwestpanel.add(boom2button, BorderLayout.CENTER);

//////////////// SCORE TABLE PANEL BELOW /////////////////////////

        resultspanel.setLayout(new BorderLayout(2,1));
        resultspanel.setBorder((BorderFactory.createEmptyBorder(0,10,0,10)));

        f3.add(resultspanel, BorderLayout.SOUTH);

        resultstable.setTableHeader(null);
        resultstable.setFont(new Font("Verdana", Font.PLAIN, 19 ));
        resultstable.setBorder(BorderFactory.createMatteBorder(5,5,5,5, Color.BLACK));
        resultstable.setRowHeight(50);

        ///// Alignment /////
        DefaultTableCellRenderer crenderer = new DefaultTableCellRenderer();
        crenderer.setHorizontalAlignment(JLabel.CENTER);
        resultstable.getColumnModel().getColumn(0).setCellRenderer(crenderer);
        resultstable.getColumnModel().getColumn(1).setCellRenderer(crenderer);
        resultstable.getColumnModel().getColumn(2).setCellRenderer(crenderer);
        resultstable.getColumnModel().getColumn(3).setCellRenderer(crenderer);
        resultstable.getColumnModel().getColumn(4).setCellRenderer(crenderer);

        resultstable.getColumnModel().getColumn(0).setPreferredWidth(300);
        resultstable.getColumnModel().getColumn(1).setPreferredWidth(15);
        resultstable.getColumnModel().getColumn(2).setPreferredWidth(15);
        resultstable.getColumnModel().getColumn(3).setPreferredWidth(15);
        resultstable.getColumnModel().getColumn(4).setPreferredWidth(15);

        resultspanel.add(jsp, SwingConstants.CENTER);


    }

    public void changeName1(){

        name1Label.setText(team1player2.getText());

    }

    public void changeName2(){

        name2Label.setText(team2player2.getText());

    }

    public String randomizeImage(){

        double max = 5, min = 1;
        String imageName = "";
        int imageNo = 0;

        imageNo = (int)((Math.random()*((max-min)+1))+min);

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

    public void renderImageRight() {

        String imgName = randomizeImage();

        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File(imgName));
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

    public void renderImageLeft(){

        String imgName = randomizeImage();

        BufferedImage img = null;
        try {
            img = ImageIO.read(new File(imgName));
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

    public void setBackgrounds(Color backgrounds){

        f2.setBackground(backgrounds);
        wrapperpanel.setBackground(backgrounds);
        thirdpanel.setBackground(backgrounds);
        forthpanel.setBackground(backgrounds);

        System.out.println(backgrounds);

    }

    public void setButtonState(boolean buttonState, JButton buttonName){

        buttonName.setEnabled(buttonState);

    }

    //////////////// GAME RESULT TABLE BELOW /////////////////////////

    public void setTable(){



        }

}
