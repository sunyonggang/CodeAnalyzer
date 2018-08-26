package com.tutor

import org.parboiled.common.FileUtils
import org.scalatest.FunSpec

class DirectoryScannerTest extends FunSpec {
	describe("DirectoryScanner") {
		it("can scan directory recursively and count file numbers") {
			val ds = new DirectoryScanner
//			ds.scan("src/test/resources") equals 2
			ds.scan("src/test/resources") equals Map(("md", 1), ("scala", 1))
		}
	}
}
