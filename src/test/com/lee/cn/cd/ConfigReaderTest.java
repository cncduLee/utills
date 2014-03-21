package com.lee.cn.cd;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: wylipengming
 * Date: 14-3-14
 * Time: 下午2:40
 * To change this template use File | Settings | File Templates.
 */
public class ConfigReaderTest {
    @Test
    public void testReadProperty() throws Exception {
        List<String[]> attr = ConfigReader.getInstall().readProperty("static.properties","test");
        List<String[]> list = new ArrayList<String[]>();
        Assert.assertNotSame(list, attr);
    }
}
