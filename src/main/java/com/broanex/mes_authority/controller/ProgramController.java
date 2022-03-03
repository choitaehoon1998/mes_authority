package com.broanex.mes_authority.controller;

import com.broanex.mes_authority.dto.ProgramDto;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProgramController {

	@GetMapping(value = "/program")
	public ResponseEntity<ProgramDto> getProgram() {
		return ResponseEntity.ok(ProgramDto.builder().programCode("예시프로그램1").programEnglish("TEST-PROGRAM-1").programKorea("예시프로그램1").programName("예시프로그램1").build());
	}
}
