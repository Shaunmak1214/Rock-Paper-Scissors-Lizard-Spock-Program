package com.company;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        SecondFrame frame2 = new SecondFrame();
        GameFrame gameFrame = new GameFrame();

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
                        frame2.secondpanel.setBackground(Color.gray);
                        frame2.thirdpanel.setBackground(Color.blue);
                        break;

                    case "Green":
                        frame2.secondpanel.setBackground(Color.GREEN);
                        frame2.thirdpanel.setBackground(Color.GREEN);
                        break;

                    case "Blue":
                        frame2.secondpanel.setBackground(Color.BLUE);
                        frame2.thirdpanel.setBackground(Color.BLUE);
                        break;

                    case "Yellow":
                        frame2.secondpanel.setBackground(Color.YELLOW);
                        frame2.thirdpanel.setBackground(Color.YELLOW);
                        break;

                    case "Grey":
                        frame2.secondpanel.setBackground(Color.GRAY);
                        frame2.thirdpanel.setBackground(Color.GRAY);
                        break;
                }
                frame2.f2.setVisible(true);//frame 2 visible true
                gameFrame.f3.setVisible(true);
                gameFrame.f3.setSize(1000,700);
                gameFrame.f3.setResizable(false);

            }
        });
    }
}
