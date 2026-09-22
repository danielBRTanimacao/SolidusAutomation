package SolidusAutomation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SolidusAutomation.DTOs.automation.ResponseFilesDTO;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api") 
public class AutomationController {

    @PostMapping("/compare")
    public ResponseEntity<ResponseFilesDTO> compareFilesAndReturn() {
        return ResponseEntity.ok().build();
    }
}
