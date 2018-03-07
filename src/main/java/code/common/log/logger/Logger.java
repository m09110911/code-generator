package code.common.log.logger;

import code.common.log.enums.Level;
import code.common.log.formatter.LoggerFormatter;

import java.util.Objects;

/**
 * log 对象 接口
 *<pre>
 *
 *</pre>
 * @author chengchaochao
 * @create 2018-03-07 10:05
 **/
public interface Logger {

    String NO_EXCEPTION_TEXT = "";

    /**
     * 获取当前日志级别
     */
    Level getLevel();

    /**
     * 设置 日志级别
     */
    void setLevel(Level level);

    /**
     * 获取 当前日志formatter
     */
    LoggerFormatter getLogFormatter();

    /**
     * 设置 fromatter
     */
    void setLogFormatter(LoggerFormatter loggerFormatter);

    /**
     * trace 级别 日志输出
     *
     * @param msg 日志信息
     */
    void trace(String msg);

    /**
     * trace 级别 日志输出
     *
     * @param throwable 异常信息
     */
    void trace(Throwable throwable);

    /**
     * trace 级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void trace(String msg, Throwable throwable);

    /**
     * trace 级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void trace(String msg, Object obj1);

    /**
     * trace 级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void trace(String msg, Object obj1, Object obj2);

    /**
     * trace 级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void trace(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * trace 级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void trace(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * trace 级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void trace(String msg, Throwable throwable, Objects... objects);

    /**
     * debug级别 日志输出
     *
     * @param msg 日志信息
     */
    void debug(String msg);

    /**
     * debug级别 日志输出
     *
     * @param throwable 异常信息
     */
    void debug(Throwable throwable);

    /**
     * debug级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void debug(String msg, Throwable throwable);

    /**
     * debug级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void debug(String msg, Object obj1);

    /**
     * debug级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void debug(String msg, Object obj1, Object obj2);

    /**
     * debug级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void debug(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * debug级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void debug(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * debug级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void debug(String msg, Throwable throwable, Objects... objects);


    /**
     * info级别 日志输出
     *
     * @param msg 日志信息
     */
    void info(String msg);

    /**
     * info级别 日志输出
     *
     * @param throwable 异常信息
     */
    void info(Throwable throwable);

    /**
     * info级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void info(String msg, Throwable throwable);

    /**
     * info级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void info(String msg, Object obj1);

    /**
     * info级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void info(String msg, Object obj1, Object obj2);

    /**
     * info级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void info(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * info级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void info(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * info级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void info(String msg, Throwable throwable, Objects... objects);

    /**
     * warn级别 日志输出
     *
     * @param msg 日志信息
     */
    void warn(String msg);

    /**
     * warn级别 日志输出
     *
     * @param throwable 异常信息
     */
    void warn(Throwable throwable);

    /**
     * warn级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void warn(String msg, Throwable throwable);

    /**
     * warn级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void warn(String msg, Object obj1);

    /**
     * warn级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void warn(String msg, Object obj1, Object obj2);

    /**
     * warn级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void warn(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * warn级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void warn(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * warn级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void warn(String msg, Throwable throwable, Objects... objects);


    /**
     * error级别 日志输出
     *
     * @param msg 日志信息
     */
    void error(String msg);

    /**
     * error级别 日志输出
     *
     * @param throwable 异常信息
     */
    void error(Throwable throwable);

    /**
     * error级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void error(String msg, Throwable throwable);

    /**
     * error级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void error(String msg, Object obj1);

    /**
     * error级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void error(String msg, Object obj1, Object obj2);

    /**
     * error级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void error(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * error级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void error(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * error级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void error(String msg, Throwable throwable, Objects... objects);


    /**
     * fatal级别 日志输出
     *
     * @param msg 日志信息
     */
    void fatal(String msg);

    /**
     * fatal级别 日志输出
     *
     * @param throwable 异常信息
     */
    void fatal(Throwable throwable);

    /**
     * fatal级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     */
    void fatal(String msg, Throwable throwable);

    /**
     * fatal级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志中的参数
     */
    void fatal(String msg, Object obj1);

    /**
     * fatal级别  日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     */
    void fatal(String msg, Object obj1, Object obj2);

    /**
     * fatal级别 日志输出
     *
     * @param msg  日志信息
     * @param obj1 日志信息中的第一个参数
     * @param obj2 日志信息中的第二个参数
     * @param obj3 日志信息中的第三个参数
     */
    void fatal(String msg, Object obj1, Object obj2, Object obj3);

    /**
     * fatal级别 日志输出
     *
     * @param msg     日志信息
     * @param obj1    日志信息中的第一个参数
     * @param obj2    日志信息中的第二个参数
     * @param obj3    日志信息中的第三个参数
     * @param objects 日志信息中的变长参数数组
     */
    void fatal(String msg, Object obj1, Object obj2, Object obj3, Object... objects);

    /**
     * fatal级别 日志输出
     *
     * @param msg       日志信息
     * @param throwable 异常信息
     * @param objects   日志信息中的变长参数数组
     */
    void fatal(String msg, Throwable throwable, Objects... objects);


}
