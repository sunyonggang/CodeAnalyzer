package com.tutor.utils

import org.scalatest.FunSpec

class FileUtilTest extends FunSpec {
	describe("FileUtil") {
		it("can extract file extension name") {
			val path = "src/test/resources/sub/lession9.scala"
			FileUtil.extractLocalPath(path) eq "lession9.scala"
		}
		it("can extract file  name") {
			val path = "src/test/resources/sub/lession9.scala"
			FileUtil.getExtFileName(path) eq "scala"
		}
	}
}
