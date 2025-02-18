import java.util.Map;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predators extends Animals {
    public void eat( int y, int x) {
        if (this.getSatiety() >= this.getMaxSatiety() || Configure.map[y][x].Organisms.size() == 0) {
            return;
        }
        int randomInt = ThreadLocalRandom.current().nextInt(1, 100);
        int randomAnimalIndex = ThreadLocalRandom.current().nextInt(1, Configure.map[y][x].Organisms.size() - 1);
        Animals randomAnimal = Configure.map[y][x].Organisms.get(randomAnimalIndex);
        Integer chance = Configure.chances.get(this.getCreatureType()).get(randomAnimal.getCreatureType());
        if (chance == null)
            {
                return;
            }
        if (chance < randomInt) {
            this.setSatiety(this.getSatiety() + randomAnimal.getWeight());
            Configure.map[y][x].Organisms.remove(randomAnimal);
        }

    }
}
