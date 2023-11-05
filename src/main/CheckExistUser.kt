fun isExistUser(username: String): Boolean {
    for (i in listUser.indices) {
        if (listUser[i].username == username) {
            return true
        }
    }
    return false
}


fun checkExistUser() {
    print("Username: ")
    val username = readln()
    if (isExistUser(username)) {
        println("Exist User")
        return
    }
    println("No User Found!")
}