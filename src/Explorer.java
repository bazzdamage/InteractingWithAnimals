public class Explorer extends Human {

    int sight = 0;

    public Explorer(String name) {
        super(name);
    }

    public int getSight() {
        return sight;
    }

    public void setSight(int sight) {
        this.sight = sight;
    }
}
