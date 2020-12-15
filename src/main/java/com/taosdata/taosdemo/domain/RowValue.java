package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class RowValue {
    private List<FieldValue> fields;


    public RowValue(List<FieldValue> fields) {
        this.fields = fields;
    }
}