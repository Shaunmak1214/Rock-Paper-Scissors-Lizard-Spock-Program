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

import java.awt.event.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;

public class FinalFrame {

    //private int t1;

    public void setP1Result(int totalPointT1P1, int totalPointT2P1, int pointT1P1[], int pointT2P1[], int totalPointT1P2, int totalPointT2P2, int pointT1P2[], int pointT2P2[], Color bg)
    {
        JFrame f4 = new JFrame();
        ImageIcon image = new ImageIcon("assets/party2.png");

        JPanel firstpanel = new JPanel();
        JPanel secondpanel = new JPanel();
        JPanel thirdpanel = new JPanel();
        JPanel fourpanel = new JPanel();
        JPanel fifthpanel = new JPanel();

        /////secondpanel labels/////
        JLabel upperlabel = new JLabel();
        JLabel team1 = new JLabel();
        JLabel team2 = new JLabel();
        JLabel congraz = new JLabel();
        JLabel winning_team = new JLabel();
        JLabel party = new JLabel(image);
        JButton b = new JButton("EXIT");



        String data[][] = {
                {"Player 1", "Round 1", "Round 2", "Round 3", "Total"},
                {"Team 1 : Sheldon", "", "", "", ""},
                {"Team 2 : Howard", "", "", "", ""}
        };
        String column[] = {"Player 2", "Round 1", "Round 2", "Round 3", "Total"};

        ///Table 2 data////
        String data2[][] = {
                {"Player 2", "Round 1", "Round 2", "Round 3", "Total"},
                {"Team 1 : Sheldon", "", "", "", ""},
                {"Team 2 : Howard", "", "", "", ""}
        };

        String column2[] = {"Player 2", "Round 1", "Round 2", "Round 3", "Total"};

        int finalTotalPointT1 = totalPointT1P1 + totalPointT1P2;
        int finalTotalPointT2 = totalPointT2P1 + totalPointT2P2;
        //int t1 = totalPointT1P1;//String data[][] = {};
        //System.out.println("t1:" + t1);

        int counter = 0;

        try {
            File myObj = new File("temp.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String dataFile = myReader.nextLine();
                System.out.println(dataFile);

                if(counter == 0){

                    data[1][0] =  "Team 1: " + dataFile;

                }

                if(counter == 1){

                    data[2][0] = "Team 2: " + dataFile;

                }

                if(counter == 2){

                    data2[1][0] = "Team 1: " + dataFile;

                }

                if(counter == 3){

                    data2[2][0] = "Team 2: " + dataFile;

                }

                counter++;

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        data[1][1] = String.valueOf(pointT1P1[0]);
        data[2][1] = String.valueOf(pointT2P1[0]);

        data[1][2] = String.valueOf(pointT1P1[1]);
        data[2][2] = String.valueOf(pointT2P1[1]);

        data[1][3] = String.valueOf(pointT1P1[2]);
        data[2][3] = String.valueOf(pointT2P1[2]);

        data[1][4] = String.valueOf(totalPointT1P1);
        data[2][4] = String.valueOf(totalPointT2P1);

        ///DATA 2
        data2[1][1] = String.valueOf(pointT1P2[0]);
        data2[2][1] = String.valueOf(pointT2P2[0]);

        data2[1][2] = String.valueOf(pointT1P2[1]);
        data2[2][2] = String.valueOf(pointT2P2[1]);

        data2[1][3] = String.valueOf(pointT1P2[2]);
        data2[2][3] = String.valueOf(pointT2P2[2]);

        data2[1][4] = String.valueOf(totalPointT1P2);
        data2[2][4] = String.valueOf(totalPointT2P2);



        //System.out.println("this data" + data[1][4]);
        /*data[][] = {
                {"Player 1", "Round 1", "Round 2", "Round 3", "Total"},
                {"Team 1 : Sheldon",  "", "", "", String.valueOf(totalPointT1P1)},
                {"Team 2 : Howard", "", "", "", ""}
        };*/

        //data[1][3] = String.valueOf(totalPointT1P1);
        System.out.println("fk me fk u" + totalPointT1P1 + totalPointT2P1 + pointT1P1[0] + pointT1P1[1] + pointT1P1[2] + pointT2P1[0] + pointT2P1[1] + pointT2P1[2]);
        System.out.println("fk u fk me" + totalPointT1P2 + totalPointT2P2 + pointT1P2[0] + pointT1P2[1] + pointT1P2[2] + pointT2P2[0] + pointT2P2[1] + pointT2P2[2]);


    /*public void setP2Result(int totalPointT1P2, int totalPointT2P2,  int pointT1P2[], int pointT2P2[])
    {

    }*/

        /*public void setFinalFrame() {*/

        //System.out.println("final t1:"+this.t1);
        ////////////////////////////thirdpanel labels////////////////////////////
        ///Table 1 data////





        //GameFrame game = new GameFrame();
        //data[1][4] = String.valueOf(totalPointT1P1);
        /*System.out.println("get total"+getTotalPointT1P1());
        data[1][4] = String.valueOf(getTotalPointT1P1());*/
        //System.out.println(data[1][4]);
        secondpanel.setBackground(bg);
        thirdpanel.setBackground(bg);
        fourpanel.setBackground(bg);
        fifthpanel.setBackground(bg);
        team1.setBackground(bg);
        team2.setBackground(bg);

        System.out.println("BG: "+bg);

        //f4.setVisible(true);
        f4.setSize(1000, 700);
        f4.setVisible(true);


/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));//PANEL LAYOUT FOR LABEL

        f4.add(firstpanel, BorderLayout.NORTH);//panel position
        firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000, 60));//FIRST PANEL SIZE
        upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
        upperlabel.setFont(new Font("Verdana", Font.PLAIN, 18));//font of text
        upperlabel.setBackground(Color.ORANGE);//text background color

        firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
        upperlabel.setOpaque(true);// MAKE LABEL VISIBLE


