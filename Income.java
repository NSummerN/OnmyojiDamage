package damage;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Income extends JDialog {
	private static final long serialVersionUID = 5844587806555068480L;
	private JPanel contentPane;
	public Income() {
		setModal(true);
		setResizable(false);
		setTitle("\u8D5E\u52A9");
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 720, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JButton btnNewButton = new JButton("\u5173\u95ED");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				shutdown();
			}
		});
		btnNewButton.setFont(new Font("µ»œﬂ", Font.PLAIN, 16));
		contentPane.add(btnNewButton, BorderLayout.SOUTH);
		
		JLabel label = new JLabel("");
		label.setBackground(Color.white);
		label.setForeground(Color.white);
		try {
			label.setIcon(new ImageIcon(ImageIO.read(new File(Head.qrcode_path))));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		contentPane.add(label, BorderLayout.CENTER);
	}
	private void shutdown() {
		this.dispose();
	}
}
