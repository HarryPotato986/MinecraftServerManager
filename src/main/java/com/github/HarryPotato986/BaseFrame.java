package com.github.HarryPotato986;

import javax.swing.*;
import java.awt.*;

public class BaseFrame extends JFrame {
    BaseFrame() {
        ServerListPanel leftPanel = new ServerListPanel();
        SettingsPanel rightPanel = new SettingsPanel();

        this.setTitle("MC Server Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        this.setSize(1280,720);

        this.add(leftPanel, BorderLayout.WEST);
        this.add(rightPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }
}
