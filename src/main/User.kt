class User(
    var username: String,
    var firstname: String,
    var lastname: String,
    var password: String,
    var phone: String,
    var email: String
) {
    override fun toString(): String {
        return """
            Username: $username
            First name: $firstname
            Last name: $lastname
            Phone: $phone
            Email: $email
        """.trimIndent()
    }
}