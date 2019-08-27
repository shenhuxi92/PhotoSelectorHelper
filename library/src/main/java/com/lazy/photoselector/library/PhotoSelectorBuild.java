package com.lazy.photoselector.library;

import android.content.Context;

public class PhotoSelectorBuild {

    private static PhotoSelectorBuild build;

    private PhotoSelectorBuild(){ }

    public static PhotoSelectorBuild Build(Context context) {
        if (build==null) {
            build = INSTANCE.BUILD;
        }
        return build;
    }

    private static class INSTANCE {
        static PhotoSelectorBuild BUILD = new PhotoSelectorBuild();
    }

}
