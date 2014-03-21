package csabj.dnsalk;

import com.lee.cn.cd.ConfigReader;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.*;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午4:30
 * To change this template use File | Settings | File Templates.
 */
public class ConfigReaderTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testGetAttributes() throws Exception {
        List<String[]> attr = ConfigReader.getInstall().getAttributes("static.properties");
        List<String[]> list = new ArrayList<String[]>();
        Assert.assertNotSame(list,attr);
    }

    @Test
    public void testGetHeaders() throws Exception {
//        String[]  attr = ConfigReader.getInstall().getHeaders("a.properties");
//        Assert.assertArrayEquals(new String[]{"bkasbfckja2321"},attr);
    }
}
