package sportif;

import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Main
{
	 private JTextField operand = new JTextField();
	 private JLabel result = new JLabel();

	 private ActionListener incrementScore(Foot equipe)
	 {
	  return (e) -> {
		  				equipe.incrementA();
		  				System.out.println(equipe.toString());
	  				 };
	 };
	 
	 private void incrementeLeScore(Foot equipe)
	 {
	  try
	  {
		  equipe.incrementA();
		  result.setText(equipe.getSport());
	  }
	  catch (NumberFormatException e)
	  {
		  result.setText("");
	  }
	 }
	 

	 private JPanel getMainPanel()
	 {
	  JPanel panel = new JPanel();
	  panel.setLayout(new GridLayout(2, 2));
	  panel.add(result);
	  return panel;
	 }
	 
	 public Main()
	 {
		 ArrayList<JButton> jButtons;
		 
		 Foot barça = new Foot("Barcelone");
		 Foot real = new Foot("Real de madrid");
		  JFrame frame = new JFrame();
		  jButtons = new ArrayList<JButton>();
		  frame.setTitle("One More Window !");
		  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		  frame.getContentPane().setLayout(new GridLayout(2, 2));
		  jButtons.add(new JButton(barça.getNom()));
		  jButtons.add(new JButton(real.getNom()));
		  jButtons.add(new JButton(barça.toStringScore()));
		  jButtons.add(new JButton(real.toStringScore()));
		  for (JButton jButton : jButtons)
		  {
		   frame.getContentPane().add(jButton);
		   jButton.addActionListener(incrementScore(barça));
		  }
		  frame.pack();
		  frame.setVisible(true);
	
	 }

 public static void main(String[] args)
 {
  new Main();
 }
}