package br.com.guifroes1984.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.guifroes1984.model.Curso;
import br.com.guifroes1984.repository.CursoRepository;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/cursos")
@AllArgsConstructor
public class CursoController {

	private final CursoRepository cursoRepository;

	@GetMapping
	public @ResponseBody List<Curso> lista() {
		return cursoRepository.findAll();
	}
}
