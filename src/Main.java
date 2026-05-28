import model.*;
import service.*;
import ui.*;

public class Main {
    public static void main(String[] args) {
        QuestService questService = new QuestService();
        // RewardService rewardService = new RewardService;

        ConsoleUI ui = new ConsoleUI(questService);
        ui.start();
    }
}
