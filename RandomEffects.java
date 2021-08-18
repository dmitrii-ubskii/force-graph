package com.vaticle.force.graph;

import java.util.Random;
import java.util.function.Supplier;

public class RandomEffects {

    static double jiggle() {
        Random random = new Random();
        return jiggle(random::nextDouble);
    }

    static double jiggle(Supplier<Double> randomSource) {
        return (randomSource.get() - 0.5) * 1e-6;
    }
}