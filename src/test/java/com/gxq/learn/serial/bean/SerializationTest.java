package com.gxq.learn.serial.bean;

import java.io.File;
import java.io.IOException;
import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import com.dyuproject.protostuff.Schema;
import com.dyuproject.protostuff.runtime.RuntimeSchema;
import com.gxq.learn.serial.core.protostuff.SerializationUtil;

import net.webby.protostuff.runtime.Generators;

public class SerializationTest {

	@Test
	public void test() throws IOException {
		User u = new User();
		u.setAge(100);
		u.setCount(14555550000000000L);
		u.setMoney(new BigDecimal(111188888888888.47777777777777777777744));
		u.setName("test");
		u.setSum(145000.0f);
		u.setDate(new Date());
		System.out.println("before:" + u);
		SerializationUtil.serialize(u);
		File file = new File("D:\\yk_temp\\test.bat");
		byte[] data = SerializationUtil.serialize(u);
		FileUtils.writeByteArrayToFile(file, data);
		byte[] newData = FileUtils.readFileToByteArray(file);
		User u2 = SerializationUtil.deserialize(newData, User.class);
		System.out.println("after:" + u2);
		//RuntimeSchema.register(BigDecimal.class, new BigDecimalSchema());
		Schema<User> schema = RuntimeSchema.getSchema(User.class);
		System.out.println(schema.getClass());
		System.out.println(Generators.newProtoGenerator(schema).generate());
	}
	
	@Test
	public void testNew() throws IOException {
		Person u = new Person();
		u.setMoney(new BigDecimal("11118888888888877777777777777.47777777777777777777744"));
		System.out.println("before:" + u);
		SerializationUtil.serialize(u);
		File file = new File("D:\\yk_temp\\test1.bat");
		byte[] data = SerializationUtil.serialize(u);
		FileUtils.writeByteArrayToFile(file, data);
		byte[] newData = FileUtils.readFileToByteArray(file);
		Person u2 = SerializationUtil.deserialize(newData, Person.class);
		System.out.println("after:" + u2);
	}

}
