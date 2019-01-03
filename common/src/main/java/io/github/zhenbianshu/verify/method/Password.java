package io.github.zhenbianshu.verify.method;

import io.github.zhenbianshu.verify.request.VerifyContent;

/**
 * created by zhenbianshu on 2018/12/1
 */
public class Password implements Verifier {

    private static final String USERNAME = "zbs";

    private static final String PASSWORD = "zhenbianshu";

    @Override
    public boolean verify(VerifyContent verifyContent) {
        if (USERNAME.equals(verifyContent.getUsername()) && PASSWORD.equals(verifyContent.getPassword())) {
            return true;
        }

        return false;
    }
}
