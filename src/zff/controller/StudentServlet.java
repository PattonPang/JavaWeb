package zff.controller;

import zff.bean.*;
import zff.dao.ClassesDao;
import zff.dao.impl.ClassesDaoImpl;
import zff.service.*;
import zff.service.impl.*;
import zff.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "StudentServlet", value = "/StudentServlet")
public class StudentServlet extends BaseServlet {

    protected void Home(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Students students = (Students) session.getAttribute("students");
        ClassesDao classesDao = new ClassesDaoImpl();
        Classes beanByclassId = classesDao.getBeanByclassId(students.getClassId());
        request.setAttribute("beanByclassId", beanByclassId);
        request.getRequestDispatcher("pages/student/Home.jsp").forward(request, response);
    }

    protected void toMyInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Students students = (Students) session.getAttribute("students");
        ClassesDao classesDao = new ClassesDaoImpl();
        Classes beanByclassId = classesDao.getBeanByclassId(students.getClassId());
        request.setAttribute("beanByclassId", beanByclassId);
        request.getRequestDispatcher("pages/student/MyInfo.jsp").forward(request, response);
    }

    protected void toChangeInfo(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Students students = (Students) session.getAttribute("students");
        ClassesDao classesDao = new ClassesDaoImpl();
        Classes beanByClassId = classesDao.getBeanByclassId(students.getClassId());
        request.setAttribute("beanByClassId", beanByClassId);
        request.getRequestDispatcher("pages/student/ChangeInfo.jsp").forward(request, response);
    }

    protected void changeStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        studentsService.update(students);
        HttpSession session = request.getSession();
        students = (Students) session.getAttribute("students");
        ClassesDao classesDao = new ClassesDaoImpl();
        Classes beanByclassId = classesDao.getBeanByclassId(students.getClassId());
        request.setAttribute("beanByclassId", beanByclassId);
        toMyInfo(request, response);
    }

    protected void toEvaTea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        List<SIstrue> stuBeanIsListAll = studentsService.getBeanIsListAll(students.getUsername());
        TeachersService teachersService = new TeachersServiceImpl();
        List<Teachers> teachersBeanListAll = teachersService.getBeanListAll();
        HashMap<String, Object> teacherMap = new HashMap<>();
        for (Teachers teachers : teachersBeanListAll) {
            teacherMap.put(teachers.getUsername(), teachers.getTeaName());
        }
        request.setAttribute("stuBeanIsListAll", stuBeanIsListAll);
        request.setAttribute("teacherMap", teacherMap);
        request.getRequestDispatcher("pages/student/EvaluateTeachers.jsp").forward(request, response);
    }

    protected void toQuestion(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Questions questions = new Questions();
        SCCTQM scctqm = WebUtils.paramsToBean(request, new SCCTQM());
        QuestionsService questionsService = new QuestionsServiceImpl();
        List<Questions> questionsBeanListAll = questionsService.getBeanListAll();
        request.setAttribute("questionsBeanListAll", questionsBeanListAll);
        request.setAttribute("scctqm", scctqm);
        request.getRequestDispatcher("pages/student/Questions.jsp").forward(request, response);
    }

    protected void upSCCTQM(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SCCTQM scctqm = WebUtils.paramsToBean(request, new SCCTQM());
        SIstrue sIstrue = WebUtils.paramsToBean(request, new SIstrue());
        Integer qSum = scctqm.getQ1mark() + scctqm.getQ2mark() + scctqm.getQ3mark() + scctqm.getQ4mark() + scctqm.getQ5mark();
        scctqm.setqSum(qSum);
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        sIstrueService.updateSCCTQM(scctqm);
        sIstrueService.updatefStu(sIstrue);
        toEvaTea(request, response);
    }
}
