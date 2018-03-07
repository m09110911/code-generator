package code.common.log.enums;

/**
 * log 级别  枚举类
 *
 * @author chengchaochao
 * @create 2018-03-07 9:56
 **/
public enum Level {

    /**
     * 跟踪的作用是指定更细粒度的信息事件
     * 比“调试”级别要高的多
     * <p>
     * 这是最低水平的日志记录
     */
    TRACE("TRACE"),
    /**
     * Debug级别指定了细粒度的信息事件
     * 这对于调试应用程序非常有用.
     * <p>
     * 这一水平高于:
     * <ul>
     * <li>{@link #TRACE}</li>
     * </ul>
     */
    DEBUG("DEBUG"),
    /**
     * 级别指定了突出显示的信息信息
     * 在粗粒度级别上应用程序的进展.
     * <p>
     * 这一水平高于:
     * <ul>
     * <li>{@link #TRACE}</li>
     * <li>{@link #DEBUG}</li>
     * </ul>
     */
    INFO("INFO "),
    /**
     * 警告:级别指定了潜在的有害情况
     * <p>
     * 这一水平高于:
     * <ul>
     * <li>{@link #TRACE}</li>
     * <li>{@link #DEBUG}</li>
     * <li>{@link #INFO}</li>
     * </ul>
     */
    WARN("WARN "),
    /**
     * 警告:级别指定了潜在的有害情况.
     * <p>
     * 这一水平高于:
     * <ul>
     * <li>{@link #TRACE}</li>
     * <li>{@link #DEBUG}</li>
     * <li>{@link #INFO}</li>
     * <li>{@link #WARN}</li>
     * </ul>
     */
    ERROR("ERROR"),
    /**
     * 级别指定了一个严重的应用程序错误事件
     * 最可能导致应用程序中止。
     * <p>
     * 这一水平高于:
     * <ul>
     * <li>{@link #TRACE}</li>
     * <li>{@link #DEBUG}</li>
     * <li>{@link #INFO}</li>
     * <li>{@link #WARN}</li>
     * <li>{@link #ERROR}</li>
     * </ul>
     */
    FATAL("FATAL");

    private final String text;

    private Level(String text) {
        this.text = text;
    }

    /**
     * 默认 日志级别
     */
    public static Level defaultLevel(){
        return INFO;
    }

    /**
     * 如果当前此级别等于或低于所提供的级别，则返回 true.
     *
     */
    public boolean isEqualOrLowerThan(Level otherLevel) {
        return ordinal() <= otherLevel.ordinal();
    }

    /**
     * 如果当前此级别等于或高于所提供的级别，则返回 true.

     */
    public boolean isEqualOrHigherThan(Level otherLevel) {
        return ordinal() >= otherLevel.ordinal();
    }

    /**
     * 返回在这个级别的输出日志程序中使用的文本。
     *
     */
    public String toText() {
        return text;
    }
}
