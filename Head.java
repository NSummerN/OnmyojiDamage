package damage;

public class Head {
	public static enum Yuhun_Type  {
			����,���,����,����,����,���»���,������,��¥,Ϳ��,������,��Ĺ��,�˻���
	}
	/*
	 * 1 - ���� - ����70%Ѫ��40%����
	 * 2 - ��� - ÿ����ת��Ϊ8%�˺�
	 * 3 - ���� - �Ա�����Ŀ���˺�����45%
	 * 4 - ���� - ÿ����15%Ѫ������10%�˺�
	 * 5 - ���� - ����45%����
	 * 6 - ���»��� - ������һ�����˺�����40%
	 * 7 - ������ - 25%����
	 * 8 - ��¥ - 80%����
	 * 9 - Ϳ�� - 30%����
	 * 10 - ������ - ÿ������75����������3��
	 * 11 - ��Ĺ�� - ����ÿ��1%Ѫ������0.5%����
	 * 12 - �˻��� - ÿ����һ���ǹ���Ŀ������20%�˺�������120%
	 * */
	public static double Player_Attack;
	public static double Player_Baoji;
	public static double Player_Baoshang;
	public static double Target_Defense;
	public static final String version="1.4.0";
	public static final String text_about = "��������WeedyEver����\n"
			+ "����Java8��д\n"
			+ "����ͼ���ԭ����Foggycloud07����\n"
			+ "δ������,����������ҵ��;,������Ϊ��Ȩ\n"
			+ "������ϵ��ʽ:WeedyEver@163.com\n"
			+ "���������MITЭ����п�Դ,�޸���ע��ԭ���������";
	public final static String[] yuhun_text = {
			null,null,"��ǰ�����",null,"Ѫ���ٷֱ�",null,null,null,null,null,"����������","Ѫ���ٷֱ�","����Ŀ����",null
	};
	public static final String qrcode_path = "icons/QRCode.png";
	public static final String[] ErrMessage = {
			null,"������ʽ�񹥻�!","������ʽ�񱩻�!(Ĭ��Ϊ10)","������ʽ�񱩻��˺�!(Ĭ��Ϊ150)","�����뱶��!(Ĭ��Ϊ100)",
			"������Ŀ�����!(Ĭ��Ϊ500)","������buffֵ!(Ĭ��Ϊ0)"
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
	public static final String tiptext = "��������������ݣ���Ҫ��©\r\n"
			+ "�����ʼ���㼴�ɹ���\r\n"
			+ "������ܻ���Щ����һ���ڡ�5%���ڣ�Ӱ�첻��";
	public static String output_text = "";
	public static final String Whatsnew = "V1.0�汾������־\r\n"
			+ "�������ܵ�ʵ��\r\n"
			+ "�������൱��ķ������\r\n"
			+ "\n"
			+ "\n"
			+ "V1.1.0�汾������־\n"
			+ "�����˲˵������Ż��˰�ť������\n"
			+ "�޸��˲���ͷ�ļ����������¹���\n"
			+ "\n"
			+ "\n"
			+ "V1.2.0�汾������־\n"
			+ "�����˶��ڸ�����ȷ�ϣ��պ���ܻ���븺��ģʽ\n"
			+ "\n"
			+ "\n"
			+ "V1.3.0�汾������־\n"
			+ "�����˸���ģʽ\n"
			+ "�������µĴ��������\n"
			+ "\n"
			+ "\n"
			+ "V1.4.0�汾������־\n"
			+ "�޸���һ������bug,��bug������,��ѡ��ĳЩ�ض��������͵�ʱ��,�����ܹ���\n"
			+ "������ѡ���ض���������ʱ,�������Ϸ��Ե��ж�\n";
	public static final String url = "https://afdian.net/@weedy";
	public static final String errortips = "��������ʱ��������!\n"
			+ "������ϵ�������޸�������,���������ť\n"
			+ "�������ʹ�����,����رհ�ť\n"
			+ "��ע��,���������,��������п��ܻ᲻�ȶ�,���������ʹ��";
	public static final String errordeal = "������ϵ��ʽ:WeedyEver@163.com\n"
			+ "�뽫�˴��ڽ���,���ϼ򵥵���������,˵���ڴ�����ǰ��������ʲô����\n"
			+ "�������,���ҵ�error.log�ļ�(һ��ͳ���ͬһĿ¼��),����һ������\n"
			+ "��л�������,���з�����bug�������պ�������޸�!\n"
			+ "Ϊ�˱�֤����ʹ������,����رճ���";
	
}
