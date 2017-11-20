/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.Indexes;
import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgShseclabelRecord;

import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Index;
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
public class PgShseclabel extends TableImpl<PgShseclabelRecord> {

    private static final long serialVersionUID = -93659733;

    /**
     * The reference instance of <code>pg_catalog.pg_shseclabel</code>
     */
    public static final PgShseclabel PG_SHSECLABEL = new PgShseclabel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShseclabelRecord> getRecordType() {
        return PgShseclabelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_shseclabel.objoid</code>.
     */
    public final TableField<PgShseclabelRecord, Long> OBJOID = createField("objoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.classoid</code>.
     */
    public final TableField<PgShseclabelRecord, Long> CLASSOID = createField("classoid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.provider</code>.
     */
    public final TableField<PgShseclabelRecord, String> PROVIDER = createField("provider", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_shseclabel.label</code>.
     */
    public final TableField<PgShseclabelRecord, String> LABEL = createField("label", org.jooq.impl.SQLDataType.CLOB.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel() {
        this(DSL.name("pg_shseclabel"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel(String alias) {
        this(DSL.name(alias), PG_SHSECLABEL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_shseclabel</code> table reference
     */
    public PgShseclabel(Name alias) {
        this(alias, PG_SHSECLABEL);
    }

    private PgShseclabel(Name alias, Table<PgShseclabelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgShseclabel(Name alias, Table<PgShseclabelRecord> aliased, Field<?>[] parameters) {
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
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.PG_SHSECLABEL_OBJECT_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabel as(String alias) {
        return new PgShseclabel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShseclabel as(Name alias) {
        return new PgShseclabel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShseclabel rename(String name) {
        return new PgShseclabel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShseclabel rename(Name name) {
        return new PgShseclabel(name, null);
    }
}
