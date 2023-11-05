fun search() {
    if (listUser.isEmpty()) {
        println("Have no any user")
        return
    }
    print("Name: ")
    val string = readln()
    for (i in listUser.indices) {
        if (string in listUser[i].firstname || string in listUser[i].lastname) {
            println(listUser[i].toString())
            println()
        }
    }
}