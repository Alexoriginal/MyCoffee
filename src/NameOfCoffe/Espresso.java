package NameOfCoffe;

import Ingredients.Coffee;
import Ingredients.Milk;
import Ingredients.Sugar;
import Ingredients.Water;

public class Espresso extends Drink{

    //Coffee coffee=new Coffee();
    private Coffee coffee;
    private Water water;
    private Sugar sugar;

    public Espresso() {
    }

    public Espresso(Coffee coffee, Water water, Sugar sugar) {
        this.coffee = coffee;
        this.water = water;
        this.sugar = sugar;
    }


    @Override
    public String beverageComposition() {
        return "Состав кофе  "+coffee.getName()+ water.getName()+sugar.getName();
    }

    @Override
    public int calculationOfThCostOfDrink() {
        return coffee.getSize()+water.getSizeW()+sugar.getSizeS();
    }

    @Override
    public String getName() {
        return "Espresso";
    }
}
