import java.lang.NumberFormatException

fun update() {
    try {
        var indexToChange = 0
        print("Username: ")
        val username = readln()
        for (i in listUser.indices) {
            if (listUser[i].username == username) {
                indexToChange = i
            }
        }
        login(username, indexToChange)
        if (!isLogin) return
        do {
            println("1. Update information")
            println("2. Delete account")
            println("Others. Back to main menu")
            val choice = Integer.valueOf(readln())
            when (choice) {
                1 -> updateInfo(indexToChange)
                2 -> deleteAcc(indexToChange)
            }
        } while (choice in 1..2)
    } catch (_: NumberFormatException) {
    }
    isLogin = false
    saveFile()
}

fun updateInfo(index: Int) {
    try {
        do {
            println("1. Change Username")
            println("2. Change First name")
            println("3. Change Last name")
            println("4. Change Password")
            println("5. Change Email")
            println("6. Change Phone")
            println("Others. Back to previous menu")
            val choice = Integer.valueOf(readln())
            when (choice) {
                1 -> listUser[index].username = usernameInput()
                2 -> listUser[index].firstname = firstNameInput()
                3 -> listUser[index].lastname = lastNameInput()
                4 -> listUser[index].password = passwordInput()
                5 -> listUser[index].email = emailInput()
                6 -> listUser[index].phone = phoneInput()
            }
        } while (choice in 1..6)
    } catch (_: NumberFormatException) {
    }
}

fun deleteAcc(index: Int) {
    try {
        println("Are you sure? (Type \"1\" for yes)")
        val answer = Integer.valueOf(readln())
        if (answer == 1) {
            listUser.removeAt(index)
            println("Success")
            return
        } else return
    } catch (_: NumberFormatException) {
    }
}

