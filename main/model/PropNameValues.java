package main.model;

import java.util.ArrayList;
import java.util.List;

public class PropNameValues
{
    /**
     * Property name
     */
    private String name = "";

    /**
     * Property values
     */
    private List<String> values = new ArrayList<String>();

    /**
     * @return the name
     */
    public String getName()
    {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName( String name )
    {
        this.name = name;
    }

    /**
     * @return the values
     */
    public List<String> getValues()
    {
        return values;
    }

    /**
     * @param values the values to set
     */
    public void setValues( List<String> values )
    {
        this.values = values;
    }

    /**
     * @param value
     */
    public void addValue( String value )
    {
        this.values = new ArrayList<String>();
        this.values.add( value );
    }
}
