package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import pl.javasolution.api.GoodPizza_adnotacja;
import pl.javasolution.api.IPizza;

@Component
@GoodPizza_adnotacja
public class ExoticPizza implements IPizza {

    private int price;
    private String name;
    @Value("#{goodPizza.price matches'[1-9]'}")
    boolean bool;

    public ExoticPizza(
            @Value("#{goodPizza.price > 13 ? 13 : 20}") int price,
            @Value("#{goodPizza.getName()?.toUpperCase()}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
        System.out.println(bool);
        return price;
    }

    public String getName() {
        return name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setName(String name) {
        this.name = name;
    }
}
