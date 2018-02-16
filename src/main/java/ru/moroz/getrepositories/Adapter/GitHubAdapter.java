package ru.moroz.getrepositories.Adapter;

import java.util.List;

import retrofit2.Call;
import ru.moroz.getrepositories.Common.Common;
import ru.moroz.getrepositories.Common.Service;
import ru.moroz.getrepositories.Model.Owner;
import ru.moroz.getrepositories.Model.Repos;

/**
 * Created by moroz on 16.02.18.
 */

    public class GitHubAdapter extends BaseAdapter implements Service {

        private Service service;

        public GitHubAdapter() {
            super(Common.API_LINK);
            service = createService(Service.class);
        }

        @Override
        public Call<Owner> getOwner(String owner) {
            return service.getOwner(owner);
        }

        @Override
        public Call<List<Repos>> getRepo(String owner) {
            return service.getRepos(owner);
        }
    }
