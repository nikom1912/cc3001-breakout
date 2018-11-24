package logic.level;
import logic.brick.Brick;

import java.util.ArrayList;
import java.util.List;

public class ConcreteLevel implements Level {
    private String name;
    private List<Brick> bricks;
    private Level nextLevel;
    private int totalPoints;

    public ConcreteLevel(String name){
        this.name = name;
        this.bricks = new ArrayList<>();
        this.nextLevel = new NullLevel();
        totalPoints = 0;
    }
    public String getName() {
        return name;
    }

    public int getNumberOfBricks(){
        return bricks.size();
    }

    public List<Brick> getBricks(){
        return bricks;
    }

    public Level getNextLevel(){
        return nextLevel;
    }

    public boolean hasNextLevel(){
        return nextLevel.isPlayableLevel();
    }

    public void setNextLevel(Level level){
        nextLevel = level;
    }

    public Level addPlayingLevel(Level level){
        if(hasNextLevel()) {
            this.nextLevel.addPlayingLevel(level);
        }
        else {
            level.setNextLevel(this.nextLevel);
            this.nextLevel = level;
        }
        return this;

    }

    public boolean isPlayableLevel(){
        return true;
    }

    public void setBricks(List<Brick> bricks){
        this.bricks = bricks;
        totalPoints = 0;
        for(Brick b: bricks){
            totalPoints += b.getScore();
        }
    }

    public int getPoints() {
        return totalPoints;
    }
}
