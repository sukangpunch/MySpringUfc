package ufcspring.ufc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ufcspring.ufc.data.dto.FDto.ChangeFighterInfoDto;
import ufcspring.ufc.data.dto.FDto.FighterDto;
import ufcspring.ufc.data.dto.FDto.FighterResponseDto;
import ufcspring.ufc.service.FService.FighterService;

@RestController
@RequestMapping("/fighters")
public class FighterController {

    private final FighterService fighterService;

    @Autowired
    public FighterController(FighterService fighterService){
        this.fighterService = fighterService;
    }

    @GetMapping()
    public ResponseEntity<FighterResponseDto> getFighter(Long fighterId){
        FighterResponseDto fighterResponseDto = fighterService.getFighter(fighterId);

        return ResponseEntity.status(HttpStatus.OK).body(fighterResponseDto);
    }

    @PostMapping
    public ResponseEntity<FighterResponseDto> createFighter(@RequestBody FighterDto fighterDto){
        FighterResponseDto fighterResponseDto = fighterService.saveFighter(fighterDto);

        return ResponseEntity.status(HttpStatus.OK).body(fighterResponseDto);
    }

    @PutMapping
    public ResponseEntity<FighterResponseDto> changeFighterName(
            @RequestBody ChangeFighterInfoDto changeFighterInfoDto) throws Exception{
        FighterResponseDto fighterResponseDto = fighterService.changeFighterInfo(
                changeFighterInfoDto.getFighterId(),
                changeFighterInfoDto.getRanking(),
                changeFighterInfoDto.getRecord(),
                changeFighterInfoDto.getKnockout(),
                changeFighterInfoDto.getSubmission());

        return ResponseEntity.status(HttpStatus.OK).body(fighterResponseDto);
    }

    @DeleteMapping
    public ResponseEntity<String> deleteFighter(Long fighterId) throws Exception{
        fighterService.deleteFighter(fighterId);

        return ResponseEntity.status(HttpStatus.OK).body("정상적으로 삭제되었습니다.");

    }

    }







