public class Duck extends Herbivores {
    @Override
    public int getMaxMoveEndurance(){
        return 4;
    }
    @Override
    public int getMaxAmountOnCell(){
        return 4;
    }
    @Override
    public  int getWeight(){
        return 1;
    }
    @Override
    public int getMaxSatiety(){
        return 1;
    }
    @Override
    public String toString() {
        return "\uD83E\uDD86";
    }
    public Creature getCreatureType(){
        return Creature.DUCK;
    }
}
