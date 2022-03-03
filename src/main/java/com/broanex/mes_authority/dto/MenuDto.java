package com.broanex.mes_authority.dto;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class MenuDto {
	private Long indexNo;
	private String menuNm;
	private Long parentId;
	private Long level;
	private Long sort;
	private List<MenuDto> children;
}
