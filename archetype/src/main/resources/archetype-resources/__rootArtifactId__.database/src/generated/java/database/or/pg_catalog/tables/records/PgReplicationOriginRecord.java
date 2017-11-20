/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgReplicationOrigin;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record2;
import org.jooq.Row2;
import org.jooq.impl.TableRecordImpl;


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
public class PgReplicationOriginRecord extends TableRecordImpl<PgReplicationOriginRecord> implements Record2<Long, String> {

    private static final long serialVersionUID = -988784397;

    /**
     * Setter for <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    public void setRoident(Long value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_origin.roident</code>.
     */
    public Long getRoident() {
        return (Long) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    public void setRoname(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_replication_origin.roname</code>.
     */
    public String getRoname() {
        return (String) get(1);
    }

    // -------------------------------------------------------------------------
    // Record2 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> fieldsRow() {
        return (Row2) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row2<Long, String> valuesRow() {
        return (Row2) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Long> field1() {
        return PgReplicationOrigin.PG_REPLICATION_ORIGIN.ROIDENT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgReplicationOrigin.PG_REPLICATION_ORIGIN.RONAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long component1() {
        return getRoident();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getRoname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Long value1() {
        return getRoident();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getRoname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationOriginRecord value1(Long value) {
        setRoident(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationOriginRecord value2(String value) {
        setRoname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgReplicationOriginRecord values(Long value1, String value2) {
        value1(value1);
        value2(value2);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgReplicationOriginRecord
     */
    public PgReplicationOriginRecord() {
        super(PgReplicationOrigin.PG_REPLICATION_ORIGIN);
    }

    /**
     * Create a detached, initialised PgReplicationOriginRecord
     */
    public PgReplicationOriginRecord(Long roident, String roname) {
        super(PgReplicationOrigin.PG_REPLICATION_ORIGIN);

        set(0, roident);
        set(1, roname);
    }
}
