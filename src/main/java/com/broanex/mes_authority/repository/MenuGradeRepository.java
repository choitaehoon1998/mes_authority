package com.broanex.mes_authority.repository;

import com.broanex.mes_authority.entity.MenuGrade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MenuGradeRepository extends JpaRepository<MenuGrade,Long> , MenuGradeQueryRepository{
}
