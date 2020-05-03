package OCP.solution;

import java.util.Arrays;
import java.util.List;

public class Demo {

    public static void main(String[] args) {
        Product apple = new Product("Apple", Size.SMALL, Color.GREEN);
        Product orange = new Product("Orange", Size.MEDIUM, Color.YELLOW);
        Product banana = new Product("Banana", Size.MEDIUM, Color.YELLOW);
        Product watermelon = new Product("WaterMelon", Size.LARGE, Color.RED);

        List<Product> products = Arrays.asList(apple, orange, banana, watermelon);

        ProductFilter productFilter = new ProductFilter();

        System.out.println("Yellow Products: ");
        productFilter.filter(products, new ColorSpecification(Color.YELLOW))
            .forEach(p -> System.out.println(" - " + p.getName() + " is Yellow"));

        System.out.println("Yellow Color and Medium Size Products: ");
        productFilter.filter(products, new AndSpecification<>(Arrays
            .asList(new ColorSpecification(Color.YELLOW), new SizeSpecification(Size.MEDIUM))))
            .forEach(p -> System.out.println(" - " + p.getName() + " is Yellow and Size Medium"));

        System.out.println("Red Color or Green Color Products: ");
        productFilter.filter(products, new OrSpecification<>(Arrays
            .asList(new ColorSpecification(Color.GREEN), new ColorSpecification(Color.RED))))
            .forEach(p -> System.out.println(" - " + p.getName() + " is Red or Green"));

    }

}
