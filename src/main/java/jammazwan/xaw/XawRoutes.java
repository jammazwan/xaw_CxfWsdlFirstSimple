package jammazwan.xaw;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class XawRoutes extends RouteBuilder {

    
    

    @Override
    public void configure() throws Exception {
    	from("cxf:bean:passThruEndpoint").log("\n\n${body}\n\n");
    }
}
