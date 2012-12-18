package Player;

import Core.GameLoader;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Neil
 * Date: 12/11/12
 * Time: 03:32
 * To change this template use File | Settings | File Templates.
 */
public class Player {
    private int playerNumber;
    private String playerName;
    private int playerColour;
    private static ArrayList<Unit> playerUnits;

    public Player(int playerNumber, String playerName)
    {
        this.playerNumber = playerNumber;
        this.playerName = playerName;
        playerUnits = new ArrayList<Unit>();
        this.initUnits();
    }

    public void initUnits() {
        for (int i = 0 ; i < GameLoader.getPlayerUnits() ; i++)
            playerUnits.add(new Unit());
    }

    public ArrayList<Unit> getPlayerUnits()
    {
        return playerUnits;
    }

    public int getPlayerColour() {
        return playerColour;
    }

    public void setPlayerColour(int playerColour) {
        this.playerColour = playerColour;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getTotalHealth() {
        int totalHealth = 0;
        for (int i=0 ; i < playerUnits.size() ; i++)
        {
            totalHealth += playerUnits.get(i).getHealth();
        }
        return totalHealth;
    }

    public void unitDestroyed(Unit unit)
    {
        playerUnits.remove(unit);
    }

    public int getUnitsRemaining() {
        return playerUnits.size();
    }

    public String toString()
    {
        String unitsList = "";
        for (int i=0 ; i<getUnitsRemaining() ; i++)
        {
            unitsList = unitsList + (i+1) + " - " + playerUnits.get(i).toString();
        }
        return getPlayerNumber() + " " + getPlayerName() + "\nTotal Health: " + getTotalHealth() + "\nUnits Remaining: " + getUnitsRemaining() + "\n" + unitsList;
    }
}
