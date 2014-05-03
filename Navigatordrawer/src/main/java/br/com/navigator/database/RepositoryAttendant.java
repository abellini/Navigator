package br.com.navigator.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.List;

import br.com.navigator.entity.Attendant;

public class RepositoryAttendant extends Repository<Attendant> {
    @Override
    public long save(Attendant obj) {
        return 0;
    }

    @Override
    protected ContentValues populateContentValues(Attendant obj) {
        return null;
    }

    @Override
    public long insert(Attendant obj) {
        return 0;
    }

    @Override
    public int update(Attendant tablet) {
        return 0;
    }

    @Override
    public int delete(long id) {
        return 0;
    }

    @Override
    public Attendant findById(long id) {
        return null;
    }

    @Override
    public List<Attendant> listAll() {
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
