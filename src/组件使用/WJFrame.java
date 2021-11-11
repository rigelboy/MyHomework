package 组件使用;

import javax.swing.*;
import java.awt.*;

public class WJFrame extends JFrame {
    public static void main(String[] args) {
        WJFrame wjf = new WJFrame();
        wjf.setSize(500,500);
        wjf.setVisible(true);
        wjf.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        wjf.add(new JTextField(2));
    }
}