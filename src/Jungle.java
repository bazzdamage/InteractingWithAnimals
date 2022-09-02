import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Jungle {

    int vision;
    List<Animal> animals = new ArrayList<>();
    List<Animal> visibleAnimals = new ArrayList<>();
    Random random = new Random();

    public boolean isVisible(Explorer explorer, Animal animal) {
        vision = random.nextInt(100);
        return explorer.sight > vision;
    }
    void populate (Animal animal) {
        animals.add(animal);
    }
    void checkVisible (Explorer explorer) {
        for (Animal animal : animals) {
            if (isVisible(explorer, animal)) {
                visibleAnimals.add(animal);
            }
        }
    }
    void lookAround () {
        for (Animal visibleAnimal : visibleAnimals) {
            System.out.println("see the " + visibleAnimal.getName());
        }
    }
}
