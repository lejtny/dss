//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.11 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.02.01 at 08:29:39 AM CET 
//


package eu.europa.esig.dss.jaxb.detailedreport;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import eu.europa.esig.dss.validation.policy.rules.SubIndication;

public class Adapter3
    extends XmlAdapter<String, SubIndication>
{


    public SubIndication unmarshal(String value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.parse(value));
    }

    public String marshal(SubIndication value) {
        return (eu.europa.esig.dss.jaxb.parsers.SubIndicationParser.print(value));
    }

}
