/**
 * 
 */
package com.HibernateHQLCRUD.app;

import java.util.List;

import com.HibernateHQLCRUD.dao.StudentDAO;
import com.HibernateHQLCRUD.entity.Student;

/**
 * @author A631954
 *
 */
public class App 
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		StudentDAO studentDao = new StudentDAO();
        Student student = new Student("Ramesh", "Fadatare", "rameshfadatare@javaguides.com");
        //studentDao.save
        //studentDao.saveStudent(student);

        studentDao.insertStudent();

        // update student
        Student student1 = new Student("Ram", "Fadatare", "rameshfadatare@javaguides.com");
        studentDao.updateStudent(student1);

        // get students
        List < Student > students = studentDao.getStudents();
        //students.forEach(s - > System.out.println(s.getFirstName()));
        //students.forEach(s- > System.out.println(s.g););

        // get single student
        Student student2 = studentDao.getStudent(1);
        System.out.println(student2.getFirstName());

        // delete student
        studentDao.deleteStudent(1);
	}

}
