public class Main {

    public static void main(String[] args) {
	Explorer explorer = new Explorer("Friday");
    Jungle jungle = new Jungle();
    Jaguar jaguar = new Jaguar("Jaguar");
    Hog hog = new Hog("Hog");
    Cat cat = new Cat("Barsik");

    System.out.println("A battered explorer named " + explorer.name + " entered in old Vietnamese jungle.");
    explorer.setSight(60);
    explorer.setSkill(75);

    jungle.populate(jaguar);
    jungle.populate(hog);
    jungle.populate(cat);

    jungle.checkVisible(explorer);
    jungle.lookAround();

    hog.checkTamable();
    hog.tame(hog, explorer);
    jaguar.checkTamable();
    cat.checkTamable();

    explorer.setSkill(0);
    System.out.println(explorer.name + " stepped on an old Vietnamese stretch and scattered limbs around");
    cat.tame(cat, explorer);

    }
}
