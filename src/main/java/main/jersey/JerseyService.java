package main.jersey;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;

import main.model.SaveModel;

@Path("message")
public class JerseyService
{
    @Path("/testPost")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    public String getMsg( SaveModel saveModel )
    {
        String chineseChar = saveModel.getBody().getInputs().get( 0 ).getPropertyValues().get( 0 ).getValues().get( 0 );
        return "Hello World " + chineseChar;
    }

}
