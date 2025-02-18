public abstract class Herbivores extends Animals {
    public void eat(int x, int y) {
        if (this.getSatiety() >= this.getMaxSatiety() && Configure.map[y][x].grass.size() == 0)
        {
            return;
        }
        Configure.map[y][x].grass.remove(new Grass());
        if (this.getSatiety() >= this.getMaxSatiety()) {
            this.setSatiety(this.getMaxSatiety());
        } else {

            this.setSatiety(this.getSatiety() + Grass.GetWeight());
        }

    }
}
