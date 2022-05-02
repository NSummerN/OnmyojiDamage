package damage;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class ErrorSender extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2476345070843777637L;
	private final JPanel contentPanel = new JPanel();
	private static JTextArea text;
	private static JTextArea dealer;
	private static JLabel errLabel;
	private static JTextArea errorMes;
	public ErrorSender(Exception e) {
		setTitle("Ouch!");
		setModal(true);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		text = new JTextArea();
		text.setFont(new Font("黑体", Font.PLAIN, 18));
		text.setLineWrap(true);
		text.setEditable(false);
		text.setBounds(0, 0, 434, 218);
		text.setText(Head.errortips);
		contentPanel.add(text);
		{
			dealer = new JTextArea();
			dealer.setLineWrap(true);
			dealer.setFont(new Font("黑体", Font.PLAIN, 18));
			dealer.setEditable(false);
			dealer.setBounds(0, 2, 434, 114);
			dealer.setText(Head.errordeal);
			contentPanel.add(dealer);
		}
		
		errLabel = new JLabel("Error Descrption");
		errLabel.setFont(new Font("黑体", Font.PLAIN, 16));
		errLabel.setBounds(0, 126, 54, 15);
		contentPanel.add(errLabel);
		
		errorMes = new JTextArea();
		errorMes.setBounds(0, 139, 434, 79);
		contentPanel.add(errorMes);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton react = new JButton("\u53CD\u9988");
				react.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e1) {
						errordeal(e);
					}
				});
				react.setFont(new Font("黑体", Font.PLAIN, 16));
				react.setActionCommand("");
				buttonPane.add(react);
				getRootPane().setDefaultButton(react);
			}
			{
				JButton close = new JButton("\u5173\u95ED");
				close.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						dispose();
					}
				});
				close.setFont(new Font("黑体", Font.PLAIN, 16));
				close.setActionCommand("Cancel");
				buttonPane.add(close);
			}
		}
		text.setVisible(true);
		dealer.setVisible(false);
		errLabel.setVisible(false);
		errorMes.setVisible(false);
	}
	private void errordeal(Exception e) {
			text.setVisible(false);
			dealer.setVisible(true);
			errLabel.setVisible(true);
			errorMes.setVisible(true);
			String str = e.getMessage();
			errorMes.setText(str);
			return;
	}
}
