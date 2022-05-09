package damage;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JDialog;
public class About extends JDialog {
	private static final long serialVersionUID = 8021233550284228130L;
	private JPanel contentPane;
	private JScrollPane jsp;
	private static final String version_info = "V"+Head.version;
	public About() {
		setModal(true);
		setResizable(false);
		setTitle("\u5173\u4E8E\u8F6F\u4EF6");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		JLabel lblNewLabel = new JLabel("\u5173\u4E8E\u8F6F\u4EF6");
		lblNewLabel.setFont(new Font("等线", Font.PLAIN, 20));
		lblNewLabel.setBounds(174, 0, 95, 25);
		contentPane.add(lblNewLabel);
		JTextArea text = new JTextArea();
		text.setLineWrap(true);
		text.setFont(new Font("等线", Font.PLAIN, 16));
		text.setEditable(false);
		text.setBounds(1, 1, 392, 220);
		text.setText(Head.text_about);	
		jsp = new JScrollPane(text);
		jsp.setBounds(13, 29, 411, 192);
		contentPane.add(jsp);
		JButton btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("等线", Font.PLAIN, 14));
		btnNewButton.setBounds(323, 231, 101, 32);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(13, 243, 101, 19);
		lblNewLabel_1.setText(version_info);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("\u9634\u9633\u5E08\u4F24\u5BB3\u8BA1\u7B97\u5668");
		lblNewLabel_2.setFont(new Font("等线", Font.PLAIN, 12));
		lblNewLabel_2.setBounds(13, 231, 101, 15);
		contentPane.add(lblNewLabel_2);
	}
}