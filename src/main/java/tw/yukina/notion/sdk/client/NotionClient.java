package tw.yukina.notion.sdk.client;

import tw.yukina.notion.sdk.client.api.ApiClient;
import tw.yukina.notion.sdk.model.block.BlockModel;
import tw.yukina.notion.sdk.model.database.DatabaseModel;
import tw.yukina.notion.sdk.model.page.PageModel;

import java.util.List;

public interface NotionClient {
    DatabaseModel getDatabaseByUuid(String uuid);

    DatabaseModel save(DatabaseModel databaseModel);

    Page getPageByUuid(String uuid);

    Page save(PageModel pageModel);

    void remove(PageModel pageModel);

    Content getContentByUuid(String uuid);

    Content save(BlockModel blockModel);

    void remove(BlockModel blockModel);

    Contents getContentsByUuid(String uuid);

    Contents getContentsByUuid(String uuid, String startCursor);

    Contents getContentsByUuid(String uuid, String startCursor, Integer pageSize);

    Contents save(Contents contents);

    Contents append(String parentUuid, BlockModel blockModel);

    Contents append(String parentUuid, List<? extends BlockModel> blockModels);

    void remove(Contents contents);

//    Page save(Page page, List<Block> content);

    ApiClient getApiClient();
}
