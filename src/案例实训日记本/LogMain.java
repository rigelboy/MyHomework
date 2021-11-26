package 案例实训日记本;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.*;
import java.util.Calendar;


public class LogMain extends JFrame  {
    JPanel pUp = new JPanel();
    JPanel pCenter =new JPanel();
    JLabel lblyear = new JLabel("年");
    JLabel lblmonth = new JLabel("月");
    JLabel lblday = new JLabel("日");
    JComboBox cbxyear = new JComboBox();
    JComboBox cbxmonth = new JComboBox();
    JComboBox cbxday = new JComboBox();
    JButton btnquery = new JButton("查询");
    JButton btnSave = new JButton("保存");
    JButton btnDelete = new JButton("删除");
    JTextArea jtaContent = new JTextArea(20,50);
    JScrollPane scrollPane;
    String filePath = "log\\";//log是保存日记文件的文件夹
    //在构造方法中吧各个组件添加到合适位置
    public LogMain(){
        super("我的日记本2");
        pUp.add(lblyear);
        pUp.add(cbxyear);
        pUp.add(lblmonth);
        pUp.add(cbxmonth);
        pUp.add(lblday);
        pUp.add(cbxday);
        pUp.add(btnquery);
        pUp.add(btnSave);
        pUp.add(btnDelete);
        scrollPane = new JScrollPane(jtaContent);
        pCenter.add(scrollPane);
        this.add(pUp, BorderLayout.NORTH);
        this.add(pCenter,BorderLayout.CENTER);
        for (int i = 2019; i <= 2029; i++) {
            cbxyear.addItem(String.valueOf(i));
        }
        //让cbxyear默认选择当前年份
        Calendar calendar = Calendar.getInstance();
        cbxyear.setSelectedItem(String.valueOf(calendar.get(Calendar.YEAR)));
        for (int i = 1; i < 12; i++) {
            cbxmonth.addItem(String.valueOf(i));
        }
        cbxmonth.setSelectedItem((String.valueOf(calendar.get(Calendar.MONTH)+1)));
        for (int i = 1; i <= getDay(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH)+1); i++) {
            cbxday.addItem(String.valueOf(i));
        }
        cbxday.setSelectedItem((String.valueOf(calendar.get(Calendar.DAY_OF_MONTH))));
        cbxyear.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int year = Integer.parseInt(cbxyear.getSelectedItem().toString());
                int month = Integer.parseInt(cbxmonth.getSelectedItem().toString());
                cbxday.removeAllItems();
                for (int i = 1; i <=getDay(year,month) ; i++) {
                    cbxday.addItem(String.valueOf(i));
                }
            }
        });
        cbxmonth.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                int year = Integer.parseInt(cbxyear.getSelectedItem().toString());
                int month = Integer.parseInt(cbxmonth.getSelectedItem().toString());
                cbxday.removeAllItems();
                for (int i = 1; i <=getDay(year,month) ; i++) {
                    cbxday.addItem(String.valueOf(i));
                }
            }
        });
        btnquery.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = filePath+cbxyear.getSelectedItem().toString()+"\\"+cbxmonth.getSelectedItem().toString()
                        +cbxday.getSelectedItem().toString()+".txt";
                File path=new File(filePath+cbxyear.getSelectedItem().toString()+"\\");
                if (path.exists()){
                    try{
                        if(!loadFile(filename)){
                            JOptionPane.showMessageDialog(LogMain.this,cbxyear.getSelectedItem().toString()+
                                    "年"+cbxmonth.getSelectedItem().toString()+"月"+cbxday.getSelectedItem().toString()+"号没有日记");
                            jtaContent.setText("");
                        }else{
                            JOptionPane.showMessageDialog(LogMain.this,"查询成功"+path.getAbsolutePath());
                        }
                    }catch (IOException e1){
                        JOptionPane.showMessageDialog(null,"查询失败:"+e1.getMessage());
                    }
                }else{
                    path.mkdirs();
                    try{
                        if(!loadFile(filename)){
                            JOptionPane.showMessageDialog(LogMain.this,cbxyear.getSelectedItem().toString()+
                                    "年"+cbxmonth.getSelectedItem().toString()+"月"+cbxday.getSelectedItem().toString()+"号没有日记");
                            jtaContent.setText("");

                        }else{
                            JOptionPane.showMessageDialog(null,"查询成功");
                        }
                    }catch (IOException e1){
                        System.out.println("读取文件失败:"+e1.getMessage());
                        JOptionPane.showMessageDialog(null,"查询失败:"+e1.getMessage());
                    }
                }

            }
        });
        btnDelete.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = filePath+cbxyear.getSelectedItem().toString()+"\\"+cbxmonth.getSelectedItem().toString()+
                        cbxday.getSelectedItem().toString()+".txt";
                File file = new File(filename);
                if(file.exists()){
                    if(file.delete())
                        JOptionPane.showMessageDialog(null,"删除成功");
                    else
                        JOptionPane.showMessageDialog(null,"删除失败");
                }
                jtaContent.setText("");
            }
        });
        btnSave.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String filename = filePath+cbxyear.getSelectedItem().toString()+"\\"+cbxmonth.getSelectedItem().toString()+
                        cbxday.getSelectedItem().toString()+".txt";
                File file = new File(filename);
                try{
                    saveFile(filename);
                    JOptionPane.showMessageDialog(null,"保存成功,文件保存在"+ filename);

                }catch (IOException e1){
                    System.out.println("保存文件失败:"+e1.getMessage());
                    JOptionPane.showMessageDialog(null,"保存失败");
                }
            }
        });
        this.setSize(600,500);
        this.setVisible(true);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public  int getDay(int year, int month) {
        int dnum = 0;
        boolean isLeap = false;
        if(year<1000||year>9999||month<1||month>12){
            System.out.println("输入的日期不合法");
            return 0;
        }
        if(year%400==0||(year%4==0&&year%100!=0)){
            isLeap=true;
        }
        switch(month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dnum=31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dnum=30;
                break;
            case 2:
                if(isLeap)
                    dnum=29;
                else
                    dnum=28;
                break;
        }
        return dnum;
    }
    public static void main(String[] args) {
        LogMain main = new LogMain();
    }
    public boolean loadFile(String filename) throws IOException{
        BufferedReader reader = null;
        File file = new File(filename);
        if(!file.exists())
            return false;
        reader = new BufferedReader(new FileReader(file));
        String content="";
        jtaContent.setText("");
        while((content= reader.readLine())!=null){
            jtaContent.append(content+"\n");
        }
        reader.close();
        return true;
    }
    public void saveFile(String filename) throws IOException{
        BufferedWriter writer = null;
        File file = new File(filename);
        if(!file.exists())
            file.createNewFile();
        writer = new BufferedWriter(new FileWriter(file));
        writer.write(jtaContent.getText().replaceAll("\n","\r\n"));
        writer.close();
    }
}
