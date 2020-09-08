package zff.controller;

import zff.bean.Admins;
import zff.bean.Classes;
import zff.bean.Students;
import zff.bean.Teachers;
import zff.dao.ClassesDao;
import zff.dao.impl.ClassesDaoImpl;
import zff.service.AdminsService;
import zff.service.StudentsService;
import zff.service.TeachersService;
import zff.service.impl.AdminsServiceImpl;
import zff.service.impl.StudentsServiceImpl;
import zff.service.impl.TeachersServiceImpl;
import zff.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @author zff
 */
@WebServlet(name = "LoginServlet",value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String user = request.getParameter("user");
        if("admins".equals(user)){
            Admins admins = WebUtils.paramsToBean(request, new Admins());
            AdminsService adminsService = new AdminsServiceImpl();
            admins = adminsService.login(admins);
            if(admins!=null){
                session.setAttribute("admins", admins);
                session.removeAttribute("msg");
                response.sendRedirect("pages/admin/Home.jsp");
            }else {
                request.setAttribute("msg", "账号或密码错误！");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else if("students".equals(user)){
            Students students = WebUtils.paramsToBean(request, new Students());
            StudentsService studentsService = new StudentsServiceImpl();
            students = studentsService.login(students);
            if(students!=null){
                session.setAttribute("students", students);
                ClassesDao classesDao = new ClassesDaoImpl();
                Classes beanByclassId = classesDao.getBeanByclassId(students.getClassId());
                request.setAttribute("beanByclassId",beanByclassId);
                session.removeAttribute("msg");
                request.getRequestDispatcher("pages/student/Home.jsp").forward(request,response);
            }else {
                request.setAttribute("msg", "账号或密码错误！");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }else if("teacher".equals(user)){
            Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
            TeachersService teacherService = new TeachersServiceImpl();
            teachers = teacherService.login(teachers);
            if(teachers!=null){
                session.setAttribute("teachers", teachers);
                session.removeAttribute("msg");
                request.getRequestDispatcher("pages/teacher/Home.jsp").forward(request, response);
            }else {
                request.setAttribute("msg", "账号或密码错误！");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            }
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }
}
