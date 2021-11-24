# Yet Another Roguelike

In this game a player controls a powerful hero, crawling through the Maze and killing monsters. Each Maze level is
randomly generated combination of grass and wall tiles. The goal on each level is to kill every monster, and then find a
boss, who holds the key to the next level, and find a door which opens it.

## Main concepts

1. Hero can move in four directions, and attack a monster if they share the same cell.
2. Hero can only move by grass, walls are "solid", and cannot be passed _(some mechanics can be added later, e.g.
   climbing or destroying the walls, or having secret passes)._
3. Monsters AI is reactive, meaning:
    * Monsters move at the same time as hero moves, and their AI is very simple, randomly picking grass tile from
      adjacent _(group behaviour and path finding, following etc. can be added later)._
    * Each hero's attack is counterattacking by the monster at the same time _(attack speed modifiers can be added
      later)_.
4.
5.

### Move

- Move down :arrow_down: or :s:
- Move up :arrow_up: or :w:
- Move right :arrow_right: or :d:
- Move left :arrow_left: or :a:

### Attack

When monster and player occupy the same cell, you can perform an attack by pressing "Space".

### Hero

Face up ![Hero Face Up](src/main/resources/images/hero-up.gif)
Face Down ![Hero Face Down](src/main/resources/images/hero-down.gif)
Face Left ![Hero Face Left](src/main/resources/images/hero-left.gif)
Face Right ![Hero Face Right](src/main/resources/images/hero-right.gif)

### Boss Monster

![Boss Monster](src/main/resources/images/boss.png)

### Monster

![Monster](src/main/resources/images/monster.gif)

### Wall

![Wall](src/main/resources/images/wall.jpg)

### Game Screenshot

![Game Screenshot](src/main/resources/images/Game_Screenshot.png)

## Engine implementation

The game runs a loop, every cycle updates player position updated by keyboard events, and updates monsters positions in
turn.