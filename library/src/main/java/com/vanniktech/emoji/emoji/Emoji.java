package com.vanniktech.emoji.emoji;

import android.support.annotation.NonNull;

import java.io.Serializable;

public final class Emoji implements Serializable {
    private static final long serialVersionUID = 1L;
    @NonNull
    private final String emoji;

    public Emoji(@NonNull final String emoji) {
        this.emoji = emoji;
    }

    public static Emoji fromCodePoints(final int... codePoints) {
        return new Emoji(new String(codePoints, 0, codePoints.length));
    }

    public static Emoji fromChar(final char ch) {
        return new Emoji(Character.toString(ch));
    }

    @NonNull
    public String getEmoji() {
        return emoji;
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        final Emoji e = (Emoji) o;
        return emoji.equals(e.emoji);
    }

    @Override
    public int hashCode() {
        return emoji.hashCode();
    }
}
