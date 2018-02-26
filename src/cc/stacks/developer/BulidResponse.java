package cc.stacks.developer;

import java.io.Serializable;

/**
 * 响应构建工具
 *
 * @author sKai-Zhang <skai-zhang@hotmail.com>
 * @copyright CopyRight 2015-2018 sKai-Zhang All Rights Reserved.
 * @license ZPL
 */
@SuppressWarnings("all")
public class BulidResponse<T> implements Serializable {

    // 响应状态
    private boolean State;

    // 响应信息
    private String Message;

    // 响应数据
    private T Data;

    // 响应时间
    private String Time;

    // 只有响应状态的构造方法
    BulidResponse(boolean State) {
        this.State = State;
        this.Time = String.valueOf(System.currentTimeMillis());
    }

    // 有响应状态和信息的构造方法
    BulidResponse(boolean State, String Message) {
        this.State = State;
        this.Message = Message;
        this.Time = String.valueOf(System.currentTimeMillis());
    }

    // 有响应状态和数据的构造方法
    BulidResponse(boolean State, T Data) {
        this.State = State;
        this.Data = Data;
        this.Time = String.valueOf(System.currentTimeMillis());
    }

    // 有响应状态,信息和数据的构造方法
    BulidResponse(boolean State, String Message, T Data) {
        this.State = State;
        this.Data = Data;
        this.Message = Message;
        this.Time = String.valueOf(System.currentTimeMillis());
    }

    // 构造成功简单响应
    public static <T> BulidResponse<T> Success() {
        return new BulidResponse<T>(true);
    }

    // 构造附带信息的成功响应
    public static <T> BulidResponse<T> Success(String Message) {
        return new BulidResponse<T>(true, Message);
    }

    // 构造附带数据的成功响应
    public static <T> BulidResponse<T> Success(T Data) {
        return new BulidResponse<T>(true, Data);
    }

    // 构造附带信息和数据的成功响应
    public static <T> BulidResponse<T> Success(String Message, T Data) {
        return new BulidResponse<T>(true, Message, Data);
    }

    // 构造成功简单响应
    public static <T> BulidResponse<T> Error() {
        return new BulidResponse<T>(false);
    }

    // 构造附带信息的成功响应
    public static <T> BulidResponse<T> Error(String Message) {
        return new BulidResponse<T>(false, Message);
    }

    // 构造附带数据的成功响应
    public static <T> BulidResponse<T> Error(T Data) {
        return new BulidResponse<T>(false, Data);
    }

    // 构造附带信息和数据的成功响应
    public static <T> BulidResponse<T> Error(String Message, T Data) {
        return new BulidResponse<T>(false, Message, Data);
    }

    public boolean isState() {
        return State;
    }

    public void setState(boolean state) {
        State = state;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }
}
