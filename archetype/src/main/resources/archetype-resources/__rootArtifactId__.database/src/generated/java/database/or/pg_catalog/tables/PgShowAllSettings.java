/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgShowAllSettingsRecord;

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
public class PgShowAllSettings extends TableImpl<PgShowAllSettingsRecord> {

    private static final long serialVersionUID = -1316890335;

    /**
     * The reference instance of <code>pg_catalog.pg_show_all_settings</code>
     */
    public static final PgShowAllSettings PG_SHOW_ALL_SETTINGS = new PgShowAllSettings();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShowAllSettingsRecord> getRecordType() {
        return PgShowAllSettingsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_show_all_settings.name</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> NAME = createField("name", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.setting</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SETTING = createField("setting", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.unit</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> UNIT = createField("unit", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.category</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> CATEGORY = createField("category", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.short_desc</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SHORT_DESC = createField("short_desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.extra_desc</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> EXTRA_DESC = createField("extra_desc", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.context</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> CONTEXT = createField("context", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.vartype</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> VARTYPE = createField("vartype", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.source</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SOURCE = createField("source", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.min_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> MIN_VAL = createField("min_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.max_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> MAX_VAL = createField("max_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.enumvals</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String[]> ENUMVALS = createField("enumvals", org.jooq.impl.SQLDataType.CLOB.getArrayDataType(), this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.boot_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> BOOT_VAL = createField("boot_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.reset_val</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> RESET_VAL = createField("reset_val", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.sourcefile</code>.
     */
    public final TableField<PgShowAllSettingsRecord, String> SOURCEFILE = createField("sourcefile", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.sourceline</code>.
     */
    public final TableField<PgShowAllSettingsRecord, Integer> SOURCELINE = createField("sourceline", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_show_all_settings.pending_restart</code>.
     */
    public final TableField<PgShowAllSettingsRecord, Boolean> PENDING_RESTART = createField("pending_restart", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * Create a <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings() {
        this(DSL.name("pg_show_all_settings"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings(String alias) {
        this(DSL.name(alias), PG_SHOW_ALL_SETTINGS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_all_settings</code> table reference
     */
    public PgShowAllSettings(Name alias) {
        this(alias, PG_SHOW_ALL_SETTINGS);
    }

    private PgShowAllSettings(Name alias, Table<PgShowAllSettingsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgShowAllSettings(Name alias, Table<PgShowAllSettingsRecord> aliased, Field<?>[] parameters) {
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
    public PgShowAllSettings as(String alias) {
        return new PgShowAllSettings(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShowAllSettings as(Name alias) {
        return new PgShowAllSettings(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowAllSettings rename(String name) {
        return new PgShowAllSettings(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowAllSettings rename(Name name) {
        return new PgShowAllSettings(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgShowAllSettings call() {
        return new PgShowAllSettings(DSL.name(getName()), null, new Field[] { 
        });
    }
}
