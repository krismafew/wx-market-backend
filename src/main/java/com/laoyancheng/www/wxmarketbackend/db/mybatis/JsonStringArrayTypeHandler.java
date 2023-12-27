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
 * @Date: 2023/12/27 19:36
 */
public class JsonStringArrayTypeHandler extends BaseTypeHandler<String[]> {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    @Override
    public void setNonNullParameter(PreparedStatement ps, int i, String[] parameter, JdbcType jdbcType) throws SQLException {
        ps.setString(i, toJsonString(parameter));
    }

    @Override
    public String[] getNullableResult(ResultSet rs, String columnName) throws SQLException {
        return toStringArr(rs.getString(columnName));
    }

    @Override
    public String[] getNullableResult(ResultSet rs, int columnIndex) throws SQLException {
        return toStringArr(rs.getString(columnIndex));
    }

    @Override
    public String[] getNullableResult(CallableStatement cs, int columnIndex) throws SQLException {
        return toStringArr(cs.getString(columnIndex));
    }

    private String[] toStringArr(String string) {
        // 将Json字符串转化为String[]
        try {
            return objectMapper.readValue(string, String[].class);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

    private String toJsonString(String[] parameter) {
        // 将String[]转化为Json字符串
        try {
            return objectMapper.writeValueAsString(parameter);
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }
    }

}
