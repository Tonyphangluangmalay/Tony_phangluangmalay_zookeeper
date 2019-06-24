public class Bat extends Mammal {
        public Bat() {
            this.energyLevel = 300;
        }
        public Bat fly() {
            System.out.println("The bat flew off into the air with a flap[! It lost 50 energy.");
            this.energyLevel -= 50;
            return this;
        }
        public Bat eatHumans() {
            System.out.println("The bat gained 25 energy.");
            this.energyLevel += 25;
            return this;
        }
        public Bat attackTown() {
            System.out.println("The bat and its friends swarm the town that was on fire and the screams of the people can be heard for miles. The bat lost 100 energy.");
            this.energyLevel -= 100;
            return this;
        }
}