package Esercizio02112023.Esercizio02112023;

import Esercizio02112023.Esercizio02112023.entities.Item;
import Esercizio02112023.Esercizio02112023.entities.Order;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@SpringBootTest

public class OrderTest {
    AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio02112023Application.class);
    @Test
    void totOrderTest(){
        List<Item> l = Stream.of((Item)ctx.getBean("pizza_margherita"),(Item)ctx.getBean("salami_pizza_xl"),(Item)ctx.getBean("lemonade"),(Item)ctx.getBean("water")).collect(Collectors.toList());
        double tot= Order.prezzoOrdine(l);
        Assertions.assertTrue(tot>0);

    }
}
