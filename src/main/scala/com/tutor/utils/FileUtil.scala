package com.tutor.utils



object FileUtil {
	type Path = String
	val EmptyFileType = "empty-file-type"

	def extractExtFileName(path: Path): String = {
		extractLocalPath(path).split("\\.").last
	}
	def extractLocalPath(path: Path): String = {
		path.split("/").last
	}
}
