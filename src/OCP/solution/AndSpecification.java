package OCP.solution;

import java.util.List;

public class AndSpecification<T> implements Specification<T> {

    List<Specification<T>> specifications;

    public AndSpecification(List<Specification<T>> specifications) {
        this.specifications = specifications;
    }

    @Override
    public boolean isSatisfied(T item) {
        boolean result = true;
        for (Specification<T> spec : specifications) {
            result = result && spec.isSatisfied(item);
        }
        return result;
    }
}
