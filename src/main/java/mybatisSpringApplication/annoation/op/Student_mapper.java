package mybatisSpringApplication.annoation.op;

import java.util.List;

import org.apache.ibatis.annotations.*;

import mybatisSpringApplication.entity.Student;

public interface Student_mapper {
	
   final String getAll = "SELECT * FROM mybatisTable"; 
   final String getById = "SELECT * FROM mybatisTable WHERE ID = #{id}";
   final String deleteById = "DELETE from mybatisTable WHERE ID = #{id}";
   final String insert = "INSERT INTO mybatisTable (name, percentage, phone,email ) VALUES (#{name}, #{percentage}, #{phone}, #{email})";
   final String update = "UPDATE mybatisTable SET email = #{email}, name = #{name},  percentage = #{percentage}, phone = #{phone} WHERE id = #{id}";
   
   @Select(getAll)
   @Results(value = {
      @Result(property = "id", column = "id"),
      @Result(property = "name", column = "NAME"),
      @Result(property = "percentage", column = "percentage"),       
      @Result(property = "phone", column = "phone"),
      @Result(property = "email", column = "email")
   })
   
   List getAll();
  
   @Select(getById)
   @Results(value = {
      @Result(property = "id", column = "id"),
      @Result(property = "name", column = "name"),
      @Result(property = "percentage", column = "percentage"),       
      @Result(property = "phone", column = "phone"),
      @Result(property = "email", column = "email")
   })
   
   Student getById(int id);

   @Update(update)
   void update(Student student);

   @Delete(deleteById)
   void delete(int id);
  
   @Insert(insert)
   @Options(useGeneratedKeys = true, keyProperty = "id")
   void insert(Student student);
}