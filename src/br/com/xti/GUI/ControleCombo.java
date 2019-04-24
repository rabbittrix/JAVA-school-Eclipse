package br.com.xti.GUI;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ControleCombo extends JFrame implements ItemListener {
	
	JComboBox<String> combo;
	JLabel label;
	ImageIcon[] imagens = {
			new ImageIcon(getClass().getResource("/Fotos/images (1).jpg")),
			new ImageIcon(getClass().getResource("/Fotos/images (2).jpg")),
			new ImageIcon(getClass().getResource("/Fotos/images (3).jpg")),
			new ImageIcon(getClass().getResource("/Fotos/images (4).jpg")),
			new ImageIcon(getClass().getResource("/Fotos/images (5).jpg")),
	};
	
	public ControleCombo() {
		super("Album de Fotos");
		
		Container c = getContentPane();
		
		combo = new JComboBox<String>();
		combo.setFont(new Font("serif", Font.PLAIN, 26));
		combo.addItem("Imagem 1");
		combo.addItem("Imagem 2");
		combo.addItem("Imagem 3");
		combo.addItem("Imagem 4");
		combo.addItem("Imagem 5");
		combo.addItemListener(this);
		
		label = new JLabel(imagens[0]);
		
		c.add(BorderLayout.NORTH, combo);
		c.add(BorderLayout.CENTER, label);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 530);
		setVisible(true);
	}

	public static void main(String[] args) {
		new ControleCombo();

	}

	@Override
	public void itemStateChanged(ItemEvent e) {
		if(e.getStateChange() == ItemEvent.SELECTED) {
			label.setIcon(imagens[combo.getSelectedIndex()]);
		}
		
	}

}
