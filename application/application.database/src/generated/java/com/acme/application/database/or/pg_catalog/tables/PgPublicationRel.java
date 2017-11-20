/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.Indexes;
import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgPublicationRelRecord;

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
public class PgPublicationRel extends TableImpl<PgPublicationRelRecord> {

    private static final long serialVersionUID = 1646445285;

    /**
     * The reference instance of <code>pg_catalog.pg_publication_rel</code>
     */
    public static final PgPublicationRel PG_PUBLICATION_REL = new PgPublicationRel();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgPublicationRelRecord> getRecordType() {
        return PgPublicationRelRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_publication_rel.prpubid</code>.
     */
    public final TableField<PgPublicationRelRecord, Long> PRPUBID = createField("prpubid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_publication_rel.prrelid</code>.
     */
    public final TableField<PgPublicationRelRecord, Long> PRRELID = createField("prrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_publication_rel</code> table reference
     */
    public PgPublicationRel() {
        this(DSL.name("pg_publication_rel"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table reference
     */
    public PgPublicationRel(String alias) {
        this(DSL.name(alias), PG_PUBLICATION_REL);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_publication_rel</code> table reference
     */
    public PgPublicationRel(Name alias) {
        this(alias, PG_PUBLICATION_REL);
    }

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgPublicationRel(Name alias, Table<PgPublicationRelRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PG_PUBLICATION_REL_PRRELID_PRPUBID_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRel as(String alias) {
        return new PgPublicationRel(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgPublicationRel as(Name alias) {
        return new PgPublicationRel(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(String name) {
        return new PgPublicationRel(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgPublicationRel rename(Name name) {
        return new PgPublicationRel(name, null);
    }
}
