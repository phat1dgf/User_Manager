fun create() {
    listUser.add(User(usernameInput(), firstNameInput(), lastNameInput(), passwordInput(), phoneInput(), emailInput()))
    saveFile()
}

fun usernameInput(): String {
    var username: String = ""
    print("Username (Username must be at least five characters and no spaces): ")
    while (username == "") {
        username = readln()
        if (isExistUser(username)) {
            println("Username already in use")
            username = ""
        } else if (" " in username || username.length < 5) {
            println("Username must be at least five characters and no spaces")
            username = ""
        }
    }
    return username
}

fun firstNameInput(): String {
    var firstname: String = ""
    print("First name: ")
    while (firstname == "") {
        firstname = readln()
        if (isNumeric(firstname) || firstname == "") {
            firstname = ""
            println("First name must not be blank or contain number")
        }
    }
    return firstname
}

fun lastNameInput(): String {
    var lastname: String = ""
    print("Last name: ")
    while (lastname == "") {
        lastname = readln()
        if (isNumeric(lastname) || lastname == "") {
            lastname = ""
            println("Last name must not be blank or contain number")
        }
    }
    return lastname
}

fun passwordInput(): String {
    var password: String = ""
    print("Password (Password must be at least six characters and no spaces): ")
    do {
        while (password == "") {
            password = readln()
            if (" " in password || password.length < 6) {
                password = ""
                println("Password must be at least six characters and no spaces")
            }
        }
        print("Confirm password:")
    } while (password != readln())
    return password
}

fun phoneInput(): String {
    var phone: String = ""
    print("Phone number: ")
    while (phone == "") {
        phone = readln()
        if (!isNumeric(phone) || phone.length != 10) {
            phone = ""
            println("Phone number must contain 10 numbers")
        }
    }
    return phone
}

fun emailInput(): String {
    var email: String = ""
    print("Email: ")
    while (email == "") {
        email = readln()
        if (!isValidEmail(email)) {
            println("Email must follow standard email format")
            email = ""
        }
    }
    return email
}