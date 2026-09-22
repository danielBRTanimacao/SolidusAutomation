package SolidusAutomation.DTOs.automation;

import org.springframework.web.multipart.MultipartFile;

public record RequestFileDTO(
    MultipartFile csv,
    MultipartFile compareTo
) {
    
}
