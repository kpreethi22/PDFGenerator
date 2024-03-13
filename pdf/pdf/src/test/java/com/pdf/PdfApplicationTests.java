package com.pdf;

import com.pdf.util.PDFGene;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PdfApplicationTests {

	@Test
	void contextLoads() {
		PDFGene pdf = new PDFGene();
		pdf.writeUsingIText();
	}
}
