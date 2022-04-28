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
	public static final String version="1.2.0";
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
	public static int ErrorID = -1;
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
			+ "加入了对于负数的确认，日后可能会加入负数模式\n";
	public static final String url = "https://afdian.net/@weedy";
	
}
