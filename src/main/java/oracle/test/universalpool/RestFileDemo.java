package oracle.test.universalpool;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

import javax.annotation.PostConstruct;
import javax.servlet.ServletContext;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.ws.rs.core.Response.ResponseBuilder;

import org.apache.commons.io.IOUtils;
import org.jboss.resteasy.plugins.providers.multipart.InputPart;
import org.jboss.resteasy.plugins.providers.multipart.MultipartFormDataInput;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;



//@Path("/file")
@RestController
public class RestFileDemo {
	
	static interface Config{
		String UPLOAD_FOLDER = "";
	}

	@Context
	private ServletContext context;
	
	@PostMapping("/upload") // //new annotation since 4.3
    public String singleFileUpload(@RequestParam("file") MultipartFile file,
                                   RedirectAttributes redirectAttributes) {
		int leftLimit = 48; // numeral '0'
	    int rightLimit = 122; // letter 'z'
	    int targetStringLength = 10;
	    Random random = new Random();
	 
	    String generatedString = random.ints(leftLimit, rightLimit + 1)
	      .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
	      .limit(targetStringLength)
	      .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
	      .toString();
	 
	    System.out.println(generatedString);
		System.out.println("");
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		try {
			file.transferTo(new File("c://x//s.pdf"));
		} catch (IllegalStateException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "anything";
	}

//	@POST
//	@Path("/upload")
//	@Consumes(MediaType.MULTIPART_FORM_DATA)
	/*
	 * @PostMapping("upload") public Response uploadFile(MultipartFormDataInput
	 * input) throws IOException { Map<String, List<InputPart>> uploadForm =
	 * input.getFormDataMap();
	 * 
	 * // Get file data to save List<InputPart> inputParts =
	 * uploadForm.get("attachment");
	 * 
	 * for (InputPart inputPart : inputParts) { try {
	 * 
	 * MultivaluedMap<String, String> header = inputPart.getHeaders(); String
	 * fileName = getFileName(header);
	 * 
	 * // convert the uploaded file to inputstream InputStream inputStream =
	 * inputPart.getBody(InputStream.class, null);
	 * 
	 * byte[] bytes = IOUtils.toByteArray(inputStream);
	 * 
	 * //String path = System.getProperty("user.home") + File.separator + "uploads";
	 * File customDir = new File(Config.UPLOAD_FOLDER);
	 * 
	 * if (!customDir.exists()) { customDir.mkdir(); } fileName =
	 * customDir.getCanonicalPath() + File.separator + fileName; writeFile(bytes,
	 * fileName);
	 * 
	 * return Response.status(200).entity("Uploaded file name : " +
	 * fileName+" . <br/> <a href='"+context.getContextPath()+"'>Back</a>").build();
	 * 
	 * } catch (Exception e) { e.printStackTrace(); } } return null; }
	 */
	
	private String getFileName(MultivaluedMap<String, String> header) {

		String[] contentDisposition = header.getFirst("Content-Disposition").split(";");

		for (String filename : contentDisposition) {
			if ((filename.trim().startsWith("filename"))) {
				String[] name = filename.split("=");
				String finalFileName = name[1].trim().replaceAll("\"", "");
				return finalFileName;
			}
		}
		return "unknown";
	}
	
	
	// Utility method
	private void writeFile(byte[] content, String filename) throws IOException {
		File file = new File(filename);

		if (!file.exists()) {
			file.createNewFile();
		}
		FileOutputStream fop = new FileOutputStream(file);
		fop.write(content);
		fop.flush();
		fop.close();
	}
	
}
