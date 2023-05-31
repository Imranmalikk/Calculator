import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class calculator extends JFrame implements ActionListener{
    JTextField t1,t2,t3;
    JButton
    b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,ba,bs,bm,bd,bdec,bdlt;
    calculator(){
        t1=new JTextField(20);
        t1.setBounds(20,30,120,30);
        add(t1);

        t2=new JTextField(20);
        t2.setBounds(150,30,120,30);
        add(t2);

        t3=new JTextField(20);
        t3.setBounds(40,70,200,30);
        add(t3);

        b0=new JButton("0");
        b1=new JButton("1");
        b2=new JButton("2");
        b3=new JButton("3");
        b4=new JButton("4");
        b5=new JButton("5");
        b6=new JButton("6");
        b7=new JButton("7");
        b8=new JButton("8");
        b9=new JButton("9");

        ba=new JButton("+");
        bs=new JButton("-");
        bm=new JButton("*");
        bd=new JButton("/");
        bdec=new JButton(".");
        bdlt=new JButton("C");

        b1.setBounds(30,130,50,30);
        b2.setBounds(85, 130, 50, 30);
        b3.setBounds(140, 130, 50, 30);
        b4.setBounds(30, 170, 50, 30);
        b5.setBounds(85, 170, 50, 30);
        b6.setBounds(140, 170, 50, 30);
        b7.setBounds(30, 210, 50, 30);
        b8.setBounds(85, 210, 50, 30);
        b9.setBounds(140, 210, 50, 30);
        b0.setBounds(85, 250, 50, 30);
        bdec.setBounds(30, 250, 50, 30);
        bdlt.setBounds(140, 250, 50, 30);
        ba.setBounds(210, 130, 50, 30);
        bm.setBounds(210, 170, 50, 30);
        bd.setBounds(210, 210, 50, 30);
        bs.setBounds(210, 250, 50, 30);

        ba.addActionListener(this);
        bm.addActionListener(this);
        bd.addActionListener(this);
        bs.addActionListener(this);
        b0.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        bdec.addActionListener(this);
        bdlt.addActionListener(this);

        add(b1);
		add(b2);
		add(b3);		
		add(b4);
		add(b5);
		add(b6);		
		add(b7);
		add(b8);
		add(b9);
		add(b0);
        add(ba);		
		add(bm);
		add(bs);
		add(bd);
		add(bdlt);
        add(bdec);

        JPanel p=new JPanel();
        p.setSize(300,400);
        p.setBackground(Color.BLUE);
        add(p);



        setSize(300,350);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String s1 =t1.getText();
        String s2 =t2.getText();
        
        double a =Double.parseDouble(s1);
        double b =Double.parseDouble(s2);
        double c =0;

        if(e.getSource()==ba){
            c=a+b;
        }
        else if(e.getSource()==bm){
            c=a*b;
        }
        else if(e.getSource()==bd){
            c=a/b;
        }
        else if(e.getSource()==bs){
            c=a-b;
        }
        else if(e.getSource()==bdlt){
            t1.setText("");
            t2.setText("");
            t3.setText("");
        }
        // if(e.getSource()==delButton) {
		// 	String string = t1.getText();
		// 	t1.setText("");
		// 	for(int i=0;i<string.length()-1;i++) {
		// 		t1.setText(tf.getText()+string.charAt(i));
		// 	}
        // }
        String result=String.valueOf(c);
        t3.setText(result);

    }
    public static void main(String args[]){
        new calculator();
    }
}