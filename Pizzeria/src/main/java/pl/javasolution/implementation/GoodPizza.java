package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import pl.javasolution.api.IPizza;

@Component
@Primary
@PropertySource("classpath:ceny.properties")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)//zasięg
public class GoodPizza implements IPizza {

    private int price;
    private String name;

    public GoodPizza(
            @Value("${cena_dobrej}") int price,
            @Value("${nazwa}") String name) {
        super();
        this.price = price;
        this.name = name;
    }

    public int getPrice() {
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
