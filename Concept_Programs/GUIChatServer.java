import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.net.*;

class ChatServer implements ActionListener
{
    JFrame fobj;
    JTextField tobj;
    JButton bobj;
    JLabel Messagelabel, Resultlabel;

    ServerSocket ssobj;
    Socket sobj;
    PrintStream pobj;
    BufferedReader bobj1;

    public ChatServer(String title, int width, int height)
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

        // ✅ Start the server immediately
        try {
            ssobj = new ServerSocket(5100);
            System.out.println("Server is waiting at port 5100...");
            sobj = ssobj.accept(); // waits for client connection
            System.out.println("Client connected successfully.");

            pobj = new PrintStream(sobj.getOutputStream());
            bobj1 = new BufferedReader(new InputStreamReader(sobj.getInputStream()));

            // ✅ Receive message from client
            String clientMsg = bobj1.readLine();
            System.out.println("Client says: " + clientMsg);
            Resultlabel.setText("Client: " + clientMsg);
        } 
        catch (IOException e) {
            e.printStackTrace();
            Resultlabel.setText("Error: " + e.getMessage());
        }
    }

    public void actionPerformed(ActionEvent aobj)
    {
        try {
            String reply = tobj.getText();
            pobj.println(reply);
            System.out.println("Server replied: " + reply);
        } 
        catch (Exception e) {
            e.printStackTrace();
            Resultlabel.setText("Error: " + e.getMessage());
        }
    }
}

class GUIChatServer
{
    public static void main(String A[])
    {
        ChatServer cobj = new ChatServer("Server", 400, 300);
    }
}
