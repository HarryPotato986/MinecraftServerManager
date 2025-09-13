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
        tabbedPane.setBackground(new Color(45, 45, 45));
        tabbedPane.setForeground(new Color(45, 45, 45));
        tabbedPane.setUI(new BasicTabbedPaneUI() {
            @Override
            protected int calculateTabAreaHeight(int tabPlacement, int horizRunCount, int maxTabHeight) {
                return -1; //I'm very surprised that -1 worked, 0 left a few pixels of tab showing
            }
        });

        ReloadServersFromFile();
        JPanel panel = (JPanel) tabbedPane.getComponentAt(1);
        JLabel label = new JLabel("it works");
        label.setForeground(Color.white);
        panel.add(label);

        this.add(tabbedPane, BorderLayout.CENTER);
    }

    private void ReloadServersFromFile() {
        tabbedPane.removeAll();
        for (String serverName : ServerListPanel.tempFile) {
            JPanel tempPanel = new JPanel();
            tempPanel.setBackground(new Color(45, 45, 45));
            tabbedPane.addTab(serverName, tempPanel);
        }
    }

    public void changeTab(String tabName) {
        tabbedPane.setSelectedIndex(tabbedPane.indexOfTab(tabName));
    }
}
