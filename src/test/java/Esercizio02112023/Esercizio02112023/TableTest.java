package Esercizio02112023.Esercizio02112023;

import Esercizio02112023.Esercizio02112023.entities.Table;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
public class TableTest {
    AnnotationConfigApplicationContext ctx =new AnnotationConfigApplicationContext(Esercizio02112023Application.class);
   @Test
   public void totCopertoTest(){
       Table t=(Table) ctx.getBean("table1");
       int tot=t.copertoTot();
       Assertions.assertAll(
               ()->Assertions.assertEquals(9,tot),
               ()->Assertions.assertTrue(tot>0)
       );
   }
}
