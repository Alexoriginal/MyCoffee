package NameOfCoffe;

public abstract class Drink {

        private String name;

        public abstract String beverageComposition();

        public abstract int calculationOfThCostOfDrink();



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
