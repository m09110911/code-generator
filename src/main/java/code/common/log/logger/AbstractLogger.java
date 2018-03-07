package code.common.log.logger;


import code.common.log.enums.Level;
import code.common.log.formatter.LoggerFormatter;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.Objects;
import java.util.function.Supplier;

/**
 * logger 主要实现
 *
 * @version 1.0
 * @create 2018-03-07 10:39
 **/
abstract class AbstractLogger implements Logger {
    private String name;
    private Level level;
    private LoggerFormatter loggerFormatter;

    AbstractLogger(String name, LoggerFormatter loggerFormatter) {
        this.name = name;
        this.loggerFormatter = loggerFormatter;
        this.level = Level.defaultLevel();
    }

    protected abstract void outPrint(String msg);


    @Override
    public Level getLevel() {
        return level;
    }

    @Override
    public void setLevel(Level level) {
        this.level = Objects.requireNonNull(level);
    }

    @Override
    public LoggerFormatter getLogFormatter() {
        return loggerFormatter;
    }

    @Override
    public void setLogFormatter(LoggerFormatter loggerFormatter) {
        this.loggerFormatter = Objects.requireNonNull(loggerFormatter);
    }

    @Override
    public void trace(String msg) {
        log(Level.TRACE, NO_THROWABLE, msg);
    }

    @Override
    public void trace(Throwable throwable) {
        log(Level.TRACE, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void trace(String msg, Throwable throwable) {
        log(Level.TRACE, throwable, msg);
    }

    @Override
    public void trace(String msg, Object obj1) {
        log(Level.TRACE, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void trace(String msg, Object obj1, Object obj2) {
        log(Level.TRACE, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void trace(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.TRACE, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void trace(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.TRACE, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void trace(String msg, Throwable throwable, Objects... objects) {
        log(Level.TRACE, throwable, msg, objects);
    }

    @Override
    public void debug(String msg) {
        log(Level.DEBUG, NO_THROWABLE, msg);
    }

    @Override
    public void debug(Throwable throwable) {
        log(Level.DEBUG, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void debug(String msg, Throwable throwable) {
        log(Level.DEBUG, throwable, msg);
    }

    @Override
    public void debug(String msg, Object obj1) {
        log(Level.DEBUG, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void debug(String msg, Object obj1, Object obj2) {
        log(Level.DEBUG, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void debug(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.DEBUG, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void debug(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.DEBUG, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void debug(String msg, Throwable throwable, Objects... objects) {
        log(Level.DEBUG, throwable, msg, objects);
    }

    @Override
    public void info(String msg) {
        log(Level.INFO, NO_THROWABLE, msg);
    }

    @Override
    public void info(Throwable throwable) {
        log(Level.INFO, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void info(String msg, Throwable throwable) {
        log(Level.INFO, throwable, msg);
    }

    @Override
    public void info(String msg, Object obj1) {
        log(Level.INFO, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void info(String msg, Object obj1, Object obj2) {
        log(Level.INFO, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void info(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.INFO, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void info(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.INFO, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void info(String msg, Throwable throwable, Objects... objects) {
        log(Level.INFO, NO_THROWABLE, msg, objects);
    }

    @Override
    public void warn(String msg) {
        log(Level.WARN, NO_THROWABLE, msg);
    }

    @Override
    public void warn(Throwable throwable) {
        log(Level.WARN, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void warn(String msg, Throwable throwable) {
        log(Level.WARN, throwable, msg);
    }

    @Override
    public void warn(String msg, Object obj1) {
        log(Level.WARN, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void warn(String msg, Object obj1, Object obj2) {
        log(Level.WARN, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void warn(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.WARN, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void warn(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.WARN, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void warn(String msg, Throwable throwable, Objects... objects) {
        log(Level.WARN, NO_THROWABLE, msg, objects);
    }

    @Override
    public void error(String msg) {
        log(Level.ERROR, NO_THROWABLE, msg);
    }

    @Override
    public void error(Throwable throwable) {
        log(Level.ERROR, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void error(String msg, Throwable throwable) {
        log(Level.ERROR, throwable, msg);
    }

    @Override
    public void error(String msg, Object obj1) {
        log(Level.ERROR, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void error(String msg, Object obj1, Object obj2) {
        log(Level.ERROR, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void error(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.ERROR, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void error(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.ERROR, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void error(String msg, Throwable throwable, Objects... objects) {
        log(Level.ERROR, throwable, msg, objects);
    }

    @Override
    public void fatal(String msg) {
        log(Level.FATAL, NO_THROWABLE, msg);
    }

    @Override
    public void fatal(Throwable throwable) {
        log(Level.FATAL, throwable, NO_EXCEPTION_TEXT);
    }

    @Override
    public void fatal(String msg, Throwable throwable) {
        log(Level.FATAL, throwable, msg);
    }

    @Override
    public void fatal(String msg, Object obj1) {
        log(Level.FATAL, NO_THROWABLE, msg, obj1);
    }

    @Override
    public void fatal(String msg, Object obj1, Object obj2) {
        log(Level.FATAL, NO_THROWABLE, msg, obj1, obj2);
    }

    @Override
    public void fatal(String msg, Object obj1, Object obj2, Object obj3) {
        log(Level.FATAL, NO_THROWABLE, msg, obj1, obj2, obj3);
    }

    @Override
    public void fatal(String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(Level.FATAL, NO_THROWABLE, msg, obj1, obj2, obj3, objects);
    }

    @Override
    public void fatal(String msg, Throwable throwable, Objects... objects) {
        log(Level.FATAL, NO_THROWABLE, msg, objects);
    }

    protected void log(Level level, Throwable throwable, String msg) {
        log(level, throwable, () -> msg);
    }

    protected void log(Level level, Throwable throwable, String msg, Object obj) {
        log(level, throwable, () -> String.format(msg, obj));
    }

    protected void log(Level level, Throwable throwable, String msg, Object obj1, Object obj2) {
        log(level, throwable, () -> String.format(msg, obj1, obj2));
    }

    protected void log(Level level, Throwable throwable, String msg, Object obj1, Object obj2, Object obj3) {
        log(level, throwable, () -> String.format(msg, obj1, obj2, obj3));
    }

    protected void log(Level level, Throwable throwable, String msg, Object obj1, Object obj2, Object obj3, Object... objects) {
        log(level, throwable, () -> {
            final Object[] params = new Object[objects.length + 3];
            params[0] = obj1;
            params[1] = obj2;
            params[2] = obj3;
            System.arraycopy(objects, 0, params, 3, objects.length);
            return String.format(msg, params);
        });
    }

    protected void log(Level level, Throwable throwable, String msg, Object... objects) {
        log(level, throwable, () -> String.format(msg, objects));
    }

    protected void log(Level level, Throwable throwable, Supplier<String> supplier) {
        if (level.isEqualOrHigherThan(this.level)) {
            final String logMsg = supplier.get();
            final String outMessage = fixMessage(level, throwable, logMsg);
            outPrint(outMessage);
        }
    }

    protected String fixMessage(Level level, Throwable throwable, String msg) {
        StringBuilder outMessage = new StringBuilder(loggerFormatter.apply(level, name, msg));
        if (throwable != NO_THROWABLE) {
            final StringWriter writer = new StringWriter();
            final PrintWriter printWriter = new PrintWriter(writer);
            throwable.printStackTrace(printWriter);
            outMessage.append("\n").append(writer.toString());
        }
        return outMessage.toString();
    }

    private final static Throwable NO_THROWABLE = null;
}
