package com.zen.android.gitlab.sdk;

import com.zen.android.gitlab.sdk.base.JsonConverter;
import com.zen.android.gitlab.sdk.protocol.GitlabApi;

import retrofit.RestAdapter;

/**
 * @author zen
 * @version 2016/4/24
 */
public class Gitlab {

    private static GitlabApi sGitlabApi = createApi();

    private static GitlabApi createApi() {
        return new RestAdapter.Builder()
                .setEndpoint("https://gitlab.com")
                .setLogLevel(RestAdapter.LogLevel.FULL)
                .setConverter(new JsonConverter())
                .build()
                .create(GitlabApi.class);
    }

    public static GitlabApi getApi() {
        return sGitlabApi;
    }
}
