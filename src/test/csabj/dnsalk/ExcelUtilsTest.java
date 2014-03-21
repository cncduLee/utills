package csabj.dnsalk;

import com.lee.cn.cd.ExcelUtils;
import com.lee.cn.cd.FileUtils;
import com.lee.cn.cd.User;

import java.io.*;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午1:39
 * To change this template use File | Settings | File Templates.
 */
public class ExcelUtilsTest {
    @org.junit.Before
    public void setUp() throws Exception {

    }

    @org.junit.After
    public void tearDown() throws Exception {

    }

    @org.junit.Test
    public void testExport2Excel() throws Exception {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        List<String[]> headNames = new ArrayList<String[]>();
        headNames.add(new String[] { "用户名", "密码", "电子邮件", "类型", "角色" });
        List<String[]> fieldNames = new ArrayList<String[]>();
        fieldNames.add(new String[] { "userName", "pwd", "email", "typeStr", "roleStr"});

        LinkedHashMap<String,Collection> map = new LinkedHashMap<String, Collection>();
        List<User> datas = new ArrayList<User>();
        datas.add(new User("1","1","1","1","1")) ;
        datas.add(new User("2","2","1","1","1")) ;
        datas.add(new User("1","1","1","1","1")) ;

        ExcelUtils.ExportSetInfo setInfo = new ExcelUtils.ExportSetInfo();
        setInfo.setObjsMap(map);
        setInfo.setFieldNames(fieldNames);
        setInfo.setTitles(new String[] { "馋八戒后台用户信息" });
        setInfo.setHeadNames(headNames);
        setInfo.setOut(baos);

        // 将需要导出的数据输出到baos
        ExcelUtils.export2Excel(setInfo);
        InputStream in = new ByteArrayInputStream(baos.toByteArray());
        FileUtils.file_put_contents("c:/a.txt", in);
    }
}
