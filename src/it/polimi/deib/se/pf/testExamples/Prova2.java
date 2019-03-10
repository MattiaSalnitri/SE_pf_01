package it.polimi.deib.se.pf.testExamples;

public class Prova2 {


    private Integer internalAttribute;

    public Prova2 (Integer internalAttribute)
    {
        this.internalAttribute = internalAttribute;
    }

    public Integer getInternalAttribute() {
        return internalAttribute;
    }

    public void setInternalAttribute(Object internalAttribute) throws IllegalArgumentException
    {
        if (internalAttribute.getClass()!=Integer.class)
            throw new IllegalArgumentException();

        this.internalAttribute = (Integer)internalAttribute;
    }



}
