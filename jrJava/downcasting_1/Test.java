package jrJava.downcasting_1;

public class Test {

	public static void main(String[] args) {

		// case 1:
		Animal pet1 = new Husky(); // (Animal) new Husky()'
		// pet1.pullSled(); // cannot do this.

		Husky pet2 = (Husky) pet1; // downcast.
		pet2.pullSled();

		// case 2:
		Animal pet3 = new Dog();
		// Husky pet4 = (Husky) pet3;
		// pet4.bark();

		// case 3:
		Mammal pet5 = new Dog();
		// Bird pet6 = (Bird) pet5;

		// case 4:
		Animal pet7 = new Human();
		Fish pet8 = (Fish) pet7;
	}

}
