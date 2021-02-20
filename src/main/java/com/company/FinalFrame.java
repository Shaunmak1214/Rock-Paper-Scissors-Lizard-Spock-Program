package com.company;

import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableCellRenderer;

public class FinalFrame {

    JFrame f = new JFrame("Assignment Sample");
    FinalFrame() {

        f.setVisible(true);

        f.setSize(1000, 700);

        JButton b = new JButton("EXIT");
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        ImageIcon image = new ImageIcon("party2.png");

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

        ////////////////////////////thirdpanel labels////////////////////////////

        ///Table 1 data////
        String data[][] = {
                {"Player 1", "Round 1", "Round 2", "Round 3", "Total"},
                {"Team 1 : Sheldon", "1", "1", "0", "2"},
                {"Team 2 : Howard", "0", "0", "1", "1"}
        };

        String column[] = {"BRUUH", "Round 1", "Round 2", "Round 3", "Total"};

        ///Table 2 data////
        String data2[][] = {
                {"BRUUH", "Round 1", "Round 2", "Round 3", "Total"},
                {"Team 1 : Sheldon", "1", "1", "0", "2"},
                {"Team 2 : Howard", "0", "0", "1", "1"}
        };

        String column2[] = {"BRUUH", "Round 1", "Round 2", "Round 3", "Total"};


/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10, 10, 10, 10)));//PANEL LAYOUT FOR LABEL

        f.add(firstpanel, BorderLayout.NORTH);//panel position
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
        f.add(secondpanel, BorderLayout.CENTER);
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

        fifthpanel.setLayout(new GridLayout(2,1));
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

        f.add(fifthpanel, BorderLayout.SOUTH);

        team1.setText("Team 1:  ");
        team2.setText("Team 2:  ");
        winning_team.setText("Team ");


    }
}
