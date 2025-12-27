package com.sun.java.swing.plaf;

import javax.swing.JToolBar;
import java.awt.Insets;

class JToolBarAdapter implements MarginSupported {

    private final JToolBar toolBar;

    JToolBarAdapter(JToolBar toolBar) {
        this.toolBar = toolBar;
    }

    @Override
    public Insets getMargin() {
        return toolBar.getMargin();
    }

    @Override
    public void setMargin(Insets margin) {
        toolBar.setMargin(margin);
    }
}
