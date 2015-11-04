package andmebaasid2.rest.jackson.map;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonDeserializer;
import andmebaasid2.utils.DateUtils;
import org.joda.time.DateTime;

import java.io.IOException;

/**
 * Created by mart.laus on 6.07.2015.
 */
public class DateTimeDeserializer extends JsonDeserializer<DateTime> {

    @Override
    public DateTime deserialize(JsonParser jp, DeserializationContext ctxt) throws IOException {

        return DateUtils.fromJson(jp.getText());
    }
}
