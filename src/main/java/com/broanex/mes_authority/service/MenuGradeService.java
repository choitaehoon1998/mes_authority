package com.broanex.mes_authority.service;

import com.broanex.mes_authority.dto.MenuGradeDto;
import com.broanex.mes_authority.entity.MenuGrade;
import com.broanex.mes_authority.repository.MenuGradeRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuGradeService {

	private final MenuGradeRepository menuGradeRepository;

	public MenuGradeService(MenuGradeRepository menuGradeRepository) {
		this.menuGradeRepository = menuGradeRepository;
	}

	public List<MenuGradeDto> findByMenuIndexNo(Long menuIndexNo) {
		return menuGradeRepository.findByMenuIndexNo(menuIndexNo);
	}

	public void saveMenuGrade(MenuGrade menuGrade) {
		if (!isExist(menuGrade)) {
			menuGradeRepository.save(menuGrade);
		}
	}

	public void updateMenuGrader(MenuGrade menuGrade) {
		if (isExist(menuGrade)) {
			menuGradeRepository.save(menuGrade);
		}
	}

	public void deleteById(Long menuGradeIndexNo) {
		if (menuGradeIndexNo != null && menuGradeRepository.existsById(menuGradeIndexNo)) {
			menuGradeRepository.deleteById(menuGradeIndexNo);
		}
	}

	private Boolean isExist(MenuGrade menuGrade) {
		if (menuGrade != null && menuGrade.getIndexNo() != null && menuGradeRepository.existsById(menuGrade.getIndexNo())) {
			return true;
		}
		return false;
	}
}
