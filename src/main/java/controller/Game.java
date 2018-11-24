package controller;

import logic.brick.*;
import logic.level.*;
import java.util.*;

/**
 * Game logic controller class.
 *
 * @author Juan-Pablo Silva
 */
public class Game {
    private int balls;
    private Level currentLevel;
    private int points;
    private boolean winner;

    public Game(int balls) {
        this.balls = balls;
        points = 0;
        winner = false;
    }

    public void setCurrentLevel(Level level){
        currentLevel = level;
    }

    public Level newLevelWithBricksNoMetal(String name, int numberOfBricks, double probOfGlass, int seed){
        List<Brick> bricks = new ArrayList<>();
        Random r = new Random(seed);
        for(int i = 0; i < numberOfBricks; i++){
            if(r.nextFloat() < probOfGlass){
                bricks.add(new GlassBrick());
            }
            else{
                bricks.add(new WoodenBrick());
            }
        }
        Level level = new ConcreteLevel(name);
        level.setBricks(bricks);
        return level;
    }
    public Level newLevelWithBricksFull(String name, int numberOfBricks, double probOfGlasses, double probOfMetal, int seed){

        return null;
    }

    public Level getCurrentLevel(){
        return currentLevel;
    }

    public boolean winner(){
        return winner;
    }

    public int getCurrentPoints(){
        return points;
    }

    public int getBallsLeft(){
        return balls;
    }

    public void dropBall(){
        balls--;
    }

    public boolean isGameOver(){
        return balls == 0 || winner;
    }

}
