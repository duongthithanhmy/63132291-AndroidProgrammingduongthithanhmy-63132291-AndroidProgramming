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
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhDoiDonVi extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNhap;
	private JTextField txtKetQua;

	
	public ManHinhDoiDonVi() {
		setTitle("ĐỔI ĐƠN VỊ TIỀN TỆ");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 720, 399);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNhap = new JLabel("Nhập VNĐ");
		lblNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNhap.setBounds(49, 67, 117, 38);
		contentPane.add(lblNhap);
		
		txtNhap = new JTextField();
		txtNhap.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtNhap.setBounds(190, 67, 340, 38);
		contentPane.add(txtNhap);
		txtNhap.setColumns(10);
		
		JButton btnUsd = new JButton("USD");
		btnUsd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamDoiUsd();
			}
		});
		btnUsd.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnUsd.setBounds(59, 181, 87, 38);
		contentPane.add(btnUsd);
		
		JButton btnEur = new JButton("EUR");
		btnEur.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamDoiEur();
			}
		});
		btnEur.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEur.setBounds(172, 181, 87, 38);
		contentPane.add(btnEur);
		
		JButton btnNdt = new JButton("NDT");
		btnNdt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamDoiNdt();
			}
		});
		btnNdt.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNdt.setBounds(283, 181, 87, 38);
		contentPane.add(btnNdt);
		
		JButton btnYen = new JButton("YÊN");
		btnYen.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamDoiDongYen();
			}
		});
		btnYen.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnYen.setBounds(396, 181, 87, 38);
		contentPane.add(btnYen);
		
		JButton btnWon = new JButton("WON");
		btnWon.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HamDoiDongWon();
			}
		});
		btnWon.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnWon.setBounds(513, 181, 87, 38);
		contentPane.add(btnWon);
		
		JLabel lblKtQu = new JLabel("Kết quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblKtQu.setBounds(49, 258, 117, 38);
		contentPane.add(lblKtQu);
		
		txtKetQua = new JTextField();
		txtKetQua.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtKetQua.setEnabled(false);
		txtKetQua.setEditable(false);
		txtKetQua.setColumns(10);
		txtKetQua.setBounds(190, 258, 340, 38);
		contentPane.add(txtKetQua);
	}
	void HamDoiUsd() {
		//lấy dữ liệu từ điều khiển
		String str_VND = txtNhap.getText();
		//tỉ giá hoán đổi
		double change = 23000;
		//chuyển kiểu
		Double VND = Double.parseDouble(str_VND);
		//tính toán
		double doi = VND/change;
		//Đưa ra hiển thị lên điều khiển
		txtKetQua.setText(String.valueOf(doi));
	}
	void HamDoiEur() {
		
	}
	void HamDoiNdt() {
		
	}
	void HamDoiDongYen() {
		
	}
	void HamDoiDongWon(){
		
	}
}
