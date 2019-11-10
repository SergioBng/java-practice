package com.rakovets.course.challenge.oop.polimorphism.battle_ground;

public abstract class Hero {
    String name;
    int health;

    public Hero(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void takeDamage(int damageFromEnemy);

    public abstract void attacEnemy(Enemy e);
}
