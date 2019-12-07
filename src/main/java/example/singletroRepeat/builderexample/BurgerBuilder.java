package example.singletroRepeat.builderexample;

public interface BurgerBuilder {

    Burger build();

    BurgerBuilder setMeat(String meat);
    BurgerBuilder setBread(String bread);
    BurgerBuilder setSauce(String sauce);
    BurgerBuilder setVegetables(String vegetables);

}
