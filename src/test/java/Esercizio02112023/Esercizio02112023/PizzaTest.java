package Esercizio02112023.Esercizio02112023;

import Esercizio02112023.Esercizio02112023.entities.Pizza;
import Esercizio02112023.Esercizio02112023.entities.Topping;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class PizzaTest {
    AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio02112023Application.class);
    @Test
   public void setPizzaTest(){
       Pizza p=(Pizza)ctx.getBean("pizza_margherita");
       List<Topping> lt= p.getToppingList();
       double price=p.setPrice(lt,false);
       assertEquals(4.99,price);
   }
}
