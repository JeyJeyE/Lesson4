package com.jeyjey.les4.tasks;

public class Task7 {

	public static void main(String[] args) {
		// 7. Найти произведение цифр заданного четырехзначного числа.
		int x;
		int a;
		int b;
		int c;
		int d;
		int y;
		x = 3588; // abcd
		a = x / 1000;
		b = (x / 100) % 10;
		c = (x / 10) % 10;
		d = x % 10;
		y = a * b * c * d;
		System.out.println("Произведение цифр четырехзначного числа: " + y);
	}

}
