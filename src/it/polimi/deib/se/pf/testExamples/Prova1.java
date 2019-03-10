package it.polimi.deib.se.pf.testExamples;


public class Prova1 {

    //attrobute of the class
    private String firstAttribute;

    /**
     * costructure of the class, that set the unique attribute
     * @param firstAttribute the attribute to update
     */
    public Prova1(String firstAttribute)
    {
        this.firstAttribute = firstAttribute;
    }

    /**
     * getter of the unique attribute of the class
     * @return the attribute
     */
    public String getFirstAttribute() {
        return firstAttribute;
    }

    /**
     * setter of the unique attribute of the class
     * @param firstAttribute the attribute to update
     */
    public void setFirstAttribute(String firstAttribute) {
        this.firstAttribute = firstAttribute;
    }


}
