package designpatterns5041.assignment02.loggerfactories;

import designpatterns5041.assignment02.loggers.Logger;
import designpatterns5041.assignment02.loggers.RickRollingLogger;

public class RickRollingLoggerFactory implements LoggerFactory {
    @Override
    public Logger create() {
        return new RickRollingLogger();
    }
} 