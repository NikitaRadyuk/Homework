package by.epam.tr.main;

public class exercise82 {
	public static void main(String[] args) {
		// 82.Исключить из строки группы символов, расположенные между символами «/*»,
		// «*/» включая границы . Предполагается, что нет вложенных скобок.

		String str1 = "Мама /*мыла раму. А папа*/ нет.";

		int x, y;

		x = method1();
		System.out.println("Индекс первой границы  " + str1.indexOf("/*"));

		y = method2();
		System.out.println("Индекс второй границы  " + str1.indexOf("*/"));

		method3(x, y);
		String str2 = method3(x, y);
		method4(x, y, str2, str1);

		System.out.println(method4(x, y, str2, str1));

	}

	public static int method1() {
		String str1 = "Мама /*мыла раму. А папа*/ нет.";
		return str1.indexOf("/*");
	}

	public static int method2() {
		String str1 = "Мама /*мыла раму. А папа*/ нет.";

		return str1.indexOf("*/");
	}

	public static String method3(int x, int y) {
		String str1 = "Мама /*мыла раму. А папа*/ нет.";
		String str2 = str1.substring(x, y + 2);
		return str2;
	}

	public static String method4(int x, int y, String str2, String str1) {
		String str3 = str1.replace(str2, " ");
		return str3;
	}

}