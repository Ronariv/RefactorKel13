import java.awt.Color;

import javax.swing.JButton;

public class ColoredButton extends JButton {

    public ColoredButton(String text, Color color) {

        super(text);

        this.setBackground(color);

    }

}