import com.google.gson.Gson
import java.lang.NumberFormatException

val listUser = mutableListOf<User>()
val gson = Gson()
val filename = "UserManagerSave.txt"
fun main() {
    loadFile()
    try {
        do {
            println("1. Create a user account")
            println("2. Check exist user")
            println("3. Searching user information by name")
            println("4. Update User (Login is required)")
            println("5. Print list user from file")
            println("Others. Quit")
            val choice = Integer.valueOf(readln())
            when (choice) {
                1 -> create()
                2 -> checkExistUser()
                3 -> search()
                4 -> update()
                5 -> display()
            }
        } while (choice in 1..5)
    } catch (_: NumberFormatException) {
    }
    saveFile()
}




