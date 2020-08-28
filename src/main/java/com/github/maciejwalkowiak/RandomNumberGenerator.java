package com.github.maciejwalkowiak;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class RandomNumberGenerator {

    private final Random random = ThreadLocalRandom.current();

    long random() {
        return random.nextLong();
    }
}
