package com.tutor

import java.io.File

import com.tutor.utils.FileUtil
import com.tutor.utils.FileUtil.Path

class DirectoryScanner {
	type FileType = String

	def scan(path: Path): Map[FileType, Int] = {
		val file = new File(path)
		val files = file.listFiles()
		files.foldLeft(Map[FileType, Int]()) { (acc, f) =>
			if(f.isFile) {
				val fileType: FileType = FileUtil.extractExtFileName(f.getPath)
				if(acc.contains(fileType)) {
					acc.updated(fileType, acc(fileType) + 1)
				} else {
					acc + (fileType -> 1)
				}
			} else {
				acc ++ scan(f.getAbsolutePath)
			}
//			if(f.isFile) acc + 1 else acc + scan(f.getAbsolutePath)

		}

	}
}
