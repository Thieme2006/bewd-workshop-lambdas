package nl.han.bewd.lambdas.reis;

import java.util.Random;

public class F18SuperHornetVervoerStrategy implements VervoerStrategy {
    @Override
    public int berekenReistijd(boolean isReisTijdensSpits) {
        Random rand = new Random();
        int random = rand.nextInt(100);
        int figther = berekenKansOpEenEnemyFighter(rand, random);
        return figther;
    }

    public int berekenKansOpEenEnemyFighter(Random rand, int kans) {
        int random = rand.nextInt(kans);
        return berekenTijd(random);
    }

    public int berekenTijd(int random) {
        if (random >= 25 && random < 50) {
            return 15;
        } else if (random >= 50 && random < 75) {
            return 20;
        } else if (random >= 75 && random < 100) {
            return 100;
        } else {
            return 0;
        }
    }
}
