package io.github.zhenbianshu.shadowsocks4j.verify.method;

import io.github.zhenbianshu.shadowsocks4j.verify.request.VerifyContent;

/**
 * created by zhenbianshu on 2018/12/1
 */
public class None implements Verifier {
    @Override
    public boolean verify(VerifyContent verifyContent) {
        return true;
    }
}
