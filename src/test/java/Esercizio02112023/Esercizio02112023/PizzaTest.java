package Esercizio02112023.Esercizio02112023;

import Esercizio02112023.Esercizio02112023.entities.Pizza;
import Esercizio02112023.Esercizio02112023.entities.Topping;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
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
   @ParameterizedTest
//    @ValueSource(strings={"pizza_margherita","salami_pizza"})
   @CsvSource({"pizza_margherita,1104","salami_pizza,1190"})
    void testParameterized(String str,int exp){

        Pizza p=(Pizza)ctx.getBean(str);
        int c=p.getCalories();
       Assertions.assertTrue(c>1012);
       Assertions.assertEquals(c,exp);
   }
}
