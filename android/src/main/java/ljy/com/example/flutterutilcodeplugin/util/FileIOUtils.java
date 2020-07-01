package ljy.com.example.flutterutilcodeplugin.util;

import java.io.File;
import java.io.InputStream;

/**
 * author : lijinyi
 * e-mail : fflijinyi@foxmail.com
 * date   : 2020/7/115:16
 * desc   :
 * version: 1.0
 */
public final class FileIOUtils {

    private static int sBufferSize = 524288;

    private FileIOUtils() {
        throw new UnsupportedOperationException("u can't instantiate me...");
    }

    ///////////////////////////////////////////////////////////////////////////
    // writeFileFromIS without progress
    ///////////////////////////////////////////////////////////////////////////

    /**
     * Write file from input stream.
     *
     * @param filePath The path of file.
     * @param is       The input stream.
     * @return {@code true}: success<br>{@code false}: fail
     */
    public static boolean writeFileFromIS(final String filePath, final InputStream is) {
        return writeFileFromIS(UtilsBridge.getFileByPath(filePath), is, false, null);
    }

    /**
     * Write file from input stream.
     *
     * @param filePath The path of file.
     * @param is       The input stream.
     * @param append   True to append, false otherwise.
     * @return {@code true}: success<br>{@code false}: fail
     */
    public static boolean writeFileFromIS(final String filePath,
                                          final InputStream is,
                                          final boolean append) {
        return writeFileFromIS(UtilsBridge.getFileByPath(filePath), is, append, null);
    }

    /**
     * Write file from input stream.
     *
     * @param file The file.
     * @param inputStream
     * @param append
     * @param is   The input stream.
     * @return {@code true}: success<br>{@code false}: fail
     */
    public static boolean writeFileFromIS(final File file, InputStream inputStream, boolean append, final InputStream is) {
        return writeFileFromIS(file, is, false, null);
    }

    /**
     * Write file from input stream.
     *
     * @param file   The file.
     * @param is     The input stream.
     * @param append True to append, false otherwise.
     * @return {@code true}: success<br>{@code false}: fail
     */
    public static boolean writeFileFromIS(final File file,
                                          final InputStream is,
                                          final boolean append) {
        return writeFileFromIS(file, is, append, null);
    }

}
