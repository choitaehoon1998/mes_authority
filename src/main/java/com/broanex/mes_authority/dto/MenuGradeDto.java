package com.broanex.mes_authority.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MenuGradeDto {
	private Long indexNo;
	private Long menuIndexNo;
	private Long gradeIndexNo;
	private String searchAuthority;
	private String saveAuthority;
	private String excelAuthority;
	private String deleteAuthority;
	private String fn1Authority;
	private String fn2Authority;
	private String fn3Authority;
	private String fn4Authority;
	private String fn5Authority;
}
