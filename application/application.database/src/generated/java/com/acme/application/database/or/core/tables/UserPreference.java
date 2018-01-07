/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.core.tables;


import com.acme.application.database.or.core.Core;
import com.acme.application.database.or.core.Keys;
import com.acme.application.database.or.core.tables.records.UserPreferenceRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.10.1"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class UserPreference extends TableImpl<UserPreferenceRecord> {

    private static final long serialVersionUID = -1013346913;

    /**
     * The reference instance of <code>core.user_preference</code>
     */
    public static final UserPreference USER_PREFERENCE = new UserPreference();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<UserPreferenceRecord> getRecordType() {
        return UserPreferenceRecord.class;
    }

    /**
     * The column <code>core.user_preference.user</code>.
     */
    public final TableField<UserPreferenceRecord, String> USER = createField("user", org.jooq.impl.SQLDataType.VARCHAR(512).nullable(false), this, "");

    /**
     * The column <code>core.user_preference.node</code>.
     */
    public final TableField<UserPreferenceRecord, String> NODE = createField("node", org.jooq.impl.SQLDataType.VARCHAR(128).nullable(false), this, "");

    /**
     * The column <code>core.user_preference.data</code>.
     */
    public final TableField<UserPreferenceRecord, byte[]> DATA = createField("data", org.jooq.impl.SQLDataType.BLOB, this, "");

    /**
     * Create a <code>core.user_preference</code> table reference
     */
    public UserPreference() {
        this(DSL.name("user_preference"), null);
    }

    /**
     * Create an aliased <code>core.user_preference</code> table reference
     */
    public UserPreference(String alias) {
        this(DSL.name(alias), USER_PREFERENCE);
    }

    /**
     * Create an aliased <code>core.user_preference</code> table reference
     */
    public UserPreference(Name alias) {
        this(alias, USER_PREFERENCE);
    }

    private UserPreference(Name alias, Table<UserPreferenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private UserPreference(Name alias, Table<UserPreferenceRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Core.CORE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<UserPreferenceRecord> getPrimaryKey() {
        return Keys.PK_USER_PREFERENCE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<UserPreferenceRecord>> getKeys() {
        return Arrays.<UniqueKey<UserPreferenceRecord>>asList(Keys.PK_USER_PREFERENCE);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreference as(String alias) {
        return new UserPreference(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UserPreference as(Name alias) {
        return new UserPreference(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPreference rename(String name) {
        return new UserPreference(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public UserPreference rename(Name name) {
        return new UserPreference(name, null);
    }
}
