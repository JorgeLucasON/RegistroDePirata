package dev.jorgelucas.RegistroDePirata.Pirata;


import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PirataService {

    private PirataRepository pirataRepository;

    public PirataService(PirataRepository pirataRepository) {
        this.pirataRepository = pirataRepository;
    }

    // listar todos os meus Piratas
    public List<PirataModel>listarPirata(){
        return pirataRepository.findAll();
    }

    // listar piratas por id
    public PirataModel listarPirataPorId(Long id){
        Optional<PirataModel> pirataPorId = pirataRepository.findById(id);
        return pirataPorId.orElse(null);
    }

    // Criar um novo Pirata
    public PirataModel criarPirata(PirataModel pirata){
        return pirataRepository.save(pirata);
    }

    // Deletar Pirata
    public void deletarPirataPorID(Long id){
        pirataRepository.deleteById(id);
    }

    // Atualizar Pirta
    public PirataModel altualizarPirata(Long id, PirataModel pirataAtualizado){
        if(pirataRepository.existsById(id)) {
            pirataAtualizado.setId(id);
            return pirataRepository.save(pirataAtualizado);
        }
        return null;
    }







}
