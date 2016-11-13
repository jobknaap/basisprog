/*
* © Job van der Knaap
* Dit bestand is alleen bedoelt voor educatie doeleinden.
* Het mag niet direct gekopieerd worden of gebruikt worden onder eigen naam.
*/

package nl.jobpc.seconds;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Panel extends JPanel {
	
	private static final long serialVersionUID = 1L;
	
	private JButton <Vul naam in>;
	private JTextField <Vul Naam In>;
	private JTextField <Vul Naam in>;
	private JTextField <Vul Naam in>;
	private JTextField <Vul Naam In>;
	
	public Panel() {
		<Vul naam in> = new JButton("Reken uit");
		<Vul naam in> = new JTextField(10);
		<Vul naam in> = new JTextField(10);
		<Vul naam in> = new JTextField(10);
		<Vul naam in> = new JTextField(10);
		add(<Vul naam in>);
		add(<Vul naam in>);
		add(<Vul naam in>);
		add(<Vul naam in>);
		add(<Vul naam in>);
		<Vul naam in>.setBounds(0, 0, 0, 0);
		<Vul naam in>.setBounds(0, 0, 0, 0);
		<Vul naam in>.setBounds(0, 0, 0, 0);
		<Vul naam in>.setBounds(0, 0, 0, 0);
		<Vul naam in>.setBounds(0, 0, 0, 0);
		<Vul naam in>.addActionListener(new ActionListener() {
			int a = 86400;
			int b = 3600;
			int c = 60;
			
			@Override
			public void actionPerformed(ActionEvent event) { 
				
				int d;
				int e;
				int f;
				int g;
		
				String h = "";
				String i = "";
				String j = "";
				if(!(h == null && !(<Vul naam in>.getText().isEmpty()))) //Textbox 1
					if(!(i == null && !(<Vul naam in>.getText().isEmpty()))) //Textbox 2
						if(!(j == null && !(<Vul naam in>.getText().isEmpty()))){ //Textbox 3

							int x;
							int y;
							int z;
							
							String text = <Vul naam in>.getText();
							x = Integer.parseInt(text);
							
							String text1 = <Vul naam in>.getText();
							y = Integer.parseInt(text1);
							
							String text11 = <Vul naam in>.getText();
							z = Integer.parseInt(text11);

				d = x * a;
				e = y * b;
				f = z * c;
				g = d + e + f;
				
				String <Vul naam in>String = Integer.toString(g); //Textbox 4
				<Vul naam in>.setText(<Vul naam in>String);// Textbox 4
				
				if(!(h == null && !(<Vul naam in>.getText().isEmpty())))
					if(!(i == null && !(<Vul naam in>.getText().isEmpty())))
						if(!(j == null && !(<Vul naam in>.getText().isEmpty()))){
							
						}
				}
			}

		});
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.drawString("Voer het aantal <Vul naam in> in:", 250, 70);
		g.drawString("Voer het aantal <Vul naam in> in:", 250, 120);
		g.drawString("Voer het aantal <Vul naam in> in:", 250, 170);
		g.drawString("De <Vul naam in> is:", 250, 270);
		g.drawString("Seconden", 510, 270);
	}
}
/*
* © Job van der Knaap
* Dit bestand is alleen bedoelt voor educatie doeleinden.
* Het mag niet direct gekopieerd worden of gebruikt worden onder eigen naam.
*/