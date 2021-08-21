package tw.yukina.notion.sdk.model.property;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.jetbrains.annotations.Nullable;
import tw.yukina.notion.sdk.model.deserializer.DateTimeDeserializer;

@Getter
@Setter
@ToString
@EqualsAndHashCode(callSuper = false)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = DateTimeDeserializer.class)
public abstract class DateTimeProperty {
    private DateTimeType dateTimeType;

    public abstract String startToString();

    @Nullable
    public abstract String endToString();
}
