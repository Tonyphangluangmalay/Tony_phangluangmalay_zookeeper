public class Gorilla extends Mammal {

	public Gorilla eatBananas() {
		System.out.println("The gorilla happily ate some bananas and gained 10 energy.");
		this.energyLevel += 10;
		return this;
	}
	public Gorilla climb() {
		System.out.println("The gorilla climbed a tree and lost 10 energy.");
		this.energyLevel -= 10;
		return this;
	}
		public Gorilla throwSomething() {
		System.out.println("The gorilla threw something and lost 5 energy.");
		this.energyLevel -= 5;
		return this;
	}
}