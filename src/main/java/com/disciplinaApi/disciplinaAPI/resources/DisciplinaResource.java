package com.disciplinaApi.disciplinaAPI.resources;

/*
Descricao :
	Classe que mapeia os endererços para as requisições
Aluno :
	Luana Ataide Castro
Data :
	01 / 08 / 2021
*/
import java.util.List;

import javax.validation.Valid;

import com.disciplinaApi.disciplinaAPI.models.Disciplina;
import com.disciplinaApi.disciplinaAPI.repository.DisciplinaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping(value="/api")
@Api(value="API REST Disciplina")
public class DisciplinaResource {
    @Autowired
    DisciplinaRepository disciplinaRepository;

    @ApiOperation(value="Retorna uma lista de Disciplinas")
    @GetMapping("/disciplinas")
    public List<Disciplina> listaDisciplinas(){
        return disciplinaRepository.findAll();
    }

    @ApiOperation(value="Retorna um produto unico")
    @GetMapping("/disciplina/{id}")
    public Disciplina listaDisciplinaUnico(@PathVariable(value="id") long id){
        return disciplinaRepository.findById(id);
    }

    @ApiOperation(value="Salva uma disciplina")
    @PostMapping("/disciplina")
    public Disciplina salvaDisciplina(@RequestBody @Valid Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }

    @ApiOperation(value="Deleta uma disciplina")
    @DeleteMapping("/disciplina")
    public void deletaDisciplina(@RequestBody @Valid Disciplina disciplina) {
        disciplinaRepository.delete(disciplina);
    }

    @ApiOperation(value="Atualiza uma disciplina")
    @PutMapping("/disciplina")
    public Disciplina atualizaDisciplina(@RequestBody @Valid Disciplina disciplina) {
        return disciplinaRepository.save(disciplina);
    }
}
