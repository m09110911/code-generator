package code.common.log.factory;


import code.common.log.enums.Level;
import code.common.log.formatter.BaseFormatter;
import code.common.log.formatter.LoggerFormatter;
import code.common.log.logger.Logger;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.stream.Stream;

import static java.util.Objects.requireNonNull;

/**
 * 日志记录器 工厂 主要实现
 *
 * @version 1.0
 * @create 2018-03-07 15:53
 **/
public abstract class AbstractLoggerFactory implements LoggerFactory {

    private final Map<String, Logger> loggers;
    private LoggerFormatter formatter;

    AbstractLoggerFactory() {
        loggers = new ConcurrentHashMap<>();
        formatter = new BaseFormatter();
    }

    @Override
    public Logger create(String binding) {
        requireNonNull(binding);
        return createLogger(binding);
    }

    @Override
    public Logger create(Class<?> binding) {
        return createLogger(makeNameFromClass(binding));
    }

    @Override
    public void setLoggerFormatter(LoggerFormatter loggerFormatter) {
        this.formatter = loggerFormatter;
    }

    @Override
    public LoggerFormatter getFormatter() {
        return formatter;
    }

    @Override
    public Stream<Map.Entry<String, Logger>> loggers() {
        return loggers.entrySet().stream();
    }

    @Override
    public void setLevel(String path, Level level) {
        requireNonNull(path);
        requireNonNull(level);
        loggers()
                .filter(l -> l.getKey().startsWith(path))
                .map(Map.Entry::getValue).forEach(v -> v.setLevel(level));
    }

    @Override
    public void setLevel(Class<?> clazz, Level level) {
        requireNonNull(clazz);
        requireNonNull(level);
        setLevel(makeNameFromClass(clazz), level);
    }

    public abstract Logger make(String binding, LoggerFormatter formatter);

    protected Logger createLogger(String binding) {
        requireNonNull(binding);
        return loggers.computeIfAbsent(binding, b -> {
            final Logger log = make(binding, formatter);
            return log;
        });
    }

    protected String makeNameFromClass(Class<?> clazz) {
        requireNonNull(clazz);
        final String[] tokens = clazz.getName().split("\\.");
        final StringBuilder sb = new StringBuilder();
        for (int i = 0; i < tokens.length; i++) {
            if (i == tokens.length - 1) {
                sb.append(tokens[i]);
            } else {
                sb.append(tokens[i].charAt(0)).append('.');
            }
        }
        return sb.toString();

    }
}
