package jrJava.array_1;

public class Practice5 {

	public static void main(String[] args) {

		Ball[] balls = new Ball[4];

		balls[0] = new Ball(50, 50);
		balls[1] = new Ball(100, 100);
		balls[2] = new Ball(150, 150);
		balls[3] = new Ball(200, 200);

		for (int i = 0; i < balls.length; i++) {
			System.out.println(balls[i].getDistance());
		}
	}

}
