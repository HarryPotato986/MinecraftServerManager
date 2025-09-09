package com.github.HarryPotato986;

import javax.swing.*;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import java.awt.*;

public class SettingsPanel extends JPanel {
    JTabbedPane tabbedPane;

    SettingsPanel() {
        this.setBackground(new Color(45, 45, 45));
        this.setPreferredSize(new Dimension(200,200));
        this.setLayout(new BorderLayout());

        tabbedPane = new JTabbedPane();
        tabbedPane.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return -1; //I'm very surprised that -1 worked, 0 left a few pixels of tab showing
            }
        });


        //tabbedPane.addTab("bruh", new JLabel("super bruh"));
        //tabbedPane.addTab("bruh 2", new JLabel("super bruh 2"));
        tabbedPane.addTab("bruh", new JPanel(new BorderLayout()));
        tabbedPane.addTab("bruh 2", new JPanel(new BorderLayout()));

        tabbedPane.setSelectedIndex(1);


        this.add(tabbedPane, BorderLayout.CENTER);
    }

    private void ReloadServersFromFile() {
        tabbedPane.removeAll();
        for (String serverName : ServerListPanel.tempFile) {
            /*
            -make a new panel for each folder
            -make a new tab for each folder, passing in serverName and the new panel
             */
        }
    }
}
