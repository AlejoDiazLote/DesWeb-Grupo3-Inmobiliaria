package com.Group3.realState.users.user;

import com.Group3.realState.users.user.domain.valueObjects.*;

public class user {

    private userId userid;
    private userName username;
    private userEmail useremail;
    private userPassword userpassword;
    private userUserType userType;

    public user(userId userid, userName username, userEmail useremail, userPassword userpassword, userUserType userType) {
        this.userid = userid;
        this.username = username;
        this.useremail = useremail;
        this.userpassword = userpassword;
        this.userType = userType;
    }
}