/////////////////// Second PANEL BELOW/////////////////////////////

        secondpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        secondpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));//PANEL LAYOUT FOR LABEL

        /////EXIT BUTTON/////
        f4.add(secondpanel, BorderLayout.CENTER);
        secondpanel.setLayout(null);
        secondpanel.add(b);
        b.setBounds(850, 20, 75, 35);
        secondpanel.add(party);

        /////TEAM 1/////
        team1.setText("Team 1:  1");
        team1.setFont(new Font("Verdana", Font.PLAIN, 25));
        team1.setBounds(250, 50, 150, 30);

        /////TEAM 2/////
        team2.setText("Team 2:  2");
        team2.setFont(new Font("Verdana", Font.PLAIN, 25));
        team2.setBounds(600, 50, 150, 30);

        /////CONGRATULATION/////
        congraz.setText("Congratulation!!");
        congraz.setFont(new Font("Verdana", Font.PLAIN, 30));
        congraz.setBounds(290, 110, 250, 40);

        /////WINNING TEAM/////
        winning_team.setText("Team 1");
        winning_team.setFont(new Font("Verdana", Font.PLAIN, 30));
        winning_team.setBounds(550, 110, 150, 40);
        winning_team.setForeground(Color.RED);

        /////PARTY IMAGE/////
        party.setText("");
        party.setFont(new Font("Verdana", Font.PLAIN, 30));
        party.setBounds(35, 50, 180, 130);


        secondpanel.add(team1);// ADD LABEL INTO THE PANEL
        team1.setOpaque(true);// MAKE LABEL VISIBLE

        secondpanel.add(team2);// ADD LABEL INTO THE PANEL
        team2.setOpaque(true);// MAKE LABEL VISIBLE

        secondpanel.add(congraz);// ADD LABEL INTO THE PANEL
        team2.setOpaque(true);// MAKE LABEL VISIBLE

        secondpanel.add(winning_team);// ADD LABEL INTO THE PANEL
        team2.setOpaque(true);// MAKE LABEL VISIBLE


