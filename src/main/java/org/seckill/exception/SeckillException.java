package org.seckill.exception;

/**
 * 所有秒杀业务相关异常
 * Created by yuanli on 2017/7/23.
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}
