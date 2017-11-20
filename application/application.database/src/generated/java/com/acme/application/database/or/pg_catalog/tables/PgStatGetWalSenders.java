/*
 * This file is generated by jOOQ.
*/
package com.acme.application.database.or.pg_catalog.tables;


import com.acme.application.database.or.pg_catalog.PgCatalog;
import com.acme.application.database.or.pg_catalog.tables.records.PgStatGetWalSendersRecord;

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
public class PgStatGetWalSenders extends TableImpl<PgStatGetWalSendersRecord> {

    private static final long serialVersionUID = -1964173138;

    /**
     * The reference instance of <code>pg_catalog.pg_stat_get_wal_senders</code>
     */
    public static final PgStatGetWalSenders PG_STAT_GET_WAL_SENDERS = new PgStatGetWalSenders();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgStatGetWalSendersRecord> getRecordType() {
        return PgStatGetWalSendersRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.pid</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, Integer> PID = createField("pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.state</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, String> STATE = createField("state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> SENT_LSN = createField("sent_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> WRITE_LSN = createField("write_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> FLUSH_LSN = createField("flush_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> REPLAY_LSN = createField("replay_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> WRITE_LAG = createField("write_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> FLUSH_LAG = createField("flush_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgStatGetWalSendersRecord, Object> REPLAY_LAG = createField("replay_lag", org.jooq.impl.DefaultDataType.getDefaultDataType("interval"), this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.sync_priority</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, Integer> SYNC_PRIORITY = createField("sync_priority", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_stat_get_wal_senders.sync_state</code>.
     */
    public final TableField<PgStatGetWalSendersRecord, String> SYNC_STATE = createField("sync_state", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * Create a <code>pg_catalog.pg_stat_get_wal_senders</code> table reference
     */
    public PgStatGetWalSenders() {
        this(DSL.name("pg_stat_get_wal_senders"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_wal_senders</code> table reference
     */
    public PgStatGetWalSenders(String alias) {
        this(DSL.name(alias), PG_STAT_GET_WAL_SENDERS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_stat_get_wal_senders</code> table reference
     */
    public PgStatGetWalSenders(Name alias) {
        this(alias, PG_STAT_GET_WAL_SENDERS);
    }

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgStatGetWalSenders(Name alias, Table<PgStatGetWalSendersRecord> aliased, Field<?>[] parameters) {
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
    public PgStatGetWalSenders as(String alias) {
        return new PgStatGetWalSenders(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSenders as(Name alias) {
        return new PgStatGetWalSenders(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetWalSenders rename(String name) {
        return new PgStatGetWalSenders(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgStatGetWalSenders rename(Name name) {
        return new PgStatGetWalSenders(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgStatGetWalSenders call() {
        return new PgStatGetWalSenders(DSL.name(getName()), null, new Field[] { 
        });
    }
}
