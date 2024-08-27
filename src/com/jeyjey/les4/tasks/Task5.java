package com.jeyjey.les4.tasks;

public class Task5 {

	public static void main(String[] args) {
		// 5. Вычислить длину окружности и площадь круга одного и того же заданного
		// радиуса R.
		double r;
		double c;
		double s;
		r = 10.0;
		c = 2 * Math.PI * r;
		s = Math.PI * Math.pow(r, 2);
		System.out.println("Длина окружности:" + c);
		System.out.println("Площадь окружности:" + s);
	}

}
