public class Horse extends Herbivores {
    @Override
    public int getMaxMoveEndurance(){
        return 4;
    }
    public int getMaxSatiety(){
        return 60;
    }

    @Override
    public int getMaxAmountOnCell(){
        return 20;
    }
    @Override
    public  int getWeight(){
        return 400;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC0E";
    }
    public Creature getCreatureType() {

        return Creature.HORSE;
    }
}
