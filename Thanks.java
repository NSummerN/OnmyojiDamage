package damage;

import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import java.awt.Color;

public class Thanks extends JDialog {
	private static final long serialVersionUID = -6927136039217828242L;
	private JPanel contentPane;
	private JScrollPane jsp;
	private JButton btnNewButton;
	private JLabel lblNewLabel_1;
	private JTextArea textArea;
	public Thanks() {
		setModal(true);
		setResizable(false);
		setTitle("\u9E23\u8C22");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u611F\u8C22\u4EE5\u4E0B\u5927\u4F6C\u7684\u652F\u6301");
		lblNewLabel.setBounds(13, 0, 197, 33);
		lblNewLabel.setFont(new Font("黑体", Font.PLAIN, 16));
		contentPane.add(lblNewLabel);
		
		textArea = new JTextArea();
		textArea.setLineWrap(true);
		textArea.setFont(new Font("等线", Font.PLAIN, 16));
		textArea.setEditable(false);
		textArea.setBounds(10, 33, 414, 218);
		
		jsp = new JScrollPane(textArea);
		jsp.setBounds(13, 29, 411, 192);
		contentPane.add(jsp);
		
		textArea.setText(Head.sponsors_list);
		
		btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.setBounds(331, 231, 93, 23);
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				dispose();
			}
		});
		btnNewButton.setFont(new Font("黑体", Font.PLAIN, 16));
		contentPane.add(btnNewButton);
		
		lblNewLabel_1 = new JLabel("\u652F\u6301\u4F5C\u8005");
		lblNewLabel_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				openurl();
			}
		});
		lblNewLabel_1.setForeground(Color.BLUE);
		lblNewLabel_1.setFont(new Font("黑体", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(13, 231, 61, 20);
		contentPane.add(lblNewLabel_1);
		change_text();
		
	}
	private void openurl() {
		try {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+Head.url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	private void change_text() {
		String str = textArea.getText();
		if(Funcs.is_str_empty(str)) {
			textArea.setText(Head.null_list);
		}
	}
}