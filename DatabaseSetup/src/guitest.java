import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class guitest extends JFrame {
	JPanel p1;
	Container co;
	JLabel l;
	JButton b1;
	JTextField t1;

	/**
	 * @param args
	 */
	public guitest() {
		p1 = new JPanel(new GridLayout(1, 2));
		co = getContentPane();
		l = new JLabel("Username");
		b1 = new JButton("Submit");
		t1 = new JTextField();
		p1.add(l);
		p1.add(t1);

		p1.add(b1);
		co.add(p1);
		setVisible(true);
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
			System.out.println(t1.getText());	
			}
		});
	}

}
