package com.tutor

import com.tutor.utils.FileUtil
import com.tutor.utils.FileUtil.Path

class SourceCode(var name : String, val path : String, val lines : List[String]) {
    def count : Int = lines.length
//    def apply(x : Int, y : Int) : Int = x + y
}

//case class SourceCode(name : String, path : String, lines : List[String])

object SourceCode{
    def fromFile(path : Path) : SourceCode = {
        import scala.io._
        val source = Source.fromFile(path)
        val lines = source.getLines().toList
        new SourceCode(FileUtil.extractLocalPath(path), path, lines)
    }


}