package com.github.HarryPotato986;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BaseFrame extends JFrame implements ActionListener {
    ServerListPanel serverListPanel = new ServerListPanel(this);
    SettingsPanel settingsPanel = new SettingsPanel();

    BaseFrame() {


        this.setTitle("MC Server Manager");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        this.setSize(1280,720);

        this.add(serverListPanel, BorderLayout.WEST);
        this.add(settingsPanel, BorderLayout.CENTER);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (ServerListButton button : serverListPanel.serverList) {
            if (e.getSource() == button) {
                settingsPanel.changeTab(button.serverName);
            }
        }
    }
}
