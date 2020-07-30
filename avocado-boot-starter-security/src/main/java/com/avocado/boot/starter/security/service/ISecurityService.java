package com.avocado.boot.starter.security.service;

import com.avocado.boot.starter.security.bean.AccessToken;
import com.avocado.boot.starter.security.bean.Authentication;
import com.fasterxml.jackson.core.JsonProcessingException;

/**
 *
 * @author ：qiaoliang
 */
public interface ISecurityService {

    /**
     * 根据访问令牌获取凭证信息
     *
     * @author ：qiaoliang
     * @param token : 访问令牌
     * @return com.avocado.boot.starter.security.bean.Authentication
     */
    Authentication getAuthentication(String token) throws JsonProcessingException;

    /**
     * 生成访问令牌
     *
     * @author ：qiaoliang
     * @param authentication : 账号的认证信息
     * @return com.avocado.boot.starter.security.bean.AccessToken
     */
    AccessToken generateToken(Authentication authentication) throws JsonProcessingException;

}