package Esercizio02112023.Esercizio02112023;

import Esercizio02112023.Esercizio02112023.entities.Drink;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class DrinkTest {
    static AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio02112023Application.class);
    static Drink d;
    @BeforeAll
    static void getDrink(){
        d=(Drink) ctx.getBean("wine");
    }
    @Test
    void drinkCaloriesTest(){
        int cal=d.getCalories();
        Assertions.assertNotNull(d);
       Assertions.assertEquals(607,cal);
    }
}
