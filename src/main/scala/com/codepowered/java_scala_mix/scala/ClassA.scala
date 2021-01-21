package com.codepowered.java_scala_mix.scala

import com.codepowered.jav_scala_mix.java.{ClassC, IClassC}


object ClassA extends App with ClassA with IClassC {

  def main(isClassA: Boolean) = {
    methodA();
    if (isClassA)
      new ClassC().main(false);
  }

  main(true);

  override def methodA(): Unit = println("object ClassA says hi in methodA")

  override def methodC() = println("object ClassA says hi in methodC")
}

trait ClassA {

  def methodA()
}
