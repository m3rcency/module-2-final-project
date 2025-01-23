package Animals;

public abstract class Animals {
    private Boolean isAlive;


    public Animals(){
        isAlive = true;
    }
    public void move(){

    }
    public void eat(){

    }

    public abstract int getX();


    public abstract int getY();


}
