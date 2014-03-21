package com.lee.cn.cd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午4:45
 * To change this template use File | Settings | File Templates.
 */
public interface ExcelHelper<T> {
    public boolean exportExcel(HttpServletRequest request, HttpServletResponse response);
    public void createExcel(Collection<T> data,String configPath,String fileName);
 }
