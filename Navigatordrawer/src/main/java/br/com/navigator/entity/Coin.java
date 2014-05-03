package br.com.navigator.entity;

import br.com.navigator.database.RepositoryTablet;

public class Coin {

    public static String[] columns = new String[] {
            RepositoryTablet.Tablets.COLUMN_NAME_TABLET_ID,
            RepositoryTablet.Tablets.COLUMN_NAME_STATUS_ID,
            RepositoryTablet.Tablets.COLUMN_NAME_COIN_ID,
            RepositoryTablet.Tablets.COLUMN_NAME_NUMBER,
            RepositoryTablet.Tablets.COLUMN_NAME_IP,
            RepositoryTablet.Tablets.COLUMN_NAME_PORT,
            RepositoryTablet.Tablets.COLUMN_NAME_SERVER_IP,
            RepositoryTablet.Tablets.COLUMN_NAME_SERVER_PORT,
            RepositoryTablet.Tablets.COLUMN_NAME_ATTENDANT_ID
    };
}
