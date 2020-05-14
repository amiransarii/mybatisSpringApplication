package mybatisSpringApplication.test;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisSpringApplication.entity.Student;

/**
 * 
 * @author amir.ansari this is a test class of insert operation of mybatis
 */
public class TestMybatisInsert {

	public static void main(String args[]) throws IOException {

		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = factory.openSession();

		// create a new Student object
		Student student = new Student(1,"Amir Ansari", 80, 012333, "amiransari.my@gmail.com");

		// Insert Student data
		session.insert("Student.insert", student);
		System.out.println("record inserted successfully");
		session.commit();
		session.close();
	}

}
