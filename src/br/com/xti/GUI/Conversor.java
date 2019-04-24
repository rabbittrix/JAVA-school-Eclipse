package br.com.xti.GUI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.text.Format;
import java.awt.event.ActionEvent;

public class Conversor extends JFrame {

	private JPanel contentPane;
	private JTextField fValor;
	private JTextField cValor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Conversor frame = new Conversor();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Conversor() {
		setTitle("Conversor de Temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 197);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnConverter = new JButton("Converter");
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DecimalFormat df = new DecimalFormat("###,##0.00 ºC");
				try {
					double fahrenheit = Double.parseDouble(fValor.getText());
					double celsius = (fahrenheit - 32)/ 1.8;
					cValor.setText(df.format(celsius));
				}catch (Exception erro) {}
				
			}
		});
		btnConverter.setFont(new Font("Tahoma", Font.PLAIN, 26));
		contentPane.add(btnConverter, BorderLayout.SOUTH);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(new GridLayout(2, 2, 5, 5));
		
		JLabel lblFahrenheit = new JLabel("Fahrenheit:");
		lblFahrenheit.setFont(new Font("Tahoma", Font.PLAIN, 26));
		lblFahrenheit.setHorizontalAlignment(SwingConstants.CENTER);
		panel.add(lblFahrenheit);
		
		fValor = new JTextField();
		fValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(fValor);
		fValor.setColumns(10);
		
		JLabel lblCelsius = new JLabel("Celsius:");
		lblCelsius.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelsius.setFont(new Font("Tahoma", Font.PLAIN, 26));
		panel.add(lblCelsius);
		
		cValor = new JTextField();
		cValor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		panel.add(cValor);
		cValor.setColumns(10);
	}

}
