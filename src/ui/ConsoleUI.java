package ui;

import model.*;
import service.QuestService;
import service.RewardService;

import java.util.*;

public class ConsoleUI {
    private final QuestService userQuestService;
    // private final Player userPlayer;
    private final RewardService rewardService;

    private final Scanner userIn = new Scanner(System.in);

    public ConsoleUI(QuestService userQuestService, RewardService rewardService) {
        this.userQuestService = userQuestService;
        // this.userPlayer = userPlayer;
        this.rewardService = rewardService;
    }

    public void start() {
        while (true) {
            showMenu();
            System.out.println("Please pick by using a valid number: ");
            int choice = Integer.parseInt(userIn.nextLine());
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
                        "6. Exit");
    }

    private void handleAddQuest() {
        System.out.println("Title: ");
        String qTitle = userIn.nextLine();
        System.out.println("description: ");
        String qDescription = userIn.nextLine();
        userQuestService.addQuest(qTitle, qDescription, readSkill(), readDifficulty());
        System.out.println(qTitle + " is now a quest!");
    }

    private Skill readSkill() {
        while (true) {
            System.out.println("Skill: ");
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

    private Difficulty readDifficulty() {
        while (true) {
            System.out.println("Difficulty: ");
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
        System.out.println("Quest-ID: ");
        int qId = Integer.parseInt(userIn.nextLine());
        Quest completedQuest = userQuestService.completeQuest(qId);
        rewardService.rewardPlayer(completedQuest);
        System.out.println(
                            "Quest with ID " + qId + " is now marked as completed! \n" +
                            "Earned xp: " + completedQuest.getXpReward());
    }

    private void handleFailQuest() {
        System.out.println("Quest-ID: ");
        int qId = Integer.parseInt(userIn.nextLine());
        userQuestService.failQuest(qId);
        System.out.println("Quest with ID " + qId + " is now marked as failed!");
    }

    private void handleViewAllQuests() {
        System.out.println(userQuestService.getAllQuests());
    }

}
