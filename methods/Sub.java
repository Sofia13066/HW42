package methods;

import model.Operation;

public class Sub implements Operation{

    @Override
    public double mathematic(double a, double b) {
        return a-b;
    }
}
