/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgSettingsRecord;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Name;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
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
public class PgSettings extends TableImpl<PgSettingsRecord> {

    private static final long serialVersionUID = -371929302;

    /**
     * The reference instance of <code>pg_catalog.pg_settings</code>
     */
    public static final PgSettings PG_SETTINGS = new PgSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSettingsRecord> getRecordType() {
        return PgSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_settings.name</code>.
     */
    public final TableField<PgSettingsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.setting</code>.
     */
    public final TableField<PgSettingsRecord, String> SETTING = createField("setting", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.unit</code>.
     */
    public final TableField<PgSettingsRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.category</code>.
     */
    public final TableField<PgSettingsRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.short_desc</code>.
     */
    public final TableField<PgSettingsRecord, String> SHORT_DESC = createField("short_desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.extra_desc</code>.
     */
    public final TableField<PgSettingsRecord, String> EXTRA_DESC = createField("extra_desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.context</code>.
     */
    public final TableField<PgSettingsRecord, String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.vartype</code>.
     */
    public final TableField<PgSettingsRecord, String> VARTYPE = createField("vartype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.source</code>.
     */
    public final TableField<PgSettingsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.min_val</code>.
     */
    public final TableField<PgSettingsRecord, String> MIN_VAL = createField("min_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.max_val</code>.
     */
    public final TableField<PgSettingsRecord, String> MAX_VAL = createField("max_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.enumvals</code>.
     */
    public final TableField<PgSettingsRecord, String[]> ENUMVALS = createField("enumvals", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_settings.boot_val</code>.
     */
    public final TableField<PgSettingsRecord, String> BOOT_VAL = createField("boot_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.reset_val</code>.
     */
    public final TableField<PgSettingsRecord, String> RESET_VAL = createField("reset_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourcefile</code>.
     */
    public final TableField<PgSettingsRecord, String> SOURCEFILE = createField("sourcefile", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.sourceline</code>.
     */
    public final TableField<PgSettingsRecord, Integer> SOURCELINE = createField("sourceline", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_settings.pending_restart</code>.
     */
    public final TableField<PgSettingsRecord, Boolean> PENDING_RESTART = createField("pending_restart", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings() {
        this(DSL.name("pg_settings"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(String alias) {
        this(DSL.name(alias), PG_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_settings</code> table reference
     */
    public PgSettings(Name alias) {
        this(alias, PG_SETTINGS);
    }

    private PgSettings(Name alias, Table<PgSettingsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSettings(Name alias, Table<PgSettingsRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return PgCatalog.PG_CATALOG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettings as(String alias) {
        return new PgSettings(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSettings as(Name alias) {
        return new PgSettings(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSettings rename(String name) {
        return new PgSettings(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSettings rename(Name name) {
        return new PgSettings(name, null);
    }
}
