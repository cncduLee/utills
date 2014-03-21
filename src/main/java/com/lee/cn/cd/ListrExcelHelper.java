package com.lee.cn.cd;

import com.lee.cn.cd.ConfigReader;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午3:25
 * To change this template use File | Settings | File Templates.
 */
public class ListrExcelHelper{


    public boolean exportExcel(Collection data, String configPath,String title, HttpServletRequest request, HttpServletResponse response) {
        try {
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("UTF-8");
            response.addHeader("Content-Disposition","attachment;filename="+title+".xls");

            OutputStream out = response.getOutputStream();
            export(data,configPath,out);
            out.close();

            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    private void export(Collection data, String configPath,OutputStream outputStream) throws Exception {
        ExcelUtils.ExportSetInfo setInfo = new ExcelUtils.ExportSetInfo();
        setInfo.setFieldNames(adapteeAttributes(configPath));
        setInfo.setHeadNames(adapteeHeaders(configPath));
        setInfo.setOut(outputStream);
    }

    public List<String[]> adapteeHeaders(String configPath) throws Exception {
        return ConfigReader.getInstall().getHeaders(configPath);
    }

    public List<String[]> adapteeAttributes(String configPath) throws Exception {
        return ConfigReader.getInstall().getAttributes(configPath);
    }

}
