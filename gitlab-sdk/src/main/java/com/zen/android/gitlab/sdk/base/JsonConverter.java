package com.zen.android.gitlab.sdk.base;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Type;

import retrofit.converter.ConversionException;
import retrofit.converter.JacksonConverter;
import retrofit.mime.TypedInput;

/**
 * @author zen
 * @version 2016/4/25
 */
public class JsonConverter extends JacksonConverter {

    @Override
    public Object fromBody(TypedInput body, Type type) throws ConversionException {
        if (type.equals(String.class)) {
            try {
                return readStream(body.in());
            } catch (IOException e) {
                throw new ConversionException("read stream error", e);
            }
        }
        return super.fromBody(body, type);
    }

    private static String readStream(InputStream is) throws IOException {
        if (is == null) {
            return null;
        }
        final int bufferSize = 4000;
        final char[] buffer = new char[bufferSize];
        final StringBuilder out = new StringBuilder();
        Reader in = new InputStreamReader(is, "UTF-8");
        for (; ; ) {
            int rsz = in.read(buffer, 0, buffer.length);
            if (rsz < 0)
                break;
            out.append(buffer, 0, rsz);
        }
        return out.toString();
    }
}
