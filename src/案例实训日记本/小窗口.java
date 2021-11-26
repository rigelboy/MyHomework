package 案例实训日记本;
import javax.swing.*;
import java.awt.*;


public class 小窗口 extends JFrame {
    JPanel pnl = new JPanel();
    JPanel ptn = new JPanel();
    JButton btn1=new JButton("保存");
    JButton btn2=new JButton("删除");
    JButton btn3=new JButton("你好");
    JTextArea jta = new JTextArea(20,50);
    public 小窗口() throws HeadlessException {
        super("My窗口");
        pnl.add(btn1);
        pnl.add(btn2);
        pnl.add(btn3);
        ptn.add(jta);
        this.setLocationRelativeTo(null);
        this.setVisible(true);
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(pnl,BorderLayout.NORTH);
        this.add(ptn,BorderLayout.EAST);
    }
    public static void main(String[] args) {
        小窗口 nt2 = new 小窗口();
    }
}

