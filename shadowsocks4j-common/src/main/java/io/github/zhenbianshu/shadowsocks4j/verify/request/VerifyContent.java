package io.github.zhenbianshu.shadowsocks4j.verify.request;

import lombok.Data;

/**
 * created by zhenbianshu on 2019/1/3
 */
@Data
public class VerifyContent {
    private String username;

    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
