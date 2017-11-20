/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables;


import ${package}.database.or.pg_catalog.PgCatalog;
import ${package}.database.or.pg_catalog.tables.records.PgGetReplicationSlotsRecord;

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
public class PgGetReplicationSlots extends TableImpl<PgGetReplicationSlotsRecord> {

    private static final long serialVersionUID = 514139239;

    /**
     * The reference instance of <code>pg_catalog.pg_get_replication_slots</code>
     */
    public static final PgGetReplicationSlots PG_GET_REPLICATION_SLOTS = new PgGetReplicationSlots();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<PgGetReplicationSlotsRecord> getRecordType() {
        return PgGetReplicationSlotsRecord.class;
    }

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_name</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> SLOT_NAME = createField("slot_name", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.plugin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> PLUGIN = createField("plugin", org.jooq.impl.SQLDataType.VARCHAR, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.slot_type</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, String> SLOT_TYPE = createField("slot_type", org.jooq.impl.SQLDataType.CLOB, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.datoid</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> DATOID = createField("datoid", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.temporary</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> TEMPORARY = createField("temporary", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Boolean> ACTIVE = createField("active", org.jooq.impl.SQLDataType.BOOLEAN, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.active_pid</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Integer> ACTIVE_PID = createField("active_pid", org.jooq.impl.SQLDataType.INTEGER, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.xmin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> XMIN = createField("xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * The column <code>pg_catalog.pg_get_replication_slots.catalog_xmin</code>.
     */
    public final TableField<PgGetReplicationSlotsRecord, Long> CATALOG_XMIN = createField("catalog_xmin", org.jooq.impl.SQLDataType.BIGINT, this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgGetReplicationSlotsRecord, Object> RESTART_LSN = createField("restart_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public final TableField<PgGetReplicationSlotsRecord, Object> CONFIRMED_FLUSH_LSN = createField("confirmed_flush_lsn", org.jooq.impl.DefaultDataType.getDefaultDataType("pg_lsn"), this, "");

    /**
     * Create a <code>pg_catalog.pg_get_replication_slots</code> table reference
     */
    public PgGetReplicationSlots() {
        this(DSL.name("pg_get_replication_slots"), null);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table reference
     */
    public PgGetReplicationSlots(String alias) {
        this(DSL.name(alias), PG_GET_REPLICATION_SLOTS);
    }

    /**
     * Create an aliased <code>pg_catalog.pg_get_replication_slots</code> table reference
     */
    public PgGetReplicationSlots(Name alias) {
        this(alias, PG_GET_REPLICATION_SLOTS);
    }

    private PgGetReplicationSlots(Name alias, Table<PgGetReplicationSlotsRecord> aliased) {
        this(alias, aliased, new Field[0]);
    }

    private PgGetReplicationSlots(Name alias, Table<PgGetReplicationSlotsRecord> aliased, Field<?>[] parameters) {
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
    public PgGetReplicationSlots as(String alias) {
        return new PgGetReplicationSlots(DSL.name(alias), this, parameters);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgGetReplicationSlots as(Name alias) {
        return new PgGetReplicationSlots(alias, this, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetReplicationSlots rename(String name) {
        return new PgGetReplicationSlots(DSL.name(name), null, parameters);
    }

    /**
     * Rename this table
     */
    @Override
    public PgGetReplicationSlots rename(Name name) {
        return new PgGetReplicationSlots(name, null, parameters);
    }

    /**
     * Call this table-valued function
     */
    public PgGetReplicationSlots call() {
        return new PgGetReplicationSlots(DSL.name(getName()), null, new Field[] { 
        });
    }
}
