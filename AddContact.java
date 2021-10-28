import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class AddContact implements ActionListener
{
	Frame frame;
	TextField t1,t2;
	Panel panel1;
	Label l1,l2,l3;
	Button b1,b2;
	
	AddContact()
	{
		frame = new Frame();
		frame.setLayout(null);
		frame.setBackground( new Color(194, 215, 242));
		frame.setVisible(true);
		frame.setSize(400,400);
		
		frame.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				frame.dispose();
			}
		});
		
		l1 = new Label("Enter name:");
		l1.setBounds(20,130,100,30);
		l1.setFont(new Font("Arial Rounded MT bold",1,16));
		frame.add(l1);
		
		t1 = new TextField();
		t1.setBounds(160,130,220,30);
		frame.add(t1);
		
		l2 = new Label("Enter number:");
		l2.setBounds(20,180,120,30);
		l2.setFont(new Font("Arial Rounded MT bold",1,16));
		frame.add(l2);
		
		t2 = new TextField();
		t2.setBounds(160,180,220,30);
		frame.add(t2);
		
		l3 = new Label("Add Contact");
		l3.setBounds(100,50,200,60);
		l3.setFont(new Font("Arial Rounded MT bold",1,30));
		frame.add(l3);
		
		b1 = new Button("Save");
		b1.setBounds(80,260,100,40);
		b1.setBackground( new Color(218, 228, 240));
		b1.setFont(new Font("Arial Rounded MT bold",1,18));
		b1.addActionListener(this);
		frame.add(b1);
		
		b2 = new Button("Exit");
		b2.setBounds(200,260,100,40);
		b2.setBackground( new Color(218, 228, 240));
		b2.setFont(new Font("Arial Rounded MT bold",1,18));
		b2.addActionListener(this);
		frame.add(b2);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		if(e.getSource() == b1)
		{
			String data = t1.getText() + ":" + t2.getText();
			try
			{	
				// we can write any one of these 
				//PrintWriter pw = new PrintWriter( new FileWriter( new File ("D:\\MCA\\java\\project\\PhoneBook\\contacts.txt"),true));
				System.out.println("b1");
				File f = new File("D:\\java\\project\\PhoneBook\\contacts.txt");
				FileWriter fw = new FileWriter(f,true);
				PrintWriter pw = new PrintWriter( fw );
				
				pw.println(data);
				pw.close();
				fw.close();
				
				JOptionPane.showMessageDialog(null,"Contact Saved");
				
			}
			
			catch(IOException e1)
			{
				e1.getMessage();
			}
		}
		
		else
		{
			JOptionPane.showConfirmDialog(null,"Would u like to exit");
			frame.dispose();
		}
	
	}
			
}