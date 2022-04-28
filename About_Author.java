package damage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class About_Author extends JDialog {
	private static final long serialVersionUID = -8684565407224526832L;
	private final JPanel contentPanel = new JPanel();
	public About_Author() {
		setTitle("\u5173\u4E8E\u4F5C\u8005");
		setResizable(false);
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(new BorderLayout(0, 0));
		{
			JTextArea text = new JTextArea("\u4E00\u4E2A\u666E\u666E\u901A\u901A\u7684\u5728\u6821\u5927\u5B66\u751F\r\n\u662F\u8230\u957F\u517C\u65C5\u884C\u8005\u517C\u535A\u58EB\u517C\u79C3\u5B50\r\n\u4F1A\u505A\u4E00\u4E9B\u6709\u610F\u601D\u7684\u4E1C\u897F\r\n\u6B22\u8FCE\u5173\u6CE8\u6211\u7684\u4E3B\u9875");
			text.setLineWrap(true);
			text.setEditable(false);
			text.setFont(new Font("等线", Font.PLAIN, 18));
			contentPanel.add(text, BorderLayout.CENTER);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JLabel label = new JLabel("\u8BBF\u95EE\u6211\u7684\u4E3B\u9875");
				label.setForeground(new Color(0, 0, 255));
				label.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						openurl();
					}
				});
				buttonPane.add(label);
			}
			{
				JButton okButton = new JButton("\u5173\u95ED");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				okButton.setFont(new Font("等线", Font.PLAIN, 14));
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
		}
	}
	private void openurl() {
		try {
			Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+Head.url);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
