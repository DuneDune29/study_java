package ActionEventTest2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

class MyFrame extends JFrame implements ActionListener {
	private JButton button;
	private JLabel label;

	public MyFrame() {
		this.setSize(250, 150);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setTitle("이벤트 예제");

		JPanel panel = new JPanel();
		button = new JButton("버튼을 누르시오");

		label = new JLabel("아직 버튼이 눌러지지 않았습니다.");
		button.addActionListener(this);
		panel.add(button);
		panel.add(label);
		
		this.add(panel);
		this.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
			if (e.getSource() == button) {
				label.setText("마침내 버튼이 눌러졌습니다."); // private이기때문에 불가능.
			}
		}
	}

	public class ActionEventTest {
		public static void main(String[] args) {
			MyFrame f = new MyFrame();
		}
	}