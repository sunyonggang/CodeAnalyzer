package com.lesson1

object HelloWorld {
    def main(args: Array[String]): Unit = {
        println("syg is 1")
//        val buildsbt = new SourceCode("aaa", "kkk", List("aaa"))
//        println(buildsbt.name)
//        buildsbt.name = "sygsyg"
//        println(buildsbt.name)
//        println(buildsbt(1,2))
//        println(buildsbt.apply(1,2))

        // use case class
        val buildsbt = SourceCode("aaa", "kkk", Nil)
        println(buildsbt)
        val copy = buildsbt.copy(name = "bbb")
        println(copy)
    }
    def add(x : Int, y : Int) : Int = {
        x + y
    }
}
