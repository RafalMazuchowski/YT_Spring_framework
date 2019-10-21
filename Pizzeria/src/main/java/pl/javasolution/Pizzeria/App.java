package pl.javasolution.Pizzeria;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.javasolution.api.IOrder;
import pl.javasolution.config.AutoConfig;
import pl.javasolution.implementation.Order;

public class App {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutoConfig.class);
        IOrder order = context.getBean(IOrder.class);
        order.printOrder();
        IOrder order2 = context.getBean(Order.class);
        order2.printOrder();
    }
}
