public class Animal {

    String name;
    int wildness;


    public Animal(String name, int wildness) {
        this.name = name;
        this.wildness = wildness;
    }

    private boolean isTamable(Animal animal) {
        return (this instanceof Tamable);
    }

    public void checkTamable() {
        if (isTamable(this)) {
            System.out.println("The " + this.getName() + " appears to be a common domestic cat.");
        } else System.out.println("Don’t put a finger in " + this.getName() + " mouth.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWildness() {
        return wildness;
    }

    public void setWildness(int wildness) {
        this.wildness = wildness;
    }
}
