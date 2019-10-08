package app.player;

public class Player{
    private int side;
    private boolean hasGone;

    public Player(int side){
        this.side = side;
        hasGone = false;
    }

    public int getPlayerSide(){
        return side; 
    }

    public String getName(){
        if(side == 1){
            return "Player 1";
        }
        return "Player 2";
    }       

    public boolean hasGone(Player player){
        return hasGone;
    }

    public void setToGone(){
        hasGone = true;
    }
}