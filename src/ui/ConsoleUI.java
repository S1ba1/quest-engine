package ui;

import model.*;
import service.QuestService;
import service.RewardService;

import java.util.*;

public class ConsoleUI {
    private final QuestService userQuestService;
    private final Player userPlayer;
    private final RewardService rewardService;

    private final Scanner userIn = new Scanner(System.in);

    public ConsoleUI(QuestService userQuestService, RewardService rewardService, Player userPlayer) {
        this.userQuestService = userQuestService;
        this.userPlayer = userPlayer;
        this.rewardService = rewardService;
    }

    public void start() {
        while (true) {
            showMenu();
            int choice = readInt("Please pick by using a valid number:");
            switch (choice) {
                case 1:
                    handleAddQuest();
                    break;
                case 2:
                    handleViewActiveQuests();
                    break;
                case 3:
                    handleCompleteQuest();
                    break;
                case 4:
                    handleFailQuest();
                    break;
                case 5:
                    handleViewAllQuests();
                    break;
                case 6:
                    handleViewStatistics();
                    break;
                case 7:
                    return;

                default:
                    System.out.println("invalid number! Please enter a valid number!");
                    break;
            }
        }
    }



    private void showMenu() {
        System.out.println(
                "1. Add Quest\n" +
                        "2. View Active Quests\n" +
                        "3. Complete Quest\n" +
                        "4. Fail Quest\n" +
                        "5. View All Quests\n" +
                        "6. View Player Statistics\n" +
                        "7. Exit");
    }

    private int readInt(String prompt) {
    while (true) {
        System.out.println(prompt);

        try {
            return Integer.parseInt(userIn.nextLine().trim());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please try again!");
        }
    }
}

    private void handleAddQuest() {
        System.out.println("Title: ");
        String qTitle = userIn.nextLine();
        System.out.println("description: ");
        String qDescription = userIn.nextLine();
        if(qDescription.equals(null)) qDescription = " ";
        userQuestService.addQuest(qTitle, qDescription, readSkill(), readDifficulty());
        System.out.println(qTitle + " is now a quest!");
    }

    private List<String> availableSkills() {
        ArrayList<String> skills = new ArrayList<>();
        for(Skill skill: Skill.values()) {
            skills.add(skill.name());
        }
        return skills;
    }

    private Skill readSkill() {
        while (true) {
            System.out.println("Skill: ");
            System.out.println(availableSkills());
            try {
                String skillString = userIn.nextLine()
                        .trim()
                        .toUpperCase();
                return Skill.valueOf(skillString);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again!");
            }
        }
    }

    private List<String> availableDifficulties() {
        ArrayList<String> difficulties = new ArrayList<>();
        for(Difficulty difficulty: Difficulty.values()) {
            difficulties.add(difficulty.name());
        }
        return difficulties;
    }

    private Difficulty readDifficulty() {
        while (true) {
            System.out.println("Difficulty: ");
            System.out.println(availableDifficulties());
            try {
                String difficultyString = userIn.nextLine()
                        .trim()
                        .toUpperCase();
                return Difficulty.valueOf(difficultyString);
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid input. Please try again!");
            }
        }
    }

    private void handleViewActiveQuests() {
        System.out.println(userQuestService.getActiveQuests());
    }

    private void handleCompleteQuest() {
        while (true) {
            int qId = readInt("Quest-ID:");
            try{
                Quest completedQuest = userQuestService.completeQuest(qId);
                rewardService.rewardPlayer(completedQuest);
                System.out.println(
                            "Quest with ID " + qId + " is now marked as completed! \n" +
                            "Earned xp: " + completedQuest.getXpReward());
                break;
            } catch(Exception e) {
                System.out.println("No Quest under this ID, please enter an ID of an existing Quest!");
            }
            
        }
        
    }

    private void handleFailQuest() {
        while(true) {
            int qId = readInt("Quest-ID:");
            try{
                userQuestService.failQuest(qId);
                System.out.println("Quest with ID " + qId + " is now marked as failed!");
            } catch(IllegalArgumentException e) {
                System.out.println("No Quest under this ID, please enter an ID of an existing Quest!");
            }
        }
        
    }

    private void handleViewAllQuests() {
        System.out.println(userQuestService.getAllQuests());
    }

    private void handleViewStatistics() {
        System.out.println("Name: " + userPlayer.getName() + "\n" +
                            "Current Level: " + userPlayer.getLevel() + "\n" +
                            "Current Xp: " + userPlayer.getcurrentXP() + "\n" +
                            "Xp needed for next Level: " + userPlayer.getRemainingXp()
        );
    }
}
