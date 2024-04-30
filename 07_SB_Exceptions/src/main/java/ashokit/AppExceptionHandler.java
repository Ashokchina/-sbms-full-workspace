package ashokit;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
@RestControllerAdvice
public class AppExceptionHandler {
	@ExceptionHandler(value = Exception.class)
public ResponseEntity<AppExInfo>handleException(Exception e){
	AppExInfo info = new AppExInfo();
	info.setExCode("SBIEX0007");
	info.setExMsg(e.getMessage());
	info.setExDate(LocalDateTime.now());
	return new ResponseEntity<>(info , HttpStatus.INTERNAL_SERVER_ERROR);
}
	public ResponseEntity<AppExInfo> handleUserEx(NoUserFoundException e){
		AppExInfo info = new AppExInfo();
		info.setExCode("SBIEX0008");
		info.setExMsg(e.getMessage());
		info.setExDate(LocalDateTime.now());
		return new ResponseEntity<>(info , HttpStatus.BAD_REQUEST);
		
	}
}
