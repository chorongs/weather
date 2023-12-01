package zerobase.weather.error;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import zerobase.weather.WeatherApplication;

public class InvalidDate extends RuntimeException{
    private static final String MESSAGE = "너무 과거 혹은 미래의 날짜입니다.";

    public InvalidDate(){
        super(MESSAGE);
    }
}
