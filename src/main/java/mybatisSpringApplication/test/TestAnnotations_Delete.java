package mybatisSpringApplication.test;
import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisSpringApplication.annoation.op.Student_mapper;
import mybatisSpringApplication.entity.Student;
public class TestAnnotations_Delete {
	public static void main(String args[]) throws IOException{
	      
		   Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		   SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);		
		   SqlSession session = sqlSessionFactory.openSession();
		   session.getConfiguration().addMapper(Student_mapper.class);
		      
		   Student_mapper mapper = session.getMapper(Student_mapper.class);
		   mapper.delete(3);
		   System.out.println("record deleted successfully");
		   session.commit();
		   session.close();            
					
		}
}
