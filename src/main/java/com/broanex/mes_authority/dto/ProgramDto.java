package com.broanex.mes_authority.dto;

import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ProgramDto {
	private String programCode;
	private String programKorea;
	private String programEnglish;
	private String programName;
}
