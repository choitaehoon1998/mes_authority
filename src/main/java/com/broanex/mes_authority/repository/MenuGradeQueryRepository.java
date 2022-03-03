package com.broanex.mes_authority.repository;


import com.broanex.mes_authority.dto.MenuGradeDto;

import java.util.List;

public interface MenuGradeQueryRepository {
	List<MenuGradeDto> findByMenuIndexNo(Long menuIndexNo);
}
