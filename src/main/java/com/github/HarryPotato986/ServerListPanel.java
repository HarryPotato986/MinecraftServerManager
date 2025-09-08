package com.github.HarryPotato986;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class ServerListPanel extends JPanel {
    private static final String[] tempFile = {"test server 1", "test server 2", "test server 3", "test server 4", "test server 5"};
    private static final ImageIcon tempIcon = new ImageIcon("src/main/resources/server-icon.png");

    ArrayList<ServerListButton> serverList = new ArrayList<>();

    ServerListPanel(){
        this.setBackground(new Color(55, 55, 55));
        this.setPreferredSize(new Dimension(200,200));

        ReloadServersFromFile();
        for (ServerListButton button : serverList) {
            this.add(button);
        }

    }

    private void ReloadServersFromFile() {
        serverList.clear();
        for (String serverName : tempFile) {
            serverList.add(new ServerListButton(serverName, tempIcon));
        }
    }
}
