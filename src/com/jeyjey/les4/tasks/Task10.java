package com.jeyjey.les4.tasks;

public class Task10 {

	public static void main(String[] args) {
		// 10. Дана сторона равностороннего треугольника. Найти площадь этого
		// треугольника, его высоту, радиусы вписанной и описанной окружностей.
		double a;
		double s;
		double h;
		double r1;
		double r2;
		a = 10;
		s = (Math.pow(a, 2) * Math.sqrt(3)) / 4;
		h = a * Math.sqrt(3) / 2;
		r1 = a * Math.sqrt(3) / 6;
		r2 = a / Math.sqrt(3);
		System.out.println("Площадь: " + s);
		System.out.println("Высота: " + h);
		System.out.println("Радиус вписанной окружности: " + r1);
		System.out.println("Радиус описанной окружности: " + r2);
	}

}
