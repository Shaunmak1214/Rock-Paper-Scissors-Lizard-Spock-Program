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
import java.awt.GridBagConstraints;


public class MainFrame extends JFrame
{
        JFrame f = new JFrame();

        public String colorSelected;

        JComboBox cb;

        JPanel firstpanel = new JPanel();
        JPanel secondpanel = new JPanel();
        JPanel thirdpanel = new JPanel();

        JLabel upperlabel = new JLabel();
        JLabel welcomelabel = new JLabel();
        JLabel descriptionlabel = new JLabel();

        JButton proceed = new JButton("PROCEED");

        MainFrame()
        {
/////////////////// FIRST PANEL BELOW/////////////////////////////

                firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
                firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL

                f.add(firstpanel,BorderLayout.NORTH);//panel position
                firstpanel.setBackground(new Color(253, 105, 0));//BACKGROUND COLOR OF FIRST PANEL
                firstpanel.setPreferredSize(new Dimension(1000,60));//FIRST PANEL SIZE
                upperlabel.setText("Rock-Paper-Scissors-Lizard-Spock");// the label text
                upperlabel.setFont(new Font("Sans Serif",Font.BOLD,18));//font of text
                //upperlabel.setBackground(Color.ORANGE);

                firstpanel.add(upperlabel);// ADD LABEL INTO THE PANEL
                //upperlabel.setOpaque(true);

                //f.setLayout(null);

///////////////// SECOND PANEL BELOW////////////////////////////

                //f.setLayout(new GridBagLayout());
                //secondpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
                secondpanel.setBorder((BorderFactory.createEmptyBorder(0,0,100,0)));
                f.add(secondpanel,BorderLayout.CENTER);

                secondpanel.setPreferredSize(new Dimension(1000,550));

                welcomelabel.setBorder((BorderFactory.createEmptyBorder(50,500,0,500)));//PANEL LAYOUT FOR LABEL
                descriptionlabel.setBorder((BorderFactory.createEmptyBorder(0,500,5,500)));//PANEL LAYOUT FOR LABEL

                welcomelabel.setFont(new Font("Verdana",Font.PLAIN,22));
                descriptionlabel.setFont(new Font("Verdana",Font.PLAIN,22));

                //proceed.setBorder((BorderFactory.createEmptyBorder(900,0,900,0)));
                //cb.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));

                welcomelabel.setText("Welcome!");
                descriptionlabel.setText("Please select the background colour before you proceed: ");

                //secondpanel.setLayout(new BoxLayout(secondpanel,BoxLayout.Y_AXIS));

                String [] color =
                        {
                                "Red",
                                "Green",
                                "Blue",
                                "Yellow",
                                "Grey"
                        };
                //JComboBox = dropdown list

                cb = new JComboBox(color);
                cb.addActionListener(this::actionPerformed);

                //secondpanel.add(cb);
                //secondpanel.add(cb).setBounds(500,400,1000,80);
                cb.setPreferredSize(new Dimension(80,30));


                secondpanel.add(welcomelabel,BorderLayout.CENTER);//welcome added
                secondpanel.add(descriptionlabel);//description added
                secondpanel.add(cb,BorderLayout.CENTER);//COMBOBOX ADDED

                //f.add(secondpanel);

                //f.setLayout(new FlowLayout());



///////////////////////THIRD PANEL BELOW////////////////////////////

                thirdpanel.setLayout(new GridBagLayout());
                thirdpanel.setBorder((BorderFactory.createEmptyBorder(0,10,10,10)));

                f.add(thirdpanel,BorderLayout.PAGE_END);
                //thirdpanel.setBackground(Color.BLACK);
                thirdpanel.setPreferredSize(new Dimension(1000,150));

                proceed.setPreferredSize(new Dimension(100,30));//BUTTON SIZE
                proceed.setFont(new Font("Sans Serif",Font.BOLD,12));//SIZE OF THE TEXT INSIDE BUTTON
                proceed.setForeground(Color.BLUE);

                thirdpanel.add(proceed);//BUTTON ADDED

                // JFrame = GUI window
                f.setTitle("Rock Paper Scissors");//set title
                f.setResizable(false);//cant resize
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//exit application

                f.setVisible(true);//make the frame appear
                f.setSize(1000, 700);//frame size
        }


        public void actionPerformed(ActionEvent e)
        {

                String colorSelect = (String) cb.getSelectedItem();
                this.colorSelected = colorSelect;

                switch (colorSelect)
                {
                        case "Red":
                                secondpanel.setBackground(Color.RED);
                                //f.getContentPane().setBackground(Color.RED);
                                thirdpanel.setBackground(Color.RED);
                                break;

                        case "Green":
                                secondpanel.setBackground(Color.GREEN);
                                //f.getContentPane().setBackground(Color.GREEN);
                                thirdpanel.setBackground(Color.GREEN);
                                break;

                        case "Blue":
                                secondpanel.setBackground(Color.BLUE);
                                //f.getContentPane().setBackground(Color.BLUE);
                                thirdpanel.setBackground(Color.BLUE);
                                break;

                        case "Yellow":
                                secondpanel.setBackground(Color.YELLOW);
                                //f.getContentPane().setBackground(Color.YELLOW);
                                thirdpanel.setBackground(Color.YELLOW);
                                break;

                        case "Grey":
                                secondpanel.setBackground(Color.GRAY);
                                //f.getContentPane().setBackground(Color.GRAY);
                                thirdpanel.setBackground(Color.GRAY);
                                break;
                }

        }

        public String getSelectedColor(){

                return this.colorSelected;

        }

}
