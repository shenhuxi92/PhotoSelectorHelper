package com.lazy.photoselector.library;

import android.content.Context;
import android.widget.ImageView;

/**
 * Created by YongShu on 2019/8/27
 * Last modification : 2019/8/27
 * Modification Version: 1
 * Explain: 图片引擎
 */
public abstract class ImageEngine {

    /**
     * 加载静态图片
     */
    abstract void loadImage(Context context, String photoPath, ImageView imageView);

    /**
     * 加载GIF动图
     */
    abstract void loadGif(Context context, String photoPath, ImageView imageView);

}
