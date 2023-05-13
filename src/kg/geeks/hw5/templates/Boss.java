package kg.geeks.hw5.templates;

public class Boss {
    private int health;
    private int damage;
    private String defenceType;

    public int getHealth(){return this.health;}
    public int getDamage(){return this.damage;}
    public String getDefenceType(){return this.defenceType;}
    public void setHealth(int newHealth){
        if (newHealth > 0) {
            this.health = newHealth;
        } else {
            System.out.println("Can't be zero or lower");
        }
    }
    public void setDamage(int newDamage){
        if (newDamage > 0) {
            this.damage = newDamage;
        } else {
            System.out.println("Can't be zero or lower");
        }
    }
    public void setDefenceType(String newDefenceType){
        if (newDefenceType != null) {
            this.defenceType = newDefenceType;
        } else {
            System.out.println("Can't be empty");
        }
    }
}