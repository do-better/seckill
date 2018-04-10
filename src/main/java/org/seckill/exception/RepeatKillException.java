package org.seckill.exception;

/**
 * 重复秒杀异常（运行期异常）spring事务只有在运行期异常时才会rollback，非运行期异常不会
 * Created by yuanli on 2017/7/23.
 */
public class RepeatKillException extends SeckillException {
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}
