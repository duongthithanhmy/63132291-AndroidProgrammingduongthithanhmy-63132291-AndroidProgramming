package ntu_63132291;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JList;
import javax.swing.JMenuBar;
import javax.swing.JCheckBox;
import java.awt.Choice;

public class ManHinhDoiDonVi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	
	public ManHinhDoiDonVi() {
		setTitle("ĐỔI ĐƠN VỊ TIỀN TỆ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		Choice choice = new Choice();
		choice.setFont(new Font("Dialog", Font.PLAIN, 20));
		choice.setBounds(112, 53, 104, 33);
		contentPane.add(choice);
		
		Choice choice_1 = new Choice();
		choice_1.setFont(new Font("Dialog", Font.PLAIN, 20));
		choice_1.setBounds(314, 53, 95, 26);
		contentPane.add(choice_1);
		
		JLabel lblNewLabel = new JLabel("->");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setBounds(254, 53, 54, 28);
		contentPane.add(lblNewLabel);
	}
}
