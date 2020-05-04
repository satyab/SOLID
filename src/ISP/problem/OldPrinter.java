package ISP.problem;

public class OldPrinter implements Machine {

    @Override
    public void print(Document d) {

    }

    @Override
    public void scan(Document d) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fax(Document d) {
        throw new UnsupportedOperationException();
    }
}
