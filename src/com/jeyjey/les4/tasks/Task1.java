package com.jeyjey.les4.tasks;

public class Task1 {

	public static void main(String[] args) {
		// 1. Вычислить значение выражения по формуле (все переменные принимают
		// действительные значения):
		double a;
		double b;
		double c;
		double x;
		a = 4;
		b = 8;
		c = 2;
		x = ((b + Math.sqrt(Math.pow(b, 2) + 4 * a * c)) / 2 * a) - (Math.pow(a, 3)) * c + Math.pow(b, -2);
		System.out.println(x);
	}
}