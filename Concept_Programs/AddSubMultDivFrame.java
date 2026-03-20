import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class ASMDOperation implements ActionListener
{
    //characteristics
    JFrame fobj;
    JButton bobj1;
    JButton bobj2;
    JButton bobj3;
    JButton bobj4;
    JTextField tobj1;
    JTextField tobj2;
    JLabel Numberlabel1, Numberlabel2, Resultlabel;

    public ASMDOperation(String title, int width, int height)
    {
        fobj = new JFrame(title);


        Numberlabel1 = new JLabel("Number 1");
        Numberlabel1.setBounds(50,50,100,30);

        tobj1 = new JTextField();
        tobj1.setBounds(150,50,150,30);

        Numberlabel2 = new JLabel("Number 2");
        Numberlabel2.setBounds(50,100,100,30); 

        tobj2 = new JTextField();
        tobj2.setBounds(150,100,150,30);

        bobj1 = new JButton("+");
        bobj1.setBounds(90,160,50,20);
        
        bobj2 = new JButton("-");
        bobj2.setBounds(150,160,50,20);

        bobj3 = new JButton("*");
        bobj3.setBounds(210,160,50,20);

        bobj4 = new JButton("/");
        bobj4.setBounds(270,160,50,20);

        Resultlabel = new JLabel();
        Resultlabel.setBounds(150,200,250,30);

        fobj.add(bobj1);
        fobj.add(bobj2);
        fobj.add(bobj3);
        fobj.add(bobj4);
        fobj.add(tobj1);
        fobj.add(tobj2);
        fobj.add(Numberlabel1);
        fobj.add(Numberlabel2);
        fobj.add(Resultlabel);

        fobj.getContentPane().setBackground(Color.YELLOW);


        bobj1.addActionListener(this);
        bobj2.addActionListener(this);
        bobj3.addActionListener(this);
        bobj4.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width,height);

        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


    public void actionPerformed(ActionEvent aobj)
    {
        double dnum1 = Double.parseDouble(tobj1.getText());
        double dnum2 = Double.parseDouble(tobj2.getText());
        double result = 0.0;

            // Identify which button was pressed
            if (aobj.getSource() == bobj1)      // +
            {
                result = dnum1 + dnum2;
            }
            else if (aobj.getSource() == bobj2) // -
            {
                result = dnum1 - dnum2;
            }
            else if (aobj.getSource() == bobj3) // *
            {
                result = dnum1 * dnum2;
            }
            else if (aobj.getSource() == bobj4) // /
            {
                if (dnum2 == 0)
                    Resultlabel.setText("Cannot divide by zero!");
                else
                    result = dnum1 / dnum2;
            }
            if (!(aobj.getSource() == bobj4 && dnum2 == 0))
            {
                Resultlabel.setText("Result : " + result);
            }
}
}

class AddSubMultDivFrame
{
    public static void main(String A[])
    {
        ASMDOperation aobj = new ASMDOperation("Calculator",400,300);
    }
}