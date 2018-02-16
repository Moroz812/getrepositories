package ru.moroz.getrepositories.Common;

import java.security.acl.Owner;
import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import ru.moroz.getrepositories.Model.Repos;

/**
 * Created by moroz on 16.02.18.
 */

public class Service {
    @GET(Common.API_USER)
    Call<Owner> getOwner(@Path("owner") String owner);

    @GET(Common.API_REPOS)
    Call<List<Repos>> getRepos(@Path("owner") String owner);
}