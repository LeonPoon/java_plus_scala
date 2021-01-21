package com.codepowered.jav_scala_mix.java;

import com.codepowered.java_scala_mix.scala.ClassA;
import com.codepowered.java_scala_mix.scala.ClassA$;

public class ClassC implements IClassC, ClassA {

    public static void main(String[] args) {
        new ClassC().main(true);
    }

    public void main(boolean isClassC) {
        new ClassC().methodC();
        if (isClassC)
            ClassA$.MODULE$.methodA();
    }

    @Override
    public void methodC() {
        System.out.println("class ClassC says hi in methodC!");
    }

    @Override
    public void methodA() {
        System.out.println("class ClassC says hi in methodA!");
    }
}
