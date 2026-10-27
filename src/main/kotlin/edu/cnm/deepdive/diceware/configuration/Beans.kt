package edu.cnm.deepdive.diceware.configuration

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import kotlin.random.Random

@Configuration
class Beans {

    @Bean
    open fun provideRandom(): Random {
        return Random.Default // TODO: Return a CS-PRNG

    }
}