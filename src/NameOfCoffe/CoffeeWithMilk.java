package NameOfCoffe;

import Ingredients.Coffee;
import Ingredients.Milk;
import Ingredients.Sugar;
import Ingredients.Water;

public class CoffeeWithMilk extends Drink {


    private Coffee coffee;
    private Water water;
    private Sugar sugar;
    private Milk milk;

    public CoffeeWithMilk() {
    }

    public CoffeeWithMilk(Coffee coffee, Water water, Sugar sugar, Milk milk) {
        this.coffee = coffee;
        this.water = water;
        this.sugar = sugar;
        this.milk = milk;
    }

    @Override
    public String beverageComposition() {
        return "Состав кофе  "+coffee.getName()+ water.getName()+sugar.getName()+milk.getName();
    }

    @Override
    public int calculationOfThCostOfDrink() {
        return coffee.getSize()+water.getSizeW()+sugar.getSizeS()+milk.getSizeM();
    }

    @Override
    public String getName() {
        return "Кофе с молоком";
    }




}
