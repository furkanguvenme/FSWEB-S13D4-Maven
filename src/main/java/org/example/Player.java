package org.example;

public class Player {
    private String name;
    private int healthPercentage;
    private Weapon weapon;

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
        this.healthPercentage = healthPercentage > 100 ? 100 : healthPercentage < 0 ? 0 : healthPercentage;
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        if(healthPercentage < damage) {
            healthPercentage = 0;
            System.out.println(name + " player has been knocked out of game");
        } else {
            healthPercentage = healthPercentage-damage;
        }
    }

    public void restoreHealth(int healthPotion) {
        if(healthPercentage + healthPotion > 100) {
            healthPercentage = 100;
        } else {
            healthPercentage += healthPotion;
        }
    }
}
