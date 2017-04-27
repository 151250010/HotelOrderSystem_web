package utils.jackson;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationConfig;

import java.text.SimpleDateFormat;

/**
 * 自定制的jackson序列化行为
 */
public class CustomObjectMapper extends ObjectMapper {

    private boolean camelCaseToLowerCaseWithUnderscores = false;
    private String dateFormatPattern;

    public void setCamelCaseToLowerCaseWithUnderscores(boolean camelCaseToLowerCaseWithUnderscores) {
        this.camelCaseToLowerCaseWithUnderscores = camelCaseToLowerCaseWithUnderscores;
    }

    public void setDateFormatPattern(String dateFormatPattern) {
        this.dateFormatPattern = dateFormatPattern;
    }

    public boolean isCamelCaseToLowerCaseWithUnderscores() {
        return camelCaseToLowerCaseWithUnderscores;
    }

    public String getDateFormatPattern() {
        return dateFormatPattern;
    }

    public void init(){

        //设置自动驼峰式命名到下划线命名的转换
        if (camelCaseToLowerCaseWithUnderscores) {
            setCamelCaseToLowerCaseWithUnderscores(true);
        }

        //设置全局日期的转换格式
        if (dateFormatPattern != null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(dateFormatPattern);
            setDateFormat(simpleDateFormat);
        }

        setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }
}
