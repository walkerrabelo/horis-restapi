package com.horis.api.controllers;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.eclipse.jetty.client.api.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;


import com.horis.api.dto.professor.AtualizacaoProfessorDto;
import com.horis.api.dto.professor.CriacaoProfessorDto;
import com.horis.api.dto.professor.ProfessorDto;
import com.horis.api.model.Professor;
import com.horis.api.repository.ProfessorRepository;

@RestController
@RequestMapping("/turmas")
public class TurmaController {

    @GetMapping
    public ResponseEntity<List<String>> getList(){
        List<String> lista = new ArrayList<String>();

        lista.add("Disciplina 01");
        lista.add("Disciplina 02");
        lista.add("Disciplina 03");

        return ResponseEntity.ok(lista);
    }

}