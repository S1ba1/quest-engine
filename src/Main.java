import model.*;
import service.*;
import ui.*;

public class Main {
    public static void main(String[] args) {
        Player player = Player.create("Tony");

        QuestService questService = new QuestService();

        RewardService rewardService = new RewardService(player);

        ConsoleUI ui = new ConsoleUI(questService, rewardService, player);
        ui.start();
    }
}
