public class Sheep extends Herbivores {
    @Override
    public int getMaxMoveEndurance(){
        return 3;
    }

    @Override
    public int getMaxAmountOnCell(){
        return 140;
    }
    @Override
    public  int getWeight(){
        return 70;
    }
    @Override
    public int getMaxSatiety(){
        return 15;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC11";
    }
    public Creature getCreatureType(){
        return Creature.SHEEP;
    }
}
