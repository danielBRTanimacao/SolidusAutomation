package SolidusAutomation.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SolidusAutomation.DTOs.automation.ResponseFilesDTO;
import SolidusAutomation.services.AutomationService;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
@RequestMapping("/api")
public class AutomationController {

    private final AutomationService automationService = new AutomationService();

    @PostMapping("/compare")
    public ResponseEntity<ResponseFilesDTO> compareFilesAndReturn() {
        automationService.compareFiles();
        return ResponseEntity.ok().build();
    }
}
