public class Rat extends Herbivores {
    @Override
    public int getMaxMoveEndurance(){
        return 1;
    }

    @Override
    public int getWeight(){
        return 1;
    }
    @Override
    public int getMaxAmountOnCell(){
        return 500;
    }
    @Override
    public int getMaxSatiety(){
        return 1;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC00";
    }
    public Creature getCreatureType(){
        return Creature.RAT;
    }
}
