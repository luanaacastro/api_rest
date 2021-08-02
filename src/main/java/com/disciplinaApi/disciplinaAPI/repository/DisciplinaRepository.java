package com.disciplinaApi.disciplinaAPI.repository;
/*
Descricao :
	Classe repository, criada para disponibilizar o crud da classe disciplina
Aluno :
	Luana Ataide Castro
Data :
	01 / 08 / 2021
*/
import com.disciplinaApi.disciplinaAPI.models.Disciplina;
import org.springframework.data.jpa.repository.JpaRepository;
public interface DisciplinaRepository extends JpaRepository<Disciplina, Long>{
    Disciplina findById(long id);
}
