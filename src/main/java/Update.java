
import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

public class Update {
    public static void main(String[] args) {

        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

        // update
        Student s=studentDao.getStudent(101);
        s.setName("Priya");
        studentDao.update(s);

    }
}