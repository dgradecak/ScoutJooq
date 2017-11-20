/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.Indexes;
import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgSequenceRecord;

import java.math.BigDecimal;
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
public class PgSequence extends TableImpl<PgSequenceRecord> {

    private static final long serialVersionUID = 1861392194;

    /**
     * The reference instance of <code>pg_catalog.pg_sequence</code>
     */
    public static final PgSequence PG_SEQUENCE = new PgSequence();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgSequenceRecord> getRecordType() {
        return PgSequenceRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_sequence.seqrelid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQRELID = createField("seqrelid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqtypid</code>.
     */
    public final TableField<PgSequenceRecord, Long> SEQTYPID = createField("seqtypid", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "");

    /**
     * The column <code>pg_catalog.pg_sequence.seqstart</code>.
     */
    public final TableField<PgSequenceRecord, BigDecimal> SEQSTART = createField("seqstart", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_sequence.seqincrement</code>.
     */
    public final TableField<PgSequenceRecord, BigDecimal> SEQINCREMENT = createField("seqincrement", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_sequence.seqmax</code>.
     */
    public final TableField<PgSequenceRecord, BigDecimal> SEQMAX = createField("seqmax", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_sequence.seqmin</code>.
     */
    public final TableField<PgSequenceRecord, BigDecimal> SEQMIN = createField("seqmin", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_sequence.seqcache</code>.
     */
    public final TableField<PgSequenceRecord, BigDecimal> SEQCACHE = createField("seqcache", org.jooq.impl.SQLDataType.BIGINT.nullable(false), this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_sequence.seqcycle</code>.
     */
    public final TableField<PgSequenceRecord, Boolean> SEQCYCLE = createField("seqcycle", org.jooq.impl.SQLDataType.BOOLEAN.nullable(false), this, "");

    /**
     * Create a <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence() {
        this(DSL.name("pg_sequence"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(String alias) {
        this(DSL.name(alias), PG_SEQUENCE);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_sequence</code> table reference
     */
    public PgSequence(Name alias) {
        this(alias, PG_SEQUENCE);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgSequence(Name alias, Table<PgSequenceRecord> aliased, Field<?>[] parameters) {
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
        return Arrays.<Index>asList(Indexes.PG_SEQUENCE_SEQRELID_INDEX);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequence as(String alias) {
        return new PgSequence(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgSequence as(Name alias) {
        return new PgSequence(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(String name) {
        return new PgSequence(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgSequence rename(Name name) {
        return new PgSequence(name, null);
    }
}
