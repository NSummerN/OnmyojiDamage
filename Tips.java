package damage;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;

public class Tips extends JDialog {
	private static final long serialVersionUID = -6927136039217828242L;
	private JPanel contentPane;
	private JScrollPane jsp;
	private JButton btnNewButton;
	public Tips() {
		setResizable(false);
		setTitle("\u4F7F\u7528\u8BF4\u660E");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u4F7F\u7528\u8BF4\u660E");
		lblNewLabel.setBounds(177, 0, 80, 33);
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 20));
		contentPane.add(lblNewLabel);
		
		JTextArea textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("等线", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(10, 33, 414, 218);
		
		jsp = new JScrollPane(textArea);
		jsp.setBounds(13, 29, 411, 192);
		contentPane.add(jsp);
		
		textArea.setText(Head.tiptext);
		
		btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.setBounds(164, 231, 93, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("等线", Font.PLAIN, 12));
		contentPane.add(btnNewButton);
		
	}
	
}
