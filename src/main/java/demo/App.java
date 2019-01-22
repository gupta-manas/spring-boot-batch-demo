package demo;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lowagie.text.pdf.PdfContentParser;
import com.lowagie.text.pdf.PdfReader;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;*/

@SpringBootApplication
public class App {

	//private static final Logger log = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

}
