package io.github.zhenbianshu.verify;

import io.github.zhenbianshu.model.verify.Request;

/**
 * created by zhenbianshu on 2018/12/1
 */
public class PasswordVerifier implements Verifier {

    private static final String USERNAME = "zbs";

    private static final String PASSWORD = "zhenbianshu";

    @Override
    public boolean verify(Request request) {
        if (USERNAME.equals(request.getUsername()) && PASSWORD.equals(request.getPassword())) {
            return true;
        }

        return false;
    }
}
