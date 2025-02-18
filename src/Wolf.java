public class Wolf extends Predators {
    @Override
    public int getMaxMoveEndurance(){
        return 3;
    }
    @Override
    public int getMaxAmountOnCell(){
        return 30;
    }
    @Override
    public  int getWeight(){
        return 500;
    }
    @Override
    public int getMaxSatiety(){
        return 8;
    }
    @Override
    public String toString(){
        return "\uD83D\uDC3A";
    }
    public Creature getCreatureType(){
        return Creature.WOLF;
    }
}
