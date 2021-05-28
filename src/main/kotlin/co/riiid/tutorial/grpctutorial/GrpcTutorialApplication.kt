package co.riiid.tutorial.grpctutorial

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class GrpcTutorialApplication

fun main(args: Array<String>) {
    runApplication<GrpcTutorialApplication>(*args)
}
