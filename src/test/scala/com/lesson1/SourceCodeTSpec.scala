package com.lesson1

import org.scalatest.{FunSpec, FunSuite}

class SourceCodeSpec extends FunSpec {
    describe("SourceCode object") {
        it("can read file and create a SourceCode instance") {
            val sc = SourceCode.fromFile("/Users/sunyonggang/IdeaProjects/mydemo/src/test/resources/README.md")
            assert(sc.path == "/Users/sunyonggang/IdeaProjects/mydemo/src/test/resources/README.md")
            assert(sc.name == "README.md")
            assert(sc.lines(0) == "# CodeAnalyzer")
        }
    }
}
