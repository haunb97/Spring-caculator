package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class controller {
    @GetMapping("/h")
    public String getIndex(){
        return "index";
    }
    @PostMapping("/caculator")
    public String form(@RequestParam float num1 , @RequestParam float num2 , @RequestParam String operator , Model model){
        float result =0 ;
        switch (operator){
            case "Addtion(+)" :
                result = num1 + num2;
                break;
            case "Subtraction(-)":
                result = num1 - num2;
                break;
            case "Mutip(*)":
                result = num1 * num2;
                break;
            case "Division(/)":
                result = num1 / num2 ;
                break;
        }
        model.addAttribute("model",result);
        return "index";
    }
}
