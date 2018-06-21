package org.service.one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.service.one.entity.PageData;
import org.service.one.entity.RestResult;
import org.service.one.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	
	
	
	@Autowired
	private UserInfoService userInfoService;
	/**
	 * Create the test case
	 *
	 * @param testName
	 *            name of the test case
	 */
	public AppTest(String testName) {
		super(testName);
	}

	/**
	 * @return the suite of tests being tested
	 */
	public static Test suite() {
		return new TestSuite(AppTest.class);
	}

	/**
	 * Rigourous Test :-)
	 */
	public void testApp() {
		assertTrue(true);
	}

	public void Test() throws Exception {
		PageData pd = new PageData();
		pd.put("mobile","18411052001");
		pd = userInfoService.selectByPhone(pd);
		System.out.println(pd);
	}
	
	public Connection getConnection()  
    {  
        Connection conn=null;  
        try  
        {  
            try {  
                Class.forName("com.mysql.cj.jdbc.Driver");  
            }  
            catch (ClassNotFoundException ex)  
            {  
                System.out.println("加载驱动程序有错误");  
            }  
            //serverTimezone=GMT jdbc:mysql://rm-wz951d5k04l5oyu52o.mysql.rds.aliyuncs.com:3306/yunpu?user=root&password=Pp001219&useUnicode=true&characterEncoding=UTF-8
            String url = "jdbc:mysql://127.0.0.1:3306/yunpu?user=root&password=root&useUnicode=true&characterEncoding=UTF-8&serverTimezone=GMT";  
            conn = DriverManager.getConnection(url);  
            System.out.println("成功连接数据库！！");  

        }  
        catch (SQLException ex1)  
        {  
            System.out.print("取得连接的时候有错误，请核对用户名和密码");  
            System.out.print(ex1.getMessage()); 
        }  
        return conn;  
    }  
	
}
