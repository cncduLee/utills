package com.lee.cn.cd;

import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created with IntelliJ IDEA.
 * com.lee.cn.cd.User: wylipengming
 * Date: 14-3-11
 * Time: 下午2:00
 * To change this template use File | Settings | File Templates.
 */
public class FileUtils {
    public static File file_put_contents(String file_name, InputStream is) {
        File file = new File(file_name);
        OutputStream os = null;
        try {
            os = new FileOutputStream(file);
            byte buffer[] = new byte[4 * 1024];
            while ((is.read(buffer)) != -1) {
                os.write(buffer);
            }
            os.flush();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                os.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return file;
    }
}
