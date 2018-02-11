import Ingredients.Coffee;
import Ingredients.Milk;
import Ingredients.Sugar;
import Ingredients.Water;
import NameOfCoffe.CoffeeWithMilk;
import NameOfCoffe.Drink;
import NameOfCoffe.Espresso;

public class Runner {
    public static void main(String[] args) {


        Drink espresso=new Espresso( new Coffee(),new Water(),new Sugar());
        Drink coffeeWMilk=new CoffeeWithMilk(new Coffee(),new Water(),new Sugar(),new Milk());


        Drink[] mass=new Drink[2];
        mass[0]=espresso;
        mass[1]=coffeeWMilk;

        for (Drink dr : mass) {
            System.out.println("Название напитка: "+dr.getName()+" Состав: "+dr.beverageComposition()+ "Цена кофе: "+dr.calculationOfThCostOfDrink()+"грн");

        }


       // System.out.println("Название напитка: "+espresso.getName()+" Состав: "+espresso.beverageComposition()+ "Цена кофе: "+espresso.calculationOfThCostOfDrink()+"грн");

    }
}
