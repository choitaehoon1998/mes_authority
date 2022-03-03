package com.broanex.mes_authority.repository.impl;

import com.broanex.mes_authority.dto.MenuGradeDto;
import com.broanex.mes_authority.repository.MenuGradeQueryRepository;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;

import java.util.List;

import static com.broanex.mes_authority.entity.QMenuGrade.menuGrade;

@RequiredArgsConstructor
public class MenuGradeRepositoryImpl implements MenuGradeQueryRepository {
	private final JPAQueryFactory queryFactory;

	@Override
	public List<MenuGradeDto> findByMenuIndexNo(Long menuIndexNo) {
		return queryFactory.select(Projections.fields(MenuGradeDto.class,
						menuGrade.indexNo,
						menuGrade.menuIndexNo,
						menuGrade.gradeIndexNo,
						menuGrade.searchAuthority,
						menuGrade.saveAuthority,
						menuGrade.excelAuthority,
						menuGrade.deleteAuthority,
						menuGrade.fn1Authority,
						menuGrade.fn2Authority,
						menuGrade.fn3Authority,
						menuGrade.fn4Authority,
						menuGrade.fn5Authority)).from(menuGrade)
				.where(menuGrade.menuIndexNo.eq(menuIndexNo)).fetch();
	}
}
