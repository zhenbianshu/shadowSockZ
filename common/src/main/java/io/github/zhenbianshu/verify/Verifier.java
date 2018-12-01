package io.github.zhenbianshu.verify;

import io.github.zhenbianshu.model.verify.Request;

/**
 * created by zhenbianshu on 2018/12/1
 */
public interface Verifier {
    boolean verify(Request request);
}
