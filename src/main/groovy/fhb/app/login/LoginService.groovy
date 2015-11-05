package fhb.app.login

class LoginService {
    static final Boolean AUTHENTICATED = true
    static final Boolean NOT_AUTHENTICATED = false

    Boolean login(String username, String password) {
        if (username == 'hans' && password == 'wurst') {
            AUTHENTICATED
        } else {
            NOT_AUTHENTICATED
        }
    }
}