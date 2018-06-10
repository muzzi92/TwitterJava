package chitter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class PeepController {
    @GetMapping("/")
    public String peepForm(Model model) {
        model.addAttribute("peep", new Peep());
        return "index";
    }
    @PostMapping("/")
    public String peepSubmit(@ModelAttribute Peep peep) {
        return "peep";
    }
}