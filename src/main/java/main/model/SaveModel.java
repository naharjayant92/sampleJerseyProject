package main.model;

public class SaveModel
{
    private SaveBody body = new SaveBody();

    public SaveBody getBody()
    {
        return body;
    }

    public void setBody( SaveBody body )
    {
        this.body = body;
    }
}
