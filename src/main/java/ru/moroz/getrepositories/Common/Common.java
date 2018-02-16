package ru.moroz.getrepositories.Common;

/**
 * Created by moroz on 15.02.18.
 */


public class Common {
    public static final String API_LINK = "https://api.github.com";
    public static final String API_USER = "users/{owner}";
    public static final String API_REPOS = "users/{owner}/repos";

    public static final boolean isDebugging = true;



//    @NonNull
//    public static String apiRequest(String owner) {
//        StringBuilder sb = new StringBuilder(API_LINK);
//        sb.append(String.format("/owner/repos", owner));
//        return sb.toString();
//    }
}