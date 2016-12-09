package razerdp.friendcircle.mvp.model;

import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import razerdp.friendcircle.mvp.callback.OnCommentChangeCallback;

/**
 * Created by 大灯泡 on 2016/12/6.
 */

public interface IComment {


    /**
     * 添加评论
     */
    void addComment(@NonNull String momentsId,
                    @NonNull String authorId,
                    @Nullable String replyUserId,
                    @NonNull String content,
                    @NonNull OnCommentChangeCallback onCommentChangeCallback);

    void removeComment(@NonNull String commentid);
}