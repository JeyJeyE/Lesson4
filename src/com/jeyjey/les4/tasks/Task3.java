package com.jeyjey.les4.tasks;

public class Task3 {

	public static void main(String[] args) {
		// 3. Вычислить расстояние между двумя точками с данными координатами (х1, у1)и
		// (x2, у2).
		double x1;
		double x2;
		double y1;
		double y2;
		double l;
		x1 = 3;
		x2 = 5;
		y1 = 5;
		y2 = 8;
		l = Math.sqrt((Math.pow((x1 - x2), 2) + (Math.pow((y1 - y2), 2))));
		System.out.println(l);
	}

}
