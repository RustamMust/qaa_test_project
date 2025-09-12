package practice_3.homework;

public class GameSettings {
    static int maxPlayers;
    final String gameName;
    int currentPlayers;

    GameSettings(String someGameName, int someCurrentPlayers) {
        this.gameName = someGameName;
        this.currentPlayers = someCurrentPlayers;
    }

    static void setMaxPlayers(int someMaxPlayers) {
        maxPlayers = someMaxPlayers;
    }

    void addPlayer() {
        if (this.currentPlayers < maxPlayers) {
            this.currentPlayers++;
            System.out.println("Player added, current number of players: " + this.currentPlayers);
        } else {
            System.out.println("Can't add new player as you reach out the limit: " + maxPlayers);
        }
    }

    void printGameStatus() {
        System.out.println("Name: " + this.gameName + ", " + "Current players: " + this.currentPlayers + ", " + "max players: " + maxPlayers);
    }
}

