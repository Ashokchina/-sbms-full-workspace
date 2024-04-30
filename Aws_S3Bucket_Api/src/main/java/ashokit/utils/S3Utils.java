package ashokit.utils;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.net.URL;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.amazonaws.services.s3.AmazonS3;

@Service
public class S3Utils {

	@Value("${cloud.aws.bucketname}")
	private String bucketName;
	@Autowired
	private AmazonS3 amazonS3;
	
	public String putObject(MultipartFile file) {
		String originalFilename = file.getOriginalFilename();
		try {
			File file1 = convertMultipartToFile(file);
			amazonS3.putObject(bucketName,originalFilename,file1);
			URL url = amazonS3.getUrl(bucketName, originalFilename);
			return url.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
	private File convertMultipartToFile(MultipartFile file) throws Exception {
		File convFile = new File(file.getOriginalFilename());
		FileOutputStream fos = new FileOutputStream(convFile);
		fos.write(file.getBytes());
		fos.close();
		return convFile;


	}
}
