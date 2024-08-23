package br.senai.sp.recolocacaodeprof.controller;


import br.senai.sp.recolocacaodeprof.model.Funcionario;
import br.senai.sp.recolocacaodeprof.repository.FuncionarioRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/funcionario")
public class FuncionarioController {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @GetMapping
    public String listagem(){
        return "funcionario/listagem";
    }

    @GetMapping("/form-inserir")
    public String formInserir(Model model){
        model.addAttribute("funcionario",new Funcionario());

        return "funcionario/form-inserir";
    }
    @PostMapping("/salvar")
    public String salvar(
            @Valid Funcionario funcionario,
            BindingResult result,
            RedirectAttributes redirectAttributes){

        // Verifica se há erros de validação
        if(result.hasErrors()){
            return "funcionario/form-inserir";
        }

        funcionarioRepository.save(funcionario);
        redirectAttributes.addFlashAttribute("mensagem", "Funcionário salvo com sucesso!");
        return "redirect:/funcionario";
    }



}
