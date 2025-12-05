public class Weapon {
    private String name;
    private int damage;
    private String type;

    public Weapon(String name, int damage, String type) {
        this.name = name;
        this.damage = damage;
        this.type = type;
    }

    public void attack(Player otherPlayer) {
        // Alter otherPlayer.health BASED ON this.damage
        otherPlayer.setHealth(otherPlayer.getHealth() - this.damage);
    }
}
