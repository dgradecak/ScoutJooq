/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgMatviewsRecord;

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
public class PgMatviews extends TableImpl<PgMatviewsRecord> {

    private static final long serialVersionUID = -864052154;

    /**
     * The reference instance of <code>pg_catalog.pg_matviews</code>
     */
    public static final PgMatviews PG_MATVIEWS = new PgMatviews();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgMatviewsRecord> getRecordType() {
        return PgMatviewsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_matviews.schemaname</code>.
     */
    public final TableField<PgMatviewsRecord, String> SCHEMANAME = createField("schemaname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.matviewname</code>.
     */
    public final TableField<PgMatviewsRecord, String> MATVIEWNAME = createField("matviewname", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.matviewowner</code>.
     */
    public final TableField<PgMatviewsRecord, String> MATVIEWOWNER = createField("matviewowner", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.tablespace</code>.
     */
    public final TableField<PgMatviewsRecord, String> TABLESPACE = createField("tablespace", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.hasindexes</code>.
     */
    public final TableField<PgMatviewsRecord, Boolean> HASINDEXES = createField("hasindexes", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.ispopulated</code>.
     */
    public final TableField<PgMatviewsRecord, Boolean> ISPOPULATED = createField("ispopulated", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_matviews.definition</code>.
     */
    public final TableField<PgMatviewsRecord, String> DEFINITION = createField("definition", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews() {
        this(DSL.name("pg_matviews"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews(String alias) {
        this(DSL.name(alias), PG_MATVIEWS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_matviews</code> table reference
     */
    public PgMatviews(Name alias) {
        this(alias, PG_MATVIEWS);
    }

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgMatviews(Name alias, Table<PgMatviewsRecord> aliased, Field<?>[] parameters) {
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
    public PgMatviews as(String alias) {
        return new PgMatviews(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgMatviews as(Name alias) {
        return new PgMatviews(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgMatviews rename(String name) {
        return new PgMatviews(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgMatviews rename(Name name) {
        return new PgMatviews(name, null);
    }
}
