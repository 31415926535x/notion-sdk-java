package tw.yukina.notion.sdk.model.common.rich.mention;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.databind.JsonDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.*;
import org.jetbrains.annotations.NotNull;
import tw.yukina.notion.sdk.model.common.unit.Database;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@JsonIgnoreProperties(ignoreUnknown = true)
@JsonDeserialize(using = JsonDeserializer.None.class)
public class DatabaseMention extends Mention {
    private static final String DATABASE_FIELD = "database";

    private Database database;

    @NotNull
    public static DatabaseMention of(String databaseId){
        Database database = new Database();
        database.setDatabaseId(databaseId);
        DatabaseMention databaseMention = new DatabaseMention();
        databaseMention.setMentionType(MentionType.DATABASE);
        databaseMention.setDatabase(database);
        return databaseMention;
    }
}