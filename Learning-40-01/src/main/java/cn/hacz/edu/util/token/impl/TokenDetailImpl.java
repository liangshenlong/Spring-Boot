package cn.hacz.edu.util.token.impl;

import cn.hacz.edu.util.token.TokenDetail;

/**
 * @author guod
 */
public class TokenDetailImpl implements TokenDetail {

    private final String username;

    public TokenDetailImpl(String username) {
        this.username = username;
    }

    @Override
    public String getUsername() {
        return this.username;
    }
}
