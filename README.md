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

# Features

## Current Features

- Quest creation
- Quest completion/failure system
- Difficulty-based XP rewards
- Quest statuses
- Validation for safe object creation
- Factory-based quest creation
- Immutable core quest properties
- Quest management service
- Stream-based quest filtering
- Optional-based quest lookup
- Console-based CLI interface
- Interactive menu system
- Enum-based user input parsing
- Custom quest display formatting
---

# Next Steps

## Immediate Next Steps

- Add `Player` class
- Implement `RewardService`
- Award XP when quests are completed
- Add player leveling system
- Improve quest display formatting
- Handle invalid menu input safely
- Handle invalid quest IDs safely
- Show available enum values during input

## Upcoming Features

- Quest filtering by skill/difficulty
- Completed quest history
- Quest statistics
- JSON save/load system
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
- APIs and Async Programming
- Frontend
- React
