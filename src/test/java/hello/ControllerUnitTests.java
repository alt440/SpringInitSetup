package hello;

import static org.hamcrest.Matchers.equalTo;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;

@RunWith(SpringRunner.class)
@SpringBootTest
@AutoConfigureMockMvc
public class ControllerUnitTests {

		@Autowired
		private MockMvc mvc;
		
		@Test
		public void getHello() throws Exception{
			//the andDo function is to print the result in console so I can see the response
			//the accept function is an accept header from an HTTP request
			//you can see the result of the content on the Failure Trace window as well
			//you can also use a different string comparator after content().string(here->...)
			//to ensure it at least contains the sentence "This is generated from Spring!"
			mvc.perform(MockMvcRequestBuilders.get("/greeting").accept(MediaType.APPLICATION_JSON))
					.andDo(MockMvcResultHandlers.print())
					.andExpect(status().isOk())
					.andExpect(content().string(equalTo("<!DOCTYPE html>\r\n<html>\r\n" + 
							"<head>\r\n" + 
							"<meta charset=\"ISO-8859-1\">\r\n" + 
							"<title>Hello World</title>\r\n" + 
							"</head>\r\n" + 
							"<body>\r\n" + 
							"	<p>This is generated from Spring!</p>\r\n" + 
							"</body>\r\n" + 
							"</html>")));
		}
}

