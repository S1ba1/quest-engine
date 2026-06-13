# Quest Engine

A gamified task and progression system built with Java.

Instead of using a normal todo list, Quest Engine turns real-life tasks into RPG-style quests with XP, levels, skills, and achievements.

The project starts as a Java CLI application and is designed to evolve later into a full backend/frontend application using technologies like:
- Vert.x
- PostgreSQL
- React
- TypeScript

---

# Status

🚧 In active development.

---
## Current Milestone

The application now supports a complete gameplay loop:

1. Create a quest
2. Complete or fail the quest
3. Earn XP rewards
4. Level up the player
5. View progression statistics

The next major milestone is persistence, allowing player progress and quests to survive application restarts.

---
# Features

## Current Features

### Quest Management
- Create quests
- Complete quests
- Fail quests
- View all quests
- View active quests
- Difficulty-based XP rewards
- Enum-based skill and difficulty system
- Quest validation and safe creation

### Player Progression
- Player creation
- XP reward system
- Automatic level progression
- XP threshold calculation
- Player statistics view

### Console Interface
- Interactive menu system
- Safe numeric input handling
- Safe enum input handling
- Available enum values displayed to users
- Quest completion feedback
- Improved quest display output

### Architecture
- Domain-driven model classes
- Factory method creation
- Service layer architecture
- Separation of concerns
- Optional-based lookups
- Stream-based filtering

---

# Next Steps

### Persistence Phase (Current Focus)

- Design repository architecture
- Create QuestRepository interface
- Create PlayerRepository interface
- Design QuestData storage model
- Design PlayerData storage model
- Implement JSON persistence
- Save quests to disk
- Load quests from disk
- Save player progression
- Restore player progression on startup

### Gameplay Improvements

- Completed quest history
- Quest filtering by skill
- Quest filtering by difficulty
- Quest filtering by status
- Quest statistics dashboard
- Achievement system
- Daily quests
- Streak tracking

---

# Planned Features

## Phase 1 — CLI Application

- Add quests
- Complete quests
- Fail quests
- List active quests
- Player XP system
- Skill leveling
- Streams for filtering and statistics

## Phase 2 — Persistence

- JSON save/load
- Quest history
- Achievement tracking
- Daily quests
- Streak system

## Phase 3 — Backend

- REST API
- Async handling with Vert.x
- Database integration with PostgreSQL

## Phase 4 — Frontend

- Web dashboard
- XP bars
- Skill trees
- Quest board
- Statistics
- Authentication

## Phase 5 — Multiplayer

- Guilds
- Shared quests
- Leaderboards
- Seasonal events

---

# Project Structure

```text
quest-engine/
 └── src/
     ├── Main.java
     ├── model/
     │   ├── Quest.java
     │   ├── Player.java
     │   ├── Skill.java
     │   ├── Difficulty.java
     │   └── QuestStatus.java
     ├── service/
     │   ├── QuestService.java
     │   └── RewardService.java
     └── ui/
         └── ConsoleUI.java
```

---

# Technologies

## Current

- Java
- OOP
- Enums
- Collections
- Streams
- Factory Methods

## Planned

- Vert.x
- PostgreSQL
- React
- TypeScript

---

# Design Goals

The goal of this project is not only to practice Java syntax, but also to learn:

- Object-Oriented Programming
- Clean Architecture
- Domain Modeling
- Scalable Software Design
- Backend Development Concepts
- Fullstack Expansion

---

# Example Quest

```text
[ACTIVE QUEST]

Title: Learn Java Streams
Skill: JAVA
Difficulty: HARD
Reward: 50 XP
Status: ACTIVE
```

---

# Future Vision

Quest Engine is intended to evolve from a simple CLI project into a complete gamified productivity platform with:
- backend services
- database persistence
- web frontend
- mobile support
- multiplayer systems
- analytics and progression systems

---

# Learning Goals

This project is used to practice:

- Classes and Objects
- Enums
- Encapsulation
- Validation
- Factory Methods
- Collections and Streams
- Optional
- Service Architecture
- CLI Architecture
- Separation of Concerns
- Persistence
- Dependency Injection (manual)
- Domain Modeling
- APIs and Async Programming
- Frontend
- React
