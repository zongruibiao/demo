package com.ule.fenxiao.dto;

import org.springframework.data.jpa.domain.Specifications;

/**
 * Created by zongruibiao on 2017/3/1.
 */
public class SearchSpeDto {
    /** 类型，and或者or */
    private String type;

    private Specifications spes;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Specifications getSpes() {
        return spes;
    }

    public void setSpes(Specifications spes) {
        this.spes = spes;
    }

    public SearchSpeDto() {
        super();
    }

    public SearchSpeDto(String type, Specifications spes) {
        this.type = type;
        this.spes = spes;
    }
}
