package br.com.navigator.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.List;

import br.com.navigator.entity.Coin;

public class RepositoryCoin extends Repository<Coin> {

    @Override
    public long save(Coin obj) {
        return 0;
    }

    @Override
    protected ContentValues populateContentValues(Coin obj) {
        return null;
    }

    @Override
    public long insert(Coin obj) {
        return 0;
    }

    @Override
    public int update(Coin tablet) {
        return 0;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public Coin findById(long id) {
        return null;
    }

    @Override
    public List<Coin> listAll() {
        return null;
    }

    @Override
    public Cursor query(SQLiteQueryBuilder queryBuilder, String[] projection, String selection, String[] selectionArgs, String groupBy, String having, String orderBy) {
        return null;
    }

    @Override
    public Cursor getCursor() {
        return null;
    }
}
