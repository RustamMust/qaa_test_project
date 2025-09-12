package practice_8.homework.extra_tasks;

import java.util.ArrayList;
import java.util.List;

public class NumberBox <T extends Number> {
   private List<T> numbers = new ArrayList<>();

   public void addNumber(T number) {
       this.numbers.add(number);
   }

    public double getSum() {
        double sum = 0.0;
        for (T number : numbers) {
            sum+=number.doubleValue();
        }
        return sum;
    }

}
