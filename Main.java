package damage;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JTextField;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Main extends JFrame {
	private static final long serialVersionUID = 8915376176527799444L;
	private JPanel contentPane;
	public static JTextField baoji;
	public static JTextField baoshang;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	private JLabel lblNewLabel_4;
	public static JTextField radit;
	private JLabel lblNewLabel_5;
	private JLabel lblNewLabel_6;
	public static JTextField damage_add;
	public static JTextField receive_add;
	public static JTextField def_decline;
	private JButton btnNewButton_3;
	private JButton btnNewButton_1_2;
	private JLabel lblNewLabel_7;
	public static JTextField defense;
	public static JTextField Yuhun_sup;
	public static JComboBox<Object> Yuhuntype;
	public static JTextField attack;
	public static JTextField attack_up;
	public static JCheckBox ifHuang;
	private static JLabel Yuhun_sup_label;
	private static JRadioButtonMenuItem normal_mode;
	private static JRadioButtonMenuItem minus_mode;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		origin();
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main frame = new Main();
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
	@SuppressWarnings("deprecation")
	public Main() {
		setTitle("\u9634\u9633\u5E08\u4F24\u5BB3\u8BA1\u7B97\u5668");
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 773, 342);
		
		
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("\u6587\u4EF6(F)");
		mnNewMenu.setMnemonic('F');
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("\u5F00\u59CB\u8BA1\u7B97");
		mntmNewMenuItem_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				start();
			}
		});
		mntmNewMenuItem_1.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_ENTER, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_1);
		
		JMenuItem mntmNewMenuItem_12 = new JMenuItem("\u68C0\u67E5\u66F4\u65B0");
		mntmNewMenuItem_12.setEnabled(false);
		mnNewMenu.add(mntmNewMenuItem_12);
		
		JMenuItem mntmNewMenuItem_6 = new JMenuItem("\u9000\u51FA\u7A0B\u5E8F");
		mntmNewMenuItem_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				exit();
			}
		});
		mntmNewMenuItem_6.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, InputEvent.CTRL_MASK));
		mnNewMenu.add(mntmNewMenuItem_6);
		
		JMenu mnNewMenu_1 = new JMenu("\u5173\u4E8E(A)");
		mnNewMenu_1.setMnemonic('A');
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mntmNewMenuItem_8 = new JMenuItem("\u5173\u4E8E\u7A0B\u5E8F");
		mntmNewMenuItem_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About frame = new About();
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem_8.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F7, 0));
		mnNewMenu_1.add(mntmNewMenuItem_8);
		
		JMenuItem mntmNewMenuItem_7 = new JMenuItem("\u5173\u4E8E\u4F5C\u8005");
		mntmNewMenuItem_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				About_Author frame = new About_Author();
				frame.setVisible(true);
			}
		});
		mntmNewMenuItem_7.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F8, 0));
		mnNewMenu_1.add(mntmNewMenuItem_7);
		
		JMenuItem mntmNewMenuItem_9 = new JMenuItem("\u6350\u8D60");
		mntmNewMenuItem_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Income();
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_9);
		
		JMenuItem mntmNewMenuItem_10 = new JMenuItem("\u66F4\u65B0\u65E5\u5FD7");
		mntmNewMenuItem_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Whatsnew frame = new Whatsnew();
				frame.setVisible(true);
			}
		});
		mnNewMenu_1.add(mntmNewMenuItem_10);
		
		JMenu mnNewMenu_2 = new JMenu("\u5E2E\u52A9(H)");
		mnNewMenu_2.setMnemonic('H');
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mntmNewMenuItem_11 = new JMenuItem("\u4F7F\u7528\u8BF4\u660E");
		mntmNewMenuItem_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tips();
			}
		});
		mntmNewMenuItem_11.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F2, 0));
		mnNewMenu_2.add(mntmNewMenuItem_11);
		
		JMenu mnNewMenu_4 = new JMenu("\u8BBE\u7F6E(S)");
		mnNewMenu_4.setMnemonic('S');
		menuBar.add(mnNewMenu_4);
		
		JMenu mnNewMenu_3_1 = new JMenu("Buff\u6E05\u7A7A");
		mnNewMenu_4.add(mnNewMenu_3_1);
		
		JMenuItem mntmNewMenuItem_14 = new JMenuItem("\u589E\u4F24\u533A");
		mntmNewMenuItem_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetbuff(1);
			} 
		});
		mnNewMenu_3_1.add(mntmNewMenuItem_14);
		
		JMenuItem mntmNewMenuItem_2_1 = new JMenuItem("\u8106\u5F31\u533A");
		mntmNewMenuItem_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetbuff(2);
			}
		});
		mnNewMenu_3_1.add(mntmNewMenuItem_2_1);
		
		JMenuItem mntmNewMenuItem_3_1 = new JMenuItem("\u51CF\u9632\u533A");
		mntmNewMenuItem_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetbuff(3);
			}
		});
		mnNewMenu_3_1.add(mntmNewMenuItem_3_1);
		
		JMenuItem mntmNewMenuItem_4_1 = new JMenuItem("\u52A0\u653B\u533A");
		mntmNewMenuItem_4_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetbuff(4);
			}
		});
		mnNewMenu_3_1.add(mntmNewMenuItem_4_1);
		
		JMenuItem mntmNewMenuItem_5_1 = new JMenuItem("\u5168\u90E8\u6E05\u96F6");
		mntmNewMenuItem_5_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resetbuff(0);
			}
		});
		mnNewMenu_3_1.add(mntmNewMenuItem_5_1);
		
		JMenu mnNewMenu_3 = new JMenu("\u6A21\u5F0F\u5207\u6362");
		mnNewMenu_4.add(mnNewMenu_3);
		
		normal_mode = new JRadioButtonMenuItem("\u5E38\u89C4\u6A21\u5F0F");
		normal_mode.setSelected(true);
		mnNewMenu_3.add(normal_mode);
		
		minus_mode = new JRadioButtonMenuItem("\u8D1F\u6570\u517C\u5BB9\u6A21\u5F0F");
		mnNewMenu_3.add(minus_mode);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("\u5F0F\u795E\u5C5E\u6027");
		lblNewLabel.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 0, 71, 37);
		contentPane.add(lblNewLabel);
		
		attack = new JTextField();
		attack.setFont(new Font("����", Font.PLAIN, 16));
		attack.setBounds(53, 39, 80, 20);
		contentPane.add(attack);
		attack.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("\u653B\u51FB");
		lblNewLabel_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(10, 30, 38, 37);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("\u66B4\u51FB");
		lblNewLabel_1_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1_1.setBounds(137, 31, 38, 37);
		contentPane.add(lblNewLabel_1_1);
		
		baoji = new JTextField();
		baoji.setFont(new Font("����", Font.PLAIN, 16));
		baoji.setColumns(10);
		baoji.setBounds(171, 39, 80, 20);
		contentPane.add(baoji);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("\u66B4\u51FB\u4F24\u5BB3");
		lblNewLabel_1_1_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_1_1_1.setBounds(265, 30, 64, 37);
		contentPane.add(lblNewLabel_1_1_1);
		
		baoshang = new JTextField();
		baoshang.setFont(new Font("����", Font.PLAIN, 16));
		baoshang.setColumns(10);
		baoshang.setBounds(331, 39, 80, 20);
		contentPane.add(baoshang);
		
		lblNewLabel_2 = new JLabel("%");
		lblNewLabel_2.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(251, 42, 14, 15);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_3 = new JLabel("%");
		lblNewLabel_3.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_3.setBounds(415, 42, 14, 15);
		contentPane.add(lblNewLabel_3);
		
		lblNewLabel_4 = new JLabel("\u500D\u7387");
		lblNewLabel_4.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_4.setBounds(432, 42, 38, 15);
		contentPane.add(lblNewLabel_4);
		
		radit = new JTextField();
		radit.setFont(new Font("����", Font.PLAIN, 16));
		radit.setColumns(10);
		radit.setBounds(467, 39, 80, 20);
		contentPane.add(radit);
		
		lblNewLabel_5 = new JLabel("%");
		lblNewLabel_5.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_5.setBounds(549, 42, 14, 15);
		contentPane.add(lblNewLabel_5);
		
		lblNewLabel_6 = new JLabel("\u589E\u4F24\u533A");
		lblNewLabel_6.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_6.setBounds(10, 69, 60, 24);
		contentPane.add(lblNewLabel_6);
		
		damage_add = new JTextField();
		damage_add.setHorizontalAlignment(SwingConstants.LEFT);
		damage_add.setFont(new Font("����", Font.PLAIN, 16));
		damage_add.setText("\u4F24\u5BB3\u589E\u52A0\uFF08\u586B\u5165\u5C0F\u6570\uFF09");
		damage_add.setBounds(10, 103, 170, 31);
		contentPane.add(damage_add);
		damage_add.setColumns(10);
		
		JButton btnNewButton = new JButton("\u6DFB\u52A0");
		btnNewButton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e){
				try {
					if(Funcs.is_str_empty(damage_add.getText())) {
						JOptionPane.showMessageDialog(null, "�����Ϊ��","����",JOptionPane.ERROR_MESSAGE);
					}else if(damage_add.getText().equals("�˺����ӣ�����С����")) {
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else if(damage_add.getText().equals("��ӳɹ�")){
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else {
						Funcs.buffadd(1);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton.setBounds(10, 141, 80, 24);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\u64A4\u9500");
		btnNewButton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Funcs.more_att_stack == null || Funcs.more_att_stack.isEmpty()) 
						JOptionPane.showMessageDialog(null, "û����ӹ��������͵�buff","����",JOptionPane.ERROR_MESSAGE);
					else
						Funcs.buffdel(1);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_1.setBounds(94, 141, 80, 24);
		contentPane.add(btnNewButton_1);
		
		receive_add = new JTextField();
		receive_add.setText("\u53D7\u5230\u4F24\u5BB3\u589E\u52A0\uFF08\u586B\u5165\u5C0F\u6570\uFF09");
		receive_add.setFont(new Font("����", Font.PLAIN, 16));
		receive_add.setColumns(10);
		receive_add.setBounds(185, 103, 199, 31);
		contentPane.add(receive_add);
		
		JButton btnNewButton_2 = new JButton("\u6DFB\u52A0");
		btnNewButton_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str = receive_add.getText();
					if(Funcs.is_str_empty(str)) {
						JOptionPane.showMessageDialog(null, "�����Ϊ��","����",JOptionPane.ERROR_MESSAGE);
					}else if(str.equals("�ܵ��˺����ӣ�����С����")) {
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else if(damage_add.getText().equals("��ӳɹ�")){
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else {
						Funcs.buffadd(2);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_2.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_2.setBounds(185, 141, 80, 24);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("\u64A4\u9500");
		btnNewButton_1_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Funcs.more_dam_stack.isEmpty() || Funcs.more_att_stack == null) 
						JOptionPane.showMessageDialog(null, "û����ӹ��������͵�buff","����",JOptionPane.ERROR_MESSAGE);
					else
						Funcs.buffdel(2);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_1.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_1_1.setBounds(304, 141, 80, 24);
		contentPane.add(btnNewButton_1_1);
		
		def_decline = new JTextField();
		def_decline.setText("\u9632\u5FA1\u51CF\u5C11\uFF08\u586B\u5165\u5C0F\u6570\uFF09");
		def_decline.setFont(new Font("����", Font.PLAIN, 16));
		def_decline.setColumns(10);
		def_decline.setBounds(394, 103, 169, 31);
		contentPane.add(def_decline);
		
		btnNewButton_3 = new JButton("\u6DFB\u52A0");
		btnNewButton_3.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str = def_decline.getText();
					if(Funcs.is_str_empty(str)) {
						JOptionPane.showMessageDialog(null, "�����Ϊ��","����",JOptionPane.ERROR_MESSAGE);
					}else if(str.equals("�������٣�����С����")) {
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else if(damage_add.getText().equals("��ӳɹ�")){
							JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else {
						Funcs.buffadd(3);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_3.setBounds(394, 141, 80, 24);
		contentPane.add(btnNewButton_3);
		
		btnNewButton_1_2 = new JButton("\u64A4\u9500");
		btnNewButton_1_2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Funcs.less_def_stack.isEmpty() || Funcs.less_def_stack == null) 
						JOptionPane.showMessageDialog(null, "û����ӹ��������͵�buff","����",JOptionPane.ERROR_MESSAGE);
					else
						Funcs.buffdel(3);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_2.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_1_2.setBounds(484, 141, 80, 24);
		contentPane.add(btnNewButton_1_2);
		
		lblNewLabel_7 = new JLabel("\u76EE\u6807\u9632\u5FA1");
		lblNewLabel_7.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_7.setBounds(564, 42, 71, 15);
		contentPane.add(lblNewLabel_7);
		
		defense = new JTextField();
		defense.setFont(new Font("����", Font.PLAIN, 16));
		defense.setColumns(10);
		defense.setBounds(633, 39, 91, 20);
		contentPane.add(defense);
		
		Yuhuntype = new JComboBox<Object>();
		Yuhuntype.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int index = Main.Yuhuntype.getSelectedIndex()+1;
			    Main.Yuhun_sup_label.setText(Head.yuhun_text[index]);
			    if(index == 2 || index == 4 || index == 10 || index == 11 || index == 12) {
					Yuhun_sup_label.setVisible(true);
					Yuhun_sup.setVisible(true);
					Yuhun_sup.setEnabled(true);
				}else {
					Yuhun_sup_label.setVisible(false);
					Yuhun_sup.setVisible(false);
				}
			}
		});
		Yuhuntype.setFont(new Font("����", Font.PLAIN, 16));
		Yuhuntype.setModel(new DefaultComboBoxModel<Object>(Head.Yuhun_Type.values()));
		Yuhuntype.setBounds(91, 183, 105, 23);
		contentPane.add(Yuhuntype);
		
		JLabel lblNewLabel_9 = new JLabel("\u5FA1\u9B42\u7C7B\u578B");
		lblNewLabel_9.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_9.setBounds(10, 175, 71, 37);
		contentPane.add(lblNewLabel_9);
		
		Yuhun_sup_label = new JLabel("\u5F53\u524D\u9B3C\u706B\u6570");
		Yuhun_sup_label.setFont(new Font("����", Font.PLAIN, 16));
		Yuhun_sup_label.setBounds(206, 183, 81, 21);
		contentPane.add(Yuhun_sup_label);
		
		Yuhun_sup = new JTextField();
		Yuhun_sup.setEnabled(false);
		Yuhun_sup.setBounds(338, 185, 150, 21);
		contentPane.add(Yuhun_sup);
		Yuhun_sup.setColumns(10);
		
		JButton btnNewButton_4 = new JButton("\u5F00\u59CB\u8BA1\u7B97");
		btnNewButton_4.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				start();
				
			}
		});
		btnNewButton_4.setFont(new Font("����", Font.PLAIN, 24));
		btnNewButton_4.setBounds(53, 216, 200, 45);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_4_1 = new JButton("\u4F7F\u7528\u8BF4\u660E");
		btnNewButton_4_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				tips();
			}
		});
		btnNewButton_4_1.setFont(new Font("����", Font.PLAIN, 24));
		btnNewButton_4_1.setBounds(301, 216, 200, 45);
		contentPane.add(btnNewButton_4_1);
		
		JButton btnNewButton_9 = new JButton("\u9000\u51FA\u7A0B\u5E8F");
		btnNewButton_9.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				exit();
			}
		});
		btnNewButton_9.setFont(new Font("����", Font.PLAIN, 24));
		btnNewButton_9.setBounds(549, 216, 200, 45);
		contentPane.add(btnNewButton_9);
		
		ifHuang = new JCheckBox("\u8352\u9AB7\u9AC5");
		ifHuang.setFont(new Font("����", Font.PLAIN, 16));
		ifHuang.setBounds(551, 186, 103, 23);
		contentPane.add(ifHuang);
		
		attack_up = new JTextField();
		attack_up.setText("\u653B\u51FB\u589E\u52A0 \uFF08\u586B\u5165\u5C0F\u6570\uFF09");
		attack_up.setFont(new Font("����", Font.PLAIN, 16));
		attack_up.setColumns(10);
		attack_up.setBounds(570, 103, 178, 31);
		contentPane.add(attack_up);
		
		JButton btnNewButton_3_1 = new JButton("\u6DFB\u52A0");
		btnNewButton_3_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					String str = attack_up.getText();
					if(Funcs.is_str_empty(str)) {
						JOptionPane.showMessageDialog(null, "�����Ϊ��","����",JOptionPane.ERROR_MESSAGE);
					}else if(str.equals("�������� ������С����")) {
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else if(damage_add.getText().equals("��ӳɹ�")){
						JOptionPane.showMessageDialog(null,"����������","��ʾ",JOptionPane.INFORMATION_MESSAGE);
					}else {
						Funcs.buffadd(4);
					}
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_3_1.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_3_1.setBounds(574, 141, 80, 24);
		contentPane.add(btnNewButton_3_1);
		
		JButton btnNewButton_1_2_1 = new JButton("\u64A4\u9500");
		btnNewButton_1_2_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					if(Funcs.attack_up_stack.isEmpty() || Funcs.attack_up_stack == null) 
						JOptionPane.showMessageDialog(null, "û����ӹ��������͵�buff","����",JOptionPane.ERROR_MESSAGE);
					else
						Funcs.buffdel(4);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}
		});
		btnNewButton_1_2_1.setFont(new Font("����", Font.PLAIN, 16));
		btnNewButton_1_2_1.setBounds(669, 141, 80, 24);
		contentPane.add(btnNewButton_1_2_1);
		
		JLabel lblNewLabel_8 = new JLabel("\u8106\u5F31\u533A");
		lblNewLabel_8.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_8.setBounds(185, 69, 60, 24);
		contentPane.add(lblNewLabel_8);
		
		JLabel lblNewLabel_8_1 = new JLabel("\u51CF\u9632\u533A");
		lblNewLabel_8_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_8_1.setBounds(394, 69, 60, 24);
		contentPane.add(lblNewLabel_8_1);
		
		JLabel lblNewLabel_8_1_1 = new JLabel("\u52A0\u653B\u533A");
		lblNewLabel_8_1_1.setFont(new Font("����", Font.PLAIN, 16));
		lblNewLabel_8_1_1.setBounds(574, 69, 60, 24);
		contentPane.add(lblNewLabel_8_1_1);
		
		Yuhun_sup_label.setVisible(false);
		Yuhun_sup.setVisible(false);
		
		ButtonGroup btg = new ButtonGroup();
		btg.add(normal_mode);
		btg.add(minus_mode);
	}
	public static void add_reset_text(int type)throws RuntimeException{
		final String str = "��ӳɹ�";
		switch(type) {
		case 1:
			damage_add.setText(str);
			break;
		case 2:
			receive_add.setText(str);
			break;
		case 3:
			def_decline.setText(str);
			break;
		case 4:
			attack_up.setText(str);
			break;
		default:
			RuntimeException e = new RuntimeException("From function \"add_reset_text\" : Type input is illegal!");
			throwerror(e);
		}
	}
	public static void del_reset_text(int type)throws Exception {
		final String str = "ɾ���ɹ�";
		switch(type) {
		case 1:
			damage_add.setText(str);
			break;
		case 2:
			receive_add.setText(str);
			break;
		case 3:
			def_decline.setText(str);
			break;
		case 4:
			attack_up.setText(str);
		default:
			RuntimeException e = new RuntimeException("From function \"del_reset_text\" : Type input is illegal!");
			throwerror(e);
		}
	}
	private static void Income() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Income frame = new Income();
					frame.setVisible(true);
				} catch (Exception e) {
					throwerror(e);
				}
			}
		});
	}
	private static void origin() {
		Funcs temp = new Funcs();
		Funcs.more_att_stack = temp.new QStack<>(120);
		Funcs.more_dam_stack = temp.new QStack<>(120);
		Funcs.less_def_stack = temp.new QStack<>(120);
		Funcs.attack_up_stack = temp.new QStack<>(120);
	}
	private static void tips() {
		Tips d = new Tips();
		d.setModal(true);
		d.setVisible(true);
	}
	private static void start() {
		int index = Main.Yuhuntype.getSelectedIndex()+1;
		if(Funcs.is_str_empty(attack.getText())) {
			JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else if(Funcs.is_str_empty(baoji.getText())) {
			JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else if(Funcs.is_str_empty(baoshang.getText())) {
			JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else if(Funcs.is_str_empty(defense.getText())) {
			JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else if(index == 2 || index == 4 || index == 10 || index == 11 || index == 12){
			if(Funcs.is_str_empty(Yuhun_sup.getText()))
				JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else if(Funcs.is_str_empty(radit.getText())){
			JOptionPane.showMessageDialog(null, "�������Ϊ��","����",JOptionPane.ERROR_MESSAGE);
		}else {
			
			if(normal_mode.isSelected() && !minus_mode.isSelected()) {
				double temp;
				temp = Double.valueOf(attack.getText());
				if(temp <= 0) {
					JOptionPane.showMessageDialog(null, "�����������������","����",JOptionPane.ERROR_MESSAGE);
					return;
				}
				temp = Double.valueOf(baoji.getText());
				if(temp <=0) {
					JOptionPane.showMessageDialog(null, "�����������������","����",JOptionPane.ERROR_MESSAGE);
					return;
				}
				temp = Double.valueOf(baoshang.getText());
				if(temp <= 0) {
					JOptionPane.showMessageDialog(null, "�����������������","����",JOptionPane.ERROR_MESSAGE);
					return;
				}
				temp = Double.valueOf(defense.getText());
				if(temp <= 0) {
					JOptionPane.showMessageDialog(null, "�����������������","����",JOptionPane.ERROR_MESSAGE);
					return;
				}
				Funcs.work(false);
			}else if(!normal_mode.isSelected() && minus_mode.isSelected()) {
				Funcs.work(true);
			}else {
				try {
					throw new RuntimeException("From function start: Illegal selection in buttongroup : normal_mode & minus_mode");
				} catch (Exception e) {
					throwerror(e);
				}
			}
			
			try {
				Output dialog = new Output();
				dialog.setModal(true);
				dialog.setVisible(true);
			}catch (Exception e1){
				e1.printStackTrace();
			}
		}
	}
	private  void exit() {
		int op = JOptionPane.showConfirmDialog(null, "ȷ��Ҫ�˳���",null,JOptionPane.OK_CANCEL_OPTION);
		if(op == JOptionPane.OK_OPTION) {
			this.dispose();
		}else if(op == JOptionPane.CANCEL_OPTION) {
			return;
		}else {
			return;
		}
	}
	private void resetbuff(int id) {
		Funcs temp = new Funcs();
		switch(id) {
		case 0:
			if(Funcs.more_att_stack == null || Funcs.more_dam_stack == null) return;
			if(Funcs.less_def_stack == null || Funcs.attack_up_stack == null) return;
			Funcs.more_att_stack = temp.new QStack<>(120);
			Funcs.more_dam_stack = temp.new QStack<>(120);
			Funcs.less_def_stack = temp.new QStack<>(120);
			Funcs.attack_up_stack = temp.new QStack<>(120);
			break;
		case 1:
			if(Funcs.more_att_stack.isEmpty()) return;
			else if(Funcs.more_att_stack == null) return;
			Funcs.more_att_stack = temp.new QStack<>(120);
			break;
		case 2:
			if(Funcs.more_dam_stack.isEmpty()) return;
			else if(Funcs.more_dam_stack == null)return;
			Funcs.more_dam_stack = temp.new QStack<>(120);
			break;
		case 3:
			if(Funcs.less_def_stack.isEmpty()) return;
			else if(Funcs.less_def_stack == null) return;
			Funcs.less_def_stack = temp.new QStack<>(120);
			break;
		case 4:
			if(Funcs.attack_up_stack.isEmpty()) return;
			else if(Funcs.attack_up_stack == null) return;
			Funcs.attack_up_stack = temp.new QStack<>(120);
			break;
		default:
			Exception e = new Exception("From function resetbuff:Illegal id input");
			throwerror(e);
		}
		return;
	}
	public static void throwerror(Exception e) {
		ErrorSender dialog = new ErrorSender(e);
		dialog.setVisible(true);
	}
}
