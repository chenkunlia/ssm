package com.soecode.lyf.utils;
import java.sql.Connection;
import java.sql.SQLException;
 
import javax.sql.DataSource;
 
import com.mchange.v2.c3p0.ComboPooledDataSource;
 
 
/**
 * 用Jdbc操作数据库的工具，本类依赖c3p0-config.xml文件
 * @author huangyong
 * @date 2018年4月8日 下午9:58:31
 *
 */
public class JdbcUtils {
	private static final ComboPooledDataSource ds = new ComboPooledDataSource();
 
	/**
	 * 获得数据源
	 * @return DataSource   返回类型
	 */
	public static DataSource getDataSource(){
		return ds;
	}
 
	/**
	 *  关闭数据源
	 * @return void   返回类型
	 */
	public static void closeDataSource(){
		ds.close();
	}
}