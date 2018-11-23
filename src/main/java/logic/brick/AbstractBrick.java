package logic.brick;

public abstract class AbstractBrick implements Brick {
    private int points;
    private int remainingHits;

    public AbstractBrick(int remainingHits, int points) {
        this.points = points;
        this.remainingHits = remainingHits;
    }

    public int getScore() {
        return points;
    }
    public boolean isDestroyed(){
        return remainingHits > 0;
    }
    public int remainingHits(){
        return remainingHits;
    }
    public void hit(){
        remainingHits--;
    }
}