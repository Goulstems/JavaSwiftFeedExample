public class main {
    public static void main(String[] args) {
        Player player1 = new Player("Hero"); // Establish Player1
        Player player2 = new Player("Villain"); // Establish Player2
        Weapon sword = new Weapon("Excalibur", 25, "Sword"); // Establish Weapon
        player1.equip(sword); // Call Player.equip(Weapon)

        // Call Player.attack(Player2)
        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);
        player1.attack(player2);
    }
}