package amazonPackage;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:amazonsale.properties")

public class MyConfigClass {
	
	@Bean
	public Dress myntraBrand()
	{
		Dress myntra = new Myntra();
		return myntra;
				
	}
	
	@Bean
	public Dress avassaBrand()
	{
		Dress avassa = new Avassa();
		return avassa;
	}
	
	
	
	@Bean(name = {"amazon","amazonBean"})
	public Amazon amazonBean()
	{
		Amazon amazon = new Amazon(myntraBrand());
		return amazon;
		
	}
	

}
