package zff.controller;

import zff.bean.Classes;
import zff.bean.Students;
import zff.service.ClassesService;
import zff.service.StudentsService;
import zff.service.impl.ClassesServiceImpl;
import zff.service.impl.StudentsServiceImpl;
import zff.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "RegisterServlet",value = "/RegisterServlet")
public class RegisterServlet extends BaseServlet {


    protected void getAllClassesStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("classesList",classesList);
        request.getRequestDispatcher("register.jsp").forward(request, response);
    }

    protected void register(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        boolean register = studentsService.register(students);
        if(register){
            response.sendRedirect("index.jsp");
        }else {
            request.setAttribute("msg","账号已存在！");
            request.getRequestDispatcher("RegisterServlet?method=getAllClassesStu").forward(request,response);
        }
    }
}
