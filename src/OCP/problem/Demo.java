package OCP.problem;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Size.SMALL, Color.GREEN);
        Product orange = new Product("Orange", Size.MEDIUM, Color.YELLOW);
        Product banana = new Product("Banana", Size.MEDIUM, Color.YELLOW);

        List<Product> products = Arrays.asList(apple, orange, banana);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Yello Products: ");
        productFilter.searchByColor(products, Color.YELLOW).forEach(p -> System.out.println(" - " + p.getName() + " is Yellow"));


    }

}
