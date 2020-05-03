package OCP.solution;

public interface Specification<T> {

    boolean isSatisfied(T item);
}
