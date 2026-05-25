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
- Difficulty system
- XP reward system
- Quest statuses
- Validation for safe object creation
- Factory-based quest creation
- Immutable core quest properties

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
     └── service/
         ├── QuestService.java
         └── RewardService.java
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
- Collections and Streams
- Service Architecture
- Persistence
- APIs and Async Programming
- REST API
- Frontend
- React
