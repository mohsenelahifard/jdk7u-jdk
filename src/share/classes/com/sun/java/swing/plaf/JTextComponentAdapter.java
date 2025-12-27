package com.sun.java.swing.plaf;

import javax.swing.JTextComponent;
import java.awt.Insets;

class JTextComponentAdapter implements MarginSupported {

    private final JTextComponent textComponent;

    JTextComponentAdapter(JTextComponent textComponent) {
        this.textComponent = textComponent;
    }

    @Override
    public Insets getMargin() {
        return textComponent.getMargin();
    }

    @Override
    public void setMargin(Insets margin) {
        textComponent.setMargin(margin);
    }
}
