/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgShowReplicationOriginStatusRecord;

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
public class PgShowReplicationOriginStatus extends TableImpl<PgShowReplicationOriginStatusRecord> {

    private static final long serialVersionUID = -1475070431;

    /**
     * The reference instance of <code>pg_catalog.pg_show_replication_origin_status</code>
     */
    public static final PgShowReplicationOriginStatus PG_SHOW_REPLICATION_ORIGIN_STATUS = new PgShowReplicationOriginStatus();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgShowReplicationOriginStatusRecord> getRecordType() {
        return PgShowReplicationOriginStatusRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_show_replication_origin_status.local_id</code>.
     */
    public final TableField<PgShowReplicationOriginStatusRecord, Long> LOCAL_ID = createField("local_id", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_show_replication_origin_status.external_id</code>.
     */
    public final TableField<PgShowReplicationOriginStatusRecord, String> EXTERNAL_ID = createField("external_id", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgShowReplicationOriginStatusRecord, Object> REMOTE_LSN = createField("remote_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgShowReplicationOriginStatusRecord, Object> LOCAL_LSN = createField("local_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * Create a <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    public PgShowReplicationOriginStatus() {
        this(DSL.name("pg_show_replication_origin_status"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    public PgShowReplicationOriginStatus(String alias) {
        this(DSL.name(alias), PG_SHOW_REPLICATION_ORIGIN_STATUS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_show_replication_origin_status</code> table reference
     */
    public PgShowReplicationOriginStatus(Name alias) {
        this(alias, PG_SHOW_REPLICATION_ORIGIN_STATUS);
    }

    private PgShowReplicationOriginStatus(Name alias, Table<PgShowReplicationOriginStatusRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgShowReplicationOriginStatus(Name alias, Table<PgShowReplicationOriginStatusRecord> aliased, Field<?>[] parameters) {
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
    public PgShowReplicationOriginStatus as(String alias) {
        return new PgShowReplicationOriginStatus(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgShowReplicationOriginStatus as(Name alias) {
        return new PgShowReplicationOriginStatus(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowReplicationOriginStatus rename(String name) {
        return new PgShowReplicationOriginStatus(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgShowReplicationOriginStatus rename(Name name) {
        return new PgShowReplicationOriginStatus(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgShowReplicationOriginStatus call() {
        return new PgShowReplicationOriginStatus(DSL.name(getName()), null, new Field[] { 
        });
    }
}
