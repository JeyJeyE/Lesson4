package com.jeyjey.les4.tasks;

public class Task4 {

	public static void main(String[] args) {
		// 4. Заданы координаты трех вершин треугольника (х1 у2),(х2, у2) ),(х3, у3).
		// Найти его периметр и площадь.
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;
		double a;
		double b;
		double c;
		double p;
		double s;
		x1 = 1;
		x2 = 5;
		x3 = 3;
		y1 = 1;
		y2 = 1;
		y3 = 5;
		a = Math.sqrt((Math.pow((x2 - x1), 2) + (Math.pow((y2 - y1), 2))));
		b = Math.sqrt((Math.pow((x3 - x2), 2) + (Math.pow((y3 - y2), 2))));
		c = Math.sqrt((Math.pow((x3 - x1), 2) + (Math.pow((y3 - y1), 2))));
		p = a + b + c;
		s = Math.sqrt(p / 2 * (p / 2 - a) * (p / 2 - b) * (p / 2 - c));
		System.out.println("Периметр: " + p);
		System.out.println("Площадь: " + s);
	}

}
