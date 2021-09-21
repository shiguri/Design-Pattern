package pazza;

/**
 * abstract product
 */
public abstract class Pizza {
    private String name;
    private String sauce;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getName(){
        return this.name;
    }

    public String getSauce() {
        return this.sauce;
    }
}
