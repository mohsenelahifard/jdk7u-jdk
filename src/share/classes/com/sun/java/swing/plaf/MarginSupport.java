package com.sun.java.swing.plaf;

import javax.swing.*;
import javax.swing.text.JTextComponent;
import java.awt.Component;

public final class MarginSupport {

    private MarginSupport() {}

    public static MarginSupported get(Component c) {
        if (c instanceof AbstractButton) {
            return new AbstractButtonAdapter((AbstractButton) c);
        }
        if (c instanceof JToolBar) {
            return new JToolBarAdapter((JToolBar) c);
        }
        if (c instanceof JTextComponent) {
            return new JTextComponentAdapter((JTextComponent) c);
        }
        return null;
    }
}
