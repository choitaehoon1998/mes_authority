package com.broanex.mes_authority.controller;

import com.broanex.mes_authority.dto.MenuGradeDto;
import com.broanex.mes_authority.entity.MenuGrade;
import com.broanex.mes_authority.service.MenuGradeService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class MenuGradeController {
	private final MenuGradeService menuGradeService;

	public MenuGradeController(MenuGradeService menuGradeService) {
		this.menuGradeService = menuGradeService;
	}

	@GetMapping(value = "/menuGrade/{menuIndexNo}")
	public ResponseEntity<List<MenuGradeDto>> findMenuGradeByMenuIndexNo(@PathVariable("menuIndexNo") Long menuIndexNo) {
		List<MenuGradeDto> menuGradeDtoList = menuGradeService.findByMenuIndexNo(menuIndexNo);
		return ok(menuGradeDtoList);
	}

	@PostMapping(value = "/menuGrade")
	public ResponseEntity<Void> saveNewMenuGrade(@RequestPart("menuGrade") MenuGrade menuGrade) {
		menuGradeService.saveMenuGrade(menuGrade);
		return ok().build();
	}

	@PutMapping(value = "/menuGrade")
	public ResponseEntity<Void> updateMenuGrade(@RequestBody MenuGrade menuGrade) {
		menuGradeService.updateMenuGrader(menuGrade);
		return ok().build();
	}

	@DeleteMapping(value="/menuGrade/{menuGradeIndexNo}")
	public ResponseEntity<Void> deleteMenuGrade(@PathVariable("menuGradeIndexNo") Long menuGradeIndexNo){
		menuGradeService.deleteById(menuGradeIndexNo);
		return ok().build();
	}
}
