/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgListeningChannels;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Row1;
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
public class PgListeningChannelsRecord extends TableRecordImpl<PgListeningChannelsRecord> implements Record1<String> {

    private static final long serialVersionUID = -589710721;

    /**
     * Setter for <code>pg_catalog.pg_listening_channels.pg_listening_channels</code>.
     */
    public void setPgListeningChannels(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_listening_channels.pg_listening_channels</code>.
     */
    public String getPgListeningChannels() {
        return (String) get(0);
    }

    // -------------------------------------------------------------------------
    // Record1 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> fieldsRow() {
        return (Row1) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row1<String> valuesRow() {
        return (Row1) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return PgListeningChannels.PG_LISTENING_CHANNELS.PG_LISTENING_CHANNELS_;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component1() {
        return getPgListeningChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getPgListeningChannels();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgListeningChannelsRecord value1(String value) {
        setPgListeningChannels(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgListeningChannelsRecord values(String value1) {
        value1(value1);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgListeningChannelsRecord
     */
    public PgListeningChannelsRecord() {
        super(PgListeningChannels.PG_LISTENING_CHANNELS);
    }

    /**
     * Create a detached, initialised PgListeningChannelsRecord
     */
    public PgListeningChannelsRecord(String pgListeningChannels) {
        super(PgListeningChannels.PG_LISTENING_CHANNELS);

        set(0, pgListeningChannels);
    }
}
