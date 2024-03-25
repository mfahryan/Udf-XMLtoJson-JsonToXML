package org.example;

import io.confluent.ksql.function.udf.Udf;
import io.confluent.ksql.function.udf.UdfDescription;
import io.confluent.ksql.function.udf.UdfParameter;
import org.json.JSONObject;
import org.json.XML;

@UdfDescription(name = "JsonToXml",
        author = "All Data International",
        version = "1.0.0",
        description = "Converts JSON to XML")
public class JsontoXml {

    @Udf(description = "Converts JSON to XML")
    public String convertJsonToXml(@UdfParameter("json") String json) {
        JSONObject jsonObject = new JSONObject(json);
        return XML.toString(jsonObject);
    }
}