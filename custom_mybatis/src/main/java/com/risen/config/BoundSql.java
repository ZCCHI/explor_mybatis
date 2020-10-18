package com.risen.config;

import com.risen.utils.ParameterMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * sql语句解析实体类
 */
public class BoundSql {

    private String sqlText;

    private List<ParameterMapping> parameterMappings = new ArrayList<ParameterMapping>();

    public BoundSql(String sqlText,List<ParameterMapping> parameterMappings){
        this.sqlText = sqlText;
        this.parameterMappings = parameterMappings;
    }

    public String getSqlText() {
        return sqlText;
    }

    public void setSqlText(String sqlText) {
        this.sqlText = sqlText;
    }

    public List<ParameterMapping> getParameterMappings() {
        return parameterMappings;
    }

    public void setParameterMappings(List<ParameterMapping> parameterMappings) {
        this.parameterMappings = parameterMappings;
    }
}