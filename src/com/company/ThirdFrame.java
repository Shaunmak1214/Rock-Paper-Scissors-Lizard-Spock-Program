package com.company;

import javax.swing.*;
import java.awt.*;

public class ThirdFrame extends SecondFrame {

    JFrame f3 = new JFrame();

    JPanel firstpanel = new JPanel();
    JPanel secondpanel = new JPanel();

    ThirdFrame()
    {
/////////////////// FIRST PANEL BELOW/////////////////////////////

        firstpanel.setLayout(new GridBagLayout());// PANEL GRID LAYOUT
        firstpanel.setBorder((BorderFactory.createEmptyBorder(10,10,10,10)));//PANEL LAYOUT FOR LABEL

        f3.add(firstpanel,BorderLayout.NORTH);//panel position
        firstpanel.setBackground(Color.ORANGE);//BACKGROUND COLOR OF FIRST PANEL
        firstpanel.setPreferredSize(new Dimension(1000,60));//FIRST PANEL SIZE

///////////////// SECOND PANEL BELOW////////////////////////////

        secondpanel.setBorder((BorderFactory.createEmptyBorder(0,0,100,0)));
        f3.add(secondpanel,BorderLayout.CENTER);

        secondpanel.setPreferredSize(new Dimension(1000,550));

    }

}
