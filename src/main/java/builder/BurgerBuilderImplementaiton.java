package builder;

public class BurgerBuilderImplementaiton implements BurgerBuilder {

    private Burger burger;

    @Override
    public Burger build() {
        return burger;
    }

    public BurgerBuilderImplementaiton() {
        burger = new Burger();
    }

    @Override
    public BurgerBuilder setBread(String bread) {
        burger.setBread(bread);
        return this;
    }

    @Override
    public BurgerBuilder setMeat(String meat) {
        burger.setMeat(meat);
    return null;
    }

    @Override
    public BurgerBuilder setSauce(String sauce) {
        burger.setSauce(sauce);
        return this;
    }

    @Override
    public BurgerBuilder setVegetables(String vegetables) {
        burger.setVegetables(vegetables);
        return this;
    }
}
