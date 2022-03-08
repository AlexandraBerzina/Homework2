/* 114.	Реализуйте метод, осуществляющий сжатие строки на основе счетчика повторяющихся символов.
*Например, строка aaabbcccc должна превратиться в a3b2c5. Если сжатая строка оказалась длиннее исходной,
* то результатом работы алгоритма должна быть исходная строка. Решить задачу с предположением, что в исходной 
* строке нет цифр. Решить задачи для произвольной строки.
**/
package by.epam.tr.main;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("Введите строку");
		str = sc.nextLine();
		System.out.println(compressBetter(str));
	}

	static String compressBetter(String str) {
		int size = countCompression(str);
		if (size >= str.length()) {
			return str;
		}

		StringBuffer mystr = new StringBuffer();
		char last = str.charAt(0);
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else if (count > 1) {
				mystr.append(last);
				mystr.append(count);
				last = str.charAt(i);
				count = 1;
			} else if (count == 1) {
				mystr.append(last);
				last = str.charAt(i);
				count = 1;
			}
		}
		if (count > 1) {
			mystr.append(last);
			mystr.append(count);
		} else {
			mystr.append(last);
		}
		return mystr.toString();
	}

	static int countCompression(String str) {
		char last = str.charAt(0);
		int size = 0;
		int count = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == last) {
				count++;
			} else {
				last = str.charAt(i);
				size += 1 + String.valueOf(count).length();
				count = 0;
			}
		}
		size += 1 + String.valueOf(count).length();
		return size;
	}

}
