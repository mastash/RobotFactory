package builder;

public class Burger {

    private String bread = null;
    private String meat = null;
    private String sauce = null;
    private String vegetables = null;

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public String getMeat() {
        return meat;
    }

    public void setMeat(String meat) {
        this.meat = meat;
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
                "bread='" + bread + '\'' +
                ", meat='" + meat + '\'' +
                ", sauce='" + sauce + '\'' +
                ", vegetables='" + vegetables + '\'' +
                '}';
    }
}
