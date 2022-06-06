package Users;

import java.util.Scanner;

public class User {

    String name;
    String password;

    public boolean Verify(String tempName, String tempPass) {

        if (name.equals(tempName) && password.equals(tempPass)) {
            return true;
        }
        return false;

    }

    public String GetName() {
        return name;
    }

}
