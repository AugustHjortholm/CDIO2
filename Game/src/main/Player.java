package main;

public class Player {

    private String name;
    private PlayerValueAccount playerValueAccount;

    public Player(String name) {
        this.name = name;
        this.playerValueAccount = new PlayerValueAccount();
    }



    public PlayerValueAccount getValueAccount(){
        return playerValueAccount;
    }

    public String getName() {
        return this.name;
    }
}

