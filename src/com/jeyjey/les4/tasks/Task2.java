package com.jeyjey.les4.tasks;

public class Task2 {

	public static void main(String[] args) {
		// 2. Вычислить периметр и площадь прямоугольного треугольника по длинам а и b
		// двух катетов.
		double a;
		double b;
		double p;
		double s;
		a = 5;
		b = 3;
		p = a + b + Math.sqrt((a * a + b * b));
		s = a * b / 2;
		System.out.println("Периметр:" + p);
		System.out.println("Площадь:" + s);
	}

}
