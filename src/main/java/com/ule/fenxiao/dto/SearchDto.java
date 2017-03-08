package com.ule.fenxiao.dto;

/**
 * Created by zongruibiao on 2017/3/1.
 */
public class SearchDto {
    /** 拼接类型，and或者or */
    private String type;
    private String key;
    private String operation;
    private Object value;

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public SearchDto() {
        super();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SearchDto(String key, String operation, Object value) {
        this.key = key;
        this.operation = operation;
        this.value = value;
    }

    public SearchDto(String type, String key, String operation, Object value) {
        this.type = type;
        this.key = key;
        this.operation = operation;
        this.value = value;
    }
}
