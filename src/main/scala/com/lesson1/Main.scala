package com.lesson1

object Main {
    def main(args: Array[String]): Unit = {
        if(args.length < 1) {
            println("usage: CodeAnalyzer FilePath")
        } else {
            val sourceCode = SourceCode.fromFile("/Users/sunyonggang/IdeaProjects/mydemo/src/main/resources/README.md")
            println(sourceCode.name)
            println(sourceCode.path)
            println(sourceCode.count)
        }
    }
}
