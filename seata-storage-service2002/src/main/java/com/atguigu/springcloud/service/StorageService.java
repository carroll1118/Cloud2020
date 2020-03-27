package com.atguigu.springcloud.service;
/**
 * @Auther Carroll
 * @Date 2020/3/27
 * @e-mail ggq_carroll@163.com
 */
public interface StorageService {
    void decrease(Long productId, Integer count);
}
