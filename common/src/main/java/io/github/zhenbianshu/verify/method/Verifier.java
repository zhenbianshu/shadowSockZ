package io.github.zhenbianshu.verify.method;

import io.github.zhenbianshu.verify.request.VerifyContent;

/**
 * created by zhenbianshu on 2018/12/1
 */
public interface Verifier {
    boolean verify(VerifyContent verifyContent);
}
