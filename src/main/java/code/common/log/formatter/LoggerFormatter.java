package code.common.log.formatter;

import code.common.log.enums.Level;

/**
 * 格式化
 *
 * @version 1.0
 * @create 2018-03-07 10:11
 **/
public interface LoggerFormatter {

    String apply(Level level, String name, String message);

}
