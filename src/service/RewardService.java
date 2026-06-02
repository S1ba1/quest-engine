package service;

import model.*;

/*
good future responsibilities:
- reward player with quest XP
- detect level ups
- prevent rewarding a quest twice
- return a reward result/message
- handle bonus XP later
- handle streak bonuses later
- unlock achievements later
*/

public class RewardService {

    private final Player player;

    public RewardService(Player player) {
        this.player = player;
    }

    public void rewardPlayer(Quest quest) {

        player.rewardXP(quest.getXpReward());
    }
}
