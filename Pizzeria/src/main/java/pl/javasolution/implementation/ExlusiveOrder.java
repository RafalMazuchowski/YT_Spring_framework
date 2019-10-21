package pl.javasolution.implementation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import pl.javasolution.api.IOrder;
import pl.javasolution.api.IPizza;

import java.util.List;

@Component
@Primary //Ładowana przed Order.java
public class ExlusiveOrder implements IOrder {

    @Value("#{listOfPizza[1]}")
    private IPizza pizza;
    @Autowired
    private List<IPizza> listOfPizza;

    public ExlusiveOrder(){
        super();
    }

    public void printOrder(){
        System.out.println("Zamówienie ekskluzywne: "+pizza.getName()+", Cena: "+pizza.getPrice());
    }

    public IPizza getPizza() {
        return pizza;
    }

    //@Value("#{exoticPizza}")
    public void setPizza(IPizza pizza) {
        this.pizza = pizza;
    }
}
