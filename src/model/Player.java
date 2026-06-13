package model;

public class Player {
    // simple implementation
    private final String name;
    private long level;
    private long currentXP;
    private long totalXP;

    private Player(String name, long level, long currentXP, long totalXP) {
        this.name = name;
        this.level = level;
        this.currentXP = currentXP;
        this.totalXP = totalXP;
    }

    public static Player create(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("A Player must have a name, it can't be blank");
        }
        return new Player(name, 1, 0, 0);
    }

    public String getName() {
        return name;
    }

    public long getLevel() {
        return level;
    }

    public long getcurrentXP() {
        return currentXP;
    }

    public long getTotalXP() {
        return totalXP;
    }

    private void levelUp() {
        level++;
        currentXP = 0;
    }

    public long getLevelThreshhold() {
        return level * 100;
    }

    public long getRemainingXp() {
        return getLevelThreshhold() - currentXP;
    }

    public void rewardXP(long xp) {
        totalXP += xp;
        if (currentXP + xp > getLevelThreshhold()) {
            long remainingXp = currentXP + xp - getLevelThreshhold();
            levelUp();
            rewardXP(remainingXp);
        } else {
            currentXP += xp;
        }
    }

}