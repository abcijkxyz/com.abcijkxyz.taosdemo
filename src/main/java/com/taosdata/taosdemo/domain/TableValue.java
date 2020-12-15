package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class TableValue {

    private String database;
    private String name;
    private List<FieldMeta> columns;
    private List<RowValue> values;

}
