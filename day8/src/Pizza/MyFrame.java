package Pizza;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame {

	public MyFrame() {

		setSize(600, 150);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("MyFrame");
		JPanel panel = new JPanel();
		//add(panel);
		panel.setBackground(Color.cyan);
		JPanel panelA = new JPanel();
		JPanel panelB = new JPanel();
		panelA.setBackground(Color.yellow);
		panelB.setBackground(Color.orange);
		JLabel label1 = new JLabel("�ڹ� ���ڿ� ���� ���� ȯ���մϴ�. ������ ������ �����Ͻÿ�.");
		panelA.add(label1);

		JButton button1 = new JButton("�޺�����");
		JButton button2 = new JButton("������������");
		JButton button3 = new JButton("�Ұ�������");
		//button1.setBackground(Color.red);
		panelB.add(button1);
		panelB.add(button2);
		panelB.add(button3);

		JLabel label2 = new JLabel("����");
		JTextField field1 = new JTextField(10);
		panelB.add(label2);
		panelB.add(field1);

		panel.add(panelA);
		panel.add(panelB);
		add(panel);
		setVisible(true);
	}
}