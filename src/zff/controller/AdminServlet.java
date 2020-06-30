package zff.controller;

import zff.bean.*;
import zff.dao.*;
import zff.dao.impl.*;
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

@WebServlet(name = "AdminServlet", value = "/AdminServlet")
public class AdminServlet extends BaseServlet {

    protected void changeAdmin(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        Admins admins = (Admins) session.getAttribute("admins");
        String password = request.getParameter("password");
        admins.setPassWd(password);
        AdminsDao adminsDao = new AdminsDaoImpl();
        boolean update = adminsDao.update(admins);
        session.setAttribute("admins", admins);
        response.sendRedirect("pages/admin/MyInfo.jsp");
    }

    protected void getAllCourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        CoursesService coursesService = new CoursesServiceImpl();
        List<Courses> beanListAllCourses = coursesService.getBeanListAll();
        request.setAttribute("beanListAllCourses", beanListAllCourses);
        request.getRequestDispatcher("pages/admin/CoursesManage.jsp").forward(request, response);
    }

    protected void toUpdateCourses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        CoursesDao coursesDao = new CoursesDaoImpl();
        Courses coursesBeanById = coursesDao.getBeanById(id);
        request.setAttribute("coursesBeanById", coursesBeanById);
        request.getRequestDispatcher("pages/admin/UpdateCourses.jsp").forward(request, response);
    }

    protected void updateCourses(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        int courseId = Integer.parseInt(request.getParameter("courseId"));
        String courseName = request.getParameter("courseName");
        Courses courses = new Courses();
        courses.setId(id);
        courses.setCourseId(courseId);
        courses.setCourseName(courseName);
        CoursesService coursesService = new CoursesServiceImpl();
        coursesService.update(courses);
        getAllCourse(request, response);
    }

    protected void addCourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Courses courses = WebUtils.paramsToBean(request, new Courses());
        CoursesService coursesService = new CoursesServiceImpl();
        boolean add = coursesService.add(courses);
        if (add) {
            getAllCourse(request, response);
        } else {
            request.setAttribute("msg", "课程号已存在！");
            request.getRequestDispatcher("pages/admin/AddCourse.jsp").forward(request, response);
        }
    }

    protected void deleteCourse(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Courses courses = WebUtils.paramsToBean(request, new Courses());
        CoursesService coursesService = new CoursesServiceImpl();
        coursesService.deleteCourse(courses.getCourseId());
        getAllCourse(request, response);
    }

    protected void getAllClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> beanListAllClasses = classesService.getBeanListAll();
        request.setAttribute("beanListAllClasses", beanListAllClasses);
        request.getRequestDispatcher("pages/admin/ClassesManage.jsp").forward(request, response);
    }

    protected void toUpdateClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        ClassesDao classesDao = new ClassesDaoImpl();
        Classes classesBeanById = classesDao.getBeanById(id);
        request.setAttribute("classesBeanById", classesBeanById);
        request.getRequestDispatcher("pages/admin/UpdateClasses.jsp").forward(request, response);
    }

    protected void updateClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Classes classes = WebUtils.paramsToBean(request, new Classes());
        ClassesService classesService = new ClassesServiceImpl();
        classesService.update(classes);
        getAllClass(request, response);
    }

    protected void addClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Classes classes = WebUtils.paramsToBean(request, new Classes());
        ClassesService classesService = new ClassesServiceImpl();
        boolean add = classesService.add(classes);
        if (add) {
            getAllClass(request, response);
        } else {
            request.setAttribute("msg", "班级号已存在！");
            request.getRequestDispatcher("pages/admin/AddClass.jsp").forward(request, response);
        }
    }

    protected void deleteClass(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Classes classes = WebUtils.paramsToBean(request, new Classes());
        ClassesService classesService = new ClassesServiceImpl();
        classesService.deleteClass(classes.getClassId());
        getAllClass(request, response);
    }

    protected void getAllQ(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        QuestionsService questionsService = new QuestionsServiceImpl();
        List<Questions> beanListAllQ = questionsService.getBeanListAll();
        request.setAttribute("beanListAllQ", beanListAllQ);
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("classesList", classesList);
        CoursesService coursesService = new CoursesServiceImpl();
        List<Courses> coursesList = coursesService.getBeanListAll();
        request.setAttribute("coursesList", coursesList);
        request.getRequestDispatcher("pages/admin/QuestionsManage.jsp").forward(request, response);
    }

    protected void trueSIsTrue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SIstrue sIstrue = WebUtils.paramsToBean(request, new SIstrue());
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        SCCTQM scctqm = new SCCTQM();
        scctqm.setClassId(sIstrue.getClassId());
        scctqm.setCourseId(sIstrue.getCourseId());
        sIstrueService.updatet(sIstrue);
        getAllQ(request, response);
    }

    protected void falseSIsTrue(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SIstrue sIstrue = WebUtils.paramsToBean(request, new SIstrue());
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        sIstrueService.updatef(sIstrue);
        TeaMark teaMark = WebUtils.paramsToBean(request, new TeaMark());
        sIstrueService.updateTeaMark(teaMark);
        getAllQ(request, response);
    }

    protected void toUpdateQ(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        QuestionsDao questionsDao = new QuestionsDaoImpl();
        Questions questionsBeanById = questionsDao.getBeanById(id);
        request.setAttribute("questionsBeanById", questionsBeanById);
        request.getRequestDispatcher("pages/admin/UpdateQuestion.jsp").forward(request, response);
    }

    protected void updateQ(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Questions questions = WebUtils.paramsToBean(request, new Questions());
        QuestionsService questionsService = new QuestionsServiceImpl();
        questionsService.update(questions);
        getAllQ(request, response);
    }

    protected void getAllTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeachersService teachersService = new TeachersServiceImpl();
        List<Teachers> beanListAllTeachers = teachersService.getBeanListAll();
        request.setAttribute("beanListAllTeachers", beanListAllTeachers);
        request.getRequestDispatcher("pages/admin/TeachersManage.jsp").forward(request, response);
    }

    protected void toUpdateTea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        TeachersDao teachersDao = new TeachersDaoImpl();
        Teachers teachersBeanById = teachersDao.getBeanById(id);
        request.setAttribute("teachersBeanById", teachersBeanById);
        request.getRequestDispatcher("pages/admin/UpdateTeacher.jsp").forward(request, response);
    }

    protected void toTACC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("classesList", classesList);
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        request.setAttribute("teachers", teachers);
        CoursesService coursesService = new CoursesServiceImpl();
        List<Courses> coursesList = coursesService.getBeanListAll();
        request.setAttribute("coursesList", coursesList);
        request.getRequestDispatcher("pages/admin/TeacherAddCC.jsp").forward(request, response);
    }

    protected void addTACC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TCC tcc = WebUtils.paramsToBean(request, new TCC());
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        tcc.setTeaId(teachers.getUsername());
        TeachersService teachersService = new TeachersServiceImpl();
        boolean bool = teachersService.addTCC(tcc);
        if (bool) {
            getAllTeacher(request, response);
        } else {
            request.setAttribute("msg", "该老师已有该班级的该课程！");
            toTACC(request, response);
        }
    }

    protected void updateTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        TeachersService teachersService = new TeachersServiceImpl();
        teachersService.update(teachers);
        getAllTeacher(request, response);
    }

    protected void addTeacher(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        TeachersService teachersService = new TeachersServiceImpl();
        boolean add = teachersService.add(teachers);
        if (add) {
            getAllTeacher(request, response);
        } else {
            request.setAttribute("msg", "用户名已存在！");
            request.getRequestDispatcher("pages/admin/AddTeacher.jsp").forward(request, response);
        }
    }

    protected void deleteTea(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Teachers teachers = WebUtils.paramsToBean(request, new Teachers());
        TeachersService teachersService = new TeachersServiceImpl();
        teachersService.deleteTeacher(teachers.getUsername());
        getAllTeacher(request, response);
    }

    protected void getAllStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        StudentsService studentsService = new StudentsServiceImpl();
        List<Students> beanListAllStudents = studentsService.getBeanListAll();
        request.setAttribute("beanListAllStudents", beanListAllStudents);
        request.getRequestDispatcher("pages/admin/StudentsManage.jsp").forward(request, response);
    }

    protected void toUpdateStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int id = Integer.parseInt(request.getParameter("id"));
        StudentsDao studentsDao = new StudentsDaoImpl();
        Students studentsBeanById = studentsDao.getBeanById(id);
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("studentsBeanById", studentsBeanById);
        request.setAttribute("classesList", classesList);
        request.getRequestDispatcher("pages/admin/UpdateStudent.jsp").forward(request, response);
    }

    protected void updateStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        studentsService.update(students);
        getAllStudent(request, response);
    }

    protected void toAddStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("classesList", classesList);
        request.getRequestDispatcher("pages/admin/AddStudent.jsp").forward(request, response);
    }

    protected void addStudent(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        boolean register = studentsService.register(students);
        if (register) {
            getAllStudent(request, response);
        } else {
            request.setAttribute("msg", "学号已存在！");
            toAddStudent(request, response);
        }
    }

    protected void deleteStu(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Students students = WebUtils.paramsToBean(request, new Students());
        StudentsService studentsService = new StudentsServiceImpl();
        studentsService.deleteStu(students.getUsername());
        getAllStudent(request, response);
    }

    protected void toSA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        List<TeaMark> teaMarkList = sIstrueService.getBeanListAll();
        request.setAttribute("teaMarkList", teaMarkList);
        TeachersService teachersService = new TeachersServiceImpl();
        List<Teachers> teachersList = teachersService.getBeanListAll();
        request.setAttribute("teachersList", teachersList);
        HashMap<String, Object> teacherMap = new HashMap<>();
        for (Teachers teachers : teachersList) {
            teacherMap.put(teachers.getUsername(), teachers.getTeaName());
        }
        request.setAttribute("teacherMap", teacherMap);
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
        request.getRequestDispatcher("pages/admin/AllStatisticalAnalysis.jsp").forward(request, response);
    }

    protected void toTACC2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        ClassesService classesService = new ClassesServiceImpl();
        List<Classes> classesList = classesService.getBeanListAll();
        request.setAttribute("classesList", classesList);
        TeachersService teachersService = new TeachersServiceImpl();
        List<Teachers> teachersList = teachersService.getBeanListAll();
        request.setAttribute("teachersList", teachersList);
        CoursesService coursesService = new CoursesServiceImpl();
        List<Courses> coursesList = coursesService.getBeanListAll();
        request.setAttribute("coursesList", coursesList);
        request.getRequestDispatcher("pages/admin/TeacherAddCC2.jsp").forward(request, response);
    }

    protected void addTACC2(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TCC tcc = WebUtils.paramsToBean(request, new TCC());
        TeachersService teachersService = new TeachersServiceImpl();
        boolean bool = teachersService.addTCC(tcc);
        if (bool) {
            getAllTeacher(request, response);
        } else {
            request.setAttribute("msg", "该老师已有该班级的该课程！");
            toTACC2(request, response);
        }
    }

    protected void delTCC(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TCC tcc = WebUtils.paramsToBean(request, new TCC());
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        sIstrueService.delTCC(tcc);
        toSA(request, response);
    }

    protected void toTSA(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        TeaMark teaMark = WebUtils.paramsToBean(request, new TeaMark());
        SIstrueService sIstrueService = new SIstrueServiceImpl();
        TeaMark beanByTea = sIstrueService.getBeanByTea(teaMark);
        request.setAttribute("beanByTea", beanByTea);
        System.out.println(teaMark);
        TeachersService teachersService = new TeachersServiceImpl();
        List<Teachers> teachersList = teachersService.getBeanListAll();
        request.setAttribute("teachersList", teachersList);
        HashMap<String, Object> teacherMap = new HashMap<>();
        for (Teachers teachers : teachersList) {
            teacherMap.put(teachers.getUsername(), teachers.getTeaName());
        }
        request.setAttribute("teacherMap", teacherMap);
        request.getRequestDispatcher("pages/admin/StatisticalAnalysis.jsp").forward(request, response);
    }
}
