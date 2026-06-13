package model;

public class Quest {
    private final int id;
    private String title;
    private String description;
    private final Skill skill;
    private final Difficulty difficulty;
    private QuestStatus status;
    private final int xpReward;

    private Quest(int id, String title, String description, Skill skill, Difficulty difficulty,QuestStatus status, int xpReward) {
        
        this.id = id;
        this.title = title;
        this.description = description;
        this.skill = skill;
        this.difficulty = difficulty;
        this.xpReward = xpReward;
        this.status = status;

    }

    public static Quest create(int id, String title, String description, Skill skill, Difficulty difficulty) {
        if (title == null || title.isBlank()) {
            //if title is empty stop creation immediately
            throw new IllegalArgumentException("Title cannot be empty");
        }

        if (description == null) {
            //if description is empty stop creation immediately
            throw new IllegalArgumentException("Description cannot be empty");
        }

        if (skill == null) {
            throw new IllegalArgumentException("Skill cannot be null");
        }

        if (difficulty == null) {
            throw new IllegalArgumentException("Difficulty cannot be null");
        }

        return new Quest(
            id,
            title,
            description,
            skill,
            difficulty,
            QuestStatus.ACTIVE,
            difficulty.getXpReward()
        );

    }

    public void complete() {
        this.status = QuestStatus.COMPLETED;
    }

    public void fail() {
        this.status = QuestStatus.FAILED;
    }

    public void updateDescription(String newDisc) {
        if(newDisc == null || newDisc.isBlank()){
            throw new IllegalArgumentException("Description cannot be empty");
        }
        description = newDisc;
    }

    public void updateTitle(String newTitle) {
        if(newTitle == null || newTitle.isBlank()){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        title = newTitle;
    }

    public String getTitle(){
        return title;
    }

    public String getDescription() {
        return description;
    }

    public Skill getSkill() {
        return skill;
    }

    public Difficulty getDifficulty(){
        return difficulty;
    }

    public int getId() {
        return id;
    }

    public int getXpReward() {
        return xpReward;
    }

    public QuestStatus getStatus() {
        return status;
    }
    
    @Override
    public String toString() {
        String output = "\n" + "Id: " + id + "\n" +
                        "Title: " + title + "\n" + 
                        "Skill: " + skill + "\n" +
                        "Difficulty: " + difficulty + "\n" +
                        "Reward: " + xpReward + "xp" + "\n" +
                        "Status: " + status + "\n";
        return output;
    }
}