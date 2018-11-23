package logic.level;
import logic.brick.Brick;
import java.util.List;

public class ConcreteLevel implements Level {
    private String name;
    private List<Brick> bricks;
    private Level nextLevel;

    public ConcreteLevel(String name, List<Brick> bricks, Level nextLevel){
        this.name = name;
        this.bricks = bricks;
        this.nextLevel = nextLevel;
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

    Level addPlayingLevel(Level level){
        if(!nextLevel.isPlayableLevel()){
            this.nextLevel = level;
        }
    }

    public boolean isPlayableLevel(){
        return true;
    }
}
