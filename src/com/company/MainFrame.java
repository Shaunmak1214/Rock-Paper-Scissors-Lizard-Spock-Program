package com.company;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JFrame;
import java.awt.GridLayout;
import javax.swing.*;
import javax.swing.plaf.ColorUIResource;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.Dimension;
import java.awt.BorderLayout;


public class MainFrame extends JFrame
{
        JFrame f = new JFrame();
        JComboBox cb;
        JPanel firstpanel = new JPanel();
        JPanel secondpanel = new JPanel();
        JLabel upperlabel = new JLabel();
        JLabel welcomelabel = new JLabel();

        MainFrame()
        {
/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL


                this.add(firstpanel,BorderLayout.NORTH);//panel position
                firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
                firstpanel.setPreferredSize(new Dimension(1000,80));//FIRST PANEL SIZE
                upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
                upperlabel.setFont(new Font("Verdana",Font.PLAIN,20));//font of text
                upperlabel.setBackground(Color.ORANGE);//text background color

                firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
                upperlabel.setOpaque(true);// MAKE LABEL VISIBLE

                //f.setLayout(null);

///////////////// SECOND PANEL BELOW////////////////////////////
                //JComboBox = dropdown list
                welcomelabel.setText("<html>Welcome!<br>Please select the background colour before you proceed: <br></html>");
                secondpanel.add(welcomelabel);
                String [] color =
                        {
                                "Red",
                                "Green",
                                "Blue",
                                "Yellow",
                                "Grey"
                        };

                cb = new JComboBox(color);
                cb.addActionListener(this::actionPerformed);



                secondpanel.add(cb,BorderLayout.CENTER);//COMBOBOX ADDED
                //secondpanel.add(cb);
                //secondpanel.add(cb).setBounds(500,400,1000,80);


                this.add(secondpanel);

                //this.setLayout(new FlowLayout());

                // JFrame = GUI window
                this.setTitle("Rock Paper Scissors");//set title
                this.setResizable(false);//cant resize
                this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application




                this.setVisible(true);//make the frame appear


                this.setSize(1000, 700);//frame size
        }


        public void actionPerformed(ActionEvent e)
        {

                String colorSelect = (String) cb.getSelectedItem();
                switch (colorSelect)
                {
                        case "Red":
                        secondpanel.setBackground(Color.RED);
                        //this.getContentPane().setBackground(Color.RED);
                        break;

                        case "Green":
                        secondpanel.setBackground(Color.GREEN);
                        //this.getContentPane().setBackground(Color.GREEN);
                        break;

                        case "Blue":
                        secondpanel.setBackground(Color.BLUE);
                        //this.getContentPane().setBackground(Color.BLUE);
                        break;

                        case "Yellow":
                        secondpanel.setBackground(Color.YELLOW);
                        //this.getContentPane().setBackground(Color.YELLOW);
                        break;

                        case "Grey":
                        secondpanel.setBackground(Color.GRAY);
                        //this.getContentPane().setBackground(Color.GRAY);
                        break;
                }

        }
}
