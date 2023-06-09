package main.model;

import java.util.ArrayList;
import java.util.List;

public class SaveBody
{
    private List<EditInfo> inputs = new ArrayList<EditInfo>();

    public void setInputs( List<EditInfo> inputs )
    {
        this.inputs = inputs;
    }
    public List<EditInfo> getInputs()
    {
        return inputs;
    }
}
