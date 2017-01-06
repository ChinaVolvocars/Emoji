package com.vanniktech.emoji.emoji;

import android.support.annotation.DrawableRes;

import com.vanniktech.emoji.R;

public class NatureCategory implements EmojiCategory {

    private static final Emoji[] DATA = new Emoji[]{
            Emoji.fromCodePoints(0x1f648),
            Emoji.fromCodePoints(0x1f38d),
            Emoji.fromCodePoints(0x1f64a),
            Emoji.fromCodePoints(0x1f4a6),
            Emoji.fromCodePoints(0x1f4a8),
            Emoji.fromCodePoints(0x1f435),
            Emoji.fromCodePoints(0x1f412),
            Emoji.fromCodePoints(0x1f98d),
            Emoji.fromCodePoints(0x1f436),
            Emoji.fromCodePoints(0x1f415),
            Emoji.fromCodePoints(0x1f429),
            Emoji.fromCodePoints(0x1f43a),
            Emoji.fromCodePoints(0x1f98a),
            Emoji.fromCodePoints(0x1f431),
            Emoji.fromCodePoints(0x1f408),
            Emoji.fromCodePoints(0x1f981),
            Emoji.fromCodePoints(0x1f42f),
            Emoji.fromCodePoints(0x1f405),
            Emoji.fromCodePoints(0x1f406),
            Emoji.fromCodePoints(0x1f434),
            Emoji.fromCodePoints(0x1f40e),
            Emoji.fromCodePoints(0x1f98c),
            Emoji.fromCodePoints(0x1f984),
            Emoji.fromCodePoints(0x1f42e),
            Emoji.fromCodePoints(0x1f402),
            Emoji.fromCodePoints(0x1f403),
            Emoji.fromCodePoints(0x1f404),
            Emoji.fromCodePoints(0x1f437),
            Emoji.fromCodePoints(0x1f416),
            Emoji.fromCodePoints(0x1f417),
            Emoji.fromCodePoints(0x1f43d),
            Emoji.fromCodePoints(0x1f40f),
            Emoji.fromCodePoints(0x1f411),
            Emoji.fromCodePoints(0x1f410),
            Emoji.fromCodePoints(0x1f42a),
            Emoji.fromCodePoints(0x1f42b),
            Emoji.fromCodePoints(0x1f418),
            Emoji.fromCodePoints(0x1f98f),
            Emoji.fromCodePoints(0x1f42d),
            Emoji.fromCodePoints(0x1f401),
            Emoji.fromCodePoints(0x1f400),
            Emoji.fromCodePoints(0x1f439),
            Emoji.fromCodePoints(0x1f430),
            Emoji.fromCodePoints(0x1f407),
            Emoji.fromCodePoints(0x1f43f),
            Emoji.fromCodePoints(0x1f987),
            Emoji.fromCodePoints(0x1f43b),
            Emoji.fromCodePoints(0x1f428),
            Emoji.fromCodePoints(0x1f43c),
            Emoji.fromCodePoints(0x1f43e),
            Emoji.fromCodePoints(0x1f983),
            Emoji.fromCodePoints(0x1f414),
            Emoji.fromCodePoints(0x1f413),
            Emoji.fromCodePoints(0x1f423),
            Emoji.fromCodePoints(0x1f424),
            Emoji.fromCodePoints(0x1f425),
            Emoji.fromCodePoints(0x1f426),
            Emoji.fromCodePoints(0x1f427),
            Emoji.fromCodePoints(0x1f54a),
            Emoji.fromCodePoints(0x1f985),
            Emoji.fromCodePoints(0x1f986),
            Emoji.fromCodePoints(0x1f989),
            Emoji.fromCodePoints(0x1f438),
            Emoji.fromCodePoints(0x1f40a),
            Emoji.fromCodePoints(0x1f422),
            Emoji.fromCodePoints(0x1f98e),
            Emoji.fromCodePoints(0x1f40d),
            Emoji.fromCodePoints(0x1f432),
            Emoji.fromCodePoints(0x1f409),
            Emoji.fromCodePoints(0x1f433),
            Emoji.fromCodePoints(0x1f40b),
            Emoji.fromCodePoints(0x1f42c),
            Emoji.fromCodePoints(0x1f41f),
            Emoji.fromCodePoints(0x1f420),
            Emoji.fromCodePoints(0x1f421),
            Emoji.fromCodePoints(0x1f988),
            Emoji.fromCodePoints(0x1f419),
            Emoji.fromCodePoints(0x1f41a),
            Emoji.fromCodePoints(0x1f980),
            Emoji.fromCodePoints(0x1f990),
            Emoji.fromCodePoints(0x1f649),
            Emoji.fromCodePoints(0x1f98b),
            Emoji.fromCodePoints(0x1f40c),
            Emoji.fromCodePoints(0x1f41b),
            Emoji.fromCodePoints(0x1f41c),
            Emoji.fromCodePoints(0x1f41d),
            Emoji.fromCodePoints(0x1f41e),
            Emoji.fromCodePoints(0x1f577),
            Emoji.fromCodePoints(0x1f578),
            Emoji.fromCodePoints(0x1f982),
            Emoji.fromCodePoints(0x1f490),
            Emoji.fromCodePoints(0x1f338),
            Emoji.fromCodePoints(0x1f3f5),
            Emoji.fromCodePoints(0x1f339),
            Emoji.fromCodePoints(0x1f940),
            Emoji.fromCodePoints(0x1f33a),
            Emoji.fromCodePoints(0x1f33b),
            Emoji.fromCodePoints(0x1f33c),
            Emoji.fromCodePoints(0x1f337),
            Emoji.fromCodePoints(0x1f331),
            Emoji.fromCodePoints(0x1f332),
            Emoji.fromCodePoints(0x1f333),
            Emoji.fromCodePoints(0x1f334),
            Emoji.fromCodePoints(0x1f335),
            Emoji.fromCodePoints(0x1f33e),
            Emoji.fromCodePoints(0x1f33f),
            Emoji.fromCodePoints(0x2618),
            Emoji.fromCodePoints(0x1f340),
            Emoji.fromCodePoints(0x1f341),
            Emoji.fromCodePoints(0x1f342),
            Emoji.fromCodePoints(0x1f343),
            Emoji.fromCodePoints(0x1f344),
            Emoji.fromCodePoints(0x1f330),
            Emoji.fromCodePoints(0x1f30d),
            Emoji.fromCodePoints(0x1f30e),
            Emoji.fromCodePoints(0x1f30f),
            Emoji.fromCodePoints(0x1f311),
            Emoji.fromCodePoints(0x1f312),
            Emoji.fromCodePoints(0x1f313),
            Emoji.fromCodePoints(0x1f314),
            Emoji.fromCodePoints(0x1f315),
            Emoji.fromCodePoints(0x1f316),
            Emoji.fromCodePoints(0x1f317),
            Emoji.fromCodePoints(0x1f318),
            Emoji.fromCodePoints(0x1f319),
            Emoji.fromCodePoints(0x1f31a),
            Emoji.fromCodePoints(0x1f31b),
            Emoji.fromCodePoints(0x1f31c),
            Emoji.fromCodePoints(0x2600),
            Emoji.fromCodePoints(0x1f31d),
            Emoji.fromCodePoints(0x1f31e),
            Emoji.fromCodePoints(0x2b50),
            Emoji.fromCodePoints(0x1f31f),
            Emoji.fromCodePoints(0x2601),
            Emoji.fromCodePoints(0x26c5),
            Emoji.fromCodePoints(0x26c8),
            Emoji.fromCodePoints(0x1f324),
            Emoji.fromCodePoints(0x1f325),
            Emoji.fromCodePoints(0x1f326),
            Emoji.fromCodePoints(0x1f327),
            Emoji.fromCodePoints(0x1f328),
            Emoji.fromCodePoints(0x1f329),
            Emoji.fromCodePoints(0x1f32a),
            Emoji.fromCodePoints(0x1f32b),
            Emoji.fromCodePoints(0x1f32c),
            Emoji.fromCodePoints(0x2602),
            Emoji.fromCodePoints(0x2614),
            Emoji.fromCodePoints(0x26a1),
            Emoji.fromCodePoints(0x2744),
            Emoji.fromCodePoints(0x2603),
            Emoji.fromCodePoints(0x26c4),
            Emoji.fromCodePoints(0x2604),
            Emoji.fromCodePoints(0x1f525),
            Emoji.fromCodePoints(0x1f4a7),
            Emoji.fromCodePoints(0x1f30a),
            Emoji.fromCodePoints(0x1f383),
            Emoji.fromCodePoints(0x1f384),
            Emoji.fromCodePoints(0x2728),
            Emoji.fromCodePoints(0x1f38b),
            Emoji.fromCodePoints(0x1f991)
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
