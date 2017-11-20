/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.generator.converter.LongConverter;
import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgStatBgwriterRecord;

import java.math.BigDecimal;
import java.time.OffsetDateTime;

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
public class PgStatBgwriter extends TableImpl<PgStatBgwriterRecord> {

    private static final long serialVersionUID = -409172596;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_bgwriter</code>
     */
    public static final PgStatBgwriter PG_STAT_BGWRITER = new PgStatBgwriter();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatBgwriterRecord> getRecordType() {
        return PgStatBgwriterRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoints_timed</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> CHECKPOINTS_TIMED = createField("checkpoints_timed", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoints_req</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> CHECKPOINTS_REQ = createField("checkpoints_req", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoint_write_time</code>.
     */
    public final TableField<PgStatBgwriterRecord, Double> CHECKPOINT_WRITE_TIME = createField("checkpoint_write_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.checkpoint_sync_time</code>.
     */
    public final TableField<PgStatBgwriterRecord, Double> CHECKPOINT_SYNC_TIME = createField("checkpoint_sync_time", org.jooq.impl.SQLDataType.DOUBLE, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_checkpoint</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> BUFFERS_CHECKPOINT = createField("buffers_checkpoint", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_clean</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> BUFFERS_CLEAN = createField("buffers_clean", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.maxwritten_clean</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> MAXWRITTEN_CLEAN = createField("maxwritten_clean", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_backend</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> BUFFERS_BACKEND = createField("buffers_backend", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_backend_fsync</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> BUFFERS_BACKEND_FSYNC = createField("buffers_backend_fsync", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.buffers_alloc</code>.
     */
    public final TableField<PgStatBgwriterRecord, BigDecimal> BUFFERS_ALLOC = createField("buffers_alloc", org.jooq.impl.SQLDataType.BIGINT, this, "", new LongConverter());

    /**
     * The column <code>pg_catalog.pg_stat_bgwriter.stats_reset</code>.
     */
    public final TableField<PgStatBgwriterRecord, OffsetDateTime> STATS_RESET = createField("stats_reset", org.jooq.impl.SQLDataType.TIMESTAMPWITHTIMEZONE, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_bgwriter</code> table reference
     */
    public PgStatBgwriter() {
        this(DSL.name("pg_stat_bgwriter"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_bgwriter</code> table reference
     */
    public PgStatBgwriter(String alias) {
        this(DSL.name(alias), PG_STAT_BGWRITER);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_bgwriter</code> table reference
     */
    public PgStatBgwriter(Name alias) {
        this(alias, PG_STAT_BGWRITER);
    }

    private PgStatBgwriter(Name alias, Table<PgStatBgwriterRecord> aliased) {
        this(alias, aliased, null);
    }

    private PgStatBgwriter(Name alias, Table<PgStatBgwriterRecord> aliased, Field<?>[] parameters) {
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
    public PgStatBgwriter as(String alias) {
        return new PgStatBgwriter(DSL.name(alias), this);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatBgwriter as(Name alias) {
        return new PgStatBgwriter(alias, this);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatBgwriter rename(String name) {
        return new PgStatBgwriter(DSL.name(name), null);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatBgwriter rename(Name name) {
        return new PgStatBgwriter(name, null);
    }
}
