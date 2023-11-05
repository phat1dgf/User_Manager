var isLogin = false
fun login(username: String, index: Int) {
    if (!isExistUser(username)) {
        println("Username does not exist")
        return
    }
    do {
        print("Password (type \"back to main menu\" to back to main menu): ")
        val password = readln()

        if (password == "back to main menu") return

        if (listUser[index].username == username && listUser[index].password == password) {
            isLogin = true
            break
        }

        if (!isLogin) println("Wrong password!")
    } while (!isLogin)
}