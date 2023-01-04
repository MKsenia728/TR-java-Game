package Game.GeneratorParticipant;

import com.github.javafaker.Faker;
import Game.Participant;
import Game.manageListParticipant.ListParticipant;

import java.util.Random;
import java.util.UUID;

public class Generator {
    int countOfParticipant = 330;

    public void generator() {
        Faker faker = new Faker();
        Random random = new Random();
        for (int i = 0; i < countOfParticipant / 3; i++) {
            ListParticipant.getInstance().addToList(new Participant(UUID.randomUUID(), faker.name().lastName(), random.nextInt(15, 18)));
            ListParticipant.getInstance().addToList(new Participant(UUID.randomUUID(), faker.name().lastName(), random.nextInt(18, 25)));
            ListParticipant.getInstance().addToList(new Participant(UUID.randomUUID(), faker.name().lastName(), random.nextInt(25, 100)));
        }
    }
}
