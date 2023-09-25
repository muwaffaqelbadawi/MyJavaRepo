package com.company;

import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

public class theWindow extends JFrame {
    private JSlider slider;
    private Applet myPanel;


    public theWindow(){
        super("The title");
        myPanel = new Applet();
        myPanel.setBackground(Color.GREEN);


        slider = new JSlider(SwingConstants.HORIZONTAL,0,200,10);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);

        slider.addChangeListener(
                new ChangeListener(){
                    public void stateChanged(ChangeEvent e){
                        myPanel.setD(slider.getValue());
                    }

                }
        );
        add(slider,BorderLayout.SOUTH);
        add(myPanel,BorderLayout.CENTER);
    }
}