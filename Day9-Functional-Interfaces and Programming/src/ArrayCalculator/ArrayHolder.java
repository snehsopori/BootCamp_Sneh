package ArrayCalculator;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ArrayHolder {
    double[] values;

    public ArrayHolder(double[] values) {
        this.values = values;
    }

    public void forEach(Consumer<Double> consumer) {
        for (double val : values) {
            consumer.accept(val);
        }
    }

    public void modify(Function<Double, Double> function) {
        for (int i = 0; i < values.length; i++) {
            values[i] = function.apply(values[i]);
        }
    }

    public void delete(Predicate<Double> predicate) {
        for (int i = 0; i < values.length; i++) {
            if(predicate.test(values[i])) {
                values[i] = 0;
            }
        }
    }

    public double fold(BiFunction<Double, Double, Double> biFunction) {
        for (int i = 1; i < values.length; i++) {
            values[i] = biFunction.apply(values[i-1], values[i]);
        }
        return values[values.length - 1];
    }
}
