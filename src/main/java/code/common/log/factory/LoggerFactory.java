package code.common.log.factory;

import code.common.log.enums.Level;
import code.common.log.formatter.LoggerFormatter;
import code.common.log.logger.Logger;

import java.util.Map;
import java.util.stream.Stream;

/**
 * 工厂方法
 *
 * @version 1.0
 * @create 2018-03-07 15:38
 **/
public interface LoggerFactory {

    /**
     *  创建一个 新的日志记录器
     * @param binding  将日志记录器 绑定到指定的字符串， 相当于 日志记录器的 key
     * @return 返回一个新的日志记录器
     */
    Logger create(String binding);

    /**
     *  创建一个 新的日志记录器
     * @param binding  将日志记录器 绑定指定的类上， 相当于根据类获取 日志记录器的 key
     * @return 返回一个新的日志记录器
     */
    Logger create(Class<?> binding);

    /**
     *  获取当前 日志记录器的 类型
     */
    Class<SystemLoggerFactory> loggerClass();

    /**
     * 设置 日志记录器的 格式
     * @param loggerFormatter
     */
    void setLoggerFormatter(LoggerFormatter loggerFormatter);

    /**
     *  获取 日志记录器的格式
     */
    LoggerFormatter getFormatter();

    /**
     *  返回 该 工厂 产出的 所有 日志记录器 的 列表流
     */
    Stream<Map.Entry<String, Logger>> loggers();

    /**
     * 设置 指定 名称 开始的 日志记录器的 级别
     */
    void setLevel(String path, Level level);

    /**
     * 设置 指定 名称 开始的 日志记录器的 级别
     */
    void setLevel(Class<?> clazz, Level level);
}
