package com.laoyancheng.www.wxmarketbackend.db.mybatis;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.ibatis.type.BaseTypeHandler;
import org.apache.ibatis.type.JdbcType;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * @Description:
 * @Author: JuRan
 * @Date: 2023/12/27 19:57
 */
public class JsonIntegerArrayTypeHandler extends BaseTypeHandler<Integer[]> {
    private static final ObjectMapper objectMapper = new ObjectMapper();

    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, Integer[] parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, toJsonString(parameter));
    }

    @Override
    public Integer[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toIntergerArr(rs.getString(columnName));
    }

    @Override
    public Integer[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toIntergerArr(rs.getString(columnIndex));
    }

    @Override
    public Integer[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toIntergerArr(cs.getString(columnIndex));
    }

    private Integer[] toIntergerArr(String string) {
        try {
            return objectMapper.readValue(string, Integer[].class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String toJsonString(Integer[] parameter) {
        try {
            return objectMapper.writeValueAsString(parameter);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }
}
