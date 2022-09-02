public interface Tamable {
    default void tame(Animal animal, Explorer explorer){
        System.out.println("Come here sweety " + animal.getName());
        if (explorer.skill > animal.wildness) {
            System.out.println(animal.getName() + " has been tamed");
        } else System.out.println("You are eaten by " + animal.getName());
    }
}
