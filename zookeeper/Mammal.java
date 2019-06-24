public class Mammal {
	public int energyLevel;
	public Mammal() {
	}
	public int displayEnergy() {
		this.energyLevel = 100;
		System.out.println(this.energyLevel);
		return this.energyLevel;
	}
}