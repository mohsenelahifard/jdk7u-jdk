package com.sun.java.swing.plaf;

import javax.swing.AbstractButton;
import java.awt.Insets;

class AbstractButtonAdapter implements MarginSupported {

    private final AbstractButton b;

    AbstractButtonAdapter(AbstractButton b) {
        this.b = b;
    }

    @Override
    public Insets getMargin() {
        return b.getMargin();
    }

    @Override
    public void setMargin(Insets margin) {
        b.setMargin(margin);
    }
}
