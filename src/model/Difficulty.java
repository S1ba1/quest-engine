package model;

public enum Difficulty {
    EASY(10),
    MEDIUM(25),
    HARD(50),
    IMPOSSIBLE(75),
    INSANE(150);

    private final int xp;

    private Difficulty(int xp) {
        this.xp = xp;
    }

    public int getXpReward() {
        return xp;
    }
}