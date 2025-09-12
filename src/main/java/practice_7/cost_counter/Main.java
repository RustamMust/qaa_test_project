package practice_7.cost_counter;

public class Main {
    public static void main(String[] args) {
        CostCounter costCounter = new CostCounter();
        costCounter.addCosts(1, 123.12);
        costCounter.addCosts(2, 145.11);
        costCounter.addCosts(3, 245.14);
        costCounter.addCosts(4, 115.34);
        costCounter.addCosts(5, 542.54);

        System.out.println(costCounter.getCosts(3));

        System.out.println(costCounter.minCostsPerMonth());


    }
}
