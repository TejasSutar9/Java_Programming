import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class ChatClient implements ActionListener
{
    JFrame fobj;
    JTextField tobj;
    JButton bobj;
    JLabel Messagelabel, Resultlabel;

    public ChatClient(String title, int width, int height)
    {
        fobj = new JFrame(title);

        Messagelabel = new JLabel("Message");
        Messagelabel.setFont(new Font("Arial", Font.BOLD, 18));
        Messagelabel.setBounds(60, 35, 100, 60);

        tobj = new JTextField();
        tobj.setBounds(150, 50, 150, 30);

        bobj = new JButton("SEND");
        bobj.setBounds(150, 120, 100, 30);

        Resultlabel = new JLabel();
        Resultlabel.setBounds(150, 170, 250, 30);

        fobj.add(Messagelabel);
        fobj.add(tobj);
        fobj.add(bobj);
        fobj.add(Resultlabel);

        bobj.addActionListener(this);

        fobj.setLayout(null);
        fobj.setSize(width, height);
        fobj.setVisible(true);
        fobj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try {
            Socket sobj = new Socket("localhost", 5100);
            System.out.println("Client connected to server successfully.");

            PrintStream pobj = new PrintStream(sobj.getOutputStream());
            BufferedReader bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

            String msg = tobj.getText();
            pobj.println(msg);
            System.out.println("Client sent: " + msg);

            String reply = bobj1.readLine();
            System.out.println("Server says: " + reply);
            Resultlabel.setText("Server: " + reply);

            bobj1.close();
            pobj.close();
            sobj.close();
        } 
        catch (IOException e) {
            e.printStackTrace();
            Resultlabel.setText("Error: " + e.getMessage());
        }
    }
}

class GUIChatClient
{
    public static void main(String A[])
    {
        ChatClient cobj = new ChatClient("Client", 400, 300);
    }
}
