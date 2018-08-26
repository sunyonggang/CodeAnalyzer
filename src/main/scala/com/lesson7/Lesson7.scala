package com.lesson7

object Lesson7 {
//	def dup(l: List[Int]): List[Int] = {
////		l.flatMap(x => List(x, x))
//		l.map(x => List(x, x)).flatten
//	}

	def dup[T](l: List[T]): List[T] = {
		l.flatMap(x => List(x, x))
	}

	def main(args: Array[String]): Unit = {
		// map & filter & fold & flatten
		val l = List(1, 4, 7 ,6, 3, 2)
		print(dup(l))
		print()
	}
}
