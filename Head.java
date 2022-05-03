package damage;

public class Head {
	public static enum Yuhun_Type  {
			破势,狂骨,鸣屋,心眼,网切,海月火玉,贝吹坊,恶楼,涂佛,兵主部,镇墓兽,伤魂鸟
	}
	/*
	 * 1 - 破势 - 高于70%血量40%增伤
	 * 2 - 狂骨 - 每点鬼火转化为8%伤害
	 * 3 - 鸣屋 - 对被控制目标伤害提升45%
	 * 4 - 心眼 - 每降低15%血量提升10%伤害
	 * 5 - 网切 - 无视45%防御
	 * 6 - 海月火玉 - 多消耗一点鬼火，伤害提升40%
	 * 7 - 贝吹坊 - 25%增伤
	 * 8 - 恶楼 - 80%增伤
	 * 9 - 涂佛 - 30%增伤
	 * 10 - 兵主部 - 每层无视75防御，上限3层
	 * 11 - 镇墓兽 - 自身每降1%血量提升0.5%爆伤
	 * 12 - 伤魂鸟 - 每阵亡一个非怪物目标提升20%伤害，上限120%
	 * */
	public static double Player_Attack;
	public static double Player_Baoji;
	public static double Player_Baoshang;
	public static double Target_Defense;
	public static final String version="1.4.0";
	public static final String text_about = "本程序由WeedyEver开发\n"
			+ "基于Java8编写\n"
			+ "部分图标归原作者Foggycloud07所有\n"
			+ "未经允许,不得用于商业用途,否则将视为侵权\n"
			+ "作者联系方式:WeedyEver@163.com\n"
			+ "本程序基于MIT协议进行开源,修改请注明原作者与出处";
	public final static String[] yuhun_text = {
			null,null,"当前鬼火数",null,"血量百分比",null,null,null,null,null,"兵主部层数","血量百分比","阵亡目标数",null
	};
	public static final String qrcode_path = "icons/QRCode.png";
	public static final String[] ErrMessage = {
			null,"请填入式神攻击!","请填入式神暴击!(默认为10)","请填入式神暴击伤害!(默认为150)","请填入倍率!(默认为100)",
			"请填入目标防御!(默认为500)","请输入buff值!(默认为0)"
	};
	public static final int ERROR = -4396;
	public static final String ERRORMSG = "ERROR";
	public static boolean isError = false;
	public static class ZeroException extends Exception{
		private static String msg;
		public ZeroException() {
			msg = "Input is zero!";
		}
		public ZeroException(String s) {
			msg = s;
		}
		public static void print() {
			System.err.println(msg);
		}
		private static final long serialVersionUID = 5770759398368757423L;
	}
	public static class MinusException extends Exception{
		private static final long serialVersionUID = -7544805225996232018L;
		private static String msg;
		public MinusException() {
			msg = "Input is minus!";
		}
		public MinusException(String s) {
			msg = s;
		}
		public static void print() {
			System.err.println(msg);
		}
	}
	public static final String tiptext = "依次填入各项数据，不要遗漏\r\n"
			+ "点击开始计算即可工作\r\n"
			+ "程序可能会有些许误差，一般在±5%以内，影响不大";
	public static String output_text = "";
	public static final String Whatsnew = "V1.0版本更新日志\r\n"
			+ "基本功能的实现\r\n"
			+ "加入了相当多的防呆设计\r\n"
			+ "\n"
			+ "\n"
			+ "V1.1.0版本更新日志\n"
			+ "加入了菜单栏，优化了按钮的数量\n"
			+ "修改了部分头文件，加入了新功能\n"
			+ "\n"
			+ "\n"
			+ "V1.2.0版本更新日志\n"
			+ "加入了对于负数的确认，日后可能会加入负数模式\n"
			+ "\n"
			+ "\n"
			+ "V1.3.0版本更新日志\n"
			+ "加入了负数模式\n"
			+ "加入了新的错误处理机制\n"
			+ "\n"
			+ "\n"
			+ "V1.4.0版本更新日志\n"
			+ "修复了一个严重bug,该bug曾导致,当选择某些特定御魂类型的时候,程序不能工作\n"
			+ "加入了选择特定御魂类型时,对输入框合法性的判定\n";
	public static final String url = "https://afdian.net/@weedy";
	public static final String errortips = "程序运行时发生错误!\n"
			+ "若想联系开发者修复此问题,点击反馈按钮\n"
			+ "若想继续使用软件,点击关闭按钮\n"
			+ "请注意,发生错误后,软件的运行可能会不稳定,不建议继续使用";
	public static final String errordeal = "作者联系方式:WeedyEver@163.com\n"
			+ "请将此窗口截屏,附上简单的文字描述,说明在错误发生前您进行了什么操作\n"
			+ "如果可以,请找到error.log文件(一般和程序同一目录下),将其一并发送\n"
			+ "感谢您的配合,所有反馈的bug都会在日后更新中修复!\n"
			+ "为了保证您的使用体验,建议关闭程序";
	
}
