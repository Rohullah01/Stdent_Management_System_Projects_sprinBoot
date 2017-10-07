package controller;

import com.stdentmsp.studentmsp.service.StudentServiceInerface;
import model.StudentM;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SutdentController {

    @Autowired
    private StudentServiceInerface studentService;
    @GetMapping("/student/add")
    public String randerAddStudnets( Model model){
        model.addAttribute("student",new StudentM());

        return "/view/StudentW";
    }

    @PostMapping("/student/add")
    public String addStudent(@ModelAttribute("student") StudentM studentM){

        studentService.save(studentM);

        return "redirect:/student/add";
    }
}
