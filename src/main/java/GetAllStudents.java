import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class GetAllStudents {
    public static void main(String[] args) {

        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

        studentDao.insert(new Student(102,"Danish"));
        studentDao.insert(new Student(103,"Sneha"));

        // update
        List<Student> students=studentDao.getAllStudents();
        for(Student s:students)
        {
            System.out.println(s);
        }

    }
}