package kg.geeks.hw5.templates;
public class Hero {
    private int health;
    private int damage;
    private String ultimate;

    public Hero(int health, int damage, String ultimate) {
        this.health = health;
        this.damage = damage;
        this.ultimate = ultimate;
    }
    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public String getUltimate(){return this.ultimate;}
}

