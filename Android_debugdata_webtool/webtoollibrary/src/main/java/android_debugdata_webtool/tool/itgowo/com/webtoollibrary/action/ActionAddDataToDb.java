package android_debugdata_webtool.tool.itgowo.com.webtoollibrary.action;

import android.content.Context;

import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.DatabaseManager;
import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.HttpRequest;
import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.Request;
import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.Response;
import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.ResponseHandler;
import android_debugdata_webtool.tool.itgowo.com.webtoollibrary.utils.DatabaseHelper;

/**
 * @author lujianchao
 * 添加数据到数据库
 */
public class ActionAddDataToDb implements Action {
    public static final String ACTION = "addDataToDb";

    @Override
    public Response doAction(Context context, Request request, HttpRequest httpRequest, ResponseHandler responseHandler) {
        Response response = DatabaseHelper.addRow(DatabaseManager.getDatabase(context, request.getDatabase()), request.getTableName(), request.getRowDataRequests());
        responseHandler.sendPost(response);
        return response;
    }
}
