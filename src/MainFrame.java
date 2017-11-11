import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainFrame extends JFrame{
    private int frmW = 300,frmH = 150,screenW,screenH,labx=100,laby=100;
    private Dimension dim =Toolkit.getDefaultToolkit().getScreenSize();
    private JLabel jlab= new JLabel();
    private JButton jbnup = new JButton("up");
    private JButton jbndown = new JButton("doun");
    private JButton jbnleft = new JButton("left");
    private JButton jbnright = new JButton("right");
    public MainFrame(){
        initcomp();
    }
    private void initcomp(){
        screenH = dim.height;
        screenW = dim.width;
        this.setBounds(screenW/2-frmW/2,screenH/2-frmH/2,frmW,frmH);
        this.setLayout(null);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
        jlab.setBounds(100,100,20,20);
        jlab.setBackground(Color.blue);
        jlab.setOpaque(true);
        this.add(jlab);

        jbnup.setBackground(Color.pink);
        jbnup.setBounds(50,200,80,50);
        jbnup.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laby-=5;
                jlab.setLocation(labx,laby);
            }
        });
        this.add(jbnup);

        jbndown.setBackground(Color.pink);
        jbndown.setBounds(150,200,80,50);
        jbndown.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                laby+=5;
                jlab.setLocation(labx,laby);
            }
        });
        this.add(jbndown);

        jbnleft.setBackground(Color.pink);
        jbnleft.setBounds(250,200,80,50);
        jbnleft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labx-=5;
                jlab.setLocation(labx,laby);
            }
        });
        this.add(jbnleft);

        jbnright.setBackground(Color.pink);
        jbnright.setBounds(350,200,80,50);
        jbnright.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                labx+=5;
                jlab.setLocation(labx,laby);
            }
        });
        this.add(jbnright);

    }
}
