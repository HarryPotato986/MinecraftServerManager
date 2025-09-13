package com.github.HarryPotato986;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ServerListButton extends JButton {
    public String serverName;

    ServerListButton(String text, ImageIcon icon, ActionListener a) {
        super(text, icon);
        addActionListener(a);
        setIconTextGap(10);

        serverName = text;
    }
}
