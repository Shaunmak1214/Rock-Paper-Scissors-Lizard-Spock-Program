package com.company;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
         MainFrame frame = new MainFrame();
         SecondFrame frame2 = new SecondFrame();

        //frame.cb.addActionListener(frame::actionPerformed);

        /*
        public void actionPerformed(ActionEvent b)
        {

            String colorSelect = (String) frame.cb.getSelectedItem();
            //f.getContentPane().setBackground(Color.RED);
            //f.getContentPane().setBackground(Color.GREEN);
            //f.getContentPane().setBackground(Color.BLUE);
            //f.getContentPane().setBackground(Color.YELLOW);
            //f.getContentPane().setBackground(Color.GRAY);
            switch (colorSelect) {
                case "Red" -> {
                    frame.secondpanel.setBackground(Color.RED);
                    frame.thirdpanel.setBackground(Color.RED);
                }
                case "Green" -> {
                    frame.secondpanel.setBackground(Color.GREEN);
                    frame.thirdpanel.setBackground(Color.GREEN);
                }
                case "Blue" -> {
                    frame.secondpanel.setBackground(Color.BLUE);
                    frame.thirdpanel.setBackground(Color.BLUE);
                }
                case "Yellow" -> {
                    frame.secondpanel.setBackground(Color.YELLOW);
                    frame.thirdpanel.setBackground(Color.YELLOW);
                }
                case "Grey" -> {
                    frame.secondpanel.setBackground(Color.GRAY);
                    frame.thirdpanel.setBackground(Color.GRAY);
                }
            }

        }
        */

        frame.proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.f.setVisible(false);//frame 1 visible false

                frame.f2.setVisible(true);//frame 2 visible true
                frame.f2.setSize(1000,700);


            }
        });
    }
}
