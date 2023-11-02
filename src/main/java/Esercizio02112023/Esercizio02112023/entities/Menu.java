package Esercizio02112023.Esercizio02112023.entities;

import lombok.*;

import java.util.List;

@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Menu {
    private List <Pizza> pizzaList;
    private List<Drink> drinkList;
}
