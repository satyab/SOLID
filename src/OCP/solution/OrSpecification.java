package OCP.solution;

import java.util.List;

public class OrSpecification<T> implements Specification<T> {

    private List<Specification<T>> specifications;

    public OrSpecification(List<Specification<T>> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean isSatisfied(T item) {
        boolean result = false;
        for (Specification<T> spec : specifications) {
            result = result || spec.isSatisfied(item);
        }
        return result;
    }
}
