package by.epam.tr.main;

public class exercise114 {

	public static void main(String[] args) {
		/* 
		 * 114.Реализуйте метод, осуществляющий сжатие строки на основе счетчика
		 * повторяющихся символов. Например, строка aaabbcccc должна превратиться в
		 * a3b2c5. Если сжатая строка оказалась длиннее исходной, то результатом работы
		 * алгоритма должна быть исходная строка. Решить задачу с предположением, что в
		 * исходной строке нет цифр. Решить задачи для произвольной строки.
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