import beans.Student;
import context.ContextProvider;
import dao.StudentDao;
import org.springframework.context.ApplicationContext;

import java.util.List;

public class Delete {
    public static void Delete(String[] args) {

        ApplicationContext ctx= ContextProvider.provideContext();
        StudentDao studentDao=ctx.getBean("stDao",StudentDao.class);

        // delete
        studentDao.delete(102);
    }
}