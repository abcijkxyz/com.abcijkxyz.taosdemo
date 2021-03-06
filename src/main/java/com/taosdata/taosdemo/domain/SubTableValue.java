package com.taosdata.taosdemo.domain;

import java.util.List;

import lombok.Data;

@Data
public class SubTableValue {

    private String database;
    private String supertable;
    private String name;
    private List<TagValue> tags;
    private List<RowValue> values;
}