/////////////////// Third PANEL BELOW/////////////////////////////

        fifthpanel.setLayout(new GridLayout(2, 1));
        fifthpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));
        thirdpanel.setLayout(new GridLayout());
        thirdpanel.setBorder((BorderFactory.createEmptyBorder(0, 0, 30, 0)));
        fourpanel.setLayout(new GridLayout());
        fourpanel.setBorder((BorderFactory.createEmptyBorder(20, 0, 10, 0)));


        /////Table 1 Charateristics/////
        JTable jt = new JTable(data, column);
        jt.setTableHeader(null);
        jt.setFont(new Font("Verdana", Font.PLAIN, 19));
        jt.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));

        jt.setRowHeight(50);


        /////Table 1 Centered Align/////
        DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
        centerRenderer.setHorizontalAlignment(JLabel.CENTER);
        jt.getColumnModel().getColumn(0).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(1).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(2).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(3).setCellRenderer(centerRenderer);
        jt.getColumnModel().getColumn(4).setCellRenderer(centerRenderer);

        /////Table 1 Width Adjusted/////
        jt.getColumnModel().getColumn(0).setPreferredWidth(300);
        jt.getColumnModel().getColumn(1).setPreferredWidth(15);
        jt.getColumnModel().getColumn(2).setPreferredWidth(15);
        jt.getColumnModel().getColumn(3).setPreferredWidth(15);
        jt.getColumnModel().getColumn(4).setPreferredWidth(15);

        /////Table 2 Characteristic/////
        JTable jt2 = new JTable(data2, column2);
        jt2.setTableHeader(null);
        jt2.setFont(new Font("Verdana", Font.PLAIN, 19));
        jt2.setBorder(BorderFactory.createMatteBorder(5, 5, 5, 5, Color.BLACK));

        jt2.setRowHeight(50);

        /////Table 2 Centered Align/////
        DefaultTableCellRenderer centerRenderer2 = new DefaultTableCellRenderer();
        centerRenderer2.setHorizontalAlignment(JLabel.CENTER);
        jt2.getColumnModel().getColumn(0).setCellRenderer(centerRenderer2);
        jt2.getColumnModel().getColumn(1).setCellRenderer(centerRenderer2);
        jt2.getColumnModel().getColumn(2).setCellRenderer(centerRenderer2);
        jt2.getColumnModel().getColumn(3).setCellRenderer(centerRenderer2);
        jt2.getColumnModel().getColumn(4).setCellRenderer(centerRenderer2);

        /////Table 2 Width Adjusted/////
        jt2.getColumnModel().getColumn(0).setPreferredWidth(300);
        jt2.getColumnModel().getColumn(1).setPreferredWidth(15);
        jt2.getColumnModel().getColumn(2).setPreferredWidth(15);
        jt2.getColumnModel().getColumn(3).setPreferredWidth(15);
        jt2.getColumnModel().getColumn(4).setPreferredWidth(15);

        jt.setVisible(true);
        jt2.setVisible(true);

        thirdpanel.add(jt);
        fourpanel.add(jt2);
        fifthpanel.add(thirdpanel);
        fifthpanel.add(fourpanel);

        f4.add(fifthpanel, BorderLayout.SOUTH);

        /*f4.setBackground(bg);
        System.out.println("BG: "+bg);*/

        team1.setText("Team 1:  "+finalTotalPointT1);
        team2.setText("Team 2:  "+finalTotalPointT2);

        if(finalTotalPointT1>finalTotalPointT2)
        {
            winning_team.setText("Team 1");
        }
        else if (finalTotalPointT1<finalTotalPointT2)
        {
            winning_team.setText("Team 2");
        }
        else if(finalTotalPointT1==finalTotalPointT2)
        {
            winning_team.setText("Draw");
        }


        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                File myObj = new File("temp.txt");
                if (myObj.delete()) {
                    System.out.println("Deleted the file: " + myObj.getName());
                } else {
                    System.out.println("Failed to delete the file.");
                }
                System.exit(0);
            }
        });
    }

}



