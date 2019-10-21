package com.rakovets.course.practice.string;

import com.rakovets.course.util.StandardInputTask;

import java.util.Arrays;

/**
 * Разработать программу для парсера информации о персонале компании.
 *
 * @author Dmitry Rakovets
 * @version 1.0
 */
public class Task03 extends StandardInputTask {
	/**
	 * Запрашивает ввод данных от пользователя и вызывает все методы класса для этих данных.
	 */
	public static void main(String[] args) {
		// Ввод данных осуществляется в Standard Input, для проверки различных вариантов входных параметров
		System.out.println("Enter information with format: 'Name Surname Salary; ...;'");
		String text = INPUT_SCANNER.nextLine();

		// Вызов методов
		System.out.println(Arrays.toString(parseToArrayName(text)));
		System.out.println(Arrays.toString(parseToArraySurname(text)));
		System.out.println(Arrays.toString(parseToArraySalary(text)));
	}

	/**
	 * Возвращает массив имен персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив имен персонала, где каждый элемент ~ имя одного сотрудника
	 */
	static String[] parseToArrayName(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String strwithspaces = text.replace(";", " ");
		String[] arrayOfInformation = strwithspaces.split("[\\s]+\\s*");
		String[] arrayOfName = new String[arrayOfInformation.length / 3];
		for (int i = 0, b =0; i < arrayOfName.length; i++, b += 3) {
			arrayOfName[i] = arrayOfInformation[b];
		}
		return arrayOfName;
	}

	/**
	 * Возвращает массив фамилий персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив фамилий персонала, где каждый элемент ~ фамилия одного сотрудника
	 */
	static String[] parseToArraySurname(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String strwithspaces = text.replace(";", " ");
		String[] arrayOfInformation = strwithspaces.split("[\\s]+\\s*");
		String[] arrayOfSurname = new String[arrayOfInformation.length / 3];
		for (int i = 0, b =1; i < arrayOfSurname.length; i++, b += 3) {
			arrayOfSurname[i] = arrayOfInformation[b];
		}
		return arrayOfSurname;
	}

	/**
	 * Возвращает массив зарплат персонала.
	 * @param text строка, которая содержит всю информацию
	 * @return массив зарплат персонала, где каждый элемент ~ зарплата одного сотрудника
	 */
	static int[] parseToArraySalary(String text) {
		//TODO
		// Код, решающий задачу пишем ниже, при этом используя параметры метода
		// Для проверки решения необходимо запустить @Test для данного class (в директории test)
		String strwithspaces = text.replace(";", " ");
		String[] arrayOfInformation = strwithspaces.split("[\\s]+\\s*");
		int[] arrayOfSalary = new int[arrayOfInformation.length / 3];
		for (int i = 0, b =2; i < arrayOfSalary.length; i++, b += 3) {
			arrayOfSalary[i] = Integer.parseInt(arrayOfInformation[b]);
		}
		return arrayOfSalary;
	}
}