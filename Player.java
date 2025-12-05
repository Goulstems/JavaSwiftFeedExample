public class Player {
    public String name;
    private int score;
    private Weapon weapon;
    private int health;

    public Player(String name) {
        this.name = name;
        this.score = 0;
        this.health = 100;
    }

    public void attack(Player otherPlayer) {
        System.out.println(this.weapon);
    }

    public int getHealth() {
        return this.health;
    }

    public void setHealth(int newHealth) {
        this.health = newHealth;
    }

    public int getScore() {
        return this.score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void equip(Weapon weapon) {
        this.weapon = weapon;
    }
}