package OCP.problem;

import java.util.List;
import java.util.stream.Stream;

public class ProductFilter {

    public Stream<Product> searchBySize(List<Product> products, Size size) {
        return products.stream().filter(p -> p.getSize() == size);
    }

    public Stream<Product> searchByColor(List<Product> products, Color color) {
        return products.stream().filter(p -> p.getColor() == color);
    }

    public Stream<Product> searchBySizeAndColor(List<Product> products, Size size, Color color) {
        return products.stream().filter(p -> p.getColor() == color && p.getSize() == size);
    }
}
