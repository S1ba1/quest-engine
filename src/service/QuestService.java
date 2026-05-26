package service;
import model.Difficulty;
import model.Quest;
import model.QuestStatus;
import model.Skill;

import java.util.*;

public class QuestService {
    private final List<Quest> quests = new ArrayList<>();
    private int nextId = 1;

    public Quest addQuest(String title, String description, Skill skill, Difficulty difficulty) {
        Quest quest = Quest.create(nextId++, title, description, skill, difficulty);
        quests.add(quest);
        return quest;
    }

    public List<Quest> getAllQuests() {
        return List.copyOf(quests);
    }

    public List<Quest> getActiveQuests() {
        return quests.stream()
                .filter(quest -> quest.getStatus() == QuestStatus.ACTIVE)
                .toList();
    }
    //findFirst() returns Optional<Quest>, another approach would be: .orElse(null)
    public Optional<Quest> findQuestById(int id) {
        return quests.stream()
                .filter(quest -> quest.getId() == id)
                .findFirst();
    }  

    private Quest getQuestOrThrow(int id) {
        return findQuestById(id).orElseThrow(() -> new IllegalArgumentException("Quest not found"));
    }

    public void completeQuest(int id) {
        Quest questWithId = getQuestOrThrow(id);
        questWithId.complete();
    }

    public void failQuest(int id) {
        Quest questWithId = getQuestOrThrow(id);
        questWithId.fail();
    }

    public void updateQuestTitle(int id, String newTitle) {
        Quest questWithId = getQuestOrThrow(id);
        questWithId.updateTitle(newTitle);
    }

    public void updateQuestDescription(int id, String newDescription) {
        Quest questWithId = getQuestOrThrow(id);
        questWithId.updateDescription(newDescription);
    }

    public long getTaskCount() {
        return quests.size();
    }
}
