package com.lannstark.lec11

fun isDirectoryPath(path: String) = path.endsWith("/")

/**
    public final class StringUtilsFileKt {
        public static final boolean isDirectoryPath(@NotNull String path) {
            Intrinsics.checkNotNullParameter(path, "path");
            return StringsKt.endsWith$default(path, "/", false, 2, (Object)null);
        }
    }
 */