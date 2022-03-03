package com.broanex.mes_authority.controller;

import com.broanex.mes_authority.dto.MenuDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

import static org.springframework.http.ResponseEntity.ok;

@Controller
public class MenuController {

	@GetMapping("menu")
	public ResponseEntity<List<MenuDto>> findAllMenu() {
		List<MenuDto> menuDtoList = new ArrayList<MenuDto>() {{
			add(MenuDto.builder().indexNo(1L).menuNm("시스템 관리").parentId(null).level(0L).sort(0L).children(
					new ArrayList<MenuDto>() {{
						add(MenuDto.builder().indexNo(2L).menuNm("프로그램 관리").parentId(1L).level(1L).sort(0L).children(new ArrayList<>()).build());
						add(MenuDto.builder().indexNo(3L).menuNm("메뉴 관리").parentId(1L).level(1L).sort(1L).children(new ArrayList<>()).build());
						add(MenuDto.builder().indexNo(4L).menuNm("사용자 관리").parentId(1L).level(1L).sort(2L).children(new ArrayList<>()).build());
						add(MenuDto.builder().indexNo(5L).menuNm("에러로그 관리").parentId(1L).level(1L).sort(3L).children(new ArrayList<>()).build());
						add(MenuDto.builder().indexNo(6L).menuNm("시스템접속 로그").parentId(1L).level(1L).sort(4L).children(new ArrayList<>()).build());
						add(MenuDto.builder().indexNo(7L).menuNm("도움말관리").parentId(1L).level(1L).sort(5L).children(new ArrayList<>()).build());
					}}
			).build());
		}};

		return ok(menuDtoList);
	}
}
