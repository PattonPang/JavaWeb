package zff.controller;

import zff.bean.Classes;
import zff.bean.Courses;
import zff.bean.TeaMark;
import zff.bean.Teachers;
import zff.service.ClassesService;
import zff.service.CoursesService;
import zff.service.SIstrueService;
import zff.service.TeachersService;
import zff.service.impl.ClassesServiceImpl;
import zff.service.impl.CoursesServiceImpl;
import zff.service.impl.SIstrueServiceImpl;
import zff.service.impl.TeachersServiceImpl;
import zff.utils.WebUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

@WebServlet(name = "TeacherServlet", value = "/TeacherServlet")
public class TeacherServlet extends BaseServlet {
    protected void changeTea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        TeachersService teachersService = new TeachersServiceImpl();
        teachersService.update(teachers);
        HttpSession session = request.getSession();
        session.setAttribute("teachers", teachers);
        request.getRequestDispatcher("pages/teacher/MyInfo.jsp").forward(request, response);
    }

    protected void toSeeEva(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Teachers teachers = (Teachers) session.getAttribute("teachers");
        TeaMark teaMark = new TeaMark();
        teaMark.setTeaId(teachers.getUsername());
        System.out.println(teaMark);
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        List<TeaMark> beanListByTea = sIstrueService.getBeanListByTea(teaMark);
        request.setAttribute("beanListByTea", beanListByTea);
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        HashMap<Integer, Object> classesMap = new HashMap<>();
        for (Classes classes : classesList) {
            classesMap.put(classes.getClassId(), classes.getClassName());
        }
        request.setAttribute("classesMap", classesMap);
        CoursesService coursesService = new CoursesServiceImpl();
        List<Courses> coursesList = coursesService.getBeanListAll();
        HashMap<Integer, Object> coursesMap = new HashMap<>();
        for (Courses courses : coursesList) {
            coursesMap.put(courses.getCourseId(), courses.getCourseName());
        }
        request.setAttribute("coursesMap", coursesMap);
        request.getRequestDispatcher("pages/teacher/SeeEvaluate.jsp").forward(request, response);
    }
}
