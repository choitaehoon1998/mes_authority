package com.broanex.mes_authority.controller;

import com.broanex.mes_authority.dto.GradeDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class GradeController {

	@GetMapping(value = "grade")
	public ResponseEntity<List<GradeDto>> findAllGrade() {

		List<GradeDto> gradeDtoList = new ArrayList<GradeDto>() {{
			add(GradeDto.builder().indexNo(1L).gradeName("시스템 관리자 그룹").build());
			add(GradeDto.builder().indexNo(2L).gradeName("일정,문서 권한 그룹").build());
			add(GradeDto.builder().indexNo(3L).gradeName("견적 권한 그룹").build());
			add(GradeDto.builder().indexNo(4L).gradeName("영업 권한 그룹").build());
			add(GradeDto.builder().indexNo(5L).gradeName("생산 권한 그룹").build());
			add(GradeDto.builder().indexNo(6L).gradeName("품질 권한 그룹").build());
			add(GradeDto.builder().indexNo(7L).gradeName("설비 권한 그룹").build());
			add(GradeDto.builder().indexNo(8L).gradeName("대외비 열람 권한 그룹").build());
		}};

		return ok(gradeDtoList);

	}
}
