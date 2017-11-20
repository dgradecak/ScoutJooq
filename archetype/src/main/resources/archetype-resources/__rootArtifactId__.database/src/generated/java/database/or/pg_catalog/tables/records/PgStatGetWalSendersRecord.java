/*
 * This file is generated by jOOQ.
*/
package ${package}.database.or.pg_catalog.tables.records;


import ${package}.database.or.pg_catalog.tables.PgStatGetWalSenders;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.Record11;
import org.jooq.Row11;
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
public class PgStatGetWalSendersRecord extends TableRecordImpl<PgStatGetWalSendersRecord> implements Record11<Integer, String, Object, Object, Object, Object, Object, Object, Object, Integer, String> {

    private static final long serialVersionUID = 1867627923;

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.pid</code>.
     */
    public void setPid(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.pid</code>.
     */
    public Integer getPid() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.state</code>.
     */
    public void setState(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.state</code>.
     */
    public String getState() {
        return (String) get(1);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.sent_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setSentLsn(Object value) {
        set(2, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.sent_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getSentLsn() {
        return (Object) get(2);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.write_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setWriteLsn(Object value) {
        set(3, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.write_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getWriteLsn() {
        return (Object) get(3);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.flush_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFlushLsn(Object value) {
        set(4, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.flush_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFlushLsn() {
        return (Object) get(4);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.replay_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setReplayLsn(Object value) {
        set(5, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.replay_lsn</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getReplayLsn() {
        return (Object) get(5);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.write_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setWriteLag(Object value) {
        set(6, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.write_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getWriteLag() {
        return (Object) get(6);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.flush_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setFlushLag(Object value) {
        set(7, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.flush_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getFlushLag() {
        return (Object) get(7);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.replay_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public void setReplayLag(Object value) {
        set(8, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.replay_lag</code>.
     */

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    public Object getReplayLag() {
        return (Object) get(8);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.sync_priority</code>.
     */
    public void setSyncPriority(Integer value) {
        set(9, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.sync_priority</code>.
     */
    public Integer getSyncPriority() {
        return (Integer) get(9);
    }

    /**
     * Setter for <code>pg_catalog.pg_stat_get_wal_senders.sync_state</code>.
     */
    public void setSyncState(String value) {
        set(10, value);
    }

    /**
     * Getter for <code>pg_catalog.pg_stat_get_wal_senders.sync_state</code>.
     */
    public String getSyncState() {
        return (String) get(10);
    }

    // -------------------------------------------------------------------------
    // Record11 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Object, Object, Object, Object, Object, Object, Object, Integer, String> fieldsRow() {
        return (Row11) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row11<Integer, String, Object, Object, Object, Object, Object, Object, Object, Integer, String> valuesRow() {
        return (Row11) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.PID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.STATE;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field3() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.SENT_LSN;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field4() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.WRITE_LSN;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field5() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.FLUSH_LSN;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field6() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.REPLAY_LSN;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field7() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.WRITE_LAG;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field8() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.FLUSH_LAG;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Field<Object> field9() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.REPLAY_LAG;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field10() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.SYNC_PRIORITY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field11() {
        return PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS.SYNC_STATE;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getState();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component3() {
        return getSentLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component4() {
        return getWriteLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component5() {
        return getFlushLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component6() {
        return getReplayLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component7() {
        return getWriteLag();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component8() {
        return getFlushLag();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object component9() {
        return getReplayLag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component10() {
        return getSyncPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component11() {
        return getSyncState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getPid();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getState();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value3() {
        return getSentLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value4() {
        return getWriteLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value5() {
        return getFlushLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value6() {
        return getReplayLsn();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value7() {
        return getWriteLag();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value8() {
        return getFlushLag();
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public Object value9() {
        return getReplayLag();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value10() {
        return getSyncPriority();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value11() {
        return getSyncState();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSendersRecord value1(Integer value) {
        setPid(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSendersRecord value2(String value) {
        setState(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value3(Object value) {
        setSentLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value4(Object value) {
        setWriteLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value5(Object value) {
        setFlushLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value6(Object value) {
        setReplayLsn(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value7(Object value) {
        setWriteLag(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value8(Object value) {
        setFlushLag(value);
        return this;
    }

    /**
     * @deprecated Unknown data type. Please define an explicit {@link org.jooq.Binding} to specify how this type should be handled.
     */
    @java.lang.Deprecated
    @Override
    public PgStatGetWalSendersRecord value9(Object value) {
        setReplayLag(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSendersRecord value10(Integer value) {
        setSyncPriority(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSendersRecord value11(String value) {
        setSyncState(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public PgStatGetWalSendersRecord values(Integer value1, String value2, Object value3, Object value4, Object value5, Object value6, Object value7, Object value8, Object value9, Integer value10, String value11) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        value11(value11);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached PgStatGetWalSendersRecord
     */
    public PgStatGetWalSendersRecord() {
        super(PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS);
    }

    /**
     * Create a detached, initialised PgStatGetWalSendersRecord
     */
    public PgStatGetWalSendersRecord(Integer pid, String state, Object sentLsn, Object writeLsn, Object flushLsn, Object replayLsn, Object writeLag, Object flushLag, Object replayLag, Integer syncPriority, String syncState) {
        super(PgStatGetWalSenders.PG_STAT_GET_WAL_SENDERS);

        set(0, pid);
        set(1, state);
        set(2, sentLsn);
        set(3, writeLsn);
        set(4, flushLsn);
        set(5, replayLsn);
        set(6, writeLag);
        set(7, flushLag);
        set(8, replayLag);
        set(9, syncPriority);
        set(10, syncState);
    }
}