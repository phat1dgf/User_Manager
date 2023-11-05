import java.io.File
import java.io.InputStream

fun saveFile() {
    File(filename).bufferedWriter().use { out ->
        for (i in listUser.indices) {
            out.write(gson.toJson(listUser[i]))
            out.newLine()
        }
    }
}

fun loadFile() {
    try {
        val inputStream: InputStream = File(filename).inputStream()
        inputStream.bufferedReader().forEachLine {
            listUser.add(gson.fromJson(it, User::class.java))
        }
    } catch (_: Exception) {
    }
}