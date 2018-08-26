package com.lesson9

case class Book(name: String)
object Lesson9 {
	def add1(x: Int):Int = x + 1
	val add1Mk1:Int => Int = {x => x + 1}
	def add1Mk2:Int => Int = {x => x + 1}
	val add1Mk3 = {(x: Int) => x + 1}
	{(x: Int) => x + 1}

	def add(x: Int)(y: Int): Int = x + y

	def compose[A, B, C](f1: A => B)(f2: B => C): A => C = {x => f2(f1(x))}

	val addMult = compose((x: Int) => x + 1)((x: Int) => x * 2)

	def main(args: Array[String]): Unit = {
		// euq & ==
		println(Book("xx").eq(Book("xx")))
		println(Book("xx") == (Book("xx")))
		println(add1Mk1.equals(add1Mk1))
		println(add1Mk2.equals(add1Mk2))

		val add1 = add(1)_
		println(add1(5))
		println(addMult(3))

	}
}
