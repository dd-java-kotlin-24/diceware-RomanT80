package edu.cnm.deepdive.diceware.configuration

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.context.annotation.Configuration

@Configuration
@ConfigurationProperties("diceware")

class DicewareConfiguration {

    /**
     * Resource specification (i.e., a resource-type, followed by a path). for a
     ** Diceware-style wordlist
     *
     * For example, this could be specified in a YAML properties file as:
     *
     * ```yaml
     *word-list: "classpath: wordlist.txt"
     * ```
     */
    var wordList: String = ""
}