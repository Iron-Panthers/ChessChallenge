package app.player;

public class Player{
    private int side;
    private boolean hasGone;

    public Player(int side){
        this.side = side;
    }

    public int getPlayerSide(){
        return side; 
    }

    public String getName(){
        if(side == 0){
            return "Player 1";
        }
        return "Player 2";
    }

    public boolean hasGone(Player player){
        return hasGone;
    }
}