package com.broanex.mes_authority.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "MENU_GRADE", uniqueConstraints = @UniqueConstraint(columnNames = {"MENU_INDEX_NO", "GRADE_INDEX_NO"}))
@Getter
@Setter
public class MenuGrade {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "INDEX_NO", nullable = false)
	private Long indexNo;

	@Column(name = "MENU_INDEX_NO", nullable = false)
	private Long menuIndexNo;

	@Column(name = "GRADE_INDEX_NO", nullable = false)
	private Long gradeIndexNo;

	@Column(name = "SEARCH_AUTHORITY", length = 1)
	private String searchAuthority;

	@Column(name = "SAVE_AUTHORITY", length = 1)
	private String saveAuthority;

	@Column(name = "EXCEL_AUTHORITY", length = 1)
	private String excelAuthority;

	@Column(name = "DELETE_AUTHORITY", length = 1)
	private String deleteAuthority;

	@Column(name = "FN1_AUTHORITY", length = 1)
	private String fn1Authority;

	@Column(name = "FN2_AUTHORITY", length = 1)
	private String fn2Authority;

	@Column(name = "FN3_AUTHORITY", length = 1)
	private String fn3Authority;

	@Column(name = "FN4_AUTHORITY", length = 1)
	private String fn4Authority;

	@Column(name = "FN5_AUTHORITY", length = 1)
	private String fn5Authority;

}