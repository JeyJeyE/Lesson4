package com.jeyjey.les4.tasks;

public class Task9 {

	public static void main(String[] args) {
		// 9. Дана длина ребра куба. Найти площадь грани, площадь полной поверхности и
		// объем этого куба.
		double a; // длина ребра куба
		double s; // площадь грани
		double s1; // площаль полной поверхности
		double v; // объем
		a = 5;
		s = Math.pow(a, 2);
		s1 = s * 6;
		v = Math.pow(a, 3);
		System.out.println("Площадь грани: " + s);
		System.out.println("Площадь полной поверхности: " + s1);
		System.out.println("Объем куба: " + v);
	}

}
