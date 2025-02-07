public class Wolf extends Animals {
    @Override
    public int getMaxMoveEndurance(){
        return 3;
    }
    @Override
    public void eat(){

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
    public String toString(){
        return "\uD83D\uDC3A";
    }
}
