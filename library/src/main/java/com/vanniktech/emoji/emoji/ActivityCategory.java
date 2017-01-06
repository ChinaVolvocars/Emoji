package com.vanniktech.emoji.emoji;

import android.support.annotation.DrawableRes;

import com.vanniktech.emoji.R;

public class ActivityCategory implements EmojiCategory {

    private static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoints(0x1f47e),
            Emoji.fromCodePoints(0x1f3f9),
            Emoji.fromCodePoints(0x1f93a),
            Emoji.fromCodePoints(0x1f3c7),
            Emoji.fromCodePoints(0x1f3c7, 0x1f3fb),
            Emoji.fromCodePoints(0x1f3c7, 0x1f3fc),
            Emoji.fromCodePoints(0x1f3c7, 0x1f3fd),
            Emoji.fromCodePoints(0x1f3c7, 0x1f3fe),
            Emoji.fromCodePoints(0x1f3c7, 0x1f3ff),
            Emoji.fromCodePoints(0x26f7),
            Emoji.fromCodePoints(0x1f3c2),
            Emoji.fromCodePoints(0x1f3cc),
            Emoji.fromCodePoints(0x1f3c4),
            Emoji.fromCodePoints(0x1f3c4, 0x1f3fb),
            Emoji.fromCodePoints(0x1f3c4, 0x1f3fc),
            Emoji.fromCodePoints(0x1f3c4, 0x1f3fd),
            Emoji.fromCodePoints(0x1f3c4, 0x1f3fe),
            Emoji.fromCodePoints(0x1f3c4, 0x1f3ff),
            Emoji.fromCodePoints(0x1f6a3),
            Emoji.fromCodePoints(0x1f6a3, 0x1f3fb),
            Emoji.fromCodePoints(0x1f6a3, 0x1f3fc),
            Emoji.fromCodePoints(0x1f6a3, 0x1f3fd),
            Emoji.fromCodePoints(0x1f6a3, 0x1f3fe),
            Emoji.fromCodePoints(0x1f6a3, 0x1f3ff),
            Emoji.fromCodePoints(0x1f3ca),
            Emoji.fromCodePoints(0x1f3ca, 0x1f3fb),
            Emoji.fromCodePoints(0x1f3ca, 0x1f3fc),
            Emoji.fromCodePoints(0x1f3ca, 0x1f3fd),
            Emoji.fromCodePoints(0x1f3ca, 0x1f3fe),
            Emoji.fromCodePoints(0x1f3ca, 0x1f3ff),
            Emoji.fromCodePoints(0x26f9),
            Emoji.fromCodePoints(0x26f9, 0x1f3fb),
            Emoji.fromCodePoints(0x26f9, 0x1f3fc),
            Emoji.fromCodePoints(0x26f9, 0x1f3fd),
            Emoji.fromCodePoints(0x26f9, 0x1f3fe),
            Emoji.fromCodePoints(0x26f9, 0x1f3ff),
            Emoji.fromCodePoints(0x1f3cb),
            Emoji.fromCodePoints(0x1f3cb, 0x1f3fb),
            Emoji.fromCodePoints(0x1f3cb, 0x1f3fc),
            Emoji.fromCodePoints(0x1f3cb, 0x1f3fd),
            Emoji.fromCodePoints(0x1f3cb, 0x1f3fe),
            Emoji.fromCodePoints(0x1f3cb, 0x1f3ff),
            Emoji.fromCodePoints(0x1f6b4),
            Emoji.fromCodePoints(0x1f6b4, 0x1f3fb),
            Emoji.fromCodePoints(0x1f6b4, 0x1f3fc),
            Emoji.fromCodePoints(0x1f6b4, 0x1f3fd),
            Emoji.fromCodePoints(0x1f6b4, 0x1f3fe),
            Emoji.fromCodePoints(0x1f6b4, 0x1f3ff),
            Emoji.fromCodePoints(0x1f6b5),
            Emoji.fromCodePoints(0x1f6b5, 0x1f3fb),
            Emoji.fromCodePoints(0x1f6b5, 0x1f3fc),
            Emoji.fromCodePoints(0x1f6b5, 0x1f3fd),
            Emoji.fromCodePoints(0x1f6b5, 0x1f3fe),
            Emoji.fromCodePoints(0x1f6b5, 0x1f3ff),
            Emoji.fromCodePoints(0x1f938),
            Emoji.fromCodePoints(0x1f938, 0x1f3fb),
            Emoji.fromCodePoints(0x1f938, 0x1f3fc),
            Emoji.fromCodePoints(0x1f938, 0x1f3fd),
            Emoji.fromCodePoints(0x1f938, 0x1f3fe),
            Emoji.fromCodePoints(0x1f938, 0x1f3ff),
            Emoji.fromCodePoints(0x1f93c),
            Emoji.fromCodePoints(0x1f93c, 0x1f3fb),
            Emoji.fromCodePoints(0x1f93c, 0x1f3fc),
            Emoji.fromCodePoints(0x1f93c, 0x1f3fd),
            Emoji.fromCodePoints(0x1f93c, 0x1f3fe),
            Emoji.fromCodePoints(0x1f93c, 0x1f3ff),
            Emoji.fromCodePoints(0x1f93d),
            Emoji.fromCodePoints(0x1f93d, 0x1f3fb),
            Emoji.fromCodePoints(0x1f93d, 0x1f3fc),
            Emoji.fromCodePoints(0x1f574),
            Emoji.fromCodePoints(0x1f93d, 0x1f3fe),
            Emoji.fromCodePoints(0x1f93d, 0x1f3ff),
            Emoji.fromCodePoints(0x1f93e),
            Emoji.fromCodePoints(0x1f93e, 0x1f3fb),
            Emoji.fromCodePoints(0x1f93e, 0x1f3fc),
            Emoji.fromCodePoints(0x1f93e, 0x1f3fd),
            Emoji.fromCodePoints(0x1f93e, 0x1f3fe),
            Emoji.fromCodePoints(0x1f93e, 0x1f3ff),
            Emoji.fromCodePoints(0x1f939),
            Emoji.fromCodePoints(0x1f939, 0x1f3fb),
            Emoji.fromCodePoints(0x1f939, 0x1f3fc),
            Emoji.fromCodePoints(0x1f939, 0x1f3fd),
            Emoji.fromCodePoints(0x1f939, 0x1f3fe),
            Emoji.fromCodePoints(0x1f939, 0x1f3ff),
            Emoji.fromCodePoints(0x1f3aa),
            Emoji.fromCodePoints(0x1f3ad),
            Emoji.fromCodePoints(0x1f3a8),
            Emoji.fromCodePoints(0x1f3b0),
            Emoji.fromCodePoints(0x1f6c0),
            Emoji.fromCodePoints(0x1f6c0, 0x1f3fb),
            Emoji.fromCodePoints(0x1f6c0, 0x1f3fc),
            Emoji.fromCodePoints(0x1f6c0, 0x1f3fd),
            Emoji.fromCodePoints(0x1f6c0, 0x1f3fe),
            Emoji.fromCodePoints(0x1f6c0, 0x1f3ff),
            Emoji.fromCodePoints(0x1f397),
            Emoji.fromCodePoints(0x1f39f),
            Emoji.fromCodePoints(0x1f3ab),
            Emoji.fromCodePoints(0x1f396),
            Emoji.fromCodePoints(0x1f3c6),
            Emoji.fromCodePoints(0x1f3c5),
            Emoji.fromCodePoints(0x1f947),
            Emoji.fromCodePoints(0x1f948),
            Emoji.fromCodePoints(0x1f949),
            Emoji.fromCodePoints(0x26bd),
            Emoji.fromCodePoints(0x26be),
            Emoji.fromCodePoints(0x1f3c0),
            Emoji.fromCodePoints(0x1f3d0),
            Emoji.fromCodePoints(0x1f3c8),
            Emoji.fromCodePoints(0x1f3c9),
            Emoji.fromCodePoints(0x1f3be),
            Emoji.fromCodePoints(0x1f3b1),
            Emoji.fromCodePoints(0x1f3b3),
            Emoji.fromCodePoints(0x1f3cf),
            Emoji.fromCodePoints(0x1f3d1),
            Emoji.fromCodePoints(0x1f3d2),
            Emoji.fromCodePoints(0x1f3d3),
            Emoji.fromCodePoints(0x1f3f8),
            Emoji.fromCodePoints(0x1f94a),
            Emoji.fromCodePoints(0x1f94b),
            Emoji.fromCodePoints(0x1f945),
            Emoji.fromCodePoints(0x1f3af),
            Emoji.fromCodePoints(0x26f3),
            Emoji.fromCodePoints(0x26f8),
            Emoji.fromCodePoints(0x1f3a3),
            Emoji.fromCodePoints(0x1f3bd),
            Emoji.fromCodePoints(0x1f3bf),
            Emoji.fromCodePoints(0x1f3ae),
            Emoji.fromCodePoints(0x1f3b2),
            Emoji.fromCodePoints(0x1f3bc),
            Emoji.fromCodePoints(0x1f3a4),
            Emoji.fromCodePoints(0x1f3a7),
            Emoji.fromCodePoints(0x1f3b7),
            Emoji.fromCodePoints(0x1f3b8),
            Emoji.fromCodePoints(0x1f3b9),
            Emoji.fromCodePoints(0x1f3ba),
            Emoji.fromCodePoints(0x1f3bb),
            Emoji.fromCodePoints(0x1f941),
            Emoji.fromCodePoints(0x1f3ac),
            Emoji.fromCodePoints(0x1f93d, 0x1f3fd)
    };

    @Override
    public Emoji[] getData() {
        return DATA;
    }

    @Override
    @DrawableRes
    public int getIcon() {
        return R.drawable.emoji_cars;
    }
}
