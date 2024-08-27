package com.jeyjey.les4.tasks;

public class Task11 {

	public static void main(String[] args) {
		//11. Известна длина окружности. Найти площадь круга, ограниченного этой окружностью.
				double l;
				double s;
				l = 15;
				s = Math.pow(l , 2) / (4 * Math.PI);
				System.out.println("Площадь круга: " + s);
	}

}
