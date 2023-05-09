package org.example.creational.factory.abstractFactory.factories;

import org.example.creational.factory.abstractFactory.ui.elements.*;

/**
 * @author musa.balin
 */
public class WindowsComponentFactory implements UIComponentFactory {
    @Override
    public Button renderButton() {
        return new WindowsButton();
    }

    @Override
    public Input renderInput() {
        return new WindowsInput();
    }
}
