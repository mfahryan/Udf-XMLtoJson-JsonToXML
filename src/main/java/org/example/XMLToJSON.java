package org.example;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;
import org.json.JSONObject;
import org.json.XML;

@UdfDescription(name = "XmlToJSON",
        author = "All Data International (https://alldataint.com/)",
        version = "0.0.2",
        description = "Converts XML to JSON")
public class XMLToJSON {
    @Udf(description = "Converts XML to JSON Without Error Handling")
    public String convertXMLtoJSONOnly(@UdfParameter("xml") String xml) {
        JSONObject result = XML.toJSONObject(xml);
        return result.toString();
    }
}
