package example.singletroRepeat.builderexample;

public class Burger {
    private String meat;
    private String bread;
    private String sauce;
    private String vegetables;

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String getVegetables() {
        return vegetables;
    }

    public void setVegetables(String vegetables) {
        this.vegetables = vegetables;
    }

    @Override
    public String toString() {
        return "Burger{" +
                "meat='" + meat + '\'' +
                ", bread='" + bread + '\'' +
                ", sauce='" + sauce + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }
}
