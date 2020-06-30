$(function () {
    var only = $("#Only").text();
    console.log(only);
    if(only == "Home"){
        $("#home").addClass("active");
    }
    if(only == "MyInfo"){
        $("#myInfo").addClass("active");
    }

    if(only == "CoursesManage"){
        $("#coursesManage").addClass("active");
    }
    if(only == "ClassesManage"){
        $("#classesManage").addClass("active");
    }
    if(only == "QuestionsManage"){
        $("#questionsManage").addClass("active");
    }
    if(only == "TeachersManage"){
        $("#teachersManage").addClass("active");
    }
    if(only == "StudentsManage"){
        $("#studentsManage").addClass("active");
    }
    if(only == "EvaTea"){
        $("#evatea").addClass("active");
    }
    if(only == "SeeEva"){
        $("#seeEva").addClass("active");
    }
    if(only == "StatisticalAnalysis"){
        $("#statisticalAnalysis").addClass("active");
    }
})