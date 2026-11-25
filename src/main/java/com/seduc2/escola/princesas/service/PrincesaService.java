package com.seduc2.escola.princesas.service;

import com.seduc2.escola.princesas.entity.Princesa;
import com.seduc2.escola.princesas.repository.PrincesaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrincesaService {

    private final PrincesaRepository repository;
    public PrincesaService(PrincesaRepository repository) {
        this.repository = repository;
    }
    public List<Princesa> mostrar(){
        return repository.findAll();
    }
    public void registrar(Princesa p){
        repository.save(p);
    }
    public void deletar(Integer id){
        repository.deleteById(id);
    }
    public void alterar(Integer id, Princesa p){
        Princesa princesa = repository.getReferenceById(id);
        princesa.setNome(p.getNome());
        princesa.setIdade(p.getIdade());
        princesa.setMascote(p.getMascote());
        princesa.setPoder(p.getPoder());
        princesa.setReino(p.getReino());
    }
}
