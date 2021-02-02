package com.company;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main{

    public static void main(String[] args) {
         MainFrame frame = new MainFrame();
         SecondFrame frame2 = new SecondFrame();

        frame.cb.addActionListener(frame::actionPerformed);

        frame.proceed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                String colorSelected = frame.getSelectedColor();

                //System.out.println("Color Selected" + colorSelected );

                frame.f.setVisible(false);//frame 1 visible false
                frame2.f2.setSize(1000,700);
                switch (colorSelected)
                {
                    case "Red":
                        frame2.secondpanel.setBackground(Color.RED);
                        break;

                    case "Green":
                        frame2.secondpanel.setBackground(Color.GREEN);
                        break;

                    case "Blue":
                        frame2.secondpanel.setBackground(Color.BLUE);
                        break;

                    case "Yellow":
                        frame2.secondpanel.setBackground(Color.YELLOW);
                        break;

                    case "Grey":
                        frame2.secondpanel.setBackground(Color.GRAY);
                        break;
                }
                frame2.f2.setVisible(true);//frame 2 visible true

            }
        });
    }
}
