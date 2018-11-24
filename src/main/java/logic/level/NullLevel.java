package logic.level;

import logic.brick.Brick;

import java.util.List;

public class NullLevel implements Level{
    public NullLevel(){
    }
    public String getName(){
        return null;
    }
    public int getNumberOfBricks(){
        return 0;
    }
    public List<Brick> getBricks(){
        return null;
    }
    public Level getNextLevel(){
        return this;
    }

    public boolean isPlayableLevel(){
        return false;
    }

    public boolean hasNextLevel(){
        return false;
    }

    public int getPoints(){
        return 0;
    }

    public Level addPlayingLevel(Level level){
        return this;
    }

    public void setNextLevel(Level level) {}

    public void setBricks(List<Brick> bricks) {}
}
