package by.epam.tr.main;

public class exercise114 {

	public static void main(String[] args) {
		/* 
		 * 114.���������� �����, �������������� ������ ������ �� ������ ��������
		 * ������������� ��������. ��������, ������ aaabbcccc ������ ������������ �
		 * a3b2c5. ���� ������ ������ ��������� ������� ��������, �� ����������� ������
		 * ��������� ������ ���� �������� ������. ������ ������ � ��������������, ��� �
		 * �������� ������ ��� ����. ������ ������ ��� ������������ ������.
		 */
		String str1 = "aaaabbcccccdd";
		System.out.println(method1(str1));

	}

	public static String method1(String str) {
		String str2 = "";
		char num = str.charAt(0);
		int count = 1;
		String s = "";
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == num) {
				count++;
				s = Integer.toString(count);
			} else {
				str2 += num + s;
				num = str.charAt(i);
				count = 1;
				s = Integer.toString(count);
			}
		}
		return str2+num+s;
	}
}