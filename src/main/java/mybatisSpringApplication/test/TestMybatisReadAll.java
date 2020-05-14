package mybatisSpringApplication.test;

import java.io.IOException;
import java.io.Reader;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import mybatisSpringApplication.entity.Student;
// read all the records
public class TestMybatisReadAll {
	
	public static void main(String args[]) throws IOException{
		
		Reader reader = Resources.getResourceAsReader("SqlMapConfig.xml");
		SqlSessionFactory sqlFactory = new SqlSessionFactoryBuilder().build(reader);
		SqlSession session = sqlFactory.openSession();
		
		//select all the students
				List<Student> studentList = session.selectList("Student.getAll");
				
				 studentList.forEach(st ->{
					 System.out.println("Student Record of Id "+st.getId());
					 System.out.println(st.getId());
			         System.out.println(st.getName());
			         System.out.println(st.getPercentage());         
			         System.out.println(st.getEmail());        
			         System.out.println(st.getPhone());   
			         
			         System.out.println();
					 
				 });
				 session.commit();
				 session.close();
		
	}

}
