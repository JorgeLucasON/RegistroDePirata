package dev.jorgelucas.RegistroDePirata.Pirata;

import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping(name = "piratas")
public class PirataController {

    private PirataService pirataService;

    public PirataController(PirataService pirataService) {
        this.pirataService = pirataService;
    }

    @GetMapping("/boasvindas")
    public String boasvindas(){
        return "Essa e minha primeira mensagem nessa rota";
    }

    // Adicionar Pirata (CREATE)
    @GetMapping("/criar")
    public String criarPirata(){
       return "Ninja criado";
    }

    // Mostra todos os Piratas (READ)
    @GetMapping("/listar")
    public List<PirataModel> listarPirata(){
        return pirataService.listarPirata();
    }

    // Mostra Piratas por Id (READ)
    @GetMapping("/listar/{id}")
    public String listarPirataPorId(){
        return "Pirata por ID";
    }

    // Alterar dados dos Piratas(UPDATE)
    @PutMapping("/alterar/{id}")
    public String atualizarPirata(){
        return "Altera Pirata por id ";
    }

    // Deletar Pirata (Delate)
    @DeleteMapping("/deletar/{id}")
    public String deletarPirataPorID(){
        return "Ninja deletado";
    }

}
