package damage;

import javax.swing.JOptionPane;

public class Funcs {
	public static boolean is_str_empty(String str) {
		char temp[] = str.toCharArray();
		for(char e:temp) {
			if(e != ' ') {
				return false;
			}
		}
		return true;
	}
	private static boolean isWangqie = false;
	private static boolean isHuang = false;
	private static boolean isMinus = false;
	private static int Bingzhubu_level = 0;
	public class QStack<T>{
		public static final int INPUT_FROM_HEAD = 1;
		public static final int INPUT_FROM_TAIL = 2;
		private static final int DEAFULT_SIZE = 255;
		private Object[] elements;
		private int size;
		public QStack() {
			this(DEAFULT_SIZE);
		}
		private int size() {
			return size;
		}
		public QStack(int nums) {
			if(nums <=0) {
				throw new IllegalArgumentException("Nums <= 0");
			}
			if(nums > Integer.MAX_VALUE) {
				throw new IllegalArgumentException("Nums >"+Integer.MAX_VALUE);
			}
			elements = new Object[nums];
			size = 0;
		}
		public T push(T ele) {
			if(size >= elements.length) {
				grow();
			}
			elements[size++] = ele;
			return ele;
		}
		public T pop() {
			if(isEmpty()) {
				return null;
			}
			int len = size();
			T ele = peek();
			size--;
			elements[len-1] = null;
			return ele;
		}
		@SuppressWarnings("unchecked")
		public T peek() {
			int len = size();
			if(len == 0)
				throw new RuntimeException("QStack is empty");
			return (T)elements[len-1];
		}
		private void grow() {
			int oldlen = elements.length;
			Object[] old = elements;
			elements = new Object[oldlen*2];
			for(int i = 0;i < oldlen;i++) {
				elements[i] = old[i];
			}
			old = null;
		}
		public boolean isEmpty() {
			return size == 0;
		}
	}
	public class Buff{
		double amount;
		Buff(){
			amount = 0.0;
		}
		Buff(double a){
			amount = a;
		}
		public double getAmount() {
			return this.amount;
		}
	}
	public static Buff bufftemp;
	public static QStack<Buff> more_att_stack ;
	public static QStack<Buff> more_dam_stack;
	public static QStack<Buff> less_def_stack;
	public static QStack<Buff> attack_up_stack;
	//more_att - 造成伤害增加
	//more_dam - 受到伤害增加
	//less_def 防御减少
	//attack_up 攻击力增加
	public static void buffadd(int type)throws Exception{//增加buff,type代表对应的类型
		Funcs T = new Funcs();
		Buff temp = T.new Buff();
		double val = 0.0;
		switch(type) {
		case 1:
			val = Double.valueOf(Main.damage_add.getText());
			if(val <=0) {
				JOptionPane.showMessageDialog(null, "输入框中请输入正数","错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
			temp.amount = val;
			more_att_stack.push(temp);
			Main.add_reset_text(1);
			break;
		case 2:
			val = Double.valueOf(Main.receive_add.getText());
			if(val <=0) {
				JOptionPane.showMessageDialog(null, "输入框中请输入正数","错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
			temp.amount = val;
			more_dam_stack.push(temp);
			Main.add_reset_text(2);
			break;
		case 3:
			val = Double.valueOf(Main.def_decline.getText());
			if(val <=0) {
				JOptionPane.showMessageDialog(null, "输入框中请输入正数","错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
			temp.amount = val;
			less_def_stack.push(temp);
			Main.add_reset_text(3);
			break;
		case 4:
			val = Double.valueOf(Main.attack_up.getText());
			if(val <=0) {
				JOptionPane.showMessageDialog(null, "输入框中请输入正数","错误",JOptionPane.ERROR_MESSAGE);
				return;
			}
			temp.amount = val;
			attack_up_stack.push(temp);
			Main.add_reset_text(4);
			break;
		default:
			throw new NumberFormatException("From function \"buffadd\" : Type input is illegal!");
		}
	}
	public static void buffdel(int type)throws Exception{//撤销增加buff,type代表对应的类型
		switch(type) {
		case 1:
			more_att_stack.pop();
			Main.del_reset_text(1);
			break;
		case 2:
			more_dam_stack.pop();
			Main.del_reset_text(2);
			break;
		case 3:
			less_def_stack.pop();
			Main.del_reset_text(3);
			break;
		case 4:
			attack_up_stack.pop();
			Main.del_reset_text(4);
			break;
		default:
			throw new NumberFormatException("From function \"buffdel\" : Type input is illegal!");
		}
	}
	private static int getYuhunindex() {
		int index = Main.Yuhuntype.getSelectedIndex();
		return index;
	}
	private static void origin_set() {
		double temp;
		String str_temp = null;
		str_temp = Main.attack.getText();
		temp = Double.valueOf(str_temp) ;
		Head.Player_Attack = temp;
		str_temp = Main.baoji.getText();
		temp = Double.valueOf(str_temp);
		Head.Player_Baoji = temp;
		str_temp = Main.baoshang.getText();
		temp = Double.valueOf(str_temp);
		Head.Player_Baoshang = temp;
		str_temp = Main.defense.getText();
		temp = Double.valueOf(str_temp);
		Head.Target_Defense = temp;
		isHuang = Main.ifHuang.isSelected();
	}
	private static double Yuhun_section()throws Exception{
		double result = 0.0;
		int index = getYuhunindex()+1;
		double temp = 0.0;
		switch(index) {
		case 1://破势
			result = 0.4;
			break;
		case 2://狂骨
			temp = Double.valueOf(Main.Yuhun_sup.getText());
			result = Math.round(temp) * 0.08;
			break;
		case 3://鸣屋
			result = 0.45;
			break;
		case 4://心眼
			int amount = Integer.valueOf(Main.Yuhun_sup.getText());
			if(amount > 85 && amount <= 100) {
				result = 0.0;
			}else if(amount > 70 && amount <= 85) {
				result = 0.10;
			}else if(amount > 55 && amount <= 70) {
				result = 0.20;
			}else if (amount > 40 && amount <= 55) {
				result = 0.30;
			}else if(amount > 25 && amount <= 40) {
				result = 0.40;
			}else if (amount > 0 && amount <= 25) {
				result = 0.50;
			}else {
				IllegalArgumentException e = new IllegalArgumentException("From function \"Yuhun_section\" : Illegal amount on Main.Yuhun_sup");
				Main.throwerror(e);
			}
			break;
		case 5:
			isWangqie = true;
			result = 0.0;
			break;
		case 6:
			result = 0.40;break;
		case 7:
			result = 0.25;break;
		case 8:
			result = 0.8;break;
		case 9:
			result = 0.3;break;
		case 10:
			int level = Integer.valueOf(Main.Yuhun_sup.getText());
			Bingzhubu_level = level;
			result = 0.0;
			break;
		case 11:
			amount = Integer.valueOf(Main.Yuhun_sup.getText());
			Head.Player_Baoshang += (double)amount * 0.5;
			result = 0.0;
			break;
		case 12:
			amount = Integer.valueOf(Main.Yuhun_sup.getText());
			amount = amount > 6 ? 6 : 0;
			result = (double)amount * 0.2;
			break;
		default:
			IllegalAccessException e = new IllegalAccessException("From function \"Yuhun_section\" : Type input is illegal!");
			Main.throwerror(e);
		}
		if(isHuang) result += 0.10;
		return result;
	}
	private static QStack<Buff> ArrToStack(double[] arr,int flag)throws Exception{
		Funcs at = new Funcs();
		int len = arr.length,i;
		QStack<Buff> temp = at.new QStack<Buff>(len);
		if(flag == QStack.INPUT_FROM_HEAD) {
			for(i=0;i<len;i++) {
				Buff t = at.new Buff(arr[i]);
				temp.push(t);
			}
		}else if(flag == QStack.INPUT_FROM_TAIL) {
			for(i=len-1;i>=0;i--) {
				Buff t = at.new Buff(arr[i]);
				temp.push(t);
			}
		}else {
			try {
				throw new NumberFormatException("From function ArrToStack:Illegal flag number input!");
			} catch (Exception e) {
				Main.throwerror(e);
			}
			
		}
		return temp;
	}
	private static double more_attack_section() throws Exception {//增伤区，包括所有增伤buff与御魂增伤
		double ans = 1.0,ys = 0;
		double arr[] = new double[more_att_stack.size()];
		int i = 0;
		ys = Yuhun_section();
		if(!more_att_stack.isEmpty()) {
			while(!more_att_stack.isEmpty()) {
				double top = more_att_stack.peek().amount;
				arr[i++] = top;
				more_att_stack.pop();
				ans += top;
			}
			more_att_stack = ArrToStack(arr, QStack.INPUT_FROM_TAIL);
		}
		
		return ans+ys;
	}
	private static double more_damage_section()throws Exception{//脆弱区，包括所有受到伤害增加的buff
		double ans = 1.0;
		double arr[] = new double[more_dam_stack.size()];
		int i =0;
		if(!more_dam_stack.isEmpty()) {
			while(!more_dam_stack.isEmpty()){
				double now = more_dam_stack.peek().getAmount();
				arr[i++] = now;
				more_dam_stack.pop();
				ans += now;
			}
			more_dam_stack = ArrToStack(arr, QStack.INPUT_FROM_TAIL);
		}
		if(ans <= 0) {
			throw new RuntimeException("From function \"more_damage_section\" : answer <= 0");
		}else {
			return ans;
		}
	}
	private static double defense_section()throws Exception{//防御区，根据怪物的基础防御计算的乘区
		double ans = 0.0;//ans - 最终计算的结果
		double def_down = 0.0;//存储减防幅度
		double basic_def = Head.Target_Defense;
		double arr[] = new double[less_def_stack.size()];
		int i = 0;
		if(isWangqie) def_down += 0.45;
		try {
			if(!less_def_stack.isEmpty()) {
				while(!less_def_stack.isEmpty()) {
					double now = less_def_stack.peek().getAmount();
					arr[i++] = now;
					def_down += now;
					less_def_stack.pop();
				}
				less_def_stack = ArrToStack(arr, QStack.INPUT_FROM_TAIL);
			}
			basic_def *= (1-def_down);
			basic_def -= Bingzhubu_level*75;//兵主部无视的固定防御，最后结算
			if(basic_def <= 0 ) basic_def = 0;
			ans = (300.0/(basic_def + 300.0));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ans;
	}
	private static void attack_section() {//攻击区，计算并设置式神最终的攻击力
		double ans = 0.0;
		double now = 0;
		double arr[] = new double[attack_up_stack.size()];
		int i =0;
		try {
			if(!attack_up_stack.isEmpty()) {
				while(!attack_up_stack.isEmpty()) {
					now = attack_up_stack.peek().amount;
					ans += now;
					arr[i++] = now;
					attack_up_stack.pop();
				}
				attack_up_stack = ArrToStack(arr, QStack.INPUT_FROM_TAIL);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
		Head.Player_Attack *= (1 + ans);
		return;
	}
	private static double baoji_section() {
		return Head.Player_Baoshang * 0.01;
	}
	private static double radio_section() {
		return Double.valueOf(Main.radit.getText()) * 0.01;
	}
	private static double damage_false()throws Exception {
		attack_section();
		double res = Head.Player_Attack * more_attack_section() * more_damage_section() * defense_section() * radio_section();
		if(isMinus && res < 0) return -res;
		else return res;
	}
	private static double damage_true()throws Exception{
		double t1 = damage_false();
		double t2 = baoji_section();
		double res = t1*t2;
		if(isMinus && res < 0) return -res;
		else return res;
	}
	private static double damage_best(){
		double ans = 0.0;
		try {
			if(Head.Player_Baoji >= 100) return damage_true();
			ans = (1-Head.Player_Baoji*0.01)*damage_false() + Head.Player_Baoji * 0.01 * damage_true();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return ans;
	}
	public static void work(boolean ifminus) {
		isMinus = ifminus;
		origin_set();
		String output = output_str();
		Head.output_text = output;
	}
	private static String output_str() {
		long up,down;
		String str = "";
		try {
			if(Head.Player_Baoji >= 100) {
				up = Math.round(damage_true() * 1.01);
				down = Math.round(damage_true() * 0.99);
				str += "最大伤害为:\n";
				str += String.format("%d", up);
				str += '\n';
				str += "最小伤害为:\n";
				str += String.format("%d",down);
				str += '\n';
			}
			else {
				str += "暴击情况下\n最大伤害为:\n";
				up = Math.round(damage_true()*1.01);
				down = Math.round(damage_true() * 0.99);
				str += String.format("%d", up);
				str += '\n';
				str += "最小伤害为:\n";
				str += String.format("%d",down);
				str += '\n';
				str += "未暴击情况下\n最大伤害为:\n";
				up = Math.round(damage_false()*1.01);
				down = Math.round(damage_false()*0.99);
				str += String.format("%d", up);
				str += '\n';
				str += "最小伤害为:\n";
				str += String.format("%d",down);
				str += '\n';
				str += "期望伤害为:\n";
				str += String.format("%d",Math.round(damage_best()));
				str += '\n';
			}
		} catch (Exception e) {
			Main.throwerror(e);
		}
		return str;
	}

}
