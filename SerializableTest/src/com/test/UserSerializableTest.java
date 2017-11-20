package com.test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

/**
 * 测试对象序列化
 * @author 张平德
 *
 */
public class UserSerializableTest {

	public static void main(String[] args) {
		testReaderUser();
	}
	
	/**
	 * 对象写入到文件中
	 */
	public static void testWriterUser() {
		FileOutputStream fos;
		ObjectOutputStream oos;
		try {
			fos = new FileOutputStream("C:\\Users\\ASUS\\Desktop\\logs\\user.txt");
			oos = new ObjectOutputStream(fos);
			User user = new User("zhangpingde", "123454678", new Date());
			oos.writeObject(user);
			oos.flush();
			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/**
	 * 文件中读取对象
	 */
	public static void testReaderUser() {
		FileInputStream fis;
		ObjectInputStream ois;
		try {
			fis=new FileInputStream("C:\\Users\\ASUS\\Desktop\\logs\\user.txt");
			ois=new ObjectInputStream(fis);
			User user=(User) ois.readObject();
			System.out.println(user);
			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
