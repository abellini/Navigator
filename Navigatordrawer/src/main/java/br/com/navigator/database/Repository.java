package br.com.navigator.database;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQueryBuilder;

import java.util.List;

public abstract class Repository<T> {

    protected SQLiteDatabase db;

    abstract public long save(T obj);

    abstract protected ContentValues populateContentValues(T obj);

    abstract public long insert(T obj);

    abstract public int update(T tablet);

    abstract public int delete(long id);

    abstract public T findById(long id);

    abstract public List<T> listAll();

    abstract public Cursor query(SQLiteQueryBuilder queryBuilder, String[]  projection, String selection, String[] selectionArgs, String groupBy, String having, String orderBy);

    abstract public Cursor getCursor();

    public void close() {
        if (this.db != null) {
            this.db.close();
        }
    }

}
