import java.awt.*;
import java.io.*;
import java.awt.event.*;

class Search implements KeyListener
{
	Frame frame;
	TextField t1;
	Panel panel1;
	List list1;
	Label l1;
	
	Search()
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
		l1.setBounds(20,50,100,30);
		l1.setFont(new Font("Arial Rounded MT bold",1,16));
		frame.add(l1);
		
		t1 = new TextField();
		t1.setBounds(160,50,220,30);
		t1.addKeyListener(this);
		frame.add(t1);
		
		panel1 = new Panel();
		panel1.setBounds(20,110,360,270);
		panel1.setLayout(null);
		panel1.setBackground( new Color(112, 135, 161));
		frame.add(panel1);
		
		list1 = new List();
		list1.setBounds(20,20,320,230);
		//list1.setBackground(Color.red);
		panel1.add(list1);
	}
	
	public void keyPressed(KeyEvent e)
    {
        list1.removeAll();
    }
 
    public void keyReleased(KeyEvent e)
    {
        
        try
        {
			String s=(String)t1.getText();
			//System.out.println(s);
			String str;
			File f=new File("D:\\java\\project\\PhoneBook\\contacts.txt");
			FileReader fr=new FileReader(f);
			BufferedReader br=new BufferedReader(fr);
			
			while( (str=br.readLine()) !=null)
			{
				if(str.startsWith(s))
				{
					list1.add(str);
				}
			}
			br.close();
		}
       
	   catch(IOException x)
		{
			System.out.println(x.getMessage());
		}
	}
    
	public void keyTyped(KeyEvent e)
	{
	}
}