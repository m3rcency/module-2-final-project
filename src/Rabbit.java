public class Rabbit extends Herbivores {
   @Override
    public int getMaxMoveEndurance(){
        return 2;
    }

    @Override
    public int getMaxAmountOnCell(){
        return 150;
    }
    @Override
    public  int getWeight(){
        return 2;
    }
    @Override
    public int getMaxSatiety(){
        return 50;
    }
    @Override
    public String toString() {
        return "\uD83D\uDC07";
    }
    public Creature getCreatureType(){
        return Creature.RABBIT;
    }

}
