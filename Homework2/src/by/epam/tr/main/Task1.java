/*������������ ������ �� 10 ��������. �� ������ �������� ������ ��������� ������ �����,
 *  �� �������� �������� - �����.
 */

package by.epam.tr.main;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		newStr();
	}

	public static String newStr() {
		Scanner sc = new Scanner(System.in);
		StringBuffer str = new StringBuffer();
		String second;
		String newStr;
		for (int i = 0; i <= 10; i++) {
			if (i % 2 == 0) {
				System.out.println("������� ������ �����");
				second = sc.next();
				while ((second.matches("[0, 2, 4, 6, 8]{1}") == false) | (second.length() > 1)) {
					System.out.println("������� ������ �����");
					second = sc.next();
				}

				str.append(second);

			}
			if (i % 2 != 0) {
				System.out.println("������� �����");
				second = sc.next();
				while ((second.matches("[a-zA-Z�-��-�]{1}") == false) | second.length() > 1) {
					System.out.println("������� �����");
					second = sc.next();
				}
				str.append(second);

			}

		}
		newStr = str.toString();
		System.out.println(str);
		return newStr;
	}
}