package com.github.HarryPotato986;

import javax.swing.*;
import java.awt.event.ActionListener;

public class ServerListButton extends JButton {
    ServerListButton(String text, Icon icon, ActionListener a) {
        super(text, icon);
        addActionListener(a);
    }
}
