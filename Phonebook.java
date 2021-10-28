import java.awt.*;
import java.awt.event.*;

class Phonebook implements ActionListener 
{
	Frame frame;
	Label l1;
	Button b1,b2,b3;
	
	Phonebook()
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
		
		l1 = new Label("PhoneBook");
		l1.setBounds(100,80,200,60);
		//l1.setBackground(Color.cyan);
		l1.setFont(new Font("Arial Rounded MT bold",1,34));
		frame.add(l1);
		
		b1 = new Button("Add Contact");
		b1.setBounds(120,180,150,40);
		b1.setBackground( new Color(44, 201, 20));
		b1.setFont(new Font("Arial Round MT bold",1,18));
		b1.addActionListener(this);
		frame.add(b1);
		
		b2 = new Button("Search");
		b2.setBounds(120,240,150,40);
		b2.setBackground( new Color(218, 228, 240));
		b2.setFont(new Font("Arial Rounded MT bold",1,18));
		b2.addActionListener(this);
		frame.add(b2);
		
		b3 = new Button("Exit");
		b3.setBounds(120,300,150,40);
		b3.setBackground( new Color(201, 22, 22));
		b3.setFont(new Font("Arial Rounded MT bold",1,18));
		b3.addActionListener(this);
		frame.add(b3);
		
		/*b1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				new Search();
			}
		});*/
		
	}	
	
	public static void main( String ar[] )
	{
		Phonebook ph = new Phonebook();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if (e.getSource() == b1) 
		{
            //frame.dispose();
            new AddContact();
		}
		
		else if (e.getSource() == b2)
		{
			new Search();
		}
		
		else
		{
			frame.dispose();
		}
		
	}
}
	