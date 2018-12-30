package com.yevhenii.essence_of_composition.logger

object Example {

  def main(args: Array[String]): Unit = {

    val f = Writer(Functions.negate, "not")
    val g = Writer(Functions.identity, "id")

    val `g.f` = g.compose(f)

    val `f.g` = f.compose(g)

    val (res, msg) = `g.f`(true)
    val (res1, msg1) = `f.g`(true)

    println(s"$msg; result = $res")
    println(s"$msg1; result = $res1")
  }
}
