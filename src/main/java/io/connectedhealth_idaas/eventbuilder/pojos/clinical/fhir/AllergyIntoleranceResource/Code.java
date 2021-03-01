package io.connectedhealth_idaas.eventbuilder.pojos.clinical.fhir.AllergyIntoleranceResource;

import java.util.List;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;


public class Code {

    public List<Coding> coding;

    public List<Coding> getCoding() {
        return coding;
    }

    public void setCoding(List<Coding> coding) {
        this.coding = coding;
    }

    public String toString()
    {
        return ReflectionToStringBuilder.toString(this);
    }
}
