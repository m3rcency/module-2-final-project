public class Rabbit extends Animals {
   @Override
    public int getMaxMoveEndurance(){
        return 2;
    }
    @Override
    public void eat() {

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
    public String toString() {
        return "\uD83D\uDC07";
    }


}
